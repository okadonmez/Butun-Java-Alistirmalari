// Fig. 15.8: CreditInquiry.java
// This program reads a file sequentially and displays the
// contents based on the type of account the user requests 
// (credit balance, debit balance or zero balance).
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreditInquiry
{
   private final static MenuOption[] choices = MenuOption.values();
   //Enum dosyasýndan seçim yapabilmek için choices adýnda bir taným oluþturduk ve MenuOption.values()'ü bu tanýma atadýk
   public static void main(String[] args)
   {
      //Kullanýcýnýn isteðini alýn (örneðin, sýfýr, kredi veya borç bakiyesi)
      MenuOption accountType = getRequest();//Türüne (isteðe baðlý) ve kimliðine göre bir dizinden bir belge (kaynaðý) alma isteði.

      while (accountType != MenuOption.END)//Enum da 4 (kapat) deðerini girmediðimiz sürece döngü devam edecek
      {
         switch (accountType)
         {
            case ZERO_BALANCE:
               System.out.printf("%nAccounts with zero balances:%n");
               break;
            case CREDIT_BALANCE:
               System.out.printf("%nAccounts with credit balances:%n");
               break;
            case DEBIT_BALANCE:
               System.out.printf("%nAccounts with debit balances:%n");
               break;
         } 

         readRecords(accountType);
         accountType = getRequest(); // get user's request 
      } 
   } 

   // Kullanýcýdan istek almak
   private static MenuOption getRequest()
   {
      int request = 4;

      //Ýstek seçeneklerini göster
      System.out.printf("%nEnter request%n%s%n%s%n%s%n%s%n",
         " 1 - List accounts with zero balances",
         " 2 - List accounts with credit balances",
         " 3 - List accounts with debit balances", 
         " 4 - Terminate program");

      try
      {
         Scanner input = new Scanner(System.in);

         do //Kullanýcý isteðini gir
         {
            System.out.printf("%n? ");
            request = input.nextInt();
         } while ((request < 1) || (request > 4));
      } 
      catch (NoSuchElementException noSuchElementException)
      {//Ýstenen öðenin mevcut olmadýðýný belirtmek için çeþitli eriþimci yöntemleriyle gönderilir.
         System.err.println("Invalid input. Terminating.");
      }

      return choices[request - 1]; //Seçenek için enum deðerini döndür
   }

   //Dosyadan kayýtlarý okuyun ve yalnýzca uygun türdeki kayýtlarý görüntüleyin
   private static void readRecords(MenuOption accountType)
   {
      //Dosyayý açar ve içeriðini iþler
      try (Scanner input = new Scanner(Paths.get("clients.txt")))
      {
         while (input.hasNext()) //Okunacak daha fazla veri
         { 
            int accountNumber = input.nextInt();//Hesap numarasý girer
            String firstName = input.next();//Ýsim girer
            String lastName = input.next();//Soyad girer
            double balance = input.nextDouble();//Bakiye girer

            //Uygun hesap türü ise, kaydý göster
            if (shouldDisplay(accountType, balance))       
               System.out.printf("%-10d%-12s%-12s%10.2f%n", accountNumber,
                  firstName, lastName, balance);
            else
               input.nextLine(); // Mevcut kaydýn geri kalanýný atýn
         }
      }
      catch (NoSuchElementException | 
         IllegalStateException | IOException e)
      {
    	 //Ýstenen öðenin mevcut olmadýðýný belirtmek için çeþitli eriþimci yöntemleriyle gönderilir.
    	 //Bir yöntemin yasadýþý veya uygun olmayan bir zamanda çaðrýldýðýný gösterir. Baþka bir deyiþle, Java ortamý veya Java uygulamasý, istenen iþlem için uygun durumda deðil.
         //Önceki yakalama bloklarý tarafýndan iþlenmeyen tüm Ýstisnalarý yakalar
    	 System.err.println("Error processing file. Terminating.");
         System.exit(1);
      } 
   } //readRecords metodu bitti

   //Kaydýn görüntülenip görüntülenmeyeceðini belirlemek için kayýt türünü kullanýn
   private static boolean shouldDisplay(
      MenuOption accountType, double balance)
   {
      if ((accountType == MenuOption.CREDIT_BALANCE) && (balance < 0))
         return true;
      else if ((accountType == MenuOption.DEBIT_BALANCE) && (balance > 0))
         return true;
      else if ((accountType == MenuOption.ZERO_BALANCE) && (balance == 0))
         return true;

      return false;
   } 
} //CreditInquiry Classý bitti