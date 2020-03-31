package id.haqiqi_studio.regularfalsi;

public class Biseksi {

    public double getC(Double fa, Double fb) {
        return (fa + fb) / 2;
    }

    public double getERC(Double c, Double c1) {
        return Math.abs(c1-c) / Math.abs(c1);
    }

    public double getAccuration(Double c1) {
        return 1 - c1;
    }

    public boolean ifFaFc(Double fa, Double fc) {
        String a = String.valueOf(fa).substring(0, 1);
        //String b = String.valueOf(fb).substring(0, 1);
        String c = String.valueOf(fc).substring(0, 1);

        if (!a.matches("-")) {
            a = "x";
        }

        if (!c.matches("-")) {
            c = "x";
        }

        if (a.matches(c)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean ifFbFc(Double fb, Double fc) {
        String b = String.valueOf(fb).substring(0, 1);
        //String b = String.valueOf(fb).substring(0, 1);
        String c = String.valueOf(fc).substring(0, 1);

        if (!b.matches("-")) {
            b = "x";
        }

        if (!c.matches("-")) {
            c = "x";
        }


        if (b.matches(c)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean compareSignAB(Double a, Double b) {
        String a1 = String.valueOf(a).substring(0, 1);
        String b1 = String.valueOf(b).substring(0, 1);
        if (a1.matches(b1)) {
            return true;
        }
        else {
            return false;
        }
    }
}
