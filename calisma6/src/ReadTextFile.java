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
      openFile();//OpenFile metodunu çaðýrýr ve dosya açýlýr
      readRecords();//readRecords metodunu çaðýrýr ve dosyayý okur
      closeFile();//CloseFile metodunu çaðýrýr ve dosya kapanýr
   }

   //client.txt dosyasýný aç
   public static void openFile()
   {
      try
      {  //Dosyayý açar
         input = new Scanner(Paths.get("clients.txt")); 
      } 
      catch (IOException ioException)
      {
         System.err.println("Error opening file. Terminating.");
         System.exit(1);
      } 
   }

   //Dosyadan kaydý oku
   public static void readRecords()
   {
      System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
         "First Name", "Last Name", "Balance");

      try 
      {
         while (input.hasNext()) //Bütün satýrlarý en aþaðýdaki satýra kadar teker teker okur
         {
            //Kayýt içeriðini göster                   
            System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(), 
               input.next(), input.next(), input.nextDouble());
         }
      } 
      catch (NoSuchElementException elementException)
      {//Dýþ görünüm þablonlarý ayrýþtýrýlýrken ja: öðe ayrýþtýrma hatasý olduðunda atýlýr
         System.err.println("File improperly formed. Terminating.");
      } 
      catch (IllegalStateException stateException)
      {//Bir Nesnenin Durumu kullanýlýrken karþýlaþýlan bir istisnayý belirtir.
         System.err.println("Error reading from file. Terminating.");
      } 
   } //readRecords metodu bitti

   //Dosyayý kapat ve uygulamayý sonlandýr
   public static void closeFile()
   {
      if (input != null)
         input.close();
   } 
} //ReadTextFile Classý Bitti