public class Mahasiswa{
 public String nama;
 public String nim;
 public String kelas;

 public void setIdentitas(String a, String b, String c){
  nama  = a;
  nim   = b;
  kelas = c;
 }

 public String getNama(){
  return nama;
 }

 public String getNim(){
  return nim;
 }

 public String getKelas(){
  return kelas;
 }

 public static void main(String[] args){
  Mahasiswa unyil = new Mahasiswa();
  unyil.setIdentitas("Unyil", "001", "SI-1");
  System.out.println("Nama  : "+unyil.getNama());
  System.out.println("NIM   : "+unyil.getNim());
  System.out.println("Kelas : "+unyil.getKelas());
  System.out.println();

  Mahasiswa usro = new Mahasiswa();
  usro.setIdentitas("Usro", "002", "SI-1");
  System.out.println("Nama  : "+usro.getNama());
  System.out.println("NIM   : "+usro.getNim());
  System.out.println("Kelas : "+usro.getKelas());  
 }
}