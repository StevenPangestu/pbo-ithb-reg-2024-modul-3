package Model;

public class DosenHonorer {
    private double honorPerSKS;

    public DosenHonorer(double honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    public double getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(double honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString() {
        return "DosenHonorer [honorPerSKS=" + honorPerSKS + ", getHonorPerSKS()=" + getHonorPerSKS() + ", getClass()="
                + getClass() + "]";
    }

}
