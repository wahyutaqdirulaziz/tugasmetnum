package id.haqiqi_studio.regularfalsi;

public class ModelSecant {

    private int no;
    private Double xn;
    private Double fxn;
    private Double fxn1;

    public ModelSecant(int no, Double xn, Double fxn, Double fxn1) {
        this.no = no;
        this.xn = xn;
        this.fxn = fxn;
        this.fxn1 = fxn1;
    }

    public int getNo() {
        return no;
    }

    public Double getXn() {
        return xn;
    }

    public Double getFxn() {
        return fxn;
    }

    public Double getFxn1() {
        return fxn1;
    }
}