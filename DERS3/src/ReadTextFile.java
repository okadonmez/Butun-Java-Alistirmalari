// Fig. 15.6: ReadTextFile.java
// This program reads a text file and displays each record.
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile
{
   private static Scanner input;

   public static void main(String[] args)
   {
      openFile();//OpenFile metodunu �a��r�r ve dosya a��l�r
      readRecords();//readRecords metodunu �a��r�r ve dosyay� okur
      closeFile();//CloseFile metodunu �a��r�r ve dosya kapan�r
   }

   //client.txt dosyas�n� a�
   public static void openFile()
   {
      try
      {  //Dosyay� a�ar
         input = new Scanner(Paths.get("clients.txt")); 
      } 
      catch (IOException ioException)
      {
         System.err.println("Error opening file. Terminating.");
         System.exit(1);
      } 
   }

   //Dosyadan kayd� oku
   public static void readRecords()
   {
      System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
         "First Name", "Last Name", "Balance");

      try 
      {
         while (input.hasNext()) //B�t�n sat�rlar� en a�a��daki sat�ra kadar teker teker okur
         {
            //Kay�t i�eri�ini g�ster                   
            System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(), 
               input.next(), input.next(), input.nextDouble());
         }
      } 
      catch (NoSuchElementException elementException)
      {//D�� g�r�n�m �ablonlar� ayr��t�r�l�rken ja: ��e ayr��t�rma hatas� oldu�unda at�l�r
         System.err.println("File improperly formed. Terminating.");
      } 
      catch (IllegalStateException stateException)
      {//Bir Nesnenin Durumu kullan�l�rken kar��la��lan bir istisnay� belirtir.
         System.err.println("Error reading from file. Terminating.");
      } 
   } //readRecords metodu bitti

   //Dosyay� kapat ve uygulamay� sonland�r
   public static void closeFile()
   {
      if (input != null)
         input.close();
   } 
} //ReadTextFile Class� Bitti