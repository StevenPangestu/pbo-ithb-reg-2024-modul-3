package Model;

public class Dosen extends Staff {
    private String NIK;

    public Dosen(String name, String alamat, String TTL, String tlp, String nik) {
        super(name, alamat, TTL, tlp, nik);
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String nIK) {
        NIK = nIK;
    }

    @Override
    public String toString() {
        return "Dosen [NIK=" + NIK + ", getNIK()=" + getNIK() + ", getName()=" + getName() + ", toString()="
                + super.toString() + ", getAlamat()=" + getAlamat() + ", getTTL()=" + getTTL() + ", getTelepon()="
                + getTelepon() + "]";
    }
}
