package KupOdevi;

public class hesaplama {
	kupBilgileri kupbilgileri = new kupBilgileri();
	int hacimSonuc;
	int alanSonuc;
	int cevreSonuc;
	int kenarUzunluk;
	public hesaplama() {
		
	}
	public hesaplama(int hacimSonuc,int cevreSonuc,int alanSonuc,int kenarUzunluk) {
		this.hacimSonuc=hacimSonuc;
		this.alanSonuc = alanSonuc;
		this.cevreSonuc = cevreSonuc;
	}
	
	public int hacimHesapla() {
		return this.hacimSonuc = kenarUzunluk*kenarUzunluk*kenarUzunluk;
		}
	public int alanHesapla() {
		return this.alanSonuc = kupbilgileri.yuzBilgisiGetir*kenarUzunluk*kenarUzunluk;
	}
	public int cevreHesapla() {
		return this.cevreSonuc = kupbilgileri.ayritBilgisiGetir*kenarUzunluk;
	}
	public static void main(String[] args) {
	
	
	}
}
