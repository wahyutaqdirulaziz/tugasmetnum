package id.haqiqi_studio.regularfalsi;

import java.util.ArrayList;

public class RegularFalsi {

    //2x^2 - 6x + 1

    public Boolean checkFunction(String func) {
        String start = func.substring(0, 1);
        return !start.matches("x");
    }

    public Integer getCharOnFunctionA(String func) {
        return Integer.parseInt(func.substring(0, 1));
    }

    public double fa(String func, double x) {
        double y;
        if (checkFunction(func)) {
            int start = getCharOnFunctionA(func);
            y = (start * Math.pow(x, 2)) - 6 * (x) + 1;
        } else {
            y = Math.pow(x, 2) - 6 * (x) + 1;
        }
        return y;
    }

    public String fb(double x) {
        double y = Math.pow(x, 2) - 6 * (x) + 1;

        return String.valueOf(y);
    }

    public void analizeFunction(String function) {
        ArrayList<String> arrayList = new ArrayList<>();
        String a, b, c;
        a = function.substring(0, 3);
        b = function.substring(3, 6);
        c = function.substring(6, 8);

    }

}
