package Model;

public class MatkulPilihan extends Matakuliah {
    int minimumMHS;

    public MatkulPilihan(String kode, String SKS, String nama, int minimum) {
        super(kode, SKS, nama);
        this.minimumMHS = minimum;
    }

    public int getMinimumMHS() {
        return minimumMHS;
    }

    public void setMinimumMHS(int minimumMHS) {
        this.minimumMHS = minimumMHS;
    }

    @Override
    public String toString() {
        return "MatkulPilihan [minimumMHS=" + minimumMHS + ", getNama()=" + getNama() + ", getMinimumMHS()="
                + getMinimumMHS() + ", getKode()=" + getKode() + ", getSKS()=" + getSKS() + ", getClass()=" + getClass()
                + "]";
    }

}
