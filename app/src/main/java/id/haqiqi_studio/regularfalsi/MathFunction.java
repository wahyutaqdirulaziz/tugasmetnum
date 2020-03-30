package id.haqiqi_studio.regularfalsi;

import android.content.Context;
import android.widget.Toast;

public class MathFunction {
    public String a1, b1, c1, d1, e1, f1, g1, h1, i1;
    public String a2, b2, c2, d2, e2, f2, g2, h2, i2;
    public String a3, b3, c3, d3, e3, f3, g3, h3, i3;


    //region A
    public String getA1(String func) {
        return func.substring(0, 1);
    }

    public String getA2(String func) {
        return func.substring(0, 1);
    }

    public String getA3(String func) {
        return func.substring(0, 1);
    }
    //endregion

    //region B
    public String getB1(String func) {
        return func.substring(1, 2);
    }

    public String getB2(String func) {
        return func.substring(1, 2);
    }

    public String getB3(String func) {
        return func.substring(1, 2);
    }
    //endregion

    //region C
    public String getC1(String func) {
        return func.substring(2, 3);
    }

    public String getC2(String func) {
        return func.substring(2, 3);
    }

    public String getC3(String func) {
        return func.substring(2, 3);
    }
    //endregion

    //region D
    public String getD1(String func) {
        return func.substring(3, 4);
    }

    public String getD2(String func) {
        return func.substring(3, 4);
    }

    public String getD3(String func) {
        return func.substring(3, 4);
    }
    //endregion

    //region E
    public String getE1(String func) {
        return func.substring(4, 5);
    }

    public String getE2(String func) {
        return func.substring(4, 5);
    }

    public String getE3(String func) {
        return func.substring(4, 5);
    }
    //endregion

    //region F
    public String getF1(String func) {
        return func.substring(5, 6);
    }

    public String getF2(String func) {
        return func.substring(5, 6);
    }

    public String getF3(String func) {
        return func.substring(5, 6);
    }
    //endregion

    //region G
    public String getG1(String func) {
        return func.substring(6, 7);
    }

    public String getG2(String func) {
        return func.substring(6, 7);
    }

    public String getG3(String func) {
        return func.substring(6, 7);
    }
    //endregion

    //region H
    public String getH1(String func) {
        return func.substring(7, 8);
    }

    public String getH2(String func) {
        return func.substring(7, 8);
    }

    public String getH3(String func) {
        return func.substring(7, 8);
    }
    //endregion

    //region E
    public String getI1(String func) {
        return func.substring(8, 9);
    }

    public String getI2(String func) {
        return func.substring(8, 9);
    }

    public String getI3(String func) {
        return func.substring(8, 9);
    }
    //endregion

    public int getFunctionLenght(String func) {
        return func.length();
    }

    //x^2-x+1
    //region Analyze Function
    public double initializeFunction(String func, double x) {
        String first, key;
        Double result = 0.0;
        int len = getFunctionLenght(func);
        first = getA1(func);
        if (first.matches("z")) {

        }

        if (len == 8) {
            if (first.matches("x")) {
                String operator1, operator2;
                operator1 = getD1(func);
                operator2 = getG1(func);
                int pangkat = Integer.parseInt(getC1(func));
                int e = Integer.parseInt(getE1(func));
                int h = Integer.parseInt(getH1(func));
                Double c;
                Double d;

                //x^2-16x+1
                //2x^2 - 6x + 1

                if (operator1.matches("-")) {
                    if (operator2.matches("-")) {
                        result = (Math.pow((x), pangkat) - (e * x) - h);
                    } else {
                        result = (Math.pow((x), pangkat) - (e * x) + h);
                    }

                } else {
                    if (operator2.matches("-")) {
                        result = (Math.pow((x), pangkat) + (e * x) - h);
                    } else {
                        result = (Math.pow((x), pangkat) + (e * x) + h);
                    }
                }
            } else {
                String operator1, operator2;
                int koefisienA = Integer.parseInt(getA1(func));
                operator1 = getE1(func);
                operator2 = getG1(func);
                int pangkat = Integer.parseInt(getD1(func));
                int h = Integer.parseInt(getH1(func));

                //2x^2-x+1

                if (operator1.matches("-")) {
                    if (operator2.matches("-")) {
                        result = (koefisienA * (Math.pow((x), pangkat)) - x - h);
                    } else {
                        result = (koefisienA * (Math.pow((x), pangkat)) - x + h);
                    }

                } else {
                    if (operator2.matches("-")) {
                        result = (koefisienA * (Math.pow((x), pangkat)) + x - h);
                    } else {
                        result = (koefisienA * (Math.pow((x), pangkat)) + x + h);
                    }
                }
            }
            return result;
        } else {
            //if len = 9
            String operator1, operator2;
            first = getA1(func);
            operator1 = getE1(func);
            operator2 = getH1(func);

            if (first.matches("2")) {
                int koefisienA = Integer.parseInt(getA1(func));
                key = getG1(func);
                if (key.matches("x")) {
                    int d = Integer.parseInt(getD1(func));
                    int f = Integer.parseInt(getF1(func));
                    int i = Integer.parseInt(getI1(func));

                    //2x^2-1x+1
                    if (operator1.matches("-")) {
                        if (operator2.matches("-")) {
                            result = (koefisienA * (Math.pow(x, d))) - f * x - i;
                        } else {
                            result = (koefisienA * (Math.pow(x, d))) - f * x + i;
                        }

                    } else {
                        if (operator2.matches("-")) {
                            result = (koefisienA * (Math.pow(x, d))) + f * x - i;
                        } else {
                            result = (koefisienA * (Math.pow(x, d))) + f * x + i;
                        }
                    }
                }
            } else {
                operator1 = getD1(func);
                operator2 = getH1(func);
                int pangkat = Integer.parseInt(getC1(func));
                Integer ef = Integer.parseInt(func.substring(4, 6));
                int i = Integer.parseInt(getI1(func));

                //x^2-10x+1

                if (operator1.matches("-")) {
                    if (operator2.matches("-")) {
                        result = (Math.pow((x), pangkat) - (ef * x) - i);
                    } else {
                        result = (Math.pow((x), pangkat) - (ef * x) + i);
                    }

                } else {
                    if (operator2.matches("-")) {
                        result = (Math.pow((x), pangkat) + (ef * x) - i);
                    } else {
                        result = (Math.pow((x), pangkat) + (ef * x) + i);
                    }
                }
            }
            return result;
        }
    }
    //endregion




    public double getValueW(Double fa, Double fb) {
        return fa / (fa - fb);
    }

    public double getValueC(Double a, Double b, double w) {
        return a + w * (b - a);
    }

    public String getSignA(Double fa) {
        String sign = String.valueOf(fa).substring(0, 1);
        if (!sign.matches("-")) {
            sign = "+";
        }
        return sign;
    }

    public String getSignB(Double fb) {
        String sign = String.valueOf(fb).substring(0, 1);
        if (!sign.matches("-")) {
            sign = "+";
        }
        return sign;
    }

    public String getSignC(Double fc) {
        String sign = String.valueOf(fc).substring(0, 1);
        if (!sign.matches("-")) {
            sign = "+";
        }
        return sign;
    }

    public Double calcERC(Double c, Double c1) {
        return (c1 - c) / (c1);
    }

    double rounding(double d, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        d = d * factor;
        long tmp = Math.round(d);
        return (double) tmp / factor;
    }

    public Boolean evaluateFunction(Double fa, Double fc) {
        String signA = getSignA(fa);
        //String signB = getSignB(func);
        String signC = getSignC(fc);

        try {
            if (signC.matches(signA)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public Boolean isConvergen(Double fc) {
        if (fc == 0.0) {
            return false;
        } else {
            return true;
        }
    }


    //region Explore
    public void exploreFunction(String func, Context context) {
        if (getFunctionLenght(func) == 8) {
            a1 = func.substring(0, 1);
            b1 = func.substring(1, 2);
            c1 = func.substring(2, 3);
            d1 = func.substring(3, 4);
            e1 = func.substring(4, 5);
            f1 = func.substring(5, 6);
            g1 = func.substring(6, 7);
            h1 = func.substring(7, 8);
            Toast.makeText(context, a1 + " " + b1 + " " + c1 + " " + d1 + " " + e1 + " " + f1 + " " + g1 + " " + h1, Toast.LENGTH_LONG).show();
        } else {
            a1 = func.substring(0, 1);
            b1 = func.substring(1, 2);
            c1 = func.substring(2, 3);
            d1 = func.substring(3, 4);
            e1 = func.substring(4, 5);
            f1 = func.substring(5, 6);
            g1 = func.substring(6, 7);
            h1 = func.substring(7, 8);
            i1 = func.substring(8, 9);
            Toast.makeText(context, a1 + " " + b1 + " " + c1 + " " + d1 + " " + e1 + " " + f1 + " " + g1 + " " + h1 + " " + i1, Toast.LENGTH_LONG).show();

        }
    }
    //endregion

}
