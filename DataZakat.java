 public class DataZakat {
    public static void main(String[] args)
    public String nama;
    public String alamat;
    public int jumlahZakatBeras;
    public int jumlahZakatUang;
    public int jumlahSedekah;

    public DataZakat(String nama, String alamat, int jumlahZakatBeras, int jumlahZakatUang, int jumlahSedekah) {
        this.nama = nama;
        this.alamat = alamat;
        this.jumlahZakatBeras = jumlahZakatBeras;
        this.jumlahZakatUang = jumlahZakatUang;
        this.jumlahSedekah = jumlahSedekah;
    }

    public String getNama() {
        return this.nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public int getJumlahZakatBeras() {
        return this.jumlahZakatBeras;
    }

    public int getJumlahZakatUang() {
        return this.jumlahZakatUang;
    }

    public int getJumlahSedekah() {
        return this.jumlahSedekah;
    }

    // Setter methods
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJumlahZakatBeras(int jumlahZakatBeras) {
        this.jumlahZakatBeras = jumlahZakatBeras;
    }

    public void setJumlahZakatUang(int jumlahZakatUang) {
        this.jumlahZakatUang = jumlahZakatUang;
    }

    public void setJumlahSedekah(int jumlahSedekah) {
        this.jumlahSedekah = jumlahSedekah;
    }
}
