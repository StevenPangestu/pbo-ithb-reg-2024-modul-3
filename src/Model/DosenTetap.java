package Model;

public class DosenTetap extends Dosen {
    private double salary;

    public DosenTetap(String name, String alamat, String TTL, String tlp, String nik, double salary) {
        super(name, alamat, TTL, tlp, nik);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "DosenTetap [salary=" + salary + ", getNIK()=" + getNIK() + ", getSalary()=" + getSalary()
                + ", getName()=" + getName() + ", toString()=" + super.toString() + ", getAlamat()=" + getAlamat()
                + ", getTTL()=" + getTTL() + ", getTelepon()=" + getTelepon() + "]";
    }

}
