package KupOdevi;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.AlignmentAction;


public class Main {
public static void main(String[] args) {
	
	KupBilgileri kupbilgileri = new KupBilgileri(); //Kup Bilgileri Constructor'ına erişmek için nesneyi oluşturuyoruz
	Scanner scanner = new Scanner(System.in); // Kullanıcıdan veri almak için scanner olustuyoruz
	System.out.println("Küpün Bir Kenar Uzunluğunu Giriniz : ");
	kupbilgileri.kenarUzunlugu = scanner.nextInt(); // kullanıcıdan veriyi alıyoruz
	Hesaplama hesaplama = new Hesaplama(); //Hesaplama Constructor'ına erişmek için nesneyi oluşturuyoruz
	hesaplama.kenarUzunluk = kupbilgileri.kenarUzunlugu; //hesaplamadaki kenarUzunluk değişkenine işlem yapabilmesi için KüpBilgilerindeki kenarUzunluğu verisini atıyoruz
	System.out.println("Hacim = "+hesaplama.hacimHesapla()+" Birim³"); //Hesaplama classındaki hacimHesapla metodunu çağırıp işlemin sonucunu gosterıyoruz
	System.out.println("Alan = "+hesaplama.alanHesapla()+" Birim²"); //Hesaplama classındaki alanHesapla metodunu çağırıp işlemin sonucunu gosterıyoruz
	System.out.println("Çevre = "+hesaplama.cevreHesapla()+" Birim"); //Hesaplama classındaki cevreHesapla metodunu çağırıp işlemin sonucunu gosterıyoruz
	
		
	}
}
