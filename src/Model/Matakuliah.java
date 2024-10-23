package Model;

public class Matakuliah {

    private String kode, SKS, nama;

    public Matakuliah(String kode, String SKS, String nama) {
        this.kode = kode;
        this.SKS = SKS;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getSKS() {
        return SKS;
    }

    public void setSKS(String sKS) {
        SKS = sKS;
    }

}
