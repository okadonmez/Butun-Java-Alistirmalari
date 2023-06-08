// Fig. 15.3: CreateTextFile.java
// Writing data to a sequential text file with class Formatter.
import java.io.FileNotFoundException;     
import java.lang.SecurityException;       
import java.util.Formatter;               
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;  
import java.util.Scanner;                 

public class CreateTextFile
{//Formatter, konsola, bir dosyaya veya bir akýþa yazacaðýnýz verileri biçimlendirerek farklý 
//formatlarda çýktý oluþturmanýza olanak saðlar.
   private static Formatter output; // Bir dosyaya metin çýktýsý verir. Bunun için output adýnda bir deðiþken tanýmladýk

   public static void main(String[] args)
   {
      openFile();//OpenFile metodunu çaðýrýr ve dosya açýlýr
      addRecords();//addRecords metodunu çaðýrýr ve dosyaya ekleme iþlemleri yapýlýr
      closeFile();//CloseFile metodunu çaðýrýr ve dosya kapanýr
   } 

   //client.txt dosyasýný aç
   public static void openFile()
   {
      try
      {
         output = new Formatter("clients.txt"); // open the file
      }
      catch (SecurityException securityException)
      {//Bir SecurityException arayan bir kaynaða eriþmek için gerekli izinlere sahip olmadýðýnda bir özel durum oluþturulur.
         System.err.println("Write permission denied. Terminating.");
         System.exit(1); //Programý sonlandýrýr
      } 
      catch (FileNotFoundException fileNotFoundException)
      {//Belirtilen bir yol adýyla gösterilen dosyayý açma giriþiminin baþarýsýz olduðunu gösterir.
         System.err.println("Error opening file. Terminating.");
         System.exit(1); //Programý sonlandýrýr
      } 
   } 

   // dosyaya kayýt ekle
   public static void addRecords()
   {
      Scanner input = new Scanner(System.in);//input adýnda bir girdi tanýmladýk
      System.out.printf("%s%n%s%n? ", 
         "Enter account number, first name, last name and balance.",
         "Enter end-of-file indicator to end input.");

      while (input.hasNext()) //dosya sonu göstergesine kadar döngü(dosyanýn en son satýrýna yazý yazmamýzý saðlýyor)
      {
         try
         {
            //Dosyaya yeni kayýt çýktýsý; geçerli giriþi varsayar
            output.format("%d %s %s %.2f%n", input.nextInt(),
               input.next(), input.next(), input.nextDouble());                             
         } 
         catch (FormatterClosedException formatterClosedException)
         {
            System.err.println("Error writing to file. Terminating.");
            break;
         } 
         catch (NoSuchElementException elementException)
         {//Geçersiz giriþ yapýldýðýnda bu catch'e girecek ve tekrar giriþ yapmasý saðlanacak 
            System.err.println("Invalid input. Please try again.");
            input.nextLine(); // discard input so user can try again
         } 

         System.out.print("? ");
      }
   }

   //dosyayý kapat
   public static void closeFile()
   {
      if (output != null)
         output.close();
   } 
} //CreateTextFile Classý bitti