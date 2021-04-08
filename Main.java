package KupOdevi;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.AlignmentAction;


public class Main {
public static void main(String[] args) {
	
	kupBilgileri kupbilgileri = new kupBilgileri(); //Kup Bilgileri Constructor'ýna eriþmek için nesneyi oluþturuyoruz
	Scanner scanner = new Scanner(System.in); // Kullanýcýdan veri almak için scanner olustuyoruz
	System.out.println("Küpün Bir Kenar Uzunluðunu Giriniz : ");
	kupbilgileri.kenarUzunlugu = scanner.nextInt(); // kullanýcýdan veriyi alýyoruz
	hesaplama hesaplama = new hesaplama(); //Hesaplama Constructor'ýna eriþmek için nesneyi oluþturuyoruz
	hesaplama.kenarUzunluk = kupbilgileri.kenarUzunlugu; //hesaplamadaki kenarUzunluk deðiþkenine iþlem yapabilmesi için KüpBilgilerindeki kenarUzunluðu verisini atýyoruz
	System.out.println("Hacim = "+hesaplama.hacimHesapla()+" Birim³"); //Hesaplama classýndaki iþlem yap metodunu çaðýrýp iþlemin sonucunu gosterýyoruz
	System.out.println("Alan = "+hesaplama.alanHesapla()+" Birim²");
	System.out.println("Çevre = "+hesaplama.cevreHesapla()+" Birim");
	
		
	}
}
