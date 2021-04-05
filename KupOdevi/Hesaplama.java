package KupOdevi;

public class Hesaplama {
	KupBilgileri kupbilgileri = new KupBilgileri();
	int Hacimsonuc;
	int Alansonuc;
	int Cevresonuc;
	int kenarUzunluk;
	Hesaplama() {
		
	}
	Hesaplama(int Hacimsonuc,int Cevresonuc,int Alansonuc,int kenarUzunluk) {
		this.Hacimsonuc=Hacimsonuc;
		this.Alansonuc = Alansonuc;
		this.Cevresonuc = Cevresonuc;
	}
	
	public int hacimHesapla() {
		return this.Hacimsonuc = kenarUzunluk*kenarUzunluk*kenarUzunluk;
		}
	public int alanHesapla() {
		return this.Alansonuc = 6*kenarUzunluk*kenarUzunluk;
	}
	public int cevreHesapla() {
		return this.Cevresonuc = 12*kenarUzunluk;
	}
	public static void main(String[] args) {
	
	
	}
}
