package id.haqiqi_studio.regularfalsi;

public class Func {

    //x^2+6x+8

    String a, b, c, d, e, f, g, h;


    public String getA(String function) {
        return function.substring(0, 1);
    }


    public String getB(String function) {
        return function.substring(1, 2);
    }


    public String getC(String function) {
        return function.substring(2, 3);
    }

    public String getD(String function) {
        return function.substring(3, 4);
    }

    public String getE(String function) {
        return function.substring(4, 5);
    }

    public String getF(String function) {
        return function.substring(5, 6);
    }

    public String getG(String function) {
        return function.substring(6, 7);
    }

    public String getH(String function) {
        return function.substring(7, 8);
    }

    public Double pecahFungsi(String function, Double x) {
        Double res = 0.0;
        //x^2+6x+8

        String operator1, operator2;
        operator1 = getD(function);
        operator2 = getG(function);

        Double pangkat = Double.parseDouble(getC(function));

        Double koefisien1 = Double.parseDouble(getE(function));

        Double konstatnta = Double.parseDouble(getH(function));




        if (function.length() == 8) {
            if (!operator1.matches("-") && !operator2.matches("-")) {
                res = Math.pow(x, pangkat) + (koefisien1 * x) + konstatnta;
            }
            else  if (operator1.matches(" +") && operator2.matches("-")) {
                res = Math.pow(x, pangkat) + (koefisien1 * x) - konstatnta;
            }
        }
        return res;
    }



}
