public class Manusia {
 public String nama;
 public int umur;
 public int tinggiBadan; 

 public void setIdentitas(String n, int u, int tb){
  nama = n;
  umur = u;
  tinggiBadan = tb;
 }

 public void makan(String temp){
  System.out.println(nama+" senang makan : "+temp);
 }

 public void bekerja(String temp){
  System.out.println(nama+" bekerja di : "+temp);
 }

 public void menikah(String temp){
  System.out.println(nama+" menikah dengan : "+temp);
 }

 public static void main(String[] args){
  Manusia lalan = new Manusia();
  lalan.setIdentitas("Lalan", 40, 170);
  System.out.println("Nama   : "+lalan.nama);
  System.out.println("Umur   : "+lalan.umur);
  System.out.println("Tinggi : "+lalan.tinggiBadan);
  lalan.makan("Mie Ayam");
  lalan.bekerja("PT. 987");
  lalan.menikah("Cinta");
  System.out.println("---------------------------");

  Manusia indra = new Manusia();
  indra.setIdentitas("Indra", 34, 166);
  System.out.println("Nama   : "+indra.nama);
  System.out.println("Umur   : "+indra.umur);
  System.out.println("Tinggi : "+indra.tinggiBadan);
  indra.makan("Bakso");
  indra.bekerja("PT. OPJ");
  indra.menikah("Puput");
  System.out.println("---------------------------");

  Manusia nano = new Manusia();
  nano.setIdentitas("Nano", 35, 165);
  System.out.println("Nama   : "+nano.nama);
  System.out.println("Umur   : "+nano.umur);
  System.out.println("Tinggi : "+nano.tinggiBadan);
  nano.makan("Ayam Bakar");
  nano.bekerja("CV. Goyang");
  nano.menikah("Ijem");
  System.out.println("---------------------------");

  Manusia andi = new Manusia();
  andi.setIdentitas("Andi", 24, 174);
  System.out.println("Nama   : "+andi.nama);
  System.out.println("Umur   : "+andi.umur);
  System.out.println("Tinggi : "+andi.tinggiBadan);
  andi.makan("Soto Babat");
  andi.bekerja("PT. Yuyayu");
  andi.menikah("Yuni");
 }
}
