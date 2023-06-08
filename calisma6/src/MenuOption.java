// Fig. 15.7: MenuOption.java
// Kredi sorgulama programýnýn seçenekleri için numaralandýrma türü.

public enum MenuOption
{
   // Enum türünün içeriðini bildir
   // Enum kullanýlmasýnýn sebebi numaralar ile basit bir menü seçimi yapmamýzý saðlýyor olmasýdýr
   ZERO_BALANCE(1),//1 -> 0 Bakiyesi
   CREDIT_BALANCE(2),//2 -> Kredi Bakiyesi
   DEBIT_BALANCE(3),//3 -> Borç Bakiyesi
   END(4);//4 -> Kapat
   
   private final int value; //Geçerli menü seçeneði
   //Private olarak tanýmladýk dýþarýdan sürekli deðiþtirilmesini istemiyoruz. 
   //Sadece bizim izin verdiðimiz durumlarda deðiþim olacak ve o da final olacak yani sabit olarak kalýcak
   // constructor
   private MenuOption(int value)//Yapýcý metodumuz ile dýþarýdan value deðeri alýyoruz ve buradaki value ye atýyoruz 
   {
      this.value = value;
   } 
} //Enum MenuOption Bitti