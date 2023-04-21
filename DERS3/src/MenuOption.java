// Fig. 15.7: MenuOption.java
// Kredi sorgulama program�n�n se�enekleri i�in numaraland�rma t�r�.

public enum MenuOption
{
   // Enum t�r�n�n i�eri�ini bildir
   // Enum kullan�lmas�n�n sebebi numaralar ile basit bir men� se�imi yapmam�z� sa�l�yor olmas�d�r
   ZERO_BALANCE(1),//1 -> 0 Bakiyesi
   CREDIT_BALANCE(2),//2 -> Kredi Bakiyesi
   DEBIT_BALANCE(3),//3 -> Bor� Bakiyesi
   END(4);//4 -> Kapat
   
   private final int value; //Ge�erli men� se�ene�i
   //Private olarak tan�mlad�k d��ar�dan s�rekli de�i�tirilmesini istemiyoruz. 
   //Sadece bizim izin verdi�imiz durumlarda de�i�im olacak ve o da final olacak yani sabit olarak kal�cak
   // constructor
   private MenuOption(int value)//Yap�c� metodumuz ile d��ar�dan value de�eri al�yoruz ve buradaki value ye at�yoruz 
   {
      this.value = value;
   } 
} //Enum MenuOption Bitti