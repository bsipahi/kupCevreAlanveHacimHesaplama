package KupOdevi;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.AlignmentAction;


public class Main {
public static void main(String[] args) {
	
	kupBilgileri kupbilgileri = new kupBilgileri(); //Kup Bilgileri Constructor'�na eri�mek i�in nesneyi olu�turuyoruz
	Scanner scanner = new Scanner(System.in); // Kullan�c�dan veri almak i�in scanner olustuyoruz
	System.out.println("K�p�n Bir Kenar Uzunlu�unu Giriniz : ");
	kupbilgileri.kenarUzunlugu = scanner.nextInt(); // kullan�c�dan veriyi al�yoruz
	hesaplama hesaplama = new hesaplama(); //Hesaplama Constructor'�na eri�mek i�in nesneyi olu�turuyoruz
	hesaplama.kenarUzunluk = kupbilgileri.kenarUzunlugu; //hesaplamadaki kenarUzunluk de�i�kenine i�lem yapabilmesi i�in K�pBilgilerindeki kenarUzunlu�u verisini at�yoruz
	System.out.println("Hacim = "+hesaplama.hacimHesapla()+" Birim�"); //Hesaplama class�ndaki i�lem yap metodunu �a��r�p i�lemin sonucunu goster�yoruz
	System.out.println("Alan = "+hesaplama.alanHesapla()+" Birim�");
	System.out.println("�evre = "+hesaplama.cevreHesapla()+" Birim");
	
		
	}
}
