import koneksi.Database;
import model.Mahasiswa;
import model.MataKuliah;

public class Main{
    public static void main(String[] args){
        System.out.print("ini program Main");
        Database.hubungkan();
        Mahasiswa.tampilkanInfo();
        MataKuliah.tampilkanInfo();
    }
}