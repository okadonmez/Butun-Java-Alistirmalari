// Fig. 15.3: CreateTextFile.java
// Writing data to a sequential text file with class Formatter.
import java.io.FileNotFoundException;     
import java.lang.SecurityException;       
import java.util.Formatter;               
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;  
import java.util.Scanner;                 

public class CreateTextFile
{//Formatter, konsola, bir dosyaya veya bir ak��a yazaca��n�z verileri bi�imlendirerek farkl� 
//formatlarda ��kt� olu�turman�za olanak sa�lar.
   private static Formatter output; // Bir dosyaya metin ��kt�s� verir. Bunun i�in output ad�nda bir de�i�ken tan�mlad�k

   public static void main(String[] args)
   {
      openFile();//OpenFile metodunu �a��r�r ve dosya a��l�r
      addRecords();//addRecords metodunu �a��r�r ve dosyaya ekleme i�lemleri yap�l�r
      closeFile();//CloseFile metodunu �a��r�r ve dosya kapan�r
   } 

   //client.txt dosyas�n� a�
   public static void openFile()
   {
      try
      {
         output = new Formatter("clients.txt"); // open the file
      }
      catch (SecurityException securityException)
      {//Bir SecurityException arayan bir kayna�a eri�mek i�in gerekli izinlere sahip olmad���nda bir �zel durum olu�turulur.
         System.err.println("Write permission denied. Terminating.");
         System.exit(1); //Program� sonland�r�r
      } 
      catch (FileNotFoundException fileNotFoundException)
      {//Belirtilen bir yol ad�yla g�sterilen dosyay� a�ma giri�iminin ba�ar�s�z oldu�unu g�sterir.
         System.err.println("Error opening file. Terminating.");
         System.exit(1); //Program� sonland�r�r
      } 
   } 

   // dosyaya kay�t ekle
   public static void addRecords()
   {
      Scanner input = new Scanner(System.in);//input ad�nda bir girdi tan�mlad�k
      System.out.printf("%s%n%s%n? ", 
         "Enter account number, first name, last name and balance.",
         "Enter end-of-file indicator to end input.");

      while (input.hasNext()) //dosya sonu g�stergesine kadar d�ng�(dosyan�n en son sat�r�na yaz� yazmam�z� sa�l�yor)
      {
         try
         {
            //Dosyaya yeni kay�t ��kt�s�; ge�erli giri�i varsayar
            output.format("%d %s %s %.2f%n", input.nextInt(),
               input.next(), input.next(), input.nextDouble());                             
         } 
         catch (FormatterClosedException formatterClosedException)
         {
            System.err.println("Error writing to file. Terminating.");
            break;
         } 
         catch (NoSuchElementException elementException)
         {//Ge�ersiz giri� yap�ld���nda bu catch'e girecek ve tekrar giri� yapmas� sa�lanacak 
            System.err.println("Invalid input. Please try again.");
            input.nextLine(); // discard input so user can try again
         } 

         System.out.print("? ");
      }
   }

   //dosyay� kapat
   public static void closeFile()
   {
      if (output != null)
         output.close();
   } 
} //CreateTextFile Class� bitti