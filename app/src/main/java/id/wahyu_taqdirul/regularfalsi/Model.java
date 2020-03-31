package id.haqiqi_studio.regularfalsi;

public class Model {

    private int no;
    private Double fa;
    private Double fb;
    private Double c;
    private Double fc;
    private Double erc;

    public Model(int no, Double fa, Double fb, Double c, Double fc, Double erc) {
        this.no = no;
        this.fa = fa;
        this.fb = fb;
        this.c = c;
        this.fc = fc;
        this.erc = erc;
    }

    public int getNo() {
        return no;
    }

    public Double getFa() {
        return fa;
    }

    public Double getFb() {
        return fb;
    }

    public Double getC() {
        return c;
    }

    public Double getFc() {
        return fc;
    }

    public Double getErc() {
        return erc;
    }

    @Override
    public String toString() {
        return c.toString();
    }
}