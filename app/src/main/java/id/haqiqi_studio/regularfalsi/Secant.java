package id.haqiqi_studio.regularfalsi;

public class Secant {
    MathFunction math = new MathFunction();

    //b-(fb*(b-a)/(fb-fa))
    public double getFXn1(Double a, Double b, Double fXna, Double fXnb) {
        return b - (fXnb * (b-a) / (fXnb-fXna));
    }

    public double getXna(String func, Double a) {
        return math.initializeFunction(func, a);
    }

    public double getXnb(String func, Double b) {
        return math.initializeFunction(func, b);
    }
}
