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
   //Enum dosyas�ndan se�im yapabilmek i�in choices ad�nda bir tan�m olu�turduk ve MenuOption.values()'� bu tan�ma atad�k
   public static void main(String[] args)
   {
      //Kullan�c�n�n iste�ini al�n (�rne�in, s�f�r, kredi veya bor� bakiyesi)
      MenuOption accountType = getRequest();//T�r�ne (iste�e ba�l�) ve kimli�ine g�re bir dizinden bir belge (kayna��) alma iste�i.

      while (accountType != MenuOption.END)//Enum da 4 (kapat) de�erini girmedi�imiz s�rece d�ng� devam edecek
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

   // Kullan�c�dan istek almak
   private static MenuOption getRequest()
   {
      int request = 4;

      //�stek se�eneklerini g�ster
      System.out.printf("%nEnter request%n%s%n%s%n%s%n%s%n",
         " 1 - List accounts with zero balances",
         " 2 - List accounts with credit balances",
         " 3 - List accounts with debit balances", 
         " 4 - Terminate program");

      try
      {
         Scanner input = new Scanner(System.in);

         do //Kullan�c� iste�ini gir
         {
            System.out.printf("%n? ");
            request = input.nextInt();
         } while ((request < 1) || (request > 4));
      } 
      catch (NoSuchElementException noSuchElementException)
      {//�stenen ��enin mevcut olmad���n� belirtmek i�in �e�itli eri�imci y�ntemleriyle g�nderilir.
         System.err.println("Invalid input. Terminating.");
      }

      return choices[request - 1]; //Se�enek i�in enum de�erini d�nd�r
   }

   //Dosyadan kay�tlar� okuyun ve yaln�zca uygun t�rdeki kay�tlar� g�r�nt�leyin
   private static void readRecords(MenuOption accountType)
   {
      //Dosyay� a�ar ve i�eri�ini i�ler
      try (Scanner input = new Scanner(Paths.get("clients.txt")))
      {
         while (input.hasNext()) //Okunacak daha fazla veri
         { 
            int accountNumber = input.nextInt();//Hesap numaras� girer
            String firstName = input.next();//�sim girer
            String lastName = input.next();//Soyad girer
            double balance = input.nextDouble();//Bakiye girer

            //Uygun hesap t�r� ise, kayd� g�ster
            if (shouldDisplay(accountType, balance))       
               System.out.printf("%-10d%-12s%-12s%10.2f%n", accountNumber,
                  firstName, lastName, balance);
            else
               input.nextLine(); // Mevcut kayd�n geri kalan�n� at�n
         }
      }
      catch (NoSuchElementException | 
         IllegalStateException | IOException e)
      {
    	 //�stenen ��enin mevcut olmad���n� belirtmek i�in �e�itli eri�imci y�ntemleriyle g�nderilir.
    	 //Bir y�ntemin yasad��� veya uygun olmayan bir zamanda �a�r�ld���n� g�sterir. Ba�ka bir deyi�le, Java ortam� veya Java uygulamas�, istenen i�lem i�in uygun durumda de�il.
         //�nceki yakalama bloklar� taraf�ndan i�lenmeyen t�m �stisnalar� yakalar
    	 System.err.println("Error processing file. Terminating.");
         System.exit(1);
      } 
   } //readRecords metodu bitti

   //Kayd�n g�r�nt�lenip g�r�nt�lenmeyece�ini belirlemek i�in kay�t t�r�n� kullan�n
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
} //CreditInquiry Class� bitti