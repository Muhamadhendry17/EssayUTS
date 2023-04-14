import java.util.Scanner;

public class ZakatSedekah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahWarga = 0;
        int jumlahZakatBeras = 0;
        int jumlahZakatUang = 0;
        int jumlahSedekah = 0;
        
        System.out.println("Selamat datang di Program Zakat dan Sedekah PGKA");
        System.out.println("------------------------------------------------");
        System.out.print("Masukkan jumlah warga yang membayar zakat fitri: ");
        jumlahWarga = input.nextInt();
        
        for (int i = 1; i <= jumlahWarga; i++) {
            System.out.println("Warga ke-" + i);
            System.out.print("Masukkan nama warga: ");
            String nama = input.next();
            System.out.print("Masukkan alamat warga: ");
            String alamat = input.next();
            System.out.print("Masukkan jumlah zakat beras (dalam kilogram): ");
            int zakatBeras = input.nextInt();
            System.out.print("Masukkan jumlah zakat uang (dalam rupiah): ");
            int zakatUang = input.nextInt();
            System.out.print("Masukkan jumlah sedekah (dalam rupiah): ");
            int sedekah = input.nextInt();
            
            Warga warga = new Warga(nama, alamat, zakatBeras, zakatUang, sedekah);
            jumlahZakatBeras += warga.getJumlahZakatBeras();
            jumlahZakatUang += warga.getJumlahZakatUang();
            jumlahSedekah += warga.getJumlahSedekah();
        }
        
        System.out.println("------------------------------------------------");
        System.out.println("Jumlah warga yang membayar zakat fitri dengan beras: " + (jumlahZakatBeras / Warga.BERAS_PER_ZAKAT));
        System.out.println("Jumlah warga yang membayar zakat fitri dengan uang: " + (jumlahZakatUang / 35000));
        System.out.println("Jumlah beras zakat yang terkumpul: " + jumlahZakatBeras + " kg");
        System.out.println("Jumlah uang zakat yang terkumpul: " + jumlahZakatUang + " rupiah");
        System.out.println("Jumlah uang sedekah yang terkumpul: " + jumlahSedekah + " rupiah");
    }
}
