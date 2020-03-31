package id.haqiqi_studio.regularfalsi;

import android.widget.TextView;
import android.widget.Toast;

public class Matriks {
    MathFunction math = new MathFunction();
    private int roundDigit = 2;

    //region Analyze Function

    //region Matriks 2x3
    public void matriks2x3(TextView inputA1,
                           TextView inputA2, TextView inputB1,
                           TextView inputB2, TextView inputC1,
                           TextView inputC2) {
        //1a+2b+3c+4d+e+6f=200


        //2   3  =  6
        //3   4  = 12

        Double a1, a2, b1, b2, c1, c2, tmpA, tmpB;

        a1 = Double.parseDouble(inputA1.getText().toString());
        a2 = Double.parseDouble(inputA2.getText().toString());
        b1 = Double.parseDouble(inputB1.getText().toString());
        b2 = Double.parseDouble(inputB2.getText().toString());
        c1 = Double.parseDouble(inputC1.getText().toString());
        c2 = Double.parseDouble(inputC2.getText().toString());


        if (a1 != 1.0) {
            b1 = b1 / a1;
            c1 = c1 / a1;
            a1 = a1 / a1;

            if (a2 != 0.0) {
                tmpA = a2;
                a2 = Math.abs(a2 - (a1 * tmpA));
                b2 = b2 - (b1 * tmpA);
                c2 = c2 - (c1 * tmpA);
            }

        } else if (b2 != 1.0) {
            tmpB = b2;
            a2 = Math.abs(a2 / tmpB);
            b2 = b2 / tmpB;
            c2 = c2 / tmpB;
        } else if (b1 != 0.0) {
            tmpB = b1;
            a1 = a1 - (a2 * tmpB);
            b1 = b1 - (b2 * tmpB);
            c1 = c1 - (c2 * tmpB);
        }

        if (c1.toString().length() > 3 || c2.toString().length() > 3) {
            c1 = math.rounding(c1, roundDigit);
            c2 = math.rounding(c2, roundDigit);
        }

        inputA1.setText(String.valueOf(a1));
        inputA2.setText(String.valueOf(a2));
        inputB1.setText(String.valueOf(b1));
        inputB2.setText(String.valueOf(b2));
        inputC1.setText(String.valueOf(c1));
        inputC2.setText(String.valueOf(c2));

    }

    //endregion

    //region Matriks 3x4
    public void matriks3x4(TextView inputA1,
                           TextView inputA2, TextView inputA3, TextView inputB1,
                           TextView inputB2, TextView inputB3, TextView inputC1,
                           TextView inputC2, TextView inputC3, TextView inputD1,
                           TextView inputD2, TextView inputD3) {
        //1a+2b+3c+4d+5e+6f=200


        //2   3  =  6
        //3   4  = 12

        Double a1, a2, a3, b1, b2, b3, c1, c2, c3, d1, d2, d3, tmpA, tmpB, tmpC;

        a1 = Double.parseDouble(inputA1.getText().toString());
        a2 = Double.parseDouble(inputA2.getText().toString());
        a3 = Double.parseDouble(inputA3.getText().toString());
        b1 = Double.parseDouble(inputB1.getText().toString());
        b2 = Double.parseDouble(inputB2.getText().toString());
        b3 = Double.parseDouble(inputB3.getText().toString());
        c1 = Double.parseDouble(inputC1.getText().toString());
        c2 = Double.parseDouble(inputC2.getText().toString());
        c3 = Double.parseDouble(inputC3.getText().toString());
        d1 = Double.parseDouble(inputD1.getText().toString());
        d2 = Double.parseDouble(inputD2.getText().toString());
        d3 = Double.parseDouble(inputD3.getText().toString());


        if (a1 != 1.0) {
            b1 = b1 / a1;
            c1 = c1 / a1;
            d1 = d1 / a1;
            a1 = a1 / a1;

            if (a2 != 0.0) {
                tmpA = a2;
                a2 = Math.abs(a2 - (a1 * tmpA));
                b2 = b2 - (b1 * tmpA);
                c2 = c2 - (c1 * tmpA);
                d2 = d2 - (d1 * tmpA);
            }

            if (a3 != 0.0) {
                tmpA = a3;
                a3 = Math.abs(a3 - (a1 * tmpA));
                b3 = b3 - (b1 * tmpA);
                c3 = c3 - (c1 * tmpA);
                d3 = d3 - (d1 * tmpA);

            }

        } else if (b2 != 1.0) {
            tmpB = b2;
            a2 = Math.abs(a2 / tmpB);
            b2 = b2 / tmpB;
            c2 = c2 / tmpB;
            d2 = d2 / tmpB;

            if (b3 != 0.0) {
                tmpB = b3;
                a3 = a3 - (a2 * tmpB);
                b3 = b3 - (b2 * tmpB);
                c3 = c3 - (c2 * tmpB);
                d3 = d3 - (d2 * tmpB);
            }

            if (b1 != 0.0) {
                tmpB = b1;
                a1 = a1 - (a2 * tmpB);
                b1 = b1 - (b2 * tmpB);
                c1 = c1 - (c2 * tmpB);
                d1 = d1 - (d2 * tmpB);
            }


        } else if (c3 != 1.0) {
            tmpC = c3;
            a3 = Math.abs(a3 / tmpC);
            b3 = b3 / tmpC;
            c3 = c3 / tmpC;
            d3 = d3 / tmpC;

            if (c2 != 0.0) {
                tmpC = c2;
                a2 = a2 - (a3 * tmpC);
                b2 = b2 - (b3 * tmpC);
                c2 = c2 - (c3 * tmpC);
                d2 = d2 - (d3 * tmpC);

            }

            if (c1 != 0.0) {
                tmpC = c1;
                a1 = a1 - (a3 * tmpC);
                b1 = b1 - (b3 * tmpC);
                c1 = c1 - (c3 * tmpC);
                d1 = d1 - (d3 * tmpC);

            }


        } else if (b1 != 0.0) {
            tmpB = b1;
            a1 = a1 - (a2 * tmpB);
            b1 = b1 - (b2 * tmpB);
            c1 = c1 - (c2 * tmpB);


        }

        if (c1.toString().length() > 3 || c2.toString().length() > 3 || c3.toString().length() > 3) {
            c1 = math.rounding(c1, roundDigit);
            c2 = math.rounding(c2, roundDigit);
            c3 = math.rounding(c3, roundDigit);
        }

        if (d1.toString().length() > 3 || d2.toString().length() > 3 || d3.toString().length() > 3) {
            d1 = math.rounding(d1, roundDigit);
            d2 = math.rounding(d2, roundDigit);
            d3 = math.rounding(d3, roundDigit);
        }

        inputA1.setText(String.valueOf(a1));
        inputA2.setText(String.valueOf(a2));
        inputA3.setText(String.valueOf(a3));
        inputB1.setText(String.valueOf(b1));
        inputB2.setText(String.valueOf(b2));
        inputB3.setText(String.valueOf(b3));
        inputC1.setText(String.valueOf(c1));
        inputC2.setText(String.valueOf(c2));
        inputC3.setText(String.valueOf(c3));
        inputD1.setText(String.valueOf(d1));
        inputD2.setText(String.valueOf(d2));
        inputD3.setText(String.valueOf(d3));

    }
    //endregion

    //region Matriks 4x5
    public void matriks4x5(TextView inputA1, TextView inputA2, TextView inputA3, TextView inputA4,
                           TextView inputB1, TextView inputB2, TextView inputB3, TextView inputB4,
                           TextView inputC1, TextView inputC2, TextView inputC3, TextView inputC4,
                           TextView inputD1, TextView inputD2, TextView inputD3, TextView inputD4,
                           TextView inputE1, TextView inputE2, TextView inputE3, TextView inputE4) {
        //1a+2b+3c+4d+5e+6f=200


        //2   3  =  6
        //3   4  = 12

        Double a1, a2, a3, a4, b1, b2, b3, b4, c1, c2, c3, c4, d1, d2, d3, d4, e1, e2, e3, e4, tmpA, tmpB, tmpC, tmpD;

        a1 = Double.parseDouble(inputA1.getText().toString());
        a2 = Double.parseDouble(inputA2.getText().toString());
        a3 = Double.parseDouble(inputA3.getText().toString());
        a4 = Double.parseDouble(inputA4.getText().toString());
        b1 = Double.parseDouble(inputB1.getText().toString());
        b2 = Double.parseDouble(inputB2.getText().toString());
        b3 = Double.parseDouble(inputB3.getText().toString());
        b4 = Double.parseDouble(inputB4.getText().toString());
        c1 = Double.parseDouble(inputC1.getText().toString());
        c2 = Double.parseDouble(inputC2.getText().toString());
        c3 = Double.parseDouble(inputC3.getText().toString());
        c4 = Double.parseDouble(inputC4.getText().toString());
        d1 = Double.parseDouble(inputD1.getText().toString());
        d2 = Double.parseDouble(inputD2.getText().toString());
        d3 = Double.parseDouble(inputD3.getText().toString());
        d4 = Double.parseDouble(inputD4.getText().toString());
        e1 = Double.parseDouble(inputE1.getText().toString());
        e2 = Double.parseDouble(inputE2.getText().toString());
        e3 = Double.parseDouble(inputE3.getText().toString());
        e4 = Double.parseDouble(inputE4.getText().toString());


        if (a1 != 1.0) {
            b1 = b1 / a1;
            c1 = c1 / a1;
            d1 = d1 / a1;
            e1 = e1 / a1;
            a1 = a1 / a1;

            if (a2 != 0.0) {
                tmpA = a2;
                a2 = Math.abs(a2 - (a1 * tmpA));
                b2 = b2 - (b1 * tmpA);
                c2 = c2 - (c1 * tmpA);
                d2 = d2 - (d1 * tmpA);
                e2 = e2 - (e1 * tmpA);
            }

            if (a3 != 0.0) {
                tmpA = a3;
                a3 = Math.abs(a3 - (a1 * tmpA));
                b3 = b3 - (b1 * tmpA);
                c3 = c3 - (c1 * tmpA);
                d3 = d3 - (d1 * tmpA);
                e3 = e3 - (e1 * tmpA);

            }
            if (a4 != 0.0) {
                tmpA = a4;
                a4 = Math.abs(a4 - (a1 * tmpA));
                b4 = b4 - (b1 * tmpA);
                c4 = c4 - (c1 * tmpA);
                d4 = d4 - (d1 * tmpA);
                e4 = e4 - (e1 * tmpA);
            }

        } else if (b2 != 1.0) {
            tmpB = b2;
            a2 = Math.abs(a2 / tmpB);
            b2 = b2 / tmpB;
            c2 = c2 / tmpB;
            d2 = d2 / tmpB;
            e2 = e2 / tmpB;

            if (b3 != 0.0) {
                tmpB = b3;
                a3 = a3 - (a2 * tmpB);
                b3 = b3 - (b2 * tmpB);
                c3 = c3 - (c2 * tmpB);
                d3 = d3 - (d2 * tmpB);
                e3 = e3 - (e2 * tmpB);
            }

            if (b1 != 0.0) {
                tmpB = b1;
                a1 = a1 - (a2 * tmpB);
                b1 = b1 - (b2 * tmpB);
                c1 = c1 - (c2 * tmpB);
                d1 = d1 - (d2 * tmpB);
                e1 = e1 - (e2 * tmpB);
            }

            if (b4 != 0.0) {
                tmpB = b4;
                a4 = a4 - (a2 * tmpB);
                b4 = b4 - (b2 * tmpB);
                c4 = c4 - (c2 * tmpB);
                d4 = d4 - (d2 * tmpB);
                e4 = e4 - (e2 * tmpB);
            }


        } else if (c3 != 1.0) {
            tmpC = c3;
            a3 = Math.abs(a3 / tmpC);
            b3 = b3 / tmpC;
            c3 = c3 / tmpC;
            d3 = d3 / tmpC;
            e3 = e3 / tmpC;

            if (c2 != 0.0) {
                tmpC = c2;
                a2 = a2 - (a3 * tmpC);
                b2 = b2 - (b3 * tmpC);
                c2 = c2 - (c3 * tmpC);
                d2 = d2 - (d3 * tmpC);
                e2 = e2 - (e3 * tmpC);

            }

            if (c1 != 0.0) {
                tmpC = c1;
                a1 = a1 - (a3 * tmpC);
                b1 = b1 - (b3 * tmpC);
                c1 = c1 - (c3 * tmpC);
                d1 = d1 - (d3 * tmpC);
                e1 = e1 - (e3 * tmpC);

            }

            if (c4 != 0.0) {
                tmpC = c4;
                a4 = a4 - (a3 * tmpC);
                b4 = b4 - (b3 * tmpC);
                c4 = c4 - (c3 * tmpC);
                d4 = d4 - (d3 * tmpC);
                e4 = e4 - (e3 * tmpC);

            }


        } else if (d4 != 1.0) {
            tmpD = d4;
            a4 = Math.abs(a4 / tmpD);
            b4 = b4 / tmpD;
            c4 = c4 / tmpD;
            d4 = d4 / tmpD;
            e4 = e4 / tmpD;

            if (d3 != 0.0) {
                tmpD = d3;
                a3 = a3 - (a4 * tmpD);
                b3 = b3 - (b4 * tmpD);
                c3 = c3 - (c4 * tmpD);
                d3 = d3 - (d4 * tmpD);
                e3 = e3 - (e4 * tmpD);

            }

            if (d2 != 0.0) {
                tmpD = d2;
                a2 = a2 - (a4 * tmpD);
                b2 = b2 - (b4 * tmpD);
                c2 = c2 - (c4 * tmpD);
                d2 = d2 - (d4 * tmpD);
                e2 = e2 - (e4 * tmpD);

            }
            if (d1 != 0.0) {
                tmpD = d1;
                a1 = a1 - (a4 * tmpD);
                b1 = b1 - (b4 * tmpD);
                c1 = c1 - (c4 * tmpD);
                d1 = d1 - (d4 * tmpD);
                e1 = e1 - (e4 * tmpD);

            }


        }

        if (d1.toString().length() > 3 || d2.toString().length() > 3 || d3.toString().length() > 3 || d4.toString().length() > 3) {
            d1 = math.rounding(d1, roundDigit);
            d2 = math.rounding(d2, roundDigit);
            d3 = math.rounding(d3, roundDigit);
            d4 = math.rounding(d4, roundDigit);
        }

        if (e1.toString().length() > 3 || e2.toString().length() > 3 || e3.toString().length() > 3 || e4.toString().length() > 3) {
            e1 = math.rounding(e1, roundDigit);
            e2 = math.rounding(e2, roundDigit);
            e3 = math.rounding(e3, roundDigit);
            e4 = math.rounding(e4, roundDigit);
        }

        inputA1.setText(String.valueOf(a1));
        inputA2.setText(String.valueOf(a2));
        inputA3.setText(String.valueOf(a3));
        inputA4.setText(String.valueOf(a4));
        inputB1.setText(String.valueOf(b1));
        inputB2.setText(String.valueOf(b2));
        inputB3.setText(String.valueOf(b3));
        inputB4.setText(String.valueOf(b4));
        inputC1.setText(String.valueOf(c1));
        inputC2.setText(String.valueOf(c2));
        inputC3.setText(String.valueOf(c3));
        inputC4.setText(String.valueOf(c4));
        inputD1.setText(String.valueOf(d1));
        inputD2.setText(String.valueOf(d2));
        inputD3.setText(String.valueOf(d3));
        inputD4.setText(String.valueOf(d4));
        inputE1.setText(String.valueOf(e1));
        inputE2.setText(String.valueOf(e2));
        inputE3.setText(String.valueOf(e3));
        inputE4.setText(String.valueOf(e4));

    }
    //endregion

    //region Matriks 5x6
    public void matriks5x6(TextView inputA1, TextView inputA2, TextView inputA3, TextView inputA4, TextView inputA5,

                           TextView inputB1, TextView inputB2, TextView inputB3, TextView inputB4, TextView inputB5,

                           TextView inputC1, TextView inputC2, TextView inputC3, TextView inputC4, TextView inputC5,

                           TextView inputD1, TextView inputD2, TextView inputD3, TextView inputD4, TextView inputD5,

                           TextView inputE1, TextView inputE2, TextView inputE3, TextView inputE4, TextView inputE5,

                           TextView inputF1, TextView inputF2, TextView inputF3, TextView inputF4, TextView inputF5
    ) {


        Double a1, a2, a3, a4, a5,
                b1, b2, b3, b4, b5,
                c1, c2, c3, c4, c5,
                d1, d2, d3, d4, d5,
                e1, e2, e3, e4, e5,
                f1, f2, f3, f4, f5,
                tmpA, tmpB, tmpC, tmpD, tmpE, tmpF, tmpG, tmpH, tmpI;

        //region Get Value
        a1 = Double.parseDouble(inputA1.getText().toString());
        a2 = Double.parseDouble(inputA2.getText().toString());
        a3 = Double.parseDouble(inputA3.getText().toString());
        a4 = Double.parseDouble(inputA4.getText().toString());
        a5 = Double.parseDouble(inputA5.getText().toString());

        b1 = Double.parseDouble(inputB1.getText().toString());
        b2 = Double.parseDouble(inputB2.getText().toString());
        b3 = Double.parseDouble(inputB3.getText().toString());
        b4 = Double.parseDouble(inputB4.getText().toString());
        b5 = Double.parseDouble(inputB5.getText().toString());

        c1 = Double.parseDouble(inputC1.getText().toString());
        c2 = Double.parseDouble(inputC2.getText().toString());
        c3 = Double.parseDouble(inputC3.getText().toString());
        c4 = Double.parseDouble(inputC4.getText().toString());
        c5 = Double.parseDouble(inputC5.getText().toString());

        d1 = Double.parseDouble(inputD1.getText().toString());
        d2 = Double.parseDouble(inputD2.getText().toString());
        d3 = Double.parseDouble(inputD3.getText().toString());
        d4 = Double.parseDouble(inputD4.getText().toString());
        d5 = Double.parseDouble(inputD5.getText().toString());

        e1 = Double.parseDouble(inputE1.getText().toString());
        e2 = Double.parseDouble(inputE2.getText().toString());
        e3 = Double.parseDouble(inputE3.getText().toString());
        e4 = Double.parseDouble(inputE4.getText().toString());
        e5 = Double.parseDouble(inputE5.getText().toString());

        f1 = Double.parseDouble(inputF1.getText().toString());
        f2 = Double.parseDouble(inputF2.getText().toString());
        f3 = Double.parseDouble(inputF3.getText().toString());
        f4 = Double.parseDouble(inputF4.getText().toString());
        f5 = Double.parseDouble(inputF5.getText().toString());



        //endregion


        if (a1 != 1.0) {
            b1 = b1 / a1;
            c1 = c1 / a1;
            d1 = d1 / a1;
            e1 = e1 / a1;
            f1 = f1 / a1;
            a1 = a1 / a1;

            //region A Columnn
            if (a2 != 0.0) {
                tmpA = a2;
                a2 = Math.abs(a2 - (a1 * tmpA));
                b2 = b2 - (b1 * tmpA);
                c2 = c2 - (c1 * tmpA);
                d2 = d2 - (d1 * tmpA);
                e2 = e2 - (e1 * tmpA);
                f2 = f2 - (f1 * tmpA);
            }

            if (a3 != 0.0) {
                tmpA = a3;
                a3 = Math.abs(a3 - (a1 * tmpA));
                b3 = b3 - (b1 * tmpA);
                c3 = c3 - (c1 * tmpA);
                d3 = d3 - (d1 * tmpA);
                e3 = e3 - (e1 * tmpA);
                f3 = f3 - (f1 * tmpA);

            }
            if (a4 != 0.0) {
                tmpA = a4;
                a4 = Math.abs(a4 - (a1 * tmpA));
                b4 = b4 - (b1 * tmpA);
                c4 = c4 - (c1 * tmpA);
                d4 = d4 - (d1 * tmpA);
                e4 = e4 - (e1 * tmpA);
                f4 = f4 - (f1 * tmpA);
            }

            if (a5 != 0.0) {
                tmpA = a5;
                a5 = Math.abs(a5 - (a1 * tmpA));
                b5 = b5 - (b1 * tmpA);
                c5 = c5 - (c1 * tmpA);
                d5 = d5 - (d1 * tmpA);
                e5 = e5 - (e1 * tmpA);
                f5 = f5 - (f1 * tmpA);
            }


        } else if (b2 != 1.0) {
            tmpB = b2;
            a2 = Math.abs(a2 / tmpB);
            b2 = b2 / tmpB;
            c2 = c2 / tmpB;
            d2 = d2 / tmpB;
            e2 = e2 / tmpB;
            f2 = f2 / tmpB;


            //region B Column
            if (b1 != 0.0) {
                tmpB = b1;
                a1 = a1 - (a2 * tmpB);
                b1 = b1 - (b2 * tmpB);
                c1 = c1 - (c2 * tmpB);
                d1 = d1 - (d2 * tmpB);
                e1 = e1 - (e2 * tmpB);
                f1 = f1 - (f2 * tmpB);
            }

            if (b3 != 0.0) {
                tmpB = b3;
                a3 = a3 - (a2 * tmpB);
                b3 = b3 - (b2 * tmpB);
                c3 = c3 - (c2 * tmpB);
                d3 = d3 - (d2 * tmpB);
                e3 = e3 - (e2 * tmpB);
                f3 = f3 - (f2 * tmpB);
            }

            if (b4 != 0.0) {
                tmpB = b4;
                a4 = a4 - (a2 * tmpB);
                b4 = b4 - (b2 * tmpB);
                c4 = c4 - (c2 * tmpB);
                d4 = d4 - (d2 * tmpB);
                e4 = e4 - (e2 * tmpB);
                f4 = f4 - (f2 * tmpB);
            }

            if (b5 != 0.0) {
                tmpB = b5;
                a5 = a5 - (a2 * tmpB);
                b5 = b5 - (b2 * tmpB);
                c5 = c5 - (c2 * tmpB);
                d5 = d5 - (d2 * tmpB);
                e5 = e5 - (e2 * tmpB);
                f5 = f5 - (f2 * tmpB);
            }


            //endregion


        } else if (c3 != 1.0) {
            tmpC = c3;
            a3 = Math.abs(a3 / tmpC);
            b3 = b3 / tmpC;
            c3 = c3 / tmpC;
            d3 = d3 / tmpC;
            e3 = e3 / tmpC;
            f3 = f3 / tmpC;

            //region C Column
            if (c2 != 0.0) {
                tmpC = c2;
                a2 = a2 - (a3 * tmpC);
                b2 = b2 - (b3 * tmpC);
                c2 = c2 - (c3 * tmpC);
                d2 = d2 - (d3 * tmpC);
                e2 = e2 - (e3 * tmpC);
                f2 = f2 - (f3 * tmpC);
            }

            if (c1 != 0.0) {
                tmpC = c1;
                a1 = a1 - (a3 * tmpC);
                b1 = b1 - (b3 * tmpC);
                c1 = c1 - (c3 * tmpC);
                d1 = d1 - (d3 * tmpC);
                e1 = e1 - (e3 * tmpC);
                f1 = f1 - (f3 * tmpC);
            }

            if (c4 != 0.0) {
                tmpC = c4;
                a4 = a4 - (a3 * tmpC);
                b4 = b4 - (b3 * tmpC);
                c4 = c4 - (c3 * tmpC);
                d4 = d4 - (d3 * tmpC);
                e4 = e4 - (e3 * tmpC);
                f4 = f4 - (f3 * tmpC);
            }

            if (c5 != 0.0) {
                tmpC = c5;
                a5 = a5 - (a3 * tmpC);
                b5 = b5 - (b3 * tmpC);
                c5 = c5 - (c3 * tmpC);
                d5 = d5 - (d3 * tmpC);
                e5 = e5 - (e3 * tmpC);
                f5 = f5 - (f3 * tmpC);
            }


            //endregion

        } else if (d4 != 1.0) {
            tmpD = d4;
            a4 = Math.abs(a4 / tmpD);
            b4 = b4 / tmpD;
            c4 = c4 / tmpD;
            d4 = d4 / tmpD;
            e4 = e4 / tmpD;
            f4 = f4 / tmpD;

            //region D Column
            if (d1 != 0.0) {
                tmpD = d1;
                a1 = a1 - (a4 * tmpD);
                b1 = b1 - (b4 * tmpD);
                c1 = c1 - (c4 * tmpD);
                d1 = d1 - (d4 * tmpD);
                e1 = e1 - (e4 * tmpD);
                f1 = f1 - (f4 * tmpD);
            }

            if (d2 != 0.0) {
                tmpD = d2;
                a2 = a2 - (a4 * tmpD);
                b2 = b2 - (b4 * tmpD);
                c2 = c2 - (c4 * tmpD);
                d2 = d2 - (d4 * tmpD);
                e2 = e2 - (e4 * tmpD);
                f2 = f2 - (f4 * tmpD);
            }

            if (d3 != 0.0) {
                tmpD = d3;
                a3 = a3 - (a4 * tmpD);
                b3 = b3 - (b4 * tmpD);
                c3 = c3 - (c4 * tmpD);
                d3 = d3 - (d4 * tmpD);
                e3 = e3 - (e4 * tmpD);
                f3 = f3 - (f4 * tmpD);
            }

            if (d5 != 0.0) {
                tmpD = d5;
                a5 = a5 - (a4 * tmpD);
                b5 = b5 - (b4 * tmpD);
                c5 = c5 - (c4 * tmpD);
                d5 = d5 - (d4 * tmpD);
                e5 = e5 - (e4 * tmpD);
                f5 = f5 - (f4 * tmpD);
            }


            //endregion

        } else if (e5 != 1.0) {
            tmpE = e5;
            a5 = Math.abs(a5 / tmpE);
            b5 = b5 / tmpE;
            c5 = c5 / tmpE;
            d5 = d5 / tmpE;
            e5 = e5 / tmpE;
            f5 = f5 / tmpE;

            //region E Column
            if (e1 != 0.0) {
                tmpE = e1;
                a1 = a1 - (a5 * tmpE);
                b1 = b1 - (b5 * tmpE);
                c1 = c1 - (c5 * tmpE);
                d1 = d1 - (d5 * tmpE);
                e1 = e1 - (e5 * tmpE);
                f1 = f1 - (f5 * tmpE);
            }

            if (e2 != 0.0) {
                tmpE = e2;
                a2 = a2 - (a5 * tmpE);
                b2 = b2 - (b5 * tmpE);
                c2 = c2 - (c5 * tmpE);
                d2 = d2 - (d5 * tmpE);
                e2 = e2 - (e5 * tmpE);
                f2 = f2 - (f5 * tmpE);
            }

            if (e3 != 0.0) {
                tmpE = e3;
                a3 = a3 - (a5 * tmpE);
                b3 = b3 - (b5 * tmpE);
                c3 = c3 - (c5 * tmpE);
                d3 = d3 - (d5 * tmpE);
                e3 = e3 - (e5 * tmpE);
                f3 = f3 - (f5 * tmpE);
            }

            if (e4 != 0.0) {
                tmpE = e4;
                a4 = a4 - (a5 * tmpE);
                b4 = b4 - (b5 * tmpE);
                c4 = c4 - (c5 * tmpE);
                d4 = d4 - (d5 * tmpE);
                e4 = e4 - (e5 * tmpE);
                f4 = f4 - (f5 * tmpE);
            }


            //endregion

            //endregion



            //endregion



            //endregion

            //endregion
        }


        a1 = math.rounding(a1, roundDigit);
        a2 = math.rounding(a2, roundDigit);
        a3 = math.rounding(a3, roundDigit);
        a4 = math.rounding(a4, roundDigit);
        a5 = math.rounding(a5, roundDigit);


        b1 = math.rounding(b1, roundDigit);
        b2 = math.rounding(b2, roundDigit);
        b3 = math.rounding(b3, roundDigit);
        b4 = math.rounding(b4, roundDigit);
        b5 = math.rounding(b5, roundDigit);

        c1 = math.rounding(c1, roundDigit);
        c2 = math.rounding(c2, roundDigit);
        c3 = math.rounding(c3, roundDigit);
        c4 = math.rounding(c4, roundDigit);
        c5 = math.rounding(c5, roundDigit);

        d1 = math.rounding(d1, roundDigit);
        d2 = math.rounding(d2, roundDigit);
        d3 = math.rounding(d3, roundDigit);
        d4 = math.rounding(d4, roundDigit);
        d5 = math.rounding(d5, roundDigit);

        e1 = math.rounding(e1, roundDigit);
        e2 = math.rounding(e2, roundDigit);
        e3 = math.rounding(e3, roundDigit);
        e4 = math.rounding(e4, roundDigit);
        e5 = math.rounding(e5, roundDigit);

        f1 = math.rounding(f1, roundDigit);
        f2 = math.rounding(f2, roundDigit);
        f3 = math.rounding(f3, roundDigit);
        f4 = math.rounding(f4, roundDigit);
        f5 = math.rounding(f5, roundDigit);


       /* if (d1.toString().length() > 3 || d2.toString().length() > 3 || d3.toString().length() > 3 || d4.toString().length() > 3) {
            d1 = math.rounding(d1, roundDigit);
            d2 = math.rounding(d2, roundDigit);
            d3 = math.rounding(d3, roundDigit);
            d4 = math.rounding(d4, roundDigit);
        }

        if (e1.toString().length() > 3 || e2.toString().length() > 3 || e3.toString().length() > 3 || e4.toString().length() > 3) {
            e1 = math.rounding(e1, roundDigit);
            e2 = math.rounding(e2, roundDigit);
            e3 = math.rounding(e3, roundDigit);
            e4 = math.rounding(e4, roundDigit);
        }*/

        inputA1.setText(String.valueOf(a1));
        inputA2.setText(String.valueOf(a2));
        inputA3.setText(String.valueOf(a3));
        inputA4.setText(String.valueOf(a4));
        inputA5.setText(String.valueOf(a5));

        inputB1.setText(String.valueOf(b1));
        inputB2.setText(String.valueOf(b2));
        inputB3.setText(String.valueOf(b3));
        inputB4.setText(String.valueOf(b4));
        inputB5.setText(String.valueOf(b5));

        inputC1.setText(String.valueOf(c1));
        inputC2.setText(String.valueOf(c2));
        inputC3.setText(String.valueOf(c3));
        inputC4.setText(String.valueOf(c4));
        inputC5.setText(String.valueOf(c5));

        inputD1.setText(String.valueOf(d1));
        inputD2.setText(String.valueOf(d2));
        inputD3.setText(String.valueOf(d3));
        inputD4.setText(String.valueOf(d4));
        inputD5.setText(String.valueOf(d5));

        inputE1.setText(String.valueOf(e1));
        inputE2.setText(String.valueOf(e2));
        inputE3.setText(String.valueOf(e3));
        inputE4.setText(String.valueOf(e4));
        inputE5.setText(String.valueOf(e5));

        inputF1.setText(String.valueOf(f1));
        inputF2.setText(String.valueOf(f2));
        inputF3.setText(String.valueOf(f3));
        inputF4.setText(String.valueOf(f4));
        inputF5.setText(String.valueOf(f5));


    }
    //endregion

    //region Matriks 6x7
    public void matriks6x7(TextView inputA1, TextView inputA2, TextView inputA3, TextView inputA4, TextView inputA5,
                           TextView inputA6,
                           TextView inputB1, TextView inputB2, TextView inputB3, TextView inputB4, TextView inputB5,
                           TextView inputB6,
                           TextView inputC1, TextView inputC2, TextView inputC3, TextView inputC4, TextView inputC5,
                           TextView inputC6,
                           TextView inputD1, TextView inputD2, TextView inputD3, TextView inputD4, TextView inputD5,
                           TextView inputD6,
                           TextView inputE1, TextView inputE2, TextView inputE3, TextView inputE4, TextView inputE5,
                           TextView inputE6,
                           TextView inputF1, TextView inputF2, TextView inputF3, TextView inputF4, TextView inputF5,
                           TextView inputF6,
                           TextView inputG1, TextView inputG2, TextView inputG3, TextView inputG4, TextView inputG5,
                           TextView inputG6
    ) {
        //1a+2b+3c+4d+5e+6f=200


        //2   3  =  6
        //3   4  = 12

        Double a1, a2, a3, a4, a5, a6,
                b1, b2, b3, b4, b5, b6,
                c1, c2, c3, c4, c5, c6,
                d1, d2, d3, d4, d5, d6,
                e1, e2, e3, e4, e5, e6,
                f1, f2, f3, f4, f5, f6,
                g1, g2, g3, g4, g5, g6,
                tmpA, tmpB, tmpC, tmpD, tmpE, tmpF, tmpG, tmpH, tmpI;

        //region Get Value
        a1 = Double.parseDouble(inputA1.getText().toString());
        a2 = Double.parseDouble(inputA2.getText().toString());
        a3 = Double.parseDouble(inputA3.getText().toString());
        a4 = Double.parseDouble(inputA4.getText().toString());
        a5 = Double.parseDouble(inputA5.getText().toString());
        a6 = Double.parseDouble(inputA6.getText().toString());

        b1 = Double.parseDouble(inputB1.getText().toString());
        b2 = Double.parseDouble(inputB2.getText().toString());
        b3 = Double.parseDouble(inputB3.getText().toString());
        b4 = Double.parseDouble(inputB4.getText().toString());
        b5 = Double.parseDouble(inputB5.getText().toString());
        b6 = Double.parseDouble(inputB6.getText().toString());

        c1 = Double.parseDouble(inputC1.getText().toString());
        c2 = Double.parseDouble(inputC2.getText().toString());
        c3 = Double.parseDouble(inputC3.getText().toString());
        c4 = Double.parseDouble(inputC4.getText().toString());
        c5 = Double.parseDouble(inputC5.getText().toString());
        c6 = Double.parseDouble(inputC6.getText().toString());

        d1 = Double.parseDouble(inputD1.getText().toString());
        d2 = Double.parseDouble(inputD2.getText().toString());
        d3 = Double.parseDouble(inputD3.getText().toString());
        d4 = Double.parseDouble(inputD4.getText().toString());
        d5 = Double.parseDouble(inputD5.getText().toString());
        d6 = Double.parseDouble(inputD6.getText().toString());

        e1 = Double.parseDouble(inputE1.getText().toString());
        e2 = Double.parseDouble(inputE2.getText().toString());
        e3 = Double.parseDouble(inputE3.getText().toString());
        e4 = Double.parseDouble(inputE4.getText().toString());
        e5 = Double.parseDouble(inputE5.getText().toString());
        e6 = Double.parseDouble(inputE6.getText().toString());

        f1 = Double.parseDouble(inputF1.getText().toString());
        f2 = Double.parseDouble(inputF2.getText().toString());
        f3 = Double.parseDouble(inputF3.getText().toString());
        f4 = Double.parseDouble(inputF4.getText().toString());
        f5 = Double.parseDouble(inputF5.getText().toString());
        f6 = Double.parseDouble(inputF6.getText().toString());

        g1 = Double.parseDouble(inputG1.getText().toString());
        g2 = Double.parseDouble(inputG2.getText().toString());
        g3 = Double.parseDouble(inputG3.getText().toString());
        g4 = Double.parseDouble(inputG4.getText().toString());
        g5 = Double.parseDouble(inputG5.getText().toString());
        g6 = Double.parseDouble(inputG6.getText().toString());


        //endregion


        if (a1 != 1.0) {
            b1 = b1 / a1;
            c1 = c1 / a1;
            d1 = d1 / a1;
            e1 = e1 / a1;
            f1 = f1 / a1;
            g1 = g1 / a1;
            a1 = a1 / a1;

            //region A Columnn
            if (a2 != 0.0) {
                tmpA = a2;
                a2 = Math.abs(a2 - (a1 * tmpA));
                b2 = b2 - (b1 * tmpA);
                c2 = c2 - (c1 * tmpA);
                d2 = d2 - (d1 * tmpA);
                e2 = e2 - (e1 * tmpA);
                f2 = f2 - (f1 * tmpA);
                g2 = g2 - (g1 * tmpA);
            }

            if (a3 != 0.0) {
                tmpA = a3;
                a3 = Math.abs(a3 - (a1 * tmpA));
                b3 = b3 - (b1 * tmpA);
                c3 = c3 - (c1 * tmpA);
                d3 = d3 - (d1 * tmpA);
                e3 = e3 - (e1 * tmpA);
                f3 = f3 - (f1 * tmpA);
                g3 = g3 - (g1 * tmpA);

            }
            if (a4 != 0.0) {
                tmpA = a4;
                a4 = Math.abs(a4 - (a1 * tmpA));
                b4 = b4 - (b1 * tmpA);
                c4 = c4 - (c1 * tmpA);
                d4 = d4 - (d1 * tmpA);
                e4 = e4 - (e1 * tmpA);
                f4 = f4 - (f1 * tmpA);
                g4 = g4 - (g1 * tmpA);
            }

            if (a5 != 0.0) {
                tmpA = a5;
                a5 = Math.abs(a5 - (a1 * tmpA));
                b5 = b5 - (b1 * tmpA);
                c5 = c5 - (c1 * tmpA);
                d5 = d5 - (d1 * tmpA);
                e5 = e5 - (e1 * tmpA);
                f5 = f5 - (f1 * tmpA);
                g5 = g5 - (g1 * tmpA);
            }

            if (a6 != 0.0) {
                tmpA = a6;
                a6 = Math.abs(a6 - (a1 * tmpA));
                b6 = b6 - (b1 * tmpA);
                c6 = c6 - (c1 * tmpA);
                d6 = d6 - (d1 * tmpA);
                e6 = e6 - (e1 * tmpA);
                f6 = f6 - (f1 * tmpA);
                g6 = g6 - (g1 * tmpA);
            }



        } else if (b2 != 1.0) {
            tmpB = b2;
            a2 = Math.abs(a2 / tmpB);
            b2 = b2 / tmpB;
            c2 = c2 / tmpB;
            d2 = d2 / tmpB;
            e2 = e2 / tmpB;
            f2 = f2 / tmpB;
            g2 = g2 / tmpB;


            //region B Column
            if (b1 != 0.0) {
                tmpB = b1;
                a1 = a1 - (a2 * tmpB);
                b1 = b1 - (b2 * tmpB);
                c1 = c1 - (c2 * tmpB);
                d1 = d1 - (d2 * tmpB);
                e1 = e1 - (e2 * tmpB);
                f1 = f1 - (f2 * tmpB);
                g1 = g1 - (g2 * tmpB);
            }

            if (b3 != 0.0) {
                tmpB = b3;
                a3 = a3 - (a2 * tmpB);
                b3 = b3 - (b2 * tmpB);
                c3 = c3 - (c2 * tmpB);
                d3 = d3 - (d2 * tmpB);
                e3 = e3 - (e2 * tmpB);
                f3 = f3 - (f2 * tmpB);
                g3 = g3 - (g2 * tmpB);
            }

            if (b4 != 0.0) {
                tmpB = b4;
                a4 = a4 - (a2 * tmpB);
                b4 = b4 - (b2 * tmpB);
                c4 = c4 - (c2 * tmpB);
                d4 = d4 - (d2 * tmpB);
                e4 = e4 - (e2 * tmpB);
                f4 = f4 - (f2 * tmpB);
                g4 = g4 - (g2 * tmpB);
            }

            if (b5 != 0.0) {
                tmpB = b5;
                a5 = a5 - (a2 * tmpB);
                b5 = b5 - (b2 * tmpB);
                c5 = c5 - (c2 * tmpB);
                d5 = d5 - (d2 * tmpB);
                e5 = e5 - (e2 * tmpB);
                f5 = f5 - (f2 * tmpB);
                g5 = g5 - (g2 * tmpB);
            }

            if (b6 != 0.0) {
                tmpB = b6;
                a6 = a6 - (a2 * tmpB);
                b6 = b6 - (b2 * tmpB);
                c6 = c6 - (c2 * tmpB);
                d6 = d6 - (d2 * tmpB);
                e6 = e6 - (e2 * tmpB);
                f6 = f6 - (f2 * tmpB);
                g6 = g6 - (g2 * tmpB);
            }


            //endregion


        } else if (c3 != 1.0) {
            tmpC = c3;
            a3 = Math.abs(a3 / tmpC);
            b3 = b3 / tmpC;
            c3 = c3 / tmpC;
            d3 = d3 / tmpC;
            e3 = e3 / tmpC;
            f3 = f3 / tmpC;
            g3 = g3 / tmpC;

            //region C Column
            if (c2 != 0.0) {
                tmpC = c2;
                a2 = a2 - (a3 * tmpC);
                b2 = b2 - (b3 * tmpC);
                c2 = c2 - (c3 * tmpC);
                d2 = d2 - (d3 * tmpC);
                e2 = e2 - (e3 * tmpC);
                f2 = f2 - (f3 * tmpC);
                g2 = g2 - (g3 * tmpC);
            }

            if (c1 != 0.0) {
                tmpC = c1;
                a1 = a1 - (a3 * tmpC);
                b1 = b1 - (b3 * tmpC);
                c1 = c1 - (c3 * tmpC);
                d1 = d1 - (d3 * tmpC);
                e1 = e1 - (e3 * tmpC);
                f1 = f1 - (f3 * tmpC);
                g1 = g1 - (g3 * tmpC);
            }

            if (c4 != 0.0) {
                tmpC = c4;
                a4 = a4 - (a3 * tmpC);
                b4 = b4 - (b3 * tmpC);
                c4 = c4 - (c3 * tmpC);
                d4 = d4 - (d3 * tmpC);
                e4 = e4 - (e3 * tmpC);
                f4 = f4 - (f3 * tmpC);
                g4 = g4 - (g3 * tmpC);
            }

            if (c5 != 0.0) {
                tmpC = c5;
                a5 = a5 - (a3 * tmpC);
                b5 = b5 - (b3 * tmpC);
                c5 = c5 - (c3 * tmpC);
                d5 = d5 - (d3 * tmpC);
                e5 = e5 - (e3 * tmpC);
                f5 = f5 - (f3 * tmpC);
                g5 = g5 - (g3 * tmpC);
            }

            if (c6 != 0.0) {
                tmpC = c6;
                a6 = a6 - (a3 * tmpC);
                b6 = b6 - (b3 * tmpC);
                c6 = c6 - (c3 * tmpC);
                d6 = d6 - (d3 * tmpC);
                e6 = e6 - (e3 * tmpC);
                f6 = f6 - (f3 * tmpC);
                g6 = g6 - (g3 * tmpC);
            }

            //endregion

        } else if (d4 != 1.0) {
            tmpD = d4;
            a4 = Math.abs(a4 / tmpD);
            b4 = b4 / tmpD;
            c4 = c4 / tmpD;
            d4 = d4 / tmpD;
            e4 = e4 / tmpD;
            f4 = f4 / tmpD;
            g4 = g4 / tmpD;

            //region D Column
            if (d1 != 0.0) {
                tmpD = d1;
                a1 = a1 - (a4 * tmpD);
                b1 = b1 - (b4 * tmpD);
                c1 = c1 - (c4 * tmpD);
                d1 = d1 - (d4 * tmpD);
                e1 = e1 - (e4 * tmpD);
                f1 = f1 - (f4 * tmpD);
                g1 = g1 - (g4 * tmpD);
            }

            if (d2 != 0.0) {
                tmpD = d2;
                a2 = a2 - (a4 * tmpD);
                b2 = b2 - (b4 * tmpD);
                c2 = c2 - (c4 * tmpD);
                d2 = d2 - (d4 * tmpD);
                e2 = e2 - (e4 * tmpD);
                f2 = f2 - (f4 * tmpD);
                g2 = g2 - (g4 * tmpD);
            }

            if (d3 != 0.0) {
                tmpD = d3;
                a3 = a3 - (a4 * tmpD);
                b3 = b3 - (b4 * tmpD);
                c3 = c3 - (c4 * tmpD);
                d3 = d3 - (d4 * tmpD);
                e3 = e3 - (e4 * tmpD);
                f3 = f3 - (f4 * tmpD);
                g3 = g3 - (g4 * tmpD);
            }

            if (d5 != 0.0) {
                tmpD = d5;
                a5 = a5 - (a4 * tmpD);
                b5 = b5 - (b4 * tmpD);
                c5 = c5 - (c4 * tmpD);
                d5 = d5 - (d4 * tmpD);
                e5 = e5 - (e4 * tmpD);
                f5 = f5 - (f4 * tmpD);
                g5 = g5 - (g4 * tmpD);
            }

            if (d6 != 0.0) {
                tmpD = d6;
                a6 = a6 - (a4 * tmpD);
                b6 = b6 - (b4 * tmpD);
                c6 = c6 - (c4 * tmpD);
                d6 = d6 - (d4 * tmpD);
                e6 = e6 - (e4 * tmpD);
                f6 = f6 - (f4 * tmpD);
                g6 = g6 - (g4 * tmpD);
            }


            //endregion

        } else if (e5 != 1.0) {
            tmpE = e5;
            a5 = Math.abs(a5 / tmpE);
            b5 = b5 / tmpE;
            c5 = c5 / tmpE;
            d5 = d5 / tmpE;
            e5 = e5 / tmpE;
            f5 = f5 / tmpE;
            g5 = g5 / tmpE;

            //region E Column
            if (e1 != 0.0) {
                tmpE = e1;
                a1 = a1 - (a5 * tmpE);
                b1 = b1 - (b5 * tmpE);
                c1 = c1 - (c5 * tmpE);
                d1 = d1 - (d5 * tmpE);
                e1 = e1 - (e5 * tmpE);
                f1 = f1 - (f5 * tmpE);
                g1 = g1 - (g5 * tmpE);
            }

            if (e2 != 0.0) {
                tmpE = e2;
                a2 = a2 - (a5 * tmpE);
                b2 = b2 - (b5 * tmpE);
                c2 = c2 - (c5 * tmpE);
                d2 = d2 - (d5 * tmpE);
                e2 = e2 - (e5 * tmpE);
                f2 = f2 - (f5 * tmpE);
                g2 = g2 - (g5 * tmpE);
            }

            if (e3 != 0.0) {
                tmpE = e3;
                a3 = a3 - (a5 * tmpE);
                b3 = b3 - (b5 * tmpE);
                c3 = c3 - (c5 * tmpE);
                d3 = d3 - (d5 * tmpE);
                e3 = e3 - (e5 * tmpE);
                f3 = f3 - (f5 * tmpE);
                g3 = g3 - (g5 * tmpE);
            }

            if (e4 != 0.0) {
                tmpE = e4;
                a4 = a4 - (a5 * tmpE);
                b4 = b4 - (b5 * tmpE);
                c4 = c4 - (c5 * tmpE);
                d4 = d4 - (d5 * tmpE);
                e4 = e4 - (e5 * tmpE);
                f4 = f4 - (f5 * tmpE);
                g4 = g4 - (g5 * tmpE);
            }

            if (e6 != 0.0) {
                tmpE = e6;
                a6 = a6 - (a5 * tmpE);
                b6 = b6 - (b5 * tmpE);
                c6 = c6 - (c5 * tmpE);
                d6 = d6 - (d5 * tmpE);
                e6 = e6 - (e5 * tmpE);
                f6 = f6 - (f5 * tmpE);
                g6 = g6 - (g5 * tmpE);
            }


            //endregion


        } else if (f6 != 1.0) {
            tmpF = f6;
            a6 = Math.abs(a6 / tmpF);
            b6 = b6 / tmpF;
            c6 = c6 / tmpF;
            d6 = d6 / tmpF;
            e6 = e6 / tmpF;
            f6 = f6 / tmpF;
            g6 = g6 / tmpF;

            //region F Column
            if (f1 != 0.0) {
                tmpF = f1;
                a1 = a1 - (a6 * tmpF);
                b1 = b1 - (b6 * tmpF);
                c1 = c1 - (c6 * tmpF);
                d1 = d1 - (d6 * tmpF);
                e1 = e1 - (e6 * tmpF);
                f1 = f1 - (f6 * tmpF);
                g1 = g1 - (g6 * tmpF);
            }

            if (f2 != 0.0) {
                tmpF = f2;
                a2 = a2 - (a6 * tmpF);
                b2 = b2 - (b6 * tmpF);
                c2 = c2 - (c6 * tmpF);
                d2 = d2 - (d6 * tmpF);
                e2 = e2 - (e6 * tmpF);
                f2 = f2 - (f6 * tmpF);
                g2 = g2 - (g6 * tmpF);
            }

            if (f3 != 0.0) {
                tmpF = f3;
                a3 = a3 - (a6 * tmpF);
                b3 = b3 - (b6 * tmpF);
                c3 = c3 - (c6 * tmpF);
                d3 = d3 - (d6 * tmpF);
                e3 = e3 - (e6 * tmpF);
                f3 = f3 - (f6 * tmpF);
                g3 = g3 - (g6 * tmpF);
            }

            if (f4 != 0.0) {
                tmpF = f4;
                a4 = a4 - (a6 * tmpF);
                b4 = b4 - (b6 * tmpF);
                c4 = c4 - (c6 * tmpF);
                d4 = d4 - (d6 * tmpF);
                e4 = e4 - (e6 * tmpF);
                f4 = f4 - (f6 * tmpF);
                g4 = g4 - (g6 * tmpF);
            }

            if (f5 != 0.0) {
                tmpF = f5;
                a5 = a5 - (a6 * tmpF);
                b5 = b5 - (b6 * tmpF);
                c5 = c5 - (c6 * tmpF);
                d5 = d5 - (d6 * tmpF);
                e5 = e5 - (e6 * tmpF);
                f5 = f5 - (f6 * tmpF);
                g5 = g5 - (g6 * tmpF);
            }


            //endregion



            //endregion



            //endregion

            //endregion
        }


        a1 = math.rounding(a1, roundDigit);
        a2 = math.rounding(a2, roundDigit);
        a3 = math.rounding(a3, roundDigit);
        a4 = math.rounding(a4, roundDigit);
        a5 = math.rounding(a5, roundDigit);
        a6 = math.rounding(a6, roundDigit);


        b1 = math.rounding(b1, roundDigit);
        b2 = math.rounding(b2, roundDigit);
        b3 = math.rounding(b3, roundDigit);
        b4 = math.rounding(b4, roundDigit);
        b5 = math.rounding(b5, roundDigit);
        b6 = math.rounding(b6, roundDigit);

        c1 = math.rounding(c1, roundDigit);
        c2 = math.rounding(c2, roundDigit);
        c3 = math.rounding(c3, roundDigit);
        c4 = math.rounding(c4, roundDigit);
        c5 = math.rounding(c5, roundDigit);
        c6 = math.rounding(c6, roundDigit);

        d1 = math.rounding(d1, roundDigit);
        d2 = math.rounding(d2, roundDigit);
        d3 = math.rounding(d3, roundDigit);
        d4 = math.rounding(d4, roundDigit);
        d5 = math.rounding(d5, roundDigit);
        d6 = math.rounding(d6, roundDigit);

        e1 = math.rounding(e1, roundDigit);
        e2 = math.rounding(e2, roundDigit);
        e3 = math.rounding(e3, roundDigit);
        e4 = math.rounding(e4, roundDigit);
        e5 = math.rounding(e5, roundDigit);
        e6 = math.rounding(e6, roundDigit);

        f1 = math.rounding(f1, roundDigit);
        f2 = math.rounding(f2, roundDigit);
        f3 = math.rounding(f3, roundDigit);
        f4 = math.rounding(f4, roundDigit);
        f5 = math.rounding(f5, roundDigit);
        f6 = math.rounding(f6, roundDigit);

        g1 = math.rounding(g1, roundDigit);
        g2 = math.rounding(g2, roundDigit);
        g3 = math.rounding(g3, roundDigit);
        g4 = math.rounding(g4, roundDigit);
        g5 = math.rounding(g5, roundDigit);
        g6 = math.rounding(g6, roundDigit);



       /* if (d1.toString().length() > 3 || d2.toString().length() > 3 || d3.toString().length() > 3 || d4.toString().length() > 3) {
            d1 = math.rounding(d1, roundDigit);
            d2 = math.rounding(d2, roundDigit);
            d3 = math.rounding(d3, roundDigit);
            d4 = math.rounding(d4, roundDigit);
        }

        if (e1.toString().length() > 3 || e2.toString().length() > 3 || e3.toString().length() > 3 || e4.toString().length() > 3) {
            e1 = math.rounding(e1, roundDigit);
            e2 = math.rounding(e2, roundDigit);
            e3 = math.rounding(e3, roundDigit);
            e4 = math.rounding(e4, roundDigit);
        }*/

        inputA1.setText(String.valueOf(a1));
        inputA2.setText(String.valueOf(a2));
        inputA3.setText(String.valueOf(a3));
        inputA4.setText(String.valueOf(a4));
        inputA5.setText(String.valueOf(a5));
        inputA6.setText(String.valueOf(a6));

        inputB1.setText(String.valueOf(b1));
        inputB2.setText(String.valueOf(b2));
        inputB3.setText(String.valueOf(b3));
        inputB4.setText(String.valueOf(b4));
        inputB5.setText(String.valueOf(b5));
        inputB6.setText(String.valueOf(b6));

        inputC1.setText(String.valueOf(c1));
        inputC2.setText(String.valueOf(c2));
        inputC3.setText(String.valueOf(c3));
        inputC4.setText(String.valueOf(c4));
        inputC5.setText(String.valueOf(c5));
        inputC6.setText(String.valueOf(c6));

        inputD1.setText(String.valueOf(d1));
        inputD2.setText(String.valueOf(d2));
        inputD3.setText(String.valueOf(d3));
        inputD4.setText(String.valueOf(d4));
        inputD5.setText(String.valueOf(d5));
        inputD6.setText(String.valueOf(d6));

        inputE1.setText(String.valueOf(e1));
        inputE2.setText(String.valueOf(e2));
        inputE3.setText(String.valueOf(e3));
        inputE4.setText(String.valueOf(e4));
        inputE5.setText(String.valueOf(e5));
        inputE6.setText(String.valueOf(e6));

        inputF1.setText(String.valueOf(f1));
        inputF2.setText(String.valueOf(f2));
        inputF3.setText(String.valueOf(f3));
        inputF4.setText(String.valueOf(f4));
        inputF5.setText(String.valueOf(f5));
        inputF6.setText(String.valueOf(f6));

        inputG1.setText(String.valueOf(g1));
        inputG2.setText(String.valueOf(g2));
        inputG3.setText(String.valueOf(g3));
        inputG4.setText(String.valueOf(g4));
        inputG5.setText(String.valueOf(g5));
        inputG6.setText(String.valueOf(g6));



    }
    //endregion

    //region Matriks 7x8
    public void matriks7x8(TextView inputA1, TextView inputA2, TextView inputA3, TextView inputA4, TextView inputA5,
                           TextView inputA6, TextView inputA7,
                           TextView inputB1, TextView inputB2, TextView inputB3, TextView inputB4, TextView inputB5,
                           TextView inputB6, TextView inputB7,
                           TextView inputC1, TextView inputC2, TextView inputC3, TextView inputC4, TextView inputC5,
                           TextView inputC6, TextView inputC7,
                           TextView inputD1, TextView inputD2, TextView inputD3, TextView inputD4, TextView inputD5,
                           TextView inputD6, TextView inputD7,
                           TextView inputE1, TextView inputE2, TextView inputE3, TextView inputE4, TextView inputE5,
                           TextView inputE6, TextView inputE7,
                           TextView inputF1, TextView inputF2, TextView inputF3, TextView inputF4, TextView inputF5,
                           TextView inputF6, TextView inputF7,
                           TextView inputG1, TextView inputG2, TextView inputG3, TextView inputG4, TextView inputG5,
                           TextView inputG6, TextView inputG7,
                           TextView inputH1, TextView inputH2, TextView inputH3, TextView inputH4, TextView inputH5,
                           TextView inputH6, TextView inputH7
    ) {
        //1a+2b+3c+4d+5e+6f=200


        //2   3  =  6
        //3   4  = 12

        Double a1, a2, a3, a4, a5, a6, a7,
                b1, b2, b3, b4, b5, b6, b7,
                c1, c2, c3, c4, c5, c6, c7,
                d1, d2, d3, d4, d5, d6, d7,
                e1, e2, e3, e4, e5, e6, e7,
                f1, f2, f3, f4, f5, f6, f7,
                g1, g2, g3, g4, g5, g6, g7,
                h1, h2, h3, h4, h5, h6, h7,
                tmpA, tmpB, tmpC, tmpD, tmpE, tmpF, tmpG, tmpH, tmpI;

        //region Get Value
        a1 = Double.parseDouble(inputA1.getText().toString());
        a2 = Double.parseDouble(inputA2.getText().toString());
        a3 = Double.parseDouble(inputA3.getText().toString());
        a4 = Double.parseDouble(inputA4.getText().toString());
        a5 = Double.parseDouble(inputA5.getText().toString());
        a6 = Double.parseDouble(inputA6.getText().toString());
        a7 = Double.parseDouble(inputA7.getText().toString());

        b1 = Double.parseDouble(inputB1.getText().toString());
        b2 = Double.parseDouble(inputB2.getText().toString());
        b3 = Double.parseDouble(inputB3.getText().toString());
        b4 = Double.parseDouble(inputB4.getText().toString());
        b5 = Double.parseDouble(inputB5.getText().toString());
        b6 = Double.parseDouble(inputB6.getText().toString());
        b7 = Double.parseDouble(inputB7.getText().toString());

        c1 = Double.parseDouble(inputC1.getText().toString());
        c2 = Double.parseDouble(inputC2.getText().toString());
        c3 = Double.parseDouble(inputC3.getText().toString());
        c4 = Double.parseDouble(inputC4.getText().toString());
        c5 = Double.parseDouble(inputC5.getText().toString());
        c6 = Double.parseDouble(inputC6.getText().toString());
        c7 = Double.parseDouble(inputC7.getText().toString());

        d1 = Double.parseDouble(inputD1.getText().toString());
        d2 = Double.parseDouble(inputD2.getText().toString());
        d3 = Double.parseDouble(inputD3.getText().toString());
        d4 = Double.parseDouble(inputD4.getText().toString());
        d5 = Double.parseDouble(inputD5.getText().toString());
        d6 = Double.parseDouble(inputD6.getText().toString());
        d7 = Double.parseDouble(inputD7.getText().toString());

        e1 = Double.parseDouble(inputE1.getText().toString());
        e2 = Double.parseDouble(inputE2.getText().toString());
        e3 = Double.parseDouble(inputE3.getText().toString());
        e4 = Double.parseDouble(inputE4.getText().toString());
        e5 = Double.parseDouble(inputE5.getText().toString());
        e6 = Double.parseDouble(inputE6.getText().toString());
        e7 = Double.parseDouble(inputE7.getText().toString());

        f1 = Double.parseDouble(inputF1.getText().toString());
        f2 = Double.parseDouble(inputF2.getText().toString());
        f3 = Double.parseDouble(inputF3.getText().toString());
        f4 = Double.parseDouble(inputF4.getText().toString());
        f5 = Double.parseDouble(inputF5.getText().toString());
        f6 = Double.parseDouble(inputF6.getText().toString());
        f7 = Double.parseDouble(inputF7.getText().toString());

        g1 = Double.parseDouble(inputG1.getText().toString());
        g2 = Double.parseDouble(inputG2.getText().toString());
        g3 = Double.parseDouble(inputG3.getText().toString());
        g4 = Double.parseDouble(inputG4.getText().toString());
        g5 = Double.parseDouble(inputG5.getText().toString());
        g6 = Double.parseDouble(inputG6.getText().toString());
        g7 = Double.parseDouble(inputG7.getText().toString());

        h1 = Double.parseDouble(inputH1.getText().toString());
        h2 = Double.parseDouble(inputH2.getText().toString());
        h3 = Double.parseDouble(inputH3.getText().toString());
        h4 = Double.parseDouble(inputH4.getText().toString());
        h5 = Double.parseDouble(inputH5.getText().toString());
        h6 = Double.parseDouble(inputH6.getText().toString());
        h7 = Double.parseDouble(inputH7.getText().toString());

        //endregion


        if (a1 != 1.0) {
            b1 = b1 / a1;
            c1 = c1 / a1;
            d1 = d1 / a1;
            e1 = e1 / a1;
            f1 = f1 / a1;
            g1 = g1 / a1;
            h1 = h1 / a1;
            a1 = a1 / a1;

            //region A Columnn
            if (a2 != 0.0) {
                tmpA = a2;
                a2 = Math.abs(a2 - (a1 * tmpA));
                b2 = b2 - (b1 * tmpA);
                c2 = c2 - (c1 * tmpA);
                d2 = d2 - (d1 * tmpA);
                e2 = e2 - (e1 * tmpA);
                f2 = f2 - (f1 * tmpA);
                g2 = g2 - (g1 * tmpA);
                h2 = h2 - (h1 * tmpA);
            }

            if (a3 != 0.0) {
                tmpA = a3;
                a3 = Math.abs(a3 - (a1 * tmpA));
                b3 = b3 - (b1 * tmpA);
                c3 = c3 - (c1 * tmpA);
                d3 = d3 - (d1 * tmpA);
                e3 = e3 - (e1 * tmpA);
                f3 = f3 - (f1 * tmpA);
                g3 = g3 - (g1 * tmpA);
                h3 = h3 - (h1 * tmpA);

            }
            if (a4 != 0.0) {
                tmpA = a4;
                a4 = Math.abs(a4 - (a1 * tmpA));
                b4 = b4 - (b1 * tmpA);
                c4 = c4 - (c1 * tmpA);
                d4 = d4 - (d1 * tmpA);
                e4 = e4 - (e1 * tmpA);
                f4 = f4 - (f1 * tmpA);
                g4 = g4 - (g1 * tmpA);
                h4 = h4 - (h1 * tmpA);
            }

            if (a5 != 0.0) {
                tmpA = a5;
                a5 = Math.abs(a5 - (a1 * tmpA));
                b5 = b5 - (b1 * tmpA);
                c5 = c5 - (c1 * tmpA);
                d5 = d5 - (d1 * tmpA);
                e5 = e5 - (e1 * tmpA);
                f5 = f5 - (f1 * tmpA);
                g5 = g5 - (g1 * tmpA);
                h5 = h5 - (h1 * tmpA);
            }

            if (a6 != 0.0) {
                tmpA = a6;
                a6 = Math.abs(a6 - (a1 * tmpA));
                b6 = b6 - (b1 * tmpA);
                c6 = c6 - (c1 * tmpA);
                d6 = d6 - (d1 * tmpA);
                e6 = e6 - (e1 * tmpA);
                f6 = f6 - (f1 * tmpA);
                g6 = g6 - (g1 * tmpA);
                h6 = h6 - (h1 * tmpA);
            }

            if (a7 != 0.0) {
                tmpA = a7;
                a7 = Math.abs(a7 - (a1 * tmpA));
                b7 = b7 - (b1 * tmpA);
                c7 = c7 - (c1 * tmpA);
                d7 = d7 - (d1 * tmpA);
                e7 = e7 - (e1 * tmpA);
                f7 = f7 - (f1 * tmpA);
                g7 = g7 - (g1 * tmpA);
                h7 = h7 - (h1 * tmpA);
            }


        } else if (b2 != 1.0) {
            tmpB = b2;
            a2 = Math.abs(a2 / tmpB);
            b2 = b2 / tmpB;
            c2 = c2 / tmpB;
            d2 = d2 / tmpB;
            e2 = e2 / tmpB;
            f2 = f2 / tmpB;
            g2 = g2 / tmpB;
            h2 = h2 / tmpB;


            //region B Column
            if (b1 != 0.0) {
                tmpB = b1;
                a1 = a1 - (a2 * tmpB);
                b1 = b1 - (b2 * tmpB);
                c1 = c1 - (c2 * tmpB);
                d1 = d1 - (d2 * tmpB);
                e1 = e1 - (e2 * tmpB);
                f1 = f1 - (f2 * tmpB);
                g1 = g1 - (g2 * tmpB);
                h1 = h1 - (h2 * tmpB);
            }

            if (b3 != 0.0) {
                tmpB = b3;
                a3 = a3 - (a2 * tmpB);
                b3 = b3 - (b2 * tmpB);
                c3 = c3 - (c2 * tmpB);
                d3 = d3 - (d2 * tmpB);
                e3 = e3 - (e2 * tmpB);
                f3 = f3 - (f2 * tmpB);
                g3 = g3 - (g2 * tmpB);
                h3 = h3 - (h2 * tmpB);
            }

            if (b4 != 0.0) {
                tmpB = b4;
                a4 = a4 - (a2 * tmpB);
                b4 = b4 - (b2 * tmpB);
                c4 = c4 - (c2 * tmpB);
                d4 = d4 - (d2 * tmpB);
                e4 = e4 - (e2 * tmpB);
                f4 = f4 - (f2 * tmpB);
                g4 = g4 - (g2 * tmpB);
                h4 = h4 - (h2 * tmpB);
            }

            if (b5 != 0.0) {
                tmpB = b5;
                a5 = a5 - (a2 * tmpB);
                b5 = b5 - (b2 * tmpB);
                c5 = c5 - (c2 * tmpB);
                d5 = d5 - (d2 * tmpB);
                e5 = e5 - (e2 * tmpB);
                f5 = f5 - (f2 * tmpB);
                g5 = g5 - (g2 * tmpB);
                h5 = h5 - (h2 * tmpB);
            }

            if (b6 != 0.0) {
                tmpB = b6;
                a6 = a6 - (a2 * tmpB);
                b6 = b6 - (b2 * tmpB);
                c6 = c6 - (c2 * tmpB);
                d6 = d6 - (d2 * tmpB);
                e6 = e6 - (e2 * tmpB);
                f6 = f6 - (f2 * tmpB);
                g6 = g6 - (g2 * tmpB);
                h6 = h6 - (h2 * tmpB);
            }

            if (b7 != 0.0) {
                tmpB = b7;
                a7 = a7 - (a2 * tmpB);
                b7 = b7 - (b2 * tmpB);
                c7 = c7 - (c2 * tmpB);
                d7 = d7 - (d2 * tmpB);
                e7 = e7 - (e2 * tmpB);
                f7 = f7 - (f2 * tmpB);
                g7 = g7 - (g2 * tmpB);
                h7 = h7 - (h2 * tmpB);
            }



            //endregion


        } else if (c3 != 1.0) {
            tmpC = c3;
            a3 = Math.abs(a3 / tmpC);
            b3 = b3 / tmpC;
            c3 = c3 / tmpC;
            d3 = d3 / tmpC;
            e3 = e3 / tmpC;
            f3 = f3 / tmpC;
            g3 = g3 / tmpC;
            h3 = h3 / tmpC;

            //region C Column
            if (c2 != 0.0) {
                tmpC = c2;
                a2 = a2 - (a3 * tmpC);
                b2 = b2 - (b3 * tmpC);
                c2 = c2 - (c3 * tmpC);
                d2 = d2 - (d3 * tmpC);
                e2 = e2 - (e3 * tmpC);
                f2 = f2 - (f3 * tmpC);
                g2 = g2 - (g3 * tmpC);
                h2 = h2 - (h3 * tmpC);
            }

            if (c1 != 0.0) {
                tmpC = c1;
                a1 = a1 - (a3 * tmpC);
                b1 = b1 - (b3 * tmpC);
                c1 = c1 - (c3 * tmpC);
                d1 = d1 - (d3 * tmpC);
                e1 = e1 - (e3 * tmpC);
                f1 = f1 - (f3 * tmpC);
                g1 = g1 - (g3 * tmpC);
                h1 = h1 - (h3 * tmpC);
            }

            if (c4 != 0.0) {
                tmpC = c4;
                a4 = a4 - (a3 * tmpC);
                b4 = b4 - (b3 * tmpC);
                c4 = c4 - (c3 * tmpC);
                d4 = d4 - (d3 * tmpC);
                e4 = e4 - (e3 * tmpC);
                f4 = f4 - (f3 * tmpC);
                g4 = g4 - (g3 * tmpC);
                h4 = h4 - (h3 * tmpC);
            }

            if (c5 != 0.0) {
                tmpC = c5;
                a5 = a5 - (a3 * tmpC);
                b5 = b5 - (b3 * tmpC);
                c5 = c5 - (c3 * tmpC);
                d5 = d5 - (d3 * tmpC);
                e5 = e5 - (e3 * tmpC);
                f5 = f5 - (f3 * tmpC);
                g5 = g5 - (g3 * tmpC);
                h5 = h5 - (h3 * tmpC);
            }

            if (c6 != 0.0) {
                tmpC = c6;
                a6 = a6 - (a3 * tmpC);
                b6 = b6 - (b3 * tmpC);
                c6 = c6 - (c3 * tmpC);
                d6 = d6 - (d3 * tmpC);
                e6 = e6 - (e3 * tmpC);
                f6 = f6 - (f3 * tmpC);
                g6 = g6 - (g3 * tmpC);
                h6 = h6 - (h3 * tmpC);
            }

            if (c7 != 0.0) {
                tmpC = c7;
                a7 = a7 - (a3 * tmpC);
                b7 = b7 - (b3 * tmpC);
                c7 = c7 - (c3 * tmpC);
                d7 = d7 - (d3 * tmpC);
                e7 = e7 - (e3 * tmpC);
                f7 = f7 - (f3 * tmpC);
                g7 = g7 - (g3 * tmpC);
                h7 = h7 - (h3 * tmpC);
            }

            //endregion

        } else if (d4 != 1.0) {
            tmpD = d4;
            a4 = Math.abs(a4 / tmpD);
            b4 = b4 / tmpD;
            c4 = c4 / tmpD;
            d4 = d4 / tmpD;
            e4 = e4 / tmpD;
            f4 = f4 / tmpD;
            g4 = g4 / tmpD;
            h4 = h4 / tmpD;

            //region D Column
            if (d1 != 0.0) {
                tmpD = d1;
                a1 = a1 - (a4 * tmpD);
                b1 = b1 - (b4 * tmpD);
                c1 = c1 - (c4 * tmpD);
                d1 = d1 - (d4 * tmpD);
                e1 = e1 - (e4 * tmpD);
                f1 = f1 - (f4 * tmpD);
                g1 = g1 - (g4 * tmpD);
                h1 = h1 - (h4 * tmpD);
            }

            if (d2 != 0.0) {
                tmpD = d2;
                a2 = a2 - (a4 * tmpD);
                b2 = b2 - (b4 * tmpD);
                c2 = c2 - (c4 * tmpD);
                d2 = d2 - (d4 * tmpD);
                e2 = e2 - (e4 * tmpD);
                f2 = f2 - (f4 * tmpD);
                g2 = g2 - (g4 * tmpD);
                h2 = h2 - (h4 * tmpD);
            }

            if (d3 != 0.0) {
                tmpD = d3;
                a3 = a3 - (a4 * tmpD);
                b3 = b3 - (b4 * tmpD);
                c3 = c3 - (c4 * tmpD);
                d3 = d3 - (d4 * tmpD);
                e3 = e3 - (e4 * tmpD);
                f3 = f3 - (f4 * tmpD);
                g3 = g3 - (g4 * tmpD);
                h3 = h3 - (h4 * tmpD);
            }

            if (d5 != 0.0) {
                tmpD = d5;
                a5 = a5 - (a4 * tmpD);
                b5 = b5 - (b4 * tmpD);
                c5 = c5 - (c4 * tmpD);
                d5 = d5 - (d4 * tmpD);
                e5 = e5 - (e4 * tmpD);
                f5 = f5 - (f4 * tmpD);
                g5 = g5 - (g4 * tmpD);
                h5 = h5 - (h4 * tmpD);
            }

            if (d6 != 0.0) {
                tmpD = d6;
                a6 = a6 - (a4 * tmpD);
                b6 = b6 - (b4 * tmpD);
                c6 = c6 - (c4 * tmpD);
                d6 = d6 - (d4 * tmpD);
                e6 = e6 - (e4 * tmpD);
                f6 = f6 - (f4 * tmpD);
                g6 = g6 - (g4 * tmpD);
                h6 = h6 - (h4 * tmpD);
            }

            if (d7 != 0.0) {
                tmpD = d7;
                a7 = a7 - (a4 * tmpD);
                b7 = b7 - (b4 * tmpD);
                c7 = c7 - (c4 * tmpD);
                d7 = d7 - (d4 * tmpD);
                e7 = e7 - (e4 * tmpD);
                f7 = f7 - (f4 * tmpD);
                g7 = g7 - (g4 * tmpD);
                h7 = h7 - (h4 * tmpD);
            }

            //endregion

        } else if (e5 != 1.0) {
            tmpE = e5;
            a5 = Math.abs(a5 / tmpE);
            b5 = b5 / tmpE;
            c5 = c5 / tmpE;
            d5 = d5 / tmpE;
            e5 = e5 / tmpE;
            f5 = f5 / tmpE;
            g5 = g5 / tmpE;
            h5 = h5 / tmpE;

            //region E Column
            if (e1 != 0.0) {
                tmpE = e1;
                a1 = a1 - (a5 * tmpE);
                b1 = b1 - (b5 * tmpE);
                c1 = c1 - (c5 * tmpE);
                d1 = d1 - (d5 * tmpE);
                e1 = e1 - (e5 * tmpE);
                f1 = f1 - (f5 * tmpE);
                g1 = g1 - (g5 * tmpE);
                h1 = h1 - (h5 * tmpE);
            }

            if (e2 != 0.0) {
                tmpE = e2;
                a2 = a2 - (a5 * tmpE);
                b2 = b2 - (b5 * tmpE);
                c2 = c2 - (c5 * tmpE);
                d2 = d2 - (d5 * tmpE);
                e2 = e2 - (e5 * tmpE);
                f2 = f2 - (f5 * tmpE);
                g2 = g2 - (g5 * tmpE);
                h2 = h2 - (h5 * tmpE);
            }

            if (e3 != 0.0) {
                tmpE = e3;
                a3 = a3 - (a5 * tmpE);
                b3 = b3 - (b5 * tmpE);
                c3 = c3 - (c5 * tmpE);
                d3 = d3 - (d5 * tmpE);
                e3 = e3 - (e5 * tmpE);
                f3 = f3 - (f5 * tmpE);
                g3 = g3 - (g5 * tmpE);
                h3 = h3 - (h5 * tmpE);
            }

            if (e4 != 0.0) {
                tmpE = e4;
                a4 = a4 - (a5 * tmpE);
                b4 = b4 - (b5 * tmpE);
                c4 = c4 - (c5 * tmpE);
                d4 = d4 - (d5 * tmpE);
                e4 = e4 - (e5 * tmpE);
                f4 = f4 - (f5 * tmpE);
                g4 = g4 - (g5 * tmpE);
                h4 = h4 - (h5 * tmpE);
            }

            if (e6 != 0.0) {
                tmpE = e6;
                a6 = a6 - (a5 * tmpE);
                b6 = b6 - (b5 * tmpE);
                c6 = c6 - (c5 * tmpE);
                d6 = d6 - (d5 * tmpE);
                e6 = e6 - (e5 * tmpE);
                f6 = f6 - (f5 * tmpE);
                g6 = g6 - (g5 * tmpE);
                h6 = h6 - (h5 * tmpE);
            }

            if (e7 != 0.0) {
                tmpE = e7;
                a7 = a7 - (a5 * tmpE);
                b7 = b7 - (b5 * tmpE);
                c7 = c7 - (c5 * tmpE);
                d7 = d7 - (d5 * tmpE);
                e7 = e7 - (e5 * tmpE);
                f7 = f7 - (f5 * tmpE);
                g7 = g7 - (g5 * tmpE);
                h7 = h7 - (h5 * tmpE);
            }

            //endregion


        } else if (f6 != 1.0) {
            tmpF = f6;
            a6 = Math.abs(a6 / tmpF);
            b6 = b6 / tmpF;
            c6 = c6 / tmpF;
            d6 = d6 / tmpF;
            e6 = e6 / tmpF;
            f6 = f6 / tmpF;
            g6 = g6 / tmpF;
            h6 = h6 / tmpF;

            //region F Column
            if (f1 != 0.0) {
                tmpF = f1;
                a1 = a1 - (a6 * tmpF);
                b1 = b1 - (b6 * tmpF);
                c1 = c1 - (c6 * tmpF);
                d1 = d1 - (d6 * tmpF);
                e1 = e1 - (e6 * tmpF);
                f1 = f1 - (f6 * tmpF);
                g1 = g1 - (g6 * tmpF);
                h1 = h1 - (h6 * tmpF);
            }

            if (f2 != 0.0) {
                tmpF = f2;
                a2 = a2 - (a6 * tmpF);
                b2 = b2 - (b6 * tmpF);
                c2 = c2 - (c6 * tmpF);
                d2 = d2 - (d6 * tmpF);
                e2 = e2 - (e6 * tmpF);
                f2 = f2 - (f6 * tmpF);
                g2 = g2 - (g6 * tmpF);
                h2 = h2 - (h6 * tmpF);
            }

            if (f3 != 0.0) {
                tmpF = f3;
                a3 = a3 - (a6 * tmpF);
                b3 = b3 - (b6 * tmpF);
                c3 = c3 - (c6 * tmpF);
                d3 = d3 - (d6 * tmpF);
                e3 = e3 - (e6 * tmpF);
                f3 = f3 - (f6 * tmpF);
                g3 = g3 - (g6 * tmpF);
                h3 = h3 - (h6 * tmpF);
            }

            if (f4 != 0.0) {
                tmpF = f4;
                a4 = a4 - (a6 * tmpF);
                b4 = b4 - (b6 * tmpF);
                c4 = c4 - (c6 * tmpF);
                d4 = d4 - (d6 * tmpF);
                e4 = e4 - (e6 * tmpF);
                f4 = f4 - (f6 * tmpF);
                g4 = g4 - (g6 * tmpF);
                h4 = h4 - (h6 * tmpF);
            }

            if (f5 != 0.0) {
                tmpF = f5;
                a5 = a5 - (a6 * tmpF);
                b5 = b5 - (b6 * tmpF);
                c5 = c5 - (c6 * tmpF);
                d5 = d5 - (d6 * tmpF);
                e5 = e5 - (e6 * tmpF);
                f5 = f5 - (f6 * tmpF);
                g5 = g5 - (g6 * tmpF);
                h5 = h5 - (h6 * tmpF);
            }

            if (f7 != 0.0) {
                tmpF = f7;
                a7 = a7 - (a6 * tmpF);
                b7 = b7 - (b6 * tmpF);
                c7 = c7 - (c6 * tmpF);
                d7 = d7 - (d6 * tmpF);
                e7 = e7 - (e6 * tmpF);
                f7 = f7 - (f6 * tmpF);
                g7 = g7 - (g6 * tmpF);
                h7 = h7 - (h6 * tmpF);
            }


            //endregion
        }

        else if (g7 != 1.0) {
            tmpG = g7;
            a7 = Math.abs(a7 / tmpG);
            b7 = b7 / tmpG;
            c7 = c7 / tmpG;
            d7 = d7 / tmpG;
            e7 = e7 / tmpG;
            f7 = f7 / tmpG;
            g7 = g7 / tmpG;
            h7 = h7 / tmpG;

            //region G Column
            if (g1 != 0.0) {
                tmpG = g1;
                a1 = a1 - (a7 * tmpG);
                b1 = b1 - (b7 * tmpG);
                c1 = c1 - (c7 * tmpG);
                d1 = d1 - (d7 * tmpG);
                e1 = e1 - (e7 * tmpG);
                f1 = f1 - (f7 * tmpG);
                g1 = g1 - (g7 * tmpG);
                h1 = h1 - (h7 * tmpG);
            }

            if (g2 != 0.0) {
                tmpG = g2;
                a2 = a2 - (a7 * tmpG);
                b2 = b2 - (b7 * tmpG);
                c2 = c2 - (c7 * tmpG);
                d2 = d2 - (d7 * tmpG);
                e2 = e2 - (e7 * tmpG);
                f2 = f2 - (f7 * tmpG);
                g2 = g2 - (g7 * tmpG);
                h2 = h2 - (h7 * tmpG);
            }

            if (g3 != 0.0) {
                tmpG = g3;
                a3 = a3 - (a7 * tmpG);
                b3 = b3 - (b7 * tmpG);
                c3 = c3 - (c7 * tmpG);
                d3 = d3 - (d7 * tmpG);
                e3 = e3 - (e7 * tmpG);
                f3 = f3 - (f7 * tmpG);
                g3 = g3 - (g7 * tmpG);
                h3 = h3 - (h7 * tmpG);
            }

            if (g4 != 0.0) {
                tmpG = g4;
                a4 = a4 - (a7 * tmpG);
                b4 = b4 - (b7 * tmpG);
                c4 = c4 - (c7 * tmpG);
                d4 = d4 - (d7 * tmpG);
                e4 = e4 - (e7 * tmpG);
                f4 = f4 - (f7 * tmpG);
                g4 = g4 - (g7 * tmpG);
                h4 = h4 - (h7 * tmpG);
            }

            if (g5 != 0.0) {
                tmpG = g5;
                a5 = a5 - (a7 * tmpG);
                b5 = b5 - (b7 * tmpG);
                c5 = c5 - (c7 * tmpG);
                d5 = d5 - (d7 * tmpG);
                e5 = e5 - (e7 * tmpG);
                f5 = f5 - (f7 * tmpG);
                g5 = g5 - (g7 * tmpG);
                h5 = h5 - (h7 * tmpG);
            }

            if (g6 != 0.0) {
                tmpG = g6;
                a6 = a6 - (a7 * tmpG);
                b6 = b6 - (b7 * tmpG);
                c6 = c6 - (c7 * tmpG);
                d6 = d6 - (d7 * tmpG);
                e6 = e6 - (e7 * tmpG);
                f6 = f6 - (f7 * tmpG);
                g6 = g6 - (g7 * tmpG);
                h6 = h6 - (h7 * tmpG);
            }



            //endregion



            //endregion

            //endregion
        }


        a1 = math.rounding(a1, roundDigit);
        a2 = math.rounding(a2, roundDigit);
        a3 = math.rounding(a3, roundDigit);
        a4 = math.rounding(a4, roundDigit);
        a5 = math.rounding(a5, roundDigit);
        a6 = math.rounding(a6, roundDigit);
        a7 = math.rounding(a7, roundDigit);


        b1 = math.rounding(b1, roundDigit);
        b2 = math.rounding(b2, roundDigit);
        b3 = math.rounding(b3, roundDigit);
        b4 = math.rounding(b4, roundDigit);
        b5 = math.rounding(b5, roundDigit);
        b6 = math.rounding(b6, roundDigit);
        b7 = math.rounding(b7, roundDigit);

        c1 = math.rounding(c1, roundDigit);
        c2 = math.rounding(c2, roundDigit);
        c3 = math.rounding(c3, roundDigit);
        c4 = math.rounding(c4, roundDigit);
        c5 = math.rounding(c5, roundDigit);
        c6 = math.rounding(c6, roundDigit);
        c7 = math.rounding(c7, roundDigit);

        d1 = math.rounding(d1, roundDigit);
        d2 = math.rounding(d2, roundDigit);
        d3 = math.rounding(d3, roundDigit);
        d4 = math.rounding(d4, roundDigit);
        d5 = math.rounding(d5, roundDigit);
        d6 = math.rounding(d6, roundDigit);
        d7 = math.rounding(d7, roundDigit);

        e1 = math.rounding(e1, roundDigit);
        e2 = math.rounding(e2, roundDigit);
        e3 = math.rounding(e3, roundDigit);
        e4 = math.rounding(e4, roundDigit);
        e5 = math.rounding(e5, roundDigit);
        e6 = math.rounding(e6, roundDigit);
        e7 = math.rounding(e7, roundDigit);

        f1 = math.rounding(f1, roundDigit);
        f2 = math.rounding(f2, roundDigit);
        f3 = math.rounding(f3, roundDigit);
        f4 = math.rounding(f4, roundDigit);
        f5 = math.rounding(f5, roundDigit);
        f6 = math.rounding(f6, roundDigit);
        f7 = math.rounding(f7, roundDigit);

        g1 = math.rounding(g1, roundDigit);
        g2 = math.rounding(g2, roundDigit);
        g3 = math.rounding(g3, roundDigit);
        g4 = math.rounding(g4, roundDigit);
        g5 = math.rounding(g5, roundDigit);
        g6 = math.rounding(g6, roundDigit);
        g7 = math.rounding(g7, roundDigit);

        h1 = math.rounding(h1, roundDigit);
        h2 = math.rounding(h2, roundDigit);
        h3 = math.rounding(h3, roundDigit);
        h4 = math.rounding(h4, roundDigit);
        h5 = math.rounding(h5, roundDigit);
        h6 = math.rounding(h6, roundDigit);
        h7 = math.rounding(h7, roundDigit);


       /* if (d1.toString().length() > 3 || d2.toString().length() > 3 || d3.toString().length() > 3 || d4.toString().length() > 3) {
            d1 = math.rounding(d1, roundDigit);
            d2 = math.rounding(d2, roundDigit);
            d3 = math.rounding(d3, roundDigit);
            d4 = math.rounding(d4, roundDigit);
        }

        if (e1.toString().length() > 3 || e2.toString().length() > 3 || e3.toString().length() > 3 || e4.toString().length() > 3) {
            e1 = math.rounding(e1, roundDigit);
            e2 = math.rounding(e2, roundDigit);
            e3 = math.rounding(e3, roundDigit);
            e4 = math.rounding(e4, roundDigit);
        }*/

        inputA1.setText(String.valueOf(a1));
        inputA2.setText(String.valueOf(a2));
        inputA3.setText(String.valueOf(a3));
        inputA4.setText(String.valueOf(a4));
        inputA5.setText(String.valueOf(a5));
        inputA6.setText(String.valueOf(a6));
        inputA7.setText(String.valueOf(a7));

        inputB1.setText(String.valueOf(b1));
        inputB2.setText(String.valueOf(b2));
        inputB3.setText(String.valueOf(b3));
        inputB4.setText(String.valueOf(b4));
        inputB5.setText(String.valueOf(b5));
        inputB6.setText(String.valueOf(b6));
        inputB7.setText(String.valueOf(b7));

        inputC1.setText(String.valueOf(c1));
        inputC2.setText(String.valueOf(c2));
        inputC3.setText(String.valueOf(c3));
        inputC4.setText(String.valueOf(c4));
        inputC5.setText(String.valueOf(c5));
        inputC6.setText(String.valueOf(c6));
        inputC7.setText(String.valueOf(c7));

        inputD1.setText(String.valueOf(d1));
        inputD2.setText(String.valueOf(d2));
        inputD3.setText(String.valueOf(d3));
        inputD4.setText(String.valueOf(d4));
        inputD5.setText(String.valueOf(d5));
        inputD6.setText(String.valueOf(d6));
        inputD7.setText(String.valueOf(d7));

        inputE1.setText(String.valueOf(e1));
        inputE2.setText(String.valueOf(e2));
        inputE3.setText(String.valueOf(e3));
        inputE4.setText(String.valueOf(e4));
        inputE5.setText(String.valueOf(e5));
        inputE6.setText(String.valueOf(e6));
        inputE7.setText(String.valueOf(e7));

        inputF1.setText(String.valueOf(f1));
        inputF2.setText(String.valueOf(f2));
        inputF3.setText(String.valueOf(f3));
        inputF4.setText(String.valueOf(f4));
        inputF5.setText(String.valueOf(f5));
        inputF6.setText(String.valueOf(f6));
        inputF7.setText(String.valueOf(f7));

        inputG1.setText(String.valueOf(g1));
        inputG2.setText(String.valueOf(g2));
        inputG3.setText(String.valueOf(g3));
        inputG4.setText(String.valueOf(g4));
        inputG5.setText(String.valueOf(g5));
        inputG6.setText(String.valueOf(g6));
        inputG7.setText(String.valueOf(g7));

        inputH1.setText(String.valueOf(h1));
        inputH2.setText(String.valueOf(h2));
        inputH3.setText(String.valueOf(h3));
        inputH4.setText(String.valueOf(h4));
        inputH5.setText(String.valueOf(h5));
        inputH6.setText(String.valueOf(h6));
        inputH7.setText(String.valueOf(h7));



    }
    //endregion

    //region Matriks 8x9
    public void matriks8x9(TextView inputA1, TextView inputA2, TextView inputA3, TextView inputA4, TextView inputA5,
                            TextView inputA6, TextView inputA7, TextView inputA8,
                            TextView inputB1, TextView inputB2, TextView inputB3, TextView inputB4, TextView inputB5,
                            TextView inputB6, TextView inputB7, TextView inputB8,
                            TextView inputC1, TextView inputC2, TextView inputC3, TextView inputC4, TextView inputC5,
                            TextView inputC6, TextView inputC7, TextView inputC8,
                            TextView inputD1, TextView inputD2, TextView inputD3, TextView inputD4, TextView inputD5,
                            TextView inputD6, TextView inputD7, TextView inputD8,
                            TextView inputE1, TextView inputE2, TextView inputE3, TextView inputE4, TextView inputE5,
                            TextView inputE6, TextView inputE7, TextView inputE8,
                            TextView inputF1, TextView inputF2, TextView inputF3, TextView inputF4, TextView inputF5,
                            TextView inputF6, TextView inputF7, TextView inputF8,
                            TextView inputG1, TextView inputG2, TextView inputG3, TextView inputG4, TextView inputG5,
                            TextView inputG6, TextView inputG7, TextView inputG8,
                            TextView inputH1, TextView inputH2, TextView inputH3, TextView inputH4, TextView inputH5,
                            TextView inputH6, TextView inputH7, TextView inputH8,
                            TextView inputI1, TextView inputI2, TextView inputI3, TextView inputI4, TextView inputI5,
                            TextView inputI6, TextView inputI7, TextView inputI8
    ) {
        //1a+2b+3c+4d+5e+6f=200


        //2   3  =  6
        //3   4  = 12

        Double a1, a2, a3, a4, a5, a6, a7, a8,
                b1, b2, b3, b4, b5, b6, b7, b8,
                c1, c2, c3, c4, c5, c6, c7, c8,
                d1, d2, d3, d4, d5, d6, d7, d8,
                e1, e2, e3, e4, e5, e6, e7, e8,
                f1, f2, f3, f4, f5, f6, f7, f8,
                g1, g2, g3, g4, g5, g6, g7, g8,
                h1, h2, h3, h4, h5, h6, h7, h8,
                i1, i2, i3, i4, i5, i6, i7, i8,
                tmpA, tmpB, tmpC, tmpD, tmpE, tmpF, tmpG, tmpH, tmpI;

        //region Get Value
        a1 = Double.parseDouble(inputA1.getText().toString());
        a2 = Double.parseDouble(inputA2.getText().toString());
        a3 = Double.parseDouble(inputA3.getText().toString());
        a4 = Double.parseDouble(inputA4.getText().toString());
        a5 = Double.parseDouble(inputA5.getText().toString());
        a6 = Double.parseDouble(inputA6.getText().toString());
        a7 = Double.parseDouble(inputA7.getText().toString());
        a8 = Double.parseDouble(inputA8.getText().toString());

        b1 = Double.parseDouble(inputB1.getText().toString());
        b2 = Double.parseDouble(inputB2.getText().toString());
        b3 = Double.parseDouble(inputB3.getText().toString());
        b4 = Double.parseDouble(inputB4.getText().toString());
        b5 = Double.parseDouble(inputB5.getText().toString());
        b6 = Double.parseDouble(inputB6.getText().toString());
        b7 = Double.parseDouble(inputB7.getText().toString());
        b8 = Double.parseDouble(inputB8.getText().toString());

        c1 = Double.parseDouble(inputC1.getText().toString());
        c2 = Double.parseDouble(inputC2.getText().toString());
        c3 = Double.parseDouble(inputC3.getText().toString());
        c4 = Double.parseDouble(inputC4.getText().toString());
        c5 = Double.parseDouble(inputC5.getText().toString());
        c6 = Double.parseDouble(inputC6.getText().toString());
        c7 = Double.parseDouble(inputC7.getText().toString());
        c8 = Double.parseDouble(inputC8.getText().toString());

        d1 = Double.parseDouble(inputD1.getText().toString());
        d2 = Double.parseDouble(inputD2.getText().toString());
        d3 = Double.parseDouble(inputD3.getText().toString());
        d4 = Double.parseDouble(inputD4.getText().toString());
        d5 = Double.parseDouble(inputD5.getText().toString());
        d6 = Double.parseDouble(inputD6.getText().toString());
        d7 = Double.parseDouble(inputD7.getText().toString());
        d8 = Double.parseDouble(inputD8.getText().toString());

        e1 = Double.parseDouble(inputE1.getText().toString());
        e2 = Double.parseDouble(inputE2.getText().toString());
        e3 = Double.parseDouble(inputE3.getText().toString());
        e4 = Double.parseDouble(inputE4.getText().toString());
        e5 = Double.parseDouble(inputE5.getText().toString());
        e6 = Double.parseDouble(inputE6.getText().toString());
        e7 = Double.parseDouble(inputE7.getText().toString());
        e8 = Double.parseDouble(inputE8.getText().toString());

        f1 = Double.parseDouble(inputF1.getText().toString());
        f2 = Double.parseDouble(inputF2.getText().toString());
        f3 = Double.parseDouble(inputF3.getText().toString());
        f4 = Double.parseDouble(inputF4.getText().toString());
        f5 = Double.parseDouble(inputF5.getText().toString());
        f6 = Double.parseDouble(inputF6.getText().toString());
        f7 = Double.parseDouble(inputF7.getText().toString());
        f8 = Double.parseDouble(inputF8.getText().toString());

        g1 = Double.parseDouble(inputG1.getText().toString());
        g2 = Double.parseDouble(inputG2.getText().toString());
        g3 = Double.parseDouble(inputG3.getText().toString());
        g4 = Double.parseDouble(inputG4.getText().toString());
        g5 = Double.parseDouble(inputG5.getText().toString());
        g6 = Double.parseDouble(inputG6.getText().toString());
        g7 = Double.parseDouble(inputG7.getText().toString());
        g8 = Double.parseDouble(inputG8.getText().toString());

        h1 = Double.parseDouble(inputH1.getText().toString());
        h2 = Double.parseDouble(inputH2.getText().toString());
        h3 = Double.parseDouble(inputH3.getText().toString());
        h4 = Double.parseDouble(inputH4.getText().toString());
        h5 = Double.parseDouble(inputH5.getText().toString());
        h6 = Double.parseDouble(inputH6.getText().toString());
        h7 = Double.parseDouble(inputH7.getText().toString());
        h8 = Double.parseDouble(inputH8.getText().toString());

        i1 = Double.parseDouble(inputI1.getText().toString());
        i2 = Double.parseDouble(inputI2.getText().toString());
        i3 = Double.parseDouble(inputI3.getText().toString());
        i4 = Double.parseDouble(inputI4.getText().toString());
        i5 = Double.parseDouble(inputI5.getText().toString());
        i6 = Double.parseDouble(inputI6.getText().toString());
        i7 = Double.parseDouble(inputI7.getText().toString());
        i8 = Double.parseDouble(inputI8.getText().toString());

        //endregion


        if (a1 != 1.0) {
            b1 = b1 / a1;
            c1 = c1 / a1;
            d1 = d1 / a1;
            e1 = e1 / a1;
            f1 = f1 / a1;
            g1 = g1 / a1;
            h1 = h1 / a1;
            i1 = i1 / a1;
            a1 = a1 / a1;

            //region A Columnn
            if (a2 != 0.0) {
                tmpA = a2;
                a2 = Math.abs(a2 - (a1 * tmpA));
                b2 = b2 - (b1 * tmpA);
                c2 = c2 - (c1 * tmpA);
                d2 = d2 - (d1 * tmpA);
                e2 = e2 - (e1 * tmpA);
                f2 = f2 - (f1 * tmpA);
                g2 = g2 - (g1 * tmpA);
                h2 = h2 - (h1 * tmpA);
                i2 = i2 - (i1 * tmpA);
            }

            if (a3 != 0.0) {
                tmpA = a3;
                a3 = Math.abs(a3 - (a1 * tmpA));
                b3 = b3 - (b1 * tmpA);
                c3 = c3 - (c1 * tmpA);
                d3 = d3 - (d1 * tmpA);
                e3 = e3 - (e1 * tmpA);
                f3 = f3 - (f1 * tmpA);
                g3 = g3 - (g1 * tmpA);
                h3 = h3 - (h1 * tmpA);
                i3 = i3 - (i1 * tmpA);

            }
            if (a4 != 0.0) {
                tmpA = a4;
                a4 = Math.abs(a4 - (a1 * tmpA));
                b4 = b4 - (b1 * tmpA);
                c4 = c4 - (c1 * tmpA);
                d4 = d4 - (d1 * tmpA);
                e4 = e4 - (e1 * tmpA);
                f4 = f4 - (f1 * tmpA);
                g4 = g4 - (g1 * tmpA);
                h4 = h4 - (h1 * tmpA);
                i4 = i4 - (i1 * tmpA);
            }

            if (a5 != 0.0) {
                tmpA = a5;
                a5 = Math.abs(a5 - (a1 * tmpA));
                b5 = b5 - (b1 * tmpA);
                c5 = c5 - (c1 * tmpA);
                d5 = d5 - (d1 * tmpA);
                e5 = e5 - (e1 * tmpA);
                f5 = f5 - (f1 * tmpA);
                g5 = g5 - (g1 * tmpA);
                h5 = h5 - (h1 * tmpA);
                i5 = i5 - (i1 * tmpA);
            }

            if (a6 != 0.0) {
                tmpA = a6;
                a6 = Math.abs(a6 - (a1 * tmpA));
                b6 = b6 - (b1 * tmpA);
                c6 = c6 - (c1 * tmpA);
                d6 = d6 - (d1 * tmpA);
                e6 = e6 - (e1 * tmpA);
                f6 = f6 - (f1 * tmpA);
                g6 = g6 - (g1 * tmpA);
                h6 = h6 - (h1 * tmpA);
                i6 = i6 - (i1 * tmpA);
            }

            if (a7 != 0.0) {
                tmpA = a7;
                a7 = Math.abs(a7 - (a1 * tmpA));
                b7 = b7 - (b1 * tmpA);
                c7 = c7 - (c1 * tmpA);
                d7 = d7 - (d1 * tmpA);
                e7 = e7 - (e1 * tmpA);
                f7 = f7 - (f1 * tmpA);
                g7 = g7 - (g1 * tmpA);
                h7 = h7 - (h1 * tmpA);
                i7 = i7 - (i1 * tmpA);
            }

            if (a8 != 0.0) {
                tmpA = a8;
                a8 = Math.abs(a8 - (a1 * tmpA));
                b8 = b8 - (b1 * tmpA);
                c8 = c8 - (c1 * tmpA);
                d8 = d8 - (d1 * tmpA);
                e8 = e8 - (e1 * tmpA);
                f8 = f8 - (f1 * tmpA);
                g8 = g8 - (g1 * tmpA);
                h8 = h8 - (h1 * tmpA);
                i8 = i8 - (i1 * tmpA);
            }

        } else if (b2 != 1.0) {
            tmpB = b2;
            a2 = Math.abs(a2 / tmpB);
            b2 = b2 / tmpB;
            c2 = c2 / tmpB;
            d2 = d2 / tmpB;
            e2 = e2 / tmpB;
            f2 = f2 / tmpB;
            g2 = g2 / tmpB;
            h2 = h2 / tmpB;
            i2 = i2 / tmpB;


            //region B Column
            if (b1 != 0.0) {
                tmpB = b1;
                a1 = a1 - (a2 * tmpB);
                b1 = b1 - (b2 * tmpB);
                c1 = c1 - (c2 * tmpB);
                d1 = d1 - (d2 * tmpB);
                e1 = e1 - (e2 * tmpB);
                f1 = f1 - (f2 * tmpB);
                g1 = g1 - (g2 * tmpB);
                h1 = h1 - (h2 * tmpB);
                i1 = i1 - (i2 * tmpB);
            }

            if (b3 != 0.0) {
                tmpB = b3;
                a3 = a3 - (a2 * tmpB);
                b3 = b3 - (b2 * tmpB);
                c3 = c3 - (c2 * tmpB);
                d3 = d3 - (d2 * tmpB);
                e3 = e3 - (e2 * tmpB);
                f3 = f3 - (f2 * tmpB);
                g3 = g3 - (g2 * tmpB);
                h3 = h3 - (h2 * tmpB);
                i3 = i3 - (i2 * tmpB);
            }

            if (b4 != 0.0) {
                tmpB = b4;
                a4 = a4 - (a2 * tmpB);
                b4 = b4 - (b2 * tmpB);
                c4 = c4 - (c2 * tmpB);
                d4 = d4 - (d2 * tmpB);
                e4 = e4 - (e2 * tmpB);
                f4 = f4 - (f2 * tmpB);
                g4 = g4 - (g2 * tmpB);
                h4 = h4 - (h2 * tmpB);
                i4 = i4 - (i2 * tmpB);
            }

            if (b5 != 0.0) {
                tmpB = b5;
                a5 = a5 - (a2 * tmpB);
                b5 = b5 - (b2 * tmpB);
                c5 = c5 - (c2 * tmpB);
                d5 = d5 - (d2 * tmpB);
                e5 = e5 - (e2 * tmpB);
                f5 = f5 - (f2 * tmpB);
                g5 = g5 - (g2 * tmpB);
                h5 = h5 - (h2 * tmpB);
                i5 = i5 - (i2 * tmpB);
            }

            if (b6 != 0.0) {
                tmpB = b6;
                a6 = a6 - (a2 * tmpB);
                b6 = b6 - (b2 * tmpB);
                c6 = c6 - (c2 * tmpB);
                d6 = d6 - (d2 * tmpB);
                e6 = e6 - (e2 * tmpB);
                f6 = f6 - (f2 * tmpB);
                g6 = g6 - (g2 * tmpB);
                h6 = h6 - (h2 * tmpB);
                i6 = i6 - (i2 * tmpB);
            }

            if (b7 != 0.0) {
                tmpB = b7;
                a7 = a7 - (a2 * tmpB);
                b7 = b7 - (b2 * tmpB);
                c7 = c7 - (c2 * tmpB);
                d7 = d7 - (d2 * tmpB);
                e7 = e7 - (e2 * tmpB);
                f7 = f7 - (f2 * tmpB);
                g7 = g7 - (g2 * tmpB);
                h7 = h7 - (h2 * tmpB);
                i7 = i7 - (i2 * tmpB);
            }

            if (b8 != 0.0) {
                tmpB = b8;
                a8 = a8 - (a2 * tmpB);
                b8 = b8 - (b2 * tmpB);
                c8 = c8 - (c2 * tmpB);
                d8 = d8 - (d2 * tmpB);
                e8 = e8 - (e2 * tmpB);
                f8 = f8 - (f2 * tmpB);
                g8 = g8 - (g2 * tmpB);
                h8 = h8 - (h2 * tmpB);
                i8 = i8 - (i2 * tmpB);
            }


            //endregion


        } else if (c3 != 1.0) {
            tmpC = c3;
            a3 = Math.abs(a3 / tmpC);
            b3 = b3 / tmpC;
            c3 = c3 / tmpC;
            d3 = d3 / tmpC;
            e3 = e3 / tmpC;
            f3 = f3 / tmpC;
            g3 = g3 / tmpC;
            h3 = h3 / tmpC;
            i3 = i3 / tmpC;

            //region C Column
            if (c2 != 0.0) {
                tmpC = c2;
                a2 = a2 - (a3 * tmpC);
                b2 = b2 - (b3 * tmpC);
                c2 = c2 - (c3 * tmpC);
                d2 = d2 - (d3 * tmpC);
                e2 = e2 - (e3 * tmpC);
                f2 = f2 - (f3 * tmpC);
                g2 = g2 - (g3 * tmpC);
                h2 = h2 - (h3 * tmpC);
                i2 = i2 - (i3 * tmpC);
            }

            if (c1 != 0.0) {
                tmpC = c1;
                a1 = a1 - (a3 * tmpC);
                b1 = b1 - (b3 * tmpC);
                c1 = c1 - (c3 * tmpC);
                d1 = d1 - (d3 * tmpC);
                e1 = e1 - (e3 * tmpC);
                f1 = f1 - (f3 * tmpC);
                g1 = g1 - (g3 * tmpC);
                h1 = h1 - (h3 * tmpC);
                i1 = i1 - (i3 * tmpC);
            }

            if (c4 != 0.0) {
                tmpC = c4;
                a4 = a4 - (a3 * tmpC);
                b4 = b4 - (b3 * tmpC);
                c4 = c4 - (c3 * tmpC);
                d4 = d4 - (d3 * tmpC);
                e4 = e4 - (e3 * tmpC);
                f4 = f4 - (f3 * tmpC);
                g4 = g4 - (g3 * tmpC);
                h4 = h4 - (h3 * tmpC);
                i4 = i4 - (i3 * tmpC);
            }

            if (c5 != 0.0) {
                tmpC = c5;
                a5 = a5 - (a3 * tmpC);
                b5 = b5 - (b3 * tmpC);
                c5 = c5 - (c3 * tmpC);
                d5 = d5 - (d3 * tmpC);
                e5 = e5 - (e3 * tmpC);
                f5 = f5 - (f3 * tmpC);
                g5 = g5 - (g3 * tmpC);
                h5 = h5 - (h3 * tmpC);
                i5 = i5 - (i3 * tmpC);
            }

            if (c6 != 0.0) {
                tmpC = c6;
                a6 = a6 - (a3 * tmpC);
                b6 = b6 - (b3 * tmpC);
                c6 = c6 - (c3 * tmpC);
                d6 = d6 - (d3 * tmpC);
                e6 = e6 - (e3 * tmpC);
                f6 = f6 - (f3 * tmpC);
                g6 = g6 - (g3 * tmpC);
                h6 = h6 - (h3 * tmpC);
                i6 = i6 - (i3 * tmpC);
            }

            if (c7 != 0.0) {
                tmpC = c7;
                a7 = a7 - (a3 * tmpC);
                b7 = b7 - (b3 * tmpC);
                c7 = c7 - (c3 * tmpC);
                d7 = d7 - (d3 * tmpC);
                e7 = e7 - (e3 * tmpC);
                f7 = f7 - (f3 * tmpC);
                g7 = g7 - (g3 * tmpC);
                h7 = h7 - (h3 * tmpC);
                i7 = i7 - (i3 * tmpC);
            }

            if (c8 != 0.0) {
                tmpC = c8;
                a8 = a8 - (a3 * tmpC);
                b8 = b8 - (b3 * tmpC);
                c8 = c8 - (c3 * tmpC);
                d8 = d8 - (d3 * tmpC);
                e8 = e8 - (e3 * tmpC);
                f8 = f8 - (f3 * tmpC);
                g8 = g8 - (g3 * tmpC);
                h8 = h8 - (h3 * tmpC);
                i8 = i8 - (i3 * tmpC);
            }

            //endregion

        } else if (d4 != 1.0) {
            tmpD = d4;
            a4 = Math.abs(a4 / tmpD);
            b4 = b4 / tmpD;
            c4 = c4 / tmpD;
            d4 = d4 / tmpD;
            e4 = e4 / tmpD;
            f4 = f4 / tmpD;
            g4 = g4 / tmpD;
            h4 = h4 / tmpD;
            i4 = i4 / tmpD;

            //region D Column
            if (d1 != 0.0) {
                tmpD = d1;
                a1 = a1 - (a4 * tmpD);
                b1 = b1 - (b4 * tmpD);
                c1 = c1 - (c4 * tmpD);
                d1 = d1 - (d4 * tmpD);
                e1 = e1 - (e4 * tmpD);
                f1 = f1 - (f4 * tmpD);
                g1 = g1 - (g4 * tmpD);
                h1 = h1 - (h4 * tmpD);
                i1 = i1 - (i4 * tmpD);
            }

            if (d2 != 0.0) {
                tmpD = d2;
                a2 = a2 - (a4 * tmpD);
                b2 = b2 - (b4 * tmpD);
                c2 = c2 - (c4 * tmpD);
                d2 = d2 - (d4 * tmpD);
                e2 = e2 - (e4 * tmpD);
                f2 = f2 - (f4 * tmpD);
                g2 = g2 - (g4 * tmpD);
                h2 = h2 - (h4 * tmpD);
                i2 = i2 - (i4 * tmpD);
            }

            if (d3 != 0.0) {
                tmpD = d3;
                a3 = a3 - (a4 * tmpD);
                b3 = b3 - (b4 * tmpD);
                c3 = c3 - (c4 * tmpD);
                d3 = d3 - (d4 * tmpD);
                e3 = e3 - (e4 * tmpD);
                f3 = f3 - (f4 * tmpD);
                g3 = g3 - (g4 * tmpD);
                h3 = h3 - (h4 * tmpD);
                i3 = i3 - (i4 * tmpD);
            }

            if (d5 != 0.0) {
                tmpD = d5;
                a5 = a5 - (a4 * tmpD);
                b5 = b5 - (b4 * tmpD);
                c5 = c5 - (c4 * tmpD);
                d5 = d5 - (d4 * tmpD);
                e5 = e5 - (e4 * tmpD);
                f5 = f5 - (f4 * tmpD);
                g5 = g5 - (g4 * tmpD);
                h5 = h5 - (h4 * tmpD);
                i5 = i5 - (i4 * tmpD);
            }

            if (d6 != 0.0) {
                tmpD = d6;
                a6 = a6 - (a4 * tmpD);
                b6 = b6 - (b4 * tmpD);
                c6 = c6 - (c4 * tmpD);
                d6 = d6 - (d4 * tmpD);
                e6 = e6 - (e4 * tmpD);
                f6 = f6 - (f4 * tmpD);
                g6 = g6 - (g4 * tmpD);
                h6 = h6 - (h4 * tmpD);
                i6 = i6 - (i4 * tmpD);
            }

            if (d7 != 0.0) {
                tmpD = d7;
                a7 = a7 - (a4 * tmpD);
                b7 = b7 - (b4 * tmpD);
                c7 = c7 - (c4 * tmpD);
                d7 = d7 - (d4 * tmpD);
                e7 = e7 - (e4 * tmpD);
                f7 = f7 - (f4 * tmpD);
                g7 = g7 - (g4 * tmpD);
                h7 = h7 - (h4 * tmpD);
                i7 = i7 - (i4 * tmpD);
            }

            if (d8 != 0.0) {
                tmpD = d8;
                a8 = a8 - (a4 * tmpD);
                b8 = b8 - (b4 * tmpD);
                c8 = c8 - (c4 * tmpD);
                d8 = d8 - (d4 * tmpD);
                e8 = e8 - (e4 * tmpD);
                f8 = f8 - (f4 * tmpD);
                g8 = g8 - (g4 * tmpD);
                h8 = h8 - (h4 * tmpD);
                i8 = i8 - (i4 * tmpD);
            }

            //endregion

        } else if (e5 != 1.0) {
            tmpE = e5;
            a5 = Math.abs(a5 / tmpE);
            b5 = b5 / tmpE;
            c5 = c5 / tmpE;
            d5 = d5 / tmpE;
            e5 = e5 / tmpE;
            f5 = f5 / tmpE;
            g5 = g5 / tmpE;
            h5 = h5 / tmpE;
            i5 = i5 / tmpE;

            //region E Column
            if (e1 != 0.0) {
                tmpE = e1;
                a1 = a1 - (a5 * tmpE);
                b1 = b1 - (b5 * tmpE);
                c1 = c1 - (c5 * tmpE);
                d1 = d1 - (d5 * tmpE);
                e1 = e1 - (e5 * tmpE);
                f1 = f1 - (f5 * tmpE);
                g1 = g1 - (g5 * tmpE);
                h1 = h1 - (h5 * tmpE);
                i1 = i1 - (i5 * tmpE);
            }

            if (e2 != 0.0) {
                tmpE = e2;
                a2 = a2 - (a5 * tmpE);
                b2 = b2 - (b5 * tmpE);
                c2 = c2 - (c5 * tmpE);
                d2 = d2 - (d5 * tmpE);
                e2 = e2 - (e5 * tmpE);
                f2 = f2 - (f5 * tmpE);
                g2 = g2 - (g5 * tmpE);
                h2 = h2 - (h5 * tmpE);
                i2 = i2 - (i5 * tmpE);
            }

            if (e3 != 0.0) {
                tmpE = e3;
                a3 = a3 - (a5 * tmpE);
                b3 = b3 - (b5 * tmpE);
                c3 = c3 - (c5 * tmpE);
                d3 = d3 - (d5 * tmpE);
                e3 = e3 - (e5 * tmpE);
                f3 = f3 - (f5 * tmpE);
                g3 = g3 - (g5 * tmpE);
                h3 = h3 - (h5 * tmpE);
                i3 = i3 - (i5 * tmpE);
            }

            if (e4 != 0.0) {
                tmpE = e4;
                a4 = a4 - (a5 * tmpE);
                b4 = b4 - (b5 * tmpE);
                c4 = c4 - (c5 * tmpE);
                d4 = d4 - (d5 * tmpE);
                e4 = e4 - (e5 * tmpE);
                f4 = f4 - (f5 * tmpE);
                g4 = g4 - (g5 * tmpE);
                h4 = h4 - (h5 * tmpE);
                i4 = i4 - (i5 * tmpE);
            }

            if (e6 != 0.0) {
                tmpE = e6;
                a6 = a6 - (a5 * tmpE);
                b6 = b6 - (b5 * tmpE);
                c6 = c6 - (c5 * tmpE);
                d6 = d6 - (d5 * tmpE);
                e6 = e6 - (e5 * tmpE);
                f6 = f6 - (f5 * tmpE);
                g6 = g6 - (g5 * tmpE);
                h6 = h6 - (h5 * tmpE);
                i6 = i6 - (i5 * tmpE);
            }

            if (e7 != 0.0) {
                tmpE = e7;
                a7 = a7 - (a5 * tmpE);
                b7 = b7 - (b5 * tmpE);
                c7 = c7 - (c5 * tmpE);
                d7 = d7 - (d5 * tmpE);
                e7 = e7 - (e5 * tmpE);
                f7 = f7 - (f5 * tmpE);
                g7 = g7 - (g5 * tmpE);
                h7 = h7 - (h5 * tmpE);
                i7 = i7 - (i5 * tmpE);
            }

            if (e8 != 0.0) {
                tmpE = e8;
                a8 = a8 - (a5 * tmpE);
                b8 = b8 - (b5 * tmpE);
                c8 = c8 - (c5 * tmpE);
                d8 = d8 - (d5 * tmpE);
                e8 = e8 - (e5 * tmpE);
                f8 = f8 - (f5 * tmpE);
                g8 = g8 - (g5 * tmpE);
                h8 = h8 - (h5 * tmpE);
                i8 = i8 - (i5 * tmpE);
            }


            //endregion


        } else if (f6 != 1.0) {
            tmpF = f6;
            a6 = Math.abs(a6 / tmpF);
            b6 = b6 / tmpF;
            c6 = c6 / tmpF;
            d6 = d6 / tmpF;
            e6 = e6 / tmpF;
            f6 = f6 / tmpF;
            g6 = g6 / tmpF;
            h6 = h6 / tmpF;
            i6 = i6 / tmpF;

            //region F Column
            if (f1 != 0.0) {
                tmpF = f1;
                a1 = a1 - (a6 * tmpF);
                b1 = b1 - (b6 * tmpF);
                c1 = c1 - (c6 * tmpF);
                d1 = d1 - (d6 * tmpF);
                e1 = e1 - (e6 * tmpF);
                f1 = f1 - (f6 * tmpF);
                g1 = g1 - (g6 * tmpF);
                h1 = h1 - (h6 * tmpF);
                i1 = i1 - (i6 * tmpF);
            }

            if (f2 != 0.0) {
                tmpF = f2;
                a2 = a2 - (a6 * tmpF);
                b2 = b2 - (b6 * tmpF);
                c2 = c2 - (c6 * tmpF);
                d2 = d2 - (d6 * tmpF);
                e2 = e2 - (e6 * tmpF);
                f2 = f2 - (f6 * tmpF);
                g2 = g2 - (g6 * tmpF);
                h2 = h2 - (h6 * tmpF);
                i2 = i2 - (i6 * tmpF);
            }

            if (f3 != 0.0) {
                tmpF = f3;
                a3 = a3 - (a6 * tmpF);
                b3 = b3 - (b6 * tmpF);
                c3 = c3 - (c6 * tmpF);
                d3 = d3 - (d6 * tmpF);
                e3 = e3 - (e6 * tmpF);
                f3 = f3 - (f6 * tmpF);
                g3 = g3 - (g6 * tmpF);
                h3 = h3 - (h6 * tmpF);
                i3 = i3 - (i6 * tmpF);
            }

            if (f4 != 0.0) {
                tmpF = f4;
                a4 = a4 - (a6 * tmpF);
                b4 = b4 - (b6 * tmpF);
                c4 = c4 - (c6 * tmpF);
                d4 = d4 - (d6 * tmpF);
                e4 = e4 - (e6 * tmpF);
                f4 = f4 - (f6 * tmpF);
                g4 = g4 - (g6 * tmpF);
                h4 = h4 - (h6 * tmpF);
                i4 = i4 - (i6 * tmpF);
            }

            if (f5 != 0.0) {
                tmpF = f5;
                a5 = a5 - (a6 * tmpF);
                b5 = b5 - (b6 * tmpF);
                c5 = c5 - (c6 * tmpF);
                d5 = d5 - (d6 * tmpF);
                e5 = e5 - (e6 * tmpF);
                f5 = f5 - (f6 * tmpF);
                g5 = g5 - (g6 * tmpF);
                h5 = h5 - (h6 * tmpF);
                i5 = i5 - (i6 * tmpF);
            }

            if (f7 != 0.0) {
                tmpF = f7;
                a7 = a7 - (a6 * tmpF);
                b7 = b7 - (b6 * tmpF);
                c7 = c7 - (c6 * tmpF);
                d7 = d7 - (d6 * tmpF);
                e7 = e7 - (e6 * tmpF);
                f7 = f7 - (f6 * tmpF);
                g7 = g7 - (g6 * tmpF);
                h7 = h7 - (h6 * tmpF);
                i7 = i7 - (i6 * tmpF);
            }

            if (f8 != 0.0) {
                tmpF = f8;
                a8 = a8 - (a6 * tmpF);
                b8 = b8 - (b6 * tmpF);
                c8 = c8 - (c6 * tmpF);
                d8 = d8 - (d6 * tmpF);
                e8 = e8 - (e6 * tmpF);
                f8 = f8 - (f6 * tmpF);
                g8 = g8 - (g6 * tmpF);
                h8 = h8 - (h6 * tmpF);
                i8 = i8 - (i6 * tmpF);
            }

            //endregion
        }

        else if (g7 != 1.0) {
            tmpG = g7;
            a7 = Math.abs(a7 / tmpG);
            b7 = b7 / tmpG;
            c7 = c7 / tmpG;
            d7 = d7 / tmpG;
            e7 = e7 / tmpG;
            f7 = f7 / tmpG;
            g7 = g7 / tmpG;
            h7 = h7 / tmpG;
            i7 = i7 / tmpG;

            //region G Column
            if (g1 != 0.0) {
                tmpG = g1;
                a1 = a1 - (a7 * tmpG);
                b1 = b1 - (b7 * tmpG);
                c1 = c1 - (c7 * tmpG);
                d1 = d1 - (d7 * tmpG);
                e1 = e1 - (e7 * tmpG);
                f1 = f1 - (f7 * tmpG);
                g1 = g1 - (g7 * tmpG);
                h1 = h1 - (h7 * tmpG);
                i1 = i1 - (i7 * tmpG);
            }

            if (g2 != 0.0) {
                tmpG = g2;
                a2 = a2 - (a7 * tmpG);
                b2 = b2 - (b7 * tmpG);
                c2 = c2 - (c7 * tmpG);
                d2 = d2 - (d7 * tmpG);
                e2 = e2 - (e7 * tmpG);
                f2 = f2 - (f7 * tmpG);
                g2 = g2 - (g7 * tmpG);
                h2 = h2 - (h7 * tmpG);
                i2 = i2 - (i7 * tmpG);
            }

            if (g3 != 0.0) {
                tmpG = g3;
                a3 = a3 - (a7 * tmpG);
                b3 = b3 - (b7 * tmpG);
                c3 = c3 - (c7 * tmpG);
                d3 = d3 - (d7 * tmpG);
                e3 = e3 - (e7 * tmpG);
                f3 = f3 - (f7 * tmpG);
                g3 = g3 - (g7 * tmpG);
                h3 = h3 - (h7 * tmpG);
                i3 = i3 - (i7 * tmpG);
            }

            if (g4 != 0.0) {
                tmpG = g4;
                a4 = a4 - (a7 * tmpG);
                b4 = b4 - (b7 * tmpG);
                c4 = c4 - (c7 * tmpG);
                d4 = d4 - (d7 * tmpG);
                e4 = e4 - (e7 * tmpG);
                f4 = f4 - (f7 * tmpG);
                g4 = g4 - (g7 * tmpG);
                h4 = h4 - (h7 * tmpG);
                i4 = i4 - (i7 * tmpG);
            }

            if (g5 != 0.0) {
                tmpG = g5;
                a5 = a5 - (a7 * tmpG);
                b5 = b5 - (b7 * tmpG);
                c5 = c5 - (c7 * tmpG);
                d5 = d5 - (d7 * tmpG);
                e5 = e5 - (e7 * tmpG);
                f5 = f5 - (f7 * tmpG);
                g5 = g5 - (g7 * tmpG);
                h5 = h5 - (h7 * tmpG);
                i5 = i5 - (i7 * tmpG);
            }

            if (g6 != 0.0) {
                tmpG = g6;
                a6 = a6 - (a7 * tmpG);
                b6 = b6 - (b7 * tmpG);
                c6 = c6 - (c7 * tmpG);
                d6 = d6 - (d7 * tmpG);
                e6 = e6 - (e7 * tmpG);
                f6 = f6 - (f7 * tmpG);
                g6 = g6 - (g7 * tmpG);
                h6 = h6 - (h7 * tmpG);
                i6 = i6 - (i7 * tmpG);
            }

            if (g8 != 0.0) {
                tmpG = g8;
                a8 = a8 - (a7 * tmpG);
                b8 = b8 - (b7 * tmpG);
                c8 = c8 - (c7 * tmpG);
                d8 = d8 - (d7 * tmpG);
                e8 = e8 - (e7 * tmpG);
                f8 = f8 - (f7 * tmpG);
                g8 = g8 - (g7 * tmpG);
                h8 = h8 - (h7 * tmpG);
                i8 = i8 - (i7 * tmpG);
            }


            //endregion

        } else if (h8 != 1.0) {
            tmpH = h8;
            a8 = Math.abs(a8 / tmpH);
            b8 = b8 / tmpH;
            c8 = c8 / tmpH;
            d8 = d8 / tmpH;
            e8 = e8 / tmpH;
            f8 = f8 / tmpH;
            g8 = g8 / tmpH;
            h8 = h8 / tmpH;
            i8 = i8 / tmpH;

            //region H Column
            if (h1 != 0.0) {
                tmpH = h1;
                a1 = a1 - (a8 * tmpH);
                b1 = b1 - (b8 * tmpH);
                c1 = c1 - (c8 * tmpH);
                d1 = d1 - (d8 * tmpH);
                e1 = e1 - (e8 * tmpH);
                f1 = f1 - (f8 * tmpH);
                g1 = g1 - (g8 * tmpH);
                h1 = h1 - (h8 * tmpH);
                i1 = i1 - (i8 * tmpH);
            }

            if (h2 != 0.0) {
                tmpH = h2;
                a2 = a2 - (a8 * tmpH);
                b2 = b2 - (b8 * tmpH);
                c2 = c2 - (c8 * tmpH);
                d2 = d2 - (d8 * tmpH);
                e2 = e2 - (e8 * tmpH);
                f2 = f2 - (f8 * tmpH);
                g2 = g2 - (g8 * tmpH);
                h2 = h2 - (h8 * tmpH);
                i2 = i2 - (i8 * tmpH);
            }

            if (h3 != 0.0) {
                tmpH = h3;
                a3 = a3 - (a8 * tmpH);
                b3 = b3 - (b8 * tmpH);
                c3 = c3 - (c8 * tmpH);
                d3 = d3 - (d8 * tmpH);
                e3 = e3 - (e8 * tmpH);
                f3 = f3 - (f8 * tmpH);
                g3 = g3 - (g8 * tmpH);
                h3 = h3 - (h8 * tmpH);
                i3 = i3 - (i8 * tmpH);
            }

            if (h4 != 0.0) {
                tmpH = h4;
                a4 = a4 - (a8 * tmpH);
                b4 = b4 - (b8 * tmpH);
                c4 = c4 - (c8 * tmpH);
                d4 = d4 - (d8 * tmpH);
                e4 = e4 - (e8 * tmpH);
                f4 = f4 - (f8 * tmpH);
                g4 = g4 - (g8 * tmpH);
                h4 = h4 - (h8 * tmpH);
                i4 = i4 - (i8 * tmpH);
            }


            if (h5 != 0.0) {
                tmpH = h5;
                a5 = a5 - (a8 * tmpH);
                b5 = b5 - (b8 * tmpH);
                c5 = c5 - (c8 * tmpH);
                d5 = d5 - (d8 * tmpH);
                e5 = e5 - (e8 * tmpH);
                f5 = f5 - (f8 * tmpH);
                g5 = g5 - (g8 * tmpH);
                h5 = h5 - (h8 * tmpH);
                i5 = i5 - (i8 * tmpH);
            }


            if (h6 != 0.0) {
                tmpH = h6;
                a6 = a6 - (a8 * tmpH);
                b6 = b6 - (b8 * tmpH);
                c6 = c6 - (c8 * tmpH);
                d6 = d6 - (d8 * tmpH);
                e6 = e6 - (e8 * tmpH);
                f6 = f6 - (f8 * tmpH);
                g6 = g6 - (g8 * tmpH);
                h6 = h6 - (h8 * tmpH);
                i6 = i6 - (i8 * tmpH);
            }

            if (h7 != 0.0) {
                tmpH = h7;
                a7 = a7 - (a8 * tmpH);
                b7 = b7 - (b8 * tmpH);
                c7 = c7 - (c8 * tmpH);
                d7 = d7 - (d8 * tmpH);
                e7 = e7 - (e8 * tmpH);
                f7 = f7 - (f8 * tmpH);
                g7 = g7 - (g8 * tmpH);
                h7 = h7 - (h8 * tmpH);
                i7 = i7 - (i8 * tmpH);
            }


            //endregion

            //endregion
        }


        a1 = math.rounding(a1, roundDigit);
        a2 = math.rounding(a2, roundDigit);
        a3 = math.rounding(a3, roundDigit);
        a4 = math.rounding(a4, roundDigit);
        a5 = math.rounding(a5, roundDigit);
        a6 = math.rounding(a6, roundDigit);
        a7 = math.rounding(a7, roundDigit);
        a8 = math.rounding(a8, roundDigit);


        b1 = math.rounding(b1, roundDigit);
        b2 = math.rounding(b2, roundDigit);
        b3 = math.rounding(b3, roundDigit);
        b4 = math.rounding(b4, roundDigit);
        b5 = math.rounding(b5, roundDigit);
        b6 = math.rounding(b6, roundDigit);
        b7 = math.rounding(b7, roundDigit);
        b8 = math.rounding(b8, roundDigit);

        c1 = math.rounding(c1, roundDigit);
        c2 = math.rounding(c2, roundDigit);
        c3 = math.rounding(c3, roundDigit);
        c4 = math.rounding(c4, roundDigit);
        c5 = math.rounding(c5, roundDigit);
        c6 = math.rounding(c6, roundDigit);
        c7 = math.rounding(c7, roundDigit);
        c8 = math.rounding(c8, roundDigit);

        d1 = math.rounding(d1, roundDigit);
        d2 = math.rounding(d2, roundDigit);
        d3 = math.rounding(d3, roundDigit);
        d4 = math.rounding(d4, roundDigit);
        d5 = math.rounding(d5, roundDigit);
        d6 = math.rounding(d6, roundDigit);
        d7 = math.rounding(d7, roundDigit);
        d8 = math.rounding(d8, roundDigit);

        e1 = math.rounding(e1, roundDigit);
        e2 = math.rounding(e2, roundDigit);
        e3 = math.rounding(e3, roundDigit);
        e4 = math.rounding(e4, roundDigit);
        e5 = math.rounding(e5, roundDigit);
        e6 = math.rounding(e6, roundDigit);
        e7 = math.rounding(e7, roundDigit);
        e8 = math.rounding(e8, roundDigit);

        f1 = math.rounding(f1, roundDigit);
        f2 = math.rounding(f2, roundDigit);
        f3 = math.rounding(f3, roundDigit);
        f4 = math.rounding(f4, roundDigit);
        f5 = math.rounding(f5, roundDigit);
        f6 = math.rounding(f6, roundDigit);
        f7 = math.rounding(f7, roundDigit);
        f8 = math.rounding(f8, roundDigit);

        g1 = math.rounding(g1, roundDigit);
        g2 = math.rounding(g2, roundDigit);
        g3 = math.rounding(g3, roundDigit);
        g4 = math.rounding(g4, roundDigit);
        g5 = math.rounding(g5, roundDigit);
        g6 = math.rounding(g6, roundDigit);
        g7 = math.rounding(g7, roundDigit);
        g8 = math.rounding(g8, roundDigit);

        h1 = math.rounding(h1, roundDigit);
        h2 = math.rounding(h2, roundDigit);
        h3 = math.rounding(h3, roundDigit);
        h4 = math.rounding(h4, roundDigit);
        h5 = math.rounding(h5, roundDigit);
        h6 = math.rounding(h6, roundDigit);
        h7 = math.rounding(h7, roundDigit);
        h8 = math.rounding(h8, roundDigit);

        i1 = math.rounding(i1, roundDigit);
        i2 = math.rounding(i2, roundDigit);
        i3 = math.rounding(i3, roundDigit);
        i4 = math.rounding(i4, roundDigit);
        i5 = math.rounding(i5, roundDigit);
        i6 = math.rounding(i6, roundDigit);
        i7 = math.rounding(i7, roundDigit);
        i8 = math.rounding(i8, roundDigit);


       /* if (d1.toString().length() > 3 || d2.toString().length() > 3 || d3.toString().length() > 3 || d4.toString().length() > 3) {
            d1 = math.rounding(d1, roundDigit);
            d2 = math.rounding(d2, roundDigit);
            d3 = math.rounding(d3, roundDigit);
            d4 = math.rounding(d4, roundDigit);
        }

        if (e1.toString().length() > 3 || e2.toString().length() > 3 || e3.toString().length() > 3 || e4.toString().length() > 3) {
            e1 = math.rounding(e1, roundDigit);
            e2 = math.rounding(e2, roundDigit);
            e3 = math.rounding(e3, roundDigit);
            e4 = math.rounding(e4, roundDigit);
        }*/

        inputA1.setText(String.valueOf(a1));
        inputA2.setText(String.valueOf(a2));
        inputA3.setText(String.valueOf(a3));
        inputA4.setText(String.valueOf(a4));
        inputA5.setText(String.valueOf(a5));
        inputA6.setText(String.valueOf(a6));
        inputA7.setText(String.valueOf(a7));
        inputA8.setText(String.valueOf(a8));

        inputB1.setText(String.valueOf(b1));
        inputB2.setText(String.valueOf(b2));
        inputB3.setText(String.valueOf(b3));
        inputB4.setText(String.valueOf(b4));
        inputB5.setText(String.valueOf(b5));
        inputB6.setText(String.valueOf(b6));
        inputB7.setText(String.valueOf(b7));
        inputB8.setText(String.valueOf(b8));

        inputC1.setText(String.valueOf(c1));
        inputC2.setText(String.valueOf(c2));
        inputC3.setText(String.valueOf(c3));
        inputC4.setText(String.valueOf(c4));
        inputC5.setText(String.valueOf(c5));
        inputC6.setText(String.valueOf(c6));
        inputC7.setText(String.valueOf(c7));
        inputC8.setText(String.valueOf(c8));

        inputD1.setText(String.valueOf(d1));
        inputD2.setText(String.valueOf(d2));
        inputD3.setText(String.valueOf(d3));
        inputD4.setText(String.valueOf(d4));
        inputD5.setText(String.valueOf(d5));
        inputD6.setText(String.valueOf(d6));
        inputD7.setText(String.valueOf(d7));
        inputD8.setText(String.valueOf(d8));

        inputE1.setText(String.valueOf(e1));
        inputE2.setText(String.valueOf(e2));
        inputE3.setText(String.valueOf(e3));
        inputE4.setText(String.valueOf(e4));
        inputE5.setText(String.valueOf(e5));
        inputE6.setText(String.valueOf(e6));
        inputE7.setText(String.valueOf(e7));
        inputE8.setText(String.valueOf(e8));

        inputF1.setText(String.valueOf(f1));
        inputF2.setText(String.valueOf(f2));
        inputF3.setText(String.valueOf(f3));
        inputF4.setText(String.valueOf(f4));
        inputF5.setText(String.valueOf(f5));
        inputF6.setText(String.valueOf(f6));
        inputF7.setText(String.valueOf(f7));
        inputF8.setText(String.valueOf(f8));

        inputG1.setText(String.valueOf(g1));
        inputG2.setText(String.valueOf(g2));
        inputG3.setText(String.valueOf(g3));
        inputG4.setText(String.valueOf(g4));
        inputG5.setText(String.valueOf(g5));
        inputG6.setText(String.valueOf(g6));
        inputG7.setText(String.valueOf(g7));
        inputG8.setText(String.valueOf(g8));

        inputH1.setText(String.valueOf(h1));
        inputH2.setText(String.valueOf(h2));
        inputH3.setText(String.valueOf(h3));
        inputH4.setText(String.valueOf(h4));
        inputH5.setText(String.valueOf(h5));
        inputH6.setText(String.valueOf(h6));
        inputH7.setText(String.valueOf(h7));
        inputH8.setText(String.valueOf(h8));

        inputI1.setText(String.valueOf(i1));
        inputI2.setText(String.valueOf(i2));
        inputI3.setText(String.valueOf(i3));
        inputI4.setText(String.valueOf(i4));
        inputI5.setText(String.valueOf(i5));
        inputI6.setText(String.valueOf(i6));
        inputI7.setText(String.valueOf(i7));
        inputI8.setText(String.valueOf(i8));


    }
    //endregion

    //region Matriks 9x10
    public void matriks9x10(TextView inputA1, TextView inputA2, TextView inputA3, TextView inputA4, TextView inputA5,
                             TextView inputA6, TextView inputA7, TextView inputA8, TextView inputA9,
                             TextView inputB1, TextView inputB2, TextView inputB3, TextView inputB4, TextView inputB5,
                             TextView inputB6, TextView inputB7, TextView inputB8, TextView inputB9,
                             TextView inputC1, TextView inputC2, TextView inputC3, TextView inputC4, TextView inputC5,
                             TextView inputC6, TextView inputC7, TextView inputC8, TextView inputC9,
                             TextView inputD1, TextView inputD2, TextView inputD3, TextView inputD4, TextView inputD5,
                             TextView inputD6, TextView inputD7, TextView inputD8, TextView inputD9,
                             TextView inputE1, TextView inputE2, TextView inputE3, TextView inputE4, TextView inputE5,
                             TextView inputE6, TextView inputE7, TextView inputE8, TextView inputE9,
                             TextView inputF1, TextView inputF2, TextView inputF3, TextView inputF4, TextView inputF5,
                             TextView inputF6, TextView inputF7, TextView inputF8, TextView inputF9,
                             TextView inputG1, TextView inputG2, TextView inputG3, TextView inputG4, TextView inputG5,
                             TextView inputG6, TextView inputG7, TextView inputG8, TextView inputG9,
                             TextView inputH1, TextView inputH2, TextView inputH3, TextView inputH4, TextView inputH5,
                             TextView inputH6, TextView inputH7, TextView inputH8, TextView inputH9,
                             TextView inputI1, TextView inputI2, TextView inputI3, TextView inputI4, TextView inputI5,
                             TextView inputI6, TextView inputI7, TextView inputI8, TextView inputI9,
                             TextView inputJ1, TextView inputJ2, TextView inputJ3, TextView inputJ4, TextView inputJ5,
                             TextView inputJ6, TextView inputJ7, TextView inputJ8, TextView inputJ9
    ) {
        //1a+2b+3c+4d+5e+6f=200


        //2   3  =  6
        //3   4  = 12

        Double a1, a2, a3, a4, a5, a6, a7, a8, a9,
                b1, b2, b3, b4, b5, b6, b7, b8, b9,
                c1, c2, c3, c4, c5, c6, c7, c8, c9,
                d1, d2, d3, d4, d5, d6, d7, d8, d9,
                e1, e2, e3, e4, e5, e6, e7, e8, e9,
                f1, f2, f3, f4, f5, f6, f7, f8, f9,
                g1, g2, g3, g4, g5, g6, g7, g8, g9,
                h1, h2, h3, h4, h5, h6, h7, h8, h9,
                i1, i2, i3, i4, i5, i6, i7, i8, i9,
                j1, j2, j3, j4, j5, j6, j7, j8, j9,
                tmpA, tmpB, tmpC, tmpD, tmpE, tmpF, tmpG, tmpH, tmpI;

        //region Get Value
        a1 = Double.parseDouble(inputA1.getText().toString());
        a2 = Double.parseDouble(inputA2.getText().toString());
        a3 = Double.parseDouble(inputA3.getText().toString());
        a4 = Double.parseDouble(inputA4.getText().toString());
        a5 = Double.parseDouble(inputA5.getText().toString());
        a6 = Double.parseDouble(inputA6.getText().toString());
        a7 = Double.parseDouble(inputA7.getText().toString());
        a8 = Double.parseDouble(inputA8.getText().toString());
        a9 = Double.parseDouble(inputA9.getText().toString());

        b1 = Double.parseDouble(inputB1.getText().toString());
        b2 = Double.parseDouble(inputB2.getText().toString());
        b3 = Double.parseDouble(inputB3.getText().toString());
        b4 = Double.parseDouble(inputB4.getText().toString());
        b5 = Double.parseDouble(inputB5.getText().toString());
        b6 = Double.parseDouble(inputB6.getText().toString());
        b7 = Double.parseDouble(inputB7.getText().toString());
        b8 = Double.parseDouble(inputB8.getText().toString());
        b9 = Double.parseDouble(inputB9.getText().toString());

        c1 = Double.parseDouble(inputC1.getText().toString());
        c2 = Double.parseDouble(inputC2.getText().toString());
        c3 = Double.parseDouble(inputC3.getText().toString());
        c4 = Double.parseDouble(inputC4.getText().toString());
        c5 = Double.parseDouble(inputC5.getText().toString());
        c6 = Double.parseDouble(inputC6.getText().toString());
        c7 = Double.parseDouble(inputC7.getText().toString());
        c8 = Double.parseDouble(inputC8.getText().toString());
        c9 = Double.parseDouble(inputC9.getText().toString());

        d1 = Double.parseDouble(inputD1.getText().toString());
        d2 = Double.parseDouble(inputD2.getText().toString());
        d3 = Double.parseDouble(inputD3.getText().toString());
        d4 = Double.parseDouble(inputD4.getText().toString());
        d5 = Double.parseDouble(inputD5.getText().toString());
        d6 = Double.parseDouble(inputD6.getText().toString());
        d7 = Double.parseDouble(inputD7.getText().toString());
        d8 = Double.parseDouble(inputD8.getText().toString());
        d9 = Double.parseDouble(inputD9.getText().toString());

        e1 = Double.parseDouble(inputE1.getText().toString());
        e2 = Double.parseDouble(inputE2.getText().toString());
        e3 = Double.parseDouble(inputE3.getText().toString());
        e4 = Double.parseDouble(inputE4.getText().toString());
        e5 = Double.parseDouble(inputE5.getText().toString());
        e6 = Double.parseDouble(inputE6.getText().toString());
        e7 = Double.parseDouble(inputE7.getText().toString());
        e8 = Double.parseDouble(inputE8.getText().toString());
        e9 = Double.parseDouble(inputE9.getText().toString());

        f1 = Double.parseDouble(inputF1.getText().toString());
        f2 = Double.parseDouble(inputF2.getText().toString());
        f3 = Double.parseDouble(inputF3.getText().toString());
        f4 = Double.parseDouble(inputF4.getText().toString());
        f5 = Double.parseDouble(inputF5.getText().toString());
        f6 = Double.parseDouble(inputF6.getText().toString());
        f7 = Double.parseDouble(inputF7.getText().toString());
        f8 = Double.parseDouble(inputF8.getText().toString());
        f9 = Double.parseDouble(inputF9.getText().toString());

        g1 = Double.parseDouble(inputG1.getText().toString());
        g2 = Double.parseDouble(inputG2.getText().toString());
        g3 = Double.parseDouble(inputG3.getText().toString());
        g4 = Double.parseDouble(inputG4.getText().toString());
        g5 = Double.parseDouble(inputG5.getText().toString());
        g6 = Double.parseDouble(inputG6.getText().toString());
        g7 = Double.parseDouble(inputG7.getText().toString());
        g8 = Double.parseDouble(inputG8.getText().toString());
        g9 = Double.parseDouble(inputG9.getText().toString());

        h1 = Double.parseDouble(inputH1.getText().toString());
        h2 = Double.parseDouble(inputH2.getText().toString());
        h3 = Double.parseDouble(inputH3.getText().toString());
        h4 = Double.parseDouble(inputH4.getText().toString());
        h5 = Double.parseDouble(inputH5.getText().toString());
        h6 = Double.parseDouble(inputH6.getText().toString());
        h7 = Double.parseDouble(inputH7.getText().toString());
        h8 = Double.parseDouble(inputH8.getText().toString());
        h9 = Double.parseDouble(inputH9.getText().toString());

        i1 = Double.parseDouble(inputI1.getText().toString());
        i2 = Double.parseDouble(inputI2.getText().toString());
        i3 = Double.parseDouble(inputI3.getText().toString());
        i4 = Double.parseDouble(inputI4.getText().toString());
        i5 = Double.parseDouble(inputI5.getText().toString());
        i6 = Double.parseDouble(inputI6.getText().toString());
        i7 = Double.parseDouble(inputI7.getText().toString());
        i8 = Double.parseDouble(inputI8.getText().toString());
        i9 = Double.parseDouble(inputI9.getText().toString());

        j1 = Double.parseDouble(inputJ1.getText().toString());
        j2 = Double.parseDouble(inputJ2.getText().toString());
        j3 = Double.parseDouble(inputJ3.getText().toString());
        j4 = Double.parseDouble(inputJ4.getText().toString());
        j5 = Double.parseDouble(inputJ5.getText().toString());
        j6 = Double.parseDouble(inputJ6.getText().toString());
        j7 = Double.parseDouble(inputJ7.getText().toString());
        j8 = Double.parseDouble(inputJ8.getText().toString());
        j9 = Double.parseDouble(inputJ9.getText().toString());

        //endregion


        if (a1 != 1.0) {
            b1 = b1 / a1;
            c1 = c1 / a1;
            d1 = d1 / a1;
            e1 = e1 / a1;
            f1 = f1 / a1;
            g1 = g1 / a1;
            h1 = h1 / a1;
            i1 = i1 / a1;
            j1 = j1 / a1;
            a1 = a1 / a1;

            //region A Columnn
            if (a2 != 0.0) {
                tmpA = a2;
                a2 = Math.abs(a2 - (a1 * tmpA));
                b2 = b2 - (b1 * tmpA);
                c2 = c2 - (c1 * tmpA);
                d2 = d2 - (d1 * tmpA);
                e2 = e2 - (e1 * tmpA);
                f2 = f2 - (f1 * tmpA);
                g2 = g2 - (g1 * tmpA);
                h2 = h2 - (h1 * tmpA);
                i2 = i2 - (i1 * tmpA);
                j2 = j2 - (j1 * tmpA);
            }

            if (a3 != 0.0) {
                tmpA = a3;
                a3 = Math.abs(a3 - (a1 * tmpA));
                b3 = b3 - (b1 * tmpA);
                c3 = c3 - (c1 * tmpA);
                d3 = d3 - (d1 * tmpA);
                e3 = e3 - (e1 * tmpA);
                f3 = f3 - (f1 * tmpA);
                g3 = g3 - (g1 * tmpA);
                h3 = h3 - (h1 * tmpA);
                i3 = i3 - (i1 * tmpA);
                j3 = j3 - (j1 * tmpA);

            }
            if (a4 != 0.0) {
                tmpA = a4;
                a4 = Math.abs(a4 - (a1 * tmpA));
                b4 = b4 - (b1 * tmpA);
                c4 = c4 - (c1 * tmpA);
                d4 = d4 - (d1 * tmpA);
                e4 = e4 - (e1 * tmpA);
                f4 = f4 - (f1 * tmpA);
                g4 = g4 - (g1 * tmpA);
                h4 = h4 - (h1 * tmpA);
                i4 = i4 - (i1 * tmpA);
                j4 = j4 - (j1 * tmpA);
            }

            if (a5 != 0.0) {
                tmpA = a5;
                a5 = Math.abs(a5 - (a1 * tmpA));
                b5 = b5 - (b1 * tmpA);
                c5 = c5 - (c1 * tmpA);
                d5 = d5 - (d1 * tmpA);
                e5 = e5 - (e1 * tmpA);
                f5 = f5 - (f1 * tmpA);
                g5 = g5 - (g1 * tmpA);
                h5 = h5 - (h1 * tmpA);
                i5 = i5 - (i1 * tmpA);
                j5 = j5 - (j1 * tmpA);
            }

            if (a6 != 0.0) {
                tmpA = a6;
                a6 = Math.abs(a6 - (a1 * tmpA));
                b6 = b6 - (b1 * tmpA);
                c6 = c6 - (c1 * tmpA);
                d6 = d6 - (d1 * tmpA);
                e6 = e6 - (e1 * tmpA);
                f6 = f6 - (f1 * tmpA);
                g6 = g6 - (g1 * tmpA);
                h6 = h6 - (h1 * tmpA);
                i6 = i6 - (i1 * tmpA);
                j6 = j6 - (j1 * tmpA);
            }

            if (a7 != 0.0) {
                tmpA = a7;
                a7 = Math.abs(a7 - (a1 * tmpA));
                b7 = b7 - (b1 * tmpA);
                c7 = c7 - (c1 * tmpA);
                d7 = d7 - (d1 * tmpA);
                e7 = e7 - (e1 * tmpA);
                f7 = f7 - (f1 * tmpA);
                g7 = g7 - (g1 * tmpA);
                h7 = h7 - (h1 * tmpA);
                i7 = i7 - (i1 * tmpA);
                j7 = j7 - (j1 * tmpA);
            }

            if (a8 != 0.0) {
                tmpA = a8;
                a8 = Math.abs(a8 - (a1 * tmpA));
                b8 = b8 - (b1 * tmpA);
                c8 = c8 - (c1 * tmpA);
                d8 = d8 - (d1 * tmpA);
                e8 = e8 - (e1 * tmpA);
                f8 = f8 - (f1 * tmpA);
                g8 = g8 - (g1 * tmpA);
                h8 = h8 - (h1 * tmpA);
                i8 = i8 - (i1 * tmpA);
                j8 = j8 - (j1 * tmpA);
            }

            if (a9 != 0.0) {
                tmpA = a9;
                a9 = Math.abs(a9 - (a1 * tmpA));
                b9 = b9 - (b1 * tmpA);
                c9 = c9 - (c1 * tmpA);
                d9 = d9 - (d1 * tmpA);
                e9 = e9 - (e1 * tmpA);
                f9 = f9 - (f1 * tmpA);
                g9 = g9 - (g1 * tmpA);
                h9 = h9 - (h1 * tmpA);
                i9 = i9 - (i1 * tmpA);
                j9 = j9 - (j1 * tmpA);
            }



        } else if (b2 != 1.0) {
            tmpB = b2;
            a2 = Math.abs(a2 / tmpB);
            b2 = b2 / tmpB;
            c2 = c2 / tmpB;
            d2 = d2 / tmpB;
            e2 = e2 / tmpB;
            f2 = f2 / tmpB;
            g2 = g2 / tmpB;
            h2 = h2 / tmpB;
            i2 = i2 / tmpB;
            j2 = j2 / tmpB;


            //region B Column
            if (b1 != 0.0) {
                tmpB = b1;
                a1 = a1 - (a2 * tmpB);
                b1 = b1 - (b2 * tmpB);
                c1 = c1 - (c2 * tmpB);
                d1 = d1 - (d2 * tmpB);
                e1 = e1 - (e2 * tmpB);
                f1 = f1 - (f2 * tmpB);
                g1 = g1 - (g2 * tmpB);
                h1 = h1 - (h2 * tmpB);
                i1 = i1 - (i2 * tmpB);
                j1 = j1 - (j2 * tmpB);
            }

            if (b3 != 0.0) {
                tmpB = b3;
                a3 = a3 - (a2 * tmpB);
                b3 = b3 - (b2 * tmpB);
                c3 = c3 - (c2 * tmpB);
                d3 = d3 - (d2 * tmpB);
                e3 = e3 - (e2 * tmpB);
                f3 = f3 - (f2 * tmpB);
                g3 = g3 - (g2 * tmpB);
                h3 = h3 - (h2 * tmpB);
                i3 = i3 - (i2 * tmpB);
                j3 = j3 - (j2 * tmpB);
            }

            if (b4 != 0.0) {
                tmpB = b4;
                a4 = a4 - (a2 * tmpB);
                b4 = b4 - (b2 * tmpB);
                c4 = c4 - (c2 * tmpB);
                d4 = d4 - (d2 * tmpB);
                e4 = e4 - (e2 * tmpB);
                f4 = f4 - (f2 * tmpB);
                g4 = g4 - (g2 * tmpB);
                h4 = h4 - (h2 * tmpB);
                i4 = i4 - (i2 * tmpB);
                j4 = j4 - (j2 * tmpB);
            }

            if (b5 != 0.0) {
                tmpB = b5;
                a5 = a5 - (a2 * tmpB);
                b5 = b5 - (b2 * tmpB);
                c5 = c5 - (c2 * tmpB);
                d5 = d5 - (d2 * tmpB);
                e5 = e5 - (e2 * tmpB);
                f5 = f5 - (f2 * tmpB);
                g5 = g5 - (g2 * tmpB);
                h5 = h5 - (h2 * tmpB);
                i5 = i5 - (i2 * tmpB);
                j5 = j5 - (j2 * tmpB);
            }

            if (b6 != 0.0) {
                tmpB = b6;
                a6 = a6 - (a2 * tmpB);
                b6 = b6 - (b2 * tmpB);
                c6 = c6 - (c2 * tmpB);
                d6 = d6 - (d2 * tmpB);
                e6 = e6 - (e2 * tmpB);
                f6 = f6 - (f2 * tmpB);
                g6 = g6 - (g2 * tmpB);
                h6 = h6 - (h2 * tmpB);
                i6 = i6 - (i2 * tmpB);
                j6 = j6 - (j2 * tmpB);
            }

            if (b7 != 0.0) {
                tmpB = b7;
                a7 = a7 - (a2 * tmpB);
                b7 = b7 - (b2 * tmpB);
                c7 = c7 - (c2 * tmpB);
                d7 = d7 - (d2 * tmpB);
                e7 = e7 - (e2 * tmpB);
                f7 = f7 - (f2 * tmpB);
                g7 = g7 - (g2 * tmpB);
                h7 = h7 - (h2 * tmpB);
                i7 = i7 - (i2 * tmpB);
                j7 = j7 - (j2 * tmpB);
            }

            if (b8 != 0.0) {
                tmpB = b8;
                a8 = a8 - (a2 * tmpB);
                b8 = b8 - (b2 * tmpB);
                c8 = c8 - (c2 * tmpB);
                d8 = d8 - (d2 * tmpB);
                e8 = e8 - (e2 * tmpB);
                f8 = f8 - (f2 * tmpB);
                g8 = g8 - (g2 * tmpB);
                h8 = h8 - (h2 * tmpB);
                i8 = i8 - (i2 * tmpB);
                j8 = j8 - (j2 * tmpB);
            }

            if (b9 != 0.0) {
                tmpB = b9;
                a9 = a9 - (a2 * tmpB);
                b9 = b9 - (b2 * tmpB);
                c9 = c9 - (c2 * tmpB);
                d9 = d9 - (d2 * tmpB);
                e9 = e9 - (e2 * tmpB);
                f9 = f9 - (f2 * tmpB);
                g9 = g9 - (g2 * tmpB);
                h9 = h9 - (h2 * tmpB);
                i9 = i9 - (i2 * tmpB);
                j9 = j9 - (j2 * tmpB);
            }


            //endregion


        } else if (c3 != 1.0) {
            tmpC = c3;
            a3 = Math.abs(a3 / tmpC);
            b3 = b3 / tmpC;
            c3 = c3 / tmpC;
            d3 = d3 / tmpC;
            e3 = e3 / tmpC;
            f3 = f3 / tmpC;
            g3 = g3 / tmpC;
            h3 = h3 / tmpC;
            i3 = i3 / tmpC;
            j3 = j3 / tmpC;

            //region C Column
            if (c2 != 0.0) {
                tmpC = c2;
                a2 = a2 - (a3 * tmpC);
                b2 = b2 - (b3 * tmpC);
                c2 = c2 - (c3 * tmpC);
                d2 = d2 - (d3 * tmpC);
                e2 = e2 - (e3 * tmpC);
                f2 = f2 - (f3 * tmpC);
                g2 = g2 - (g3 * tmpC);
                h2 = h2 - (h3 * tmpC);
                i2 = i2 - (i3 * tmpC);
                j2 = j2 - (j3 * tmpC);
            }

            if (c1 != 0.0) {
                tmpC = c1;
                a1 = a1 - (a3 * tmpC);
                b1 = b1 - (b3 * tmpC);
                c1 = c1 - (c3 * tmpC);
                d1 = d1 - (d3 * tmpC);
                e1 = e1 - (e3 * tmpC);
                f1 = f1 - (f3 * tmpC);
                g1 = g1 - (g3 * tmpC);
                h1 = h1 - (h3 * tmpC);
                i1 = i1 - (i3 * tmpC);
                j1 = j1 - (j3 * tmpC);
            }

            if (c4 != 0.0) {
                tmpC = c4;
                a4 = a4 - (a3 * tmpC);
                b4 = b4 - (b3 * tmpC);
                c4 = c4 - (c3 * tmpC);
                d4 = d4 - (d3 * tmpC);
                e4 = e4 - (e3 * tmpC);
                f4 = f4 - (f3 * tmpC);
                g4 = g4 - (g3 * tmpC);
                h4 = h4 - (h3 * tmpC);
                i4 = i4 - (i3 * tmpC);
                j4 = j4 - (j3 * tmpC);
            }

            if (c5 != 0.0) {
                tmpC = c5;
                a5 = a5 - (a3 * tmpC);
                b5 = b5 - (b3 * tmpC);
                c5 = c5 - (c3 * tmpC);
                d5 = d5 - (d3 * tmpC);
                e5 = e5 - (e3 * tmpC);
                f5 = f5 - (f3 * tmpC);
                g5 = g5 - (g3 * tmpC);
                h5 = h5 - (h3 * tmpC);
                i5 = i5 - (i3 * tmpC);
                j5 = j5 - (j3 * tmpC);
            }

            if (c6 != 0.0) {
                tmpC = c6;
                a6 = a6 - (a3 * tmpC);
                b6 = b6 - (b3 * tmpC);
                c6 = c6 - (c3 * tmpC);
                d6 = d6 - (d3 * tmpC);
                e6 = e6 - (e3 * tmpC);
                f6 = f6 - (f3 * tmpC);
                g6 = g6 - (g3 * tmpC);
                h6 = h6 - (h3 * tmpC);
                i6 = i6 - (i3 * tmpC);
                j6 = j6 - (j3 * tmpC);
            }

            if (c7 != 0.0) {
                tmpC = c7;
                a7 = a7 - (a3 * tmpC);
                b7 = b7 - (b3 * tmpC);
                c7 = c7 - (c3 * tmpC);
                d7 = d7 - (d3 * tmpC);
                e7 = e7 - (e3 * tmpC);
                f7 = f7 - (f3 * tmpC);
                g7 = g7 - (g3 * tmpC);
                h7 = h7 - (h3 * tmpC);
                i7 = i7 - (i3 * tmpC);
                j7 = j7 - (j3 * tmpC);
            }

            if (c8 != 0.0) {
                tmpC = c8;
                a8 = a8 - (a3 * tmpC);
                b8 = b8 - (b3 * tmpC);
                c8 = c8 - (c3 * tmpC);
                d8 = d8 - (d3 * tmpC);
                e8 = e8 - (e3 * tmpC);
                f8 = f8 - (f3 * tmpC);
                g8 = g8 - (g3 * tmpC);
                h8 = h8 - (h3 * tmpC);
                i8 = i8 - (i3 * tmpC);
                j8 = j8 - (j3 * tmpC);
            }

            if (c9 != 0.0) {
                tmpC = c9;
                a9 = a9 - (a3 * tmpC);
                b9 = b9 - (b3 * tmpC);
                c9 = c9 - (c3 * tmpC);
                d9 = d9 - (d3 * tmpC);
                e9 = e9 - (e3 * tmpC);
                f9 = f9 - (f3 * tmpC);
                g9 = g9 - (g3 * tmpC);
                h9 = h9 - (h3 * tmpC);
                i9 = i9 - (i3 * tmpC);
                j9 = j9 - (j3 * tmpC);
            }

            //endregion

        } else if (d4 != 1.0) {
            tmpD = d4;
            a4 = Math.abs(a4 / tmpD);
            b4 = b4 / tmpD;
            c4 = c4 / tmpD;
            d4 = d4 / tmpD;
            e4 = e4 / tmpD;
            f4 = f4 / tmpD;
            g4 = g4 / tmpD;
            h4 = h4 / tmpD;
            i4 = i4 / tmpD;
            j4 = j4 / tmpD;

            //region D Column
            if (d1 != 0.0) {
                tmpD = d1;
                a1 = a1 - (a4 * tmpD);
                b1 = b1 - (b4 * tmpD);
                c1 = c1 - (c4 * tmpD);
                d1 = d1 - (d4 * tmpD);
                e1 = e1 - (e4 * tmpD);
                f1 = f1 - (f4 * tmpD);
                g1 = g1 - (g4 * tmpD);
                h1 = h1 - (h4 * tmpD);
                i1 = i1 - (i4 * tmpD);
                j1 = j1 - (j4 * tmpD);
            }

            if (d2 != 0.0) {
                tmpD = d2;
                a2 = a2 - (a4 * tmpD);
                b2 = b2 - (b4 * tmpD);
                c2 = c2 - (c4 * tmpD);
                d2 = d2 - (d4 * tmpD);
                e2 = e2 - (e4 * tmpD);
                f2 = f2 - (f4 * tmpD);
                g2 = g2 - (g4 * tmpD);
                h2 = h2 - (h4 * tmpD);
                i2 = i2 - (i4 * tmpD);
                j2 = j2 - (j4 * tmpD);
            }

            if (d3 != 0.0) {
                tmpD = d3;
                a3 = a3 - (a4 * tmpD);
                b3 = b3 - (b4 * tmpD);
                c3 = c3 - (c4 * tmpD);
                d3 = d3 - (d4 * tmpD);
                e3 = e3 - (e4 * tmpD);
                f3 = f3 - (f4 * tmpD);
                g3 = g3 - (g4 * tmpD);
                h3 = h3 - (h4 * tmpD);
                i3 = i3 - (i4 * tmpD);
                j3 = j3 - (j4 * tmpD);
            }

            if (d5 != 0.0) {
                tmpD = d5;
                a5 = a5 - (a4 * tmpD);
                b5 = b5 - (b4 * tmpD);
                c5 = c5 - (c4 * tmpD);
                d5 = d5 - (d4 * tmpD);
                e5 = e5 - (e4 * tmpD);
                f5 = f5 - (f4 * tmpD);
                g5 = g5 - (g4 * tmpD);
                h5 = h5 - (h4 * tmpD);
                i5 = i5 - (i4 * tmpD);
                j5 = j5 - (j4 * tmpD);
            }

            if (d6 != 0.0) {
                tmpD = d6;
                a6 = a6 - (a4 * tmpD);
                b6 = b6 - (b4 * tmpD);
                c6 = c6 - (c4 * tmpD);
                d6 = d6 - (d4 * tmpD);
                e6 = e6 - (e4 * tmpD);
                f6 = f6 - (f4 * tmpD);
                g6 = g6 - (g4 * tmpD);
                h6 = h6 - (h4 * tmpD);
                i6 = i6 - (i4 * tmpD);
                j6 = j6 - (j4 * tmpD);
            }

            if (d7 != 0.0) {
                tmpD = d7;
                a7 = a7 - (a4 * tmpD);
                b7 = b7 - (b4 * tmpD);
                c7 = c7 - (c4 * tmpD);
                d7 = d7 - (d4 * tmpD);
                e7 = e7 - (e4 * tmpD);
                f7 = f7 - (f4 * tmpD);
                g7 = g7 - (g4 * tmpD);
                h7 = h7 - (h4 * tmpD);
                i7 = i7 - (i4 * tmpD);
                j7 = j7 - (j4 * tmpD);
            }

            if (d8 != 0.0) {
                tmpD = d8;
                a8 = a8 - (a4 * tmpD);
                b8 = b8 - (b4 * tmpD);
                c8 = c8 - (c4 * tmpD);
                d8 = d8 - (d4 * tmpD);
                e8 = e8 - (e4 * tmpD);
                f8 = f8 - (f4 * tmpD);
                g8 = g8 - (g4 * tmpD);
                h8 = h8 - (h4 * tmpD);
                i8 = i8 - (i4 * tmpD);
                j8 = j8 - (j4 * tmpD);
            }

            if (d9 != 0.0) {
                tmpD = d9;
                a9 = a9 - (a4 * tmpD);
                b9 = b9 - (b4 * tmpD);
                c9 = c9 - (c4 * tmpD);
                d9 = d9 - (d4 * tmpD);
                e9 = e9 - (e4 * tmpD);
                f9 = f9 - (f4 * tmpD);
                g9 = g9 - (g4 * tmpD);
                h9 = h9 - (h4 * tmpD);
                i9 = i9 - (i4 * tmpD);
                j9 = j9 - (j4 * tmpD);
            }

            //endregion

        } else if (e5 != 1.0) {
            tmpE = e5;
            a5 = Math.abs(a5 / tmpE);
            b5 = b5 / tmpE;
            c5 = c5 / tmpE;
            d5 = d5 / tmpE;
            e5 = e5 / tmpE;
            f5 = f5 / tmpE;
            g5 = g5 / tmpE;
            h5 = h5 / tmpE;
            i5 = i5 / tmpE;
            j5 = j5 / tmpE;

            //region E Column
            if (e1 != 0.0) {
                tmpE = e1;
                a1 = a1 - (a5 * tmpE);
                b1 = b1 - (b5 * tmpE);
                c1 = c1 - (c5 * tmpE);
                d1 = d1 - (d5 * tmpE);
                e1 = e1 - (e5 * tmpE);
                f1 = f1 - (f5 * tmpE);
                g1 = g1 - (g5 * tmpE);
                h1 = h1 - (h5 * tmpE);
                i1 = i1 - (i5 * tmpE);
                j1 = j1 - (j5 * tmpE);
            }

            if (e2 != 0.0) {
                tmpE = e2;
                a2 = a2 - (a5 * tmpE);
                b2 = b2 - (b5 * tmpE);
                c2 = c2 - (c5 * tmpE);
                d2 = d2 - (d5 * tmpE);
                e2 = e2 - (e5 * tmpE);
                f2 = f2 - (f5 * tmpE);
                g2 = g2 - (g5 * tmpE);
                h2 = h2 - (h5 * tmpE);
                i2 = i2 - (i5 * tmpE);
                j2 = j2 - (j5 * tmpE);
            }

            if (e3 != 0.0) {
                tmpE = e3;
                a3 = a3 - (a5 * tmpE);
                b3 = b3 - (b5 * tmpE);
                c3 = c3 - (c5 * tmpE);
                d3 = d3 - (d5 * tmpE);
                e3 = e3 - (e5 * tmpE);
                f3 = f3 - (f5 * tmpE);
                g3 = g3 - (g5 * tmpE);
                h3 = h3 - (h5 * tmpE);
                i3 = i3 - (i5 * tmpE);
                j3 = j3 - (j5 * tmpE);
            }

            if (e4 != 0.0) {
                tmpE = e4;
                a4 = a4 - (a5 * tmpE);
                b4 = b4 - (b5 * tmpE);
                c4 = c4 - (c5 * tmpE);
                d4 = d4 - (d5 * tmpE);
                e4 = e4 - (e5 * tmpE);
                f4 = f4 - (f5 * tmpE);
                g4 = g4 - (g5 * tmpE);
                h4 = h4 - (h5 * tmpE);
                i4 = i4 - (i5 * tmpE);
                j4 = j4 - (j5 * tmpE);
            }

            if (e6 != 0.0) {
                tmpE = e6;
                a6 = a6 - (a5 * tmpE);
                b6 = b6 - (b5 * tmpE);
                c6 = c6 - (c5 * tmpE);
                d6 = d6 - (d5 * tmpE);
                e6 = e6 - (e5 * tmpE);
                f6 = f6 - (f5 * tmpE);
                g6 = g6 - (g5 * tmpE);
                h6 = h6 - (h5 * tmpE);
                i6 = i6 - (i5 * tmpE);
                j6 = j6 - (j5 * tmpE);
            }

            if (e7 != 0.0) {
                tmpE = e7;
                a7 = a7 - (a5 * tmpE);
                b7 = b7 - (b5 * tmpE);
                c7 = c7 - (c5 * tmpE);
                d7 = d7 - (d5 * tmpE);
                e7 = e7 - (e5 * tmpE);
                f7 = f7 - (f5 * tmpE);
                g7 = g7 - (g5 * tmpE);
                h7 = h7 - (h5 * tmpE);
                i7 = i7 - (i5 * tmpE);
                j7 = j7 - (j5 * tmpE);
            }

            if (e8 != 0.0) {
                tmpE = e8;
                a8 = a8 - (a5 * tmpE);
                b8 = b8 - (b5 * tmpE);
                c8 = c8 - (c5 * tmpE);
                d8 = d8 - (d5 * tmpE);
                e8 = e8 - (e5 * tmpE);
                f8 = f8 - (f5 * tmpE);
                g8 = g8 - (g5 * tmpE);
                h8 = h8 - (h5 * tmpE);
                i8 = i8 - (i5 * tmpE);
                j8 = j8 - (j5 * tmpE);
            }

            if (e9 != 0.0) {
                tmpE = e9;
                a9 = a9 - (a5 * tmpE);
                b9 = b9 - (b5 * tmpE);
                c9 = c9 - (c5 * tmpE);
                d9 = d9 - (d5 * tmpE);
                e9 = e9 - (e5 * tmpE);
                f9 = f9 - (f5 * tmpE);
                g9 = g9 - (g5 * tmpE);
                h9 = h9 - (h5 * tmpE);
                i9 = i9 - (i5 * tmpE);
                j9 = j9 - (j5 * tmpE);
            }

            //endregion


        } else if (f6 != 1.0) {
            tmpF = f6;
            a6 = Math.abs(a6 / tmpF);
            b6 = b6 / tmpF;
            c6 = c6 / tmpF;
            d6 = d6 / tmpF;
            e6 = e6 / tmpF;
            f6 = f6 / tmpF;
            g6 = g6 / tmpF;
            h6 = h6 / tmpF;
            i6 = i6 / tmpF;
            j6 = j6 / tmpF;

            //region F Column
            if (f1 != 0.0) {
                tmpF = f1;
                a1 = a1 - (a6 * tmpF);
                b1 = b1 - (b6 * tmpF);
                c1 = c1 - (c6 * tmpF);
                d1 = d1 - (d6 * tmpF);
                e1 = e1 - (e6 * tmpF);
                f1 = f1 - (f6 * tmpF);
                g1 = g1 - (g6 * tmpF);
                h1 = h1 - (h6 * tmpF);
                i1 = i1 - (i6 * tmpF);
                j1 = j1 - (j6 * tmpF);
            }

            if (f2 != 0.0) {
                tmpF = f2;
                a2 = a2 - (a6 * tmpF);
                b2 = b2 - (b6 * tmpF);
                c2 = c2 - (c6 * tmpF);
                d2 = d2 - (d6 * tmpF);
                e2 = e2 - (e6 * tmpF);
                f2 = f2 - (f6 * tmpF);
                g2 = g2 - (g6 * tmpF);
                h2 = h2 - (h6 * tmpF);
                i2 = i2 - (i6 * tmpF);
                j2 = j2 - (j6 * tmpF);
            }

            if (f3 != 0.0) {
                tmpF = f3;
                a3 = a3 - (a6 * tmpF);
                b3 = b3 - (b6 * tmpF);
                c3 = c3 - (c6 * tmpF);
                d3 = d3 - (d6 * tmpF);
                e3 = e3 - (e6 * tmpF);
                f3 = f3 - (f6 * tmpF);
                g3 = g3 - (g6 * tmpF);
                h3 = h3 - (h6 * tmpF);
                i3 = i3 - (i6 * tmpF);
                j3 = j3 - (j6 * tmpF);
            }

            if (f4 != 0.0) {
                tmpF = f4;
                a4 = a4 - (a6 * tmpF);
                b4 = b4 - (b6 * tmpF);
                c4 = c4 - (c6 * tmpF);
                d4 = d4 - (d6 * tmpF);
                e4 = e4 - (e6 * tmpF);
                f4 = f4 - (f6 * tmpF);
                g4 = g4 - (g6 * tmpF);
                h4 = h4 - (h6 * tmpF);
                i4 = i4 - (i6 * tmpF);
                j4 = j4 - (j6 * tmpF);
            }

            if (f5 != 0.0) {
                tmpF = f5;
                a5 = a5 - (a6 * tmpF);
                b5 = b5 - (b6 * tmpF);
                c5 = c5 - (c6 * tmpF);
                d5 = d5 - (d6 * tmpF);
                e5 = e5 - (e6 * tmpF);
                f5 = f5 - (f6 * tmpF);
                g5 = g5 - (g6 * tmpF);
                h5 = h5 - (h6 * tmpF);
                i5 = i5 - (i6 * tmpF);
                j5 = j5 - (j6 * tmpF);
            }

            if (f7 != 0.0) {
                tmpF = f7;
                a7 = a7 - (a6 * tmpF);
                b7 = b7 - (b6 * tmpF);
                c7 = c7 - (c6 * tmpF);
                d7 = d7 - (d6 * tmpF);
                e7 = e7 - (e6 * tmpF);
                f7 = f7 - (f6 * tmpF);
                g7 = g7 - (g6 * tmpF);
                h7 = h7 - (h6 * tmpF);
                i7 = i7 - (i6 * tmpF);
                j7 = j7 - (j6 * tmpF);
            }

            if (f8 != 0.0) {
                tmpF = f8;
                a8 = a8 - (a6 * tmpF);
                b8 = b8 - (b6 * tmpF);
                c8 = c8 - (c6 * tmpF);
                d8 = d8 - (d6 * tmpF);
                e8 = e8 - (e6 * tmpF);
                f8 = f8 - (f6 * tmpF);
                g8 = g8 - (g6 * tmpF);
                h8 = h8 - (h6 * tmpF);
                i8 = i8 - (i6 * tmpF);
                j8 = j8 - (j6 * tmpF);
            }

            if (f9 != 0.0) {
                tmpF = f9;
                a9 = a9 - (a6 * tmpF);
                b9 = b9 - (b6 * tmpF);
                c9 = c9 - (c6 * tmpF);
                d9 = d9 - (d6 * tmpF);
                e9 = e9 - (e6 * tmpF);
                f9 = f9 - (f6 * tmpF);
                g9 = g9 - (g6 * tmpF);
                h9 = h9 - (h6 * tmpF);
                i9 = i9 - (i6 * tmpF);
                j9 = j9 - (j6 * tmpF);
            }

            //endregion
        }

        else if (g7 != 1.0) {
            tmpG = g7;
            a7 = Math.abs(a7 / tmpG);
            b7 = b7 / tmpG;
            c7 = c7 / tmpG;
            d7 = d7 / tmpG;
            e7 = e7 / tmpG;
            f7 = f7 / tmpG;
            g7 = g7 / tmpG;
            h7 = h7 / tmpG;
            i7 = i7 / tmpG;
            j7 = j7 / tmpG;

            //region G Column
            if (g1 != 0.0) {
                tmpG = g1;
                a1 = a1 - (a7 * tmpG);
                b1 = b1 - (b7 * tmpG);
                c1 = c1 - (c7 * tmpG);
                d1 = d1 - (d7 * tmpG);
                e1 = e1 - (e7 * tmpG);
                f1 = f1 - (f7 * tmpG);
                g1 = g1 - (g7 * tmpG);
                h1 = h1 - (h7 * tmpG);
                i1 = i1 - (i7 * tmpG);
                j1 = j1 - (j7 * tmpG);
            }

            if (g2 != 0.0) {
                tmpG = g2;
                a2 = a2 - (a7 * tmpG);
                b2 = b2 - (b7 * tmpG);
                c2 = c2 - (c7 * tmpG);
                d2 = d2 - (d7 * tmpG);
                e2 = e2 - (e7 * tmpG);
                f2 = f2 - (f7 * tmpG);
                g2 = g2 - (g7 * tmpG);
                h2 = h2 - (h7 * tmpG);
                i2 = i2 - (i7 * tmpG);
                j2 = j2 - (j7 * tmpG);
            }

            if (g3 != 0.0) {
                tmpG = g3;
                a3 = a3 - (a7 * tmpG);
                b3 = b3 - (b7 * tmpG);
                c3 = c3 - (c7 * tmpG);
                d3 = d3 - (d7 * tmpG);
                e3 = e3 - (e7 * tmpG);
                f3 = f3 - (f7 * tmpG);
                g3 = g3 - (g7 * tmpG);
                h3 = h3 - (h7 * tmpG);
                i3 = i3 - (i7 * tmpG);
                j3 = j3 - (j7 * tmpG);
            }

            if (g4 != 0.0) {
                tmpG = g4;
                a4 = a4 - (a7 * tmpG);
                b4 = b4 - (b7 * tmpG);
                c4 = c4 - (c7 * tmpG);
                d4 = d4 - (d7 * tmpG);
                e4 = e4 - (e7 * tmpG);
                f4 = f4 - (f7 * tmpG);
                g4 = g4 - (g7 * tmpG);
                h4 = h4 - (h7 * tmpG);
                i4 = i4 - (i7 * tmpG);
                j4 = j4 - (j7 * tmpG);
            }

            if (g5 != 0.0) {
                tmpG = g5;
                a5 = a5 - (a7 * tmpG);
                b5 = b5 - (b7 * tmpG);
                c5 = c5 - (c7 * tmpG);
                d5 = d5 - (d7 * tmpG);
                e5 = e5 - (e7 * tmpG);
                f5 = f5 - (f7 * tmpG);
                g5 = g5 - (g7 * tmpG);
                h5 = h5 - (h7 * tmpG);
                i5 = i5 - (i7 * tmpG);
                j5 = j5 - (j7 * tmpG);
            }

            if (g6 != 0.0) {
                tmpG = g6;
                a6 = a6 - (a7 * tmpG);
                b6 = b6 - (b7 * tmpG);
                c6 = c6 - (c7 * tmpG);
                d6 = d6 - (d7 * tmpG);
                e6 = e6 - (e7 * tmpG);
                f6 = f6 - (f7 * tmpG);
                g6 = g6 - (g7 * tmpG);
                h6 = h6 - (h7 * tmpG);
                i6 = i6 - (i7 * tmpG);
                j6 = j6 - (j7 * tmpG);
            }

            if (g8 != 0.0) {
                tmpG = g8;
                a8 = a8 - (a7 * tmpG);
                b8 = b8 - (b7 * tmpG);
                c8 = c8 - (c7 * tmpG);
                d8 = d8 - (d7 * tmpG);
                e8 = e8 - (e7 * tmpG);
                f8 = f8 - (f7 * tmpG);
                g8 = g8 - (g7 * tmpG);
                h8 = h8 - (h7 * tmpG);
                i8 = i8 - (i7 * tmpG);
                j8 = j8 - (j7 * tmpG);
            }

            if (g9 != 0.0) {
                tmpG = g9;
                a9 = a9 - (a7 * tmpG);
                b9 = b9 - (b7 * tmpG);
                c9 = c9 - (c7 * tmpG);
                d9 = d9 - (d7 * tmpG);
                e9 = e9 - (e7 * tmpG);
                f9 = f9 - (f7 * tmpG);
                g9 = g9 - (g7 * tmpG);
                h9 = h9 - (h7 * tmpG);
                i9 = i9 - (i7 * tmpG);
                j9 = j9 - (j7 * tmpG);
            }

            //endregion

        } else if (h8 != 1.0) {
            tmpH = h8;
            a8 = Math.abs(a8 / tmpH);
            b8 = b8 / tmpH;
            c8 = c8 / tmpH;
            d8 = d8 / tmpH;
            e8 = e8 / tmpH;
            f8 = f8 / tmpH;
            g8 = g8 / tmpH;
            h8 = h8 / tmpH;
            i8 = i8 / tmpH;
            j8 = j8 / tmpH;

            //region H Column
            if (h1 != 0.0) {
                tmpH = h1;
                a1 = a1 - (a8 * tmpH);
                b1 = b1 - (b8 * tmpH);
                c1 = c1 - (c8 * tmpH);
                d1 = d1 - (d8 * tmpH);
                e1 = e1 - (e8 * tmpH);
                f1 = f1 - (f8 * tmpH);
                g1 = g1 - (g8 * tmpH);
                h1 = h1 - (h8 * tmpH);
                i1 = i1 - (i8 * tmpH);
                j1 = j1 - (j8 * tmpH);
            }

            if (h2 != 0.0) {
                tmpH = h2;
                a2 = a2 - (a8 * tmpH);
                b2 = b2 - (b8 * tmpH);
                c2 = c2 - (c8 * tmpH);
                d2 = d2 - (d8 * tmpH);
                e2 = e2 - (e8 * tmpH);
                f2 = f2 - (f8 * tmpH);
                g2 = g2 - (g8 * tmpH);
                h2 = h2 - (h8 * tmpH);
                i2 = i2 - (i8 * tmpH);
                j2 = j2 - (j8 * tmpH);
            }

            if (h3 != 0.0) {
                tmpH = h3;
                a3 = a3 - (a8 * tmpH);
                b3 = b3 - (b8 * tmpH);
                c3 = c3 - (c8 * tmpH);
                d3 = d3 - (d8 * tmpH);
                e3 = e3 - (e8 * tmpH);
                f3 = f3 - (f8 * tmpH);
                g3 = g3 - (g8 * tmpH);
                h3 = h3 - (h8 * tmpH);
                i3 = i3 - (i8 * tmpH);
                j3 = j3 - (j8 * tmpH);
            }

            if (h4 != 0.0) {
                tmpH = h4;
                a4 = a4 - (a8 * tmpH);
                b4 = b4 - (b8 * tmpH);
                c4 = c4 - (c8 * tmpH);
                d4 = d4 - (d8 * tmpH);
                e4 = e4 - (e8 * tmpH);
                f4 = f4 - (f8 * tmpH);
                g4 = g4 - (g8 * tmpH);
                h4 = h4 - (h8 * tmpH);
                i4 = i4 - (i8 * tmpH);
                j4 = j4 - (j8 * tmpH);
            }


            if (h5 != 0.0) {
                tmpH = h5;
                a5 = a5 - (a8 * tmpH);
                b5 = b5 - (b8 * tmpH);
                c5 = c5 - (c8 * tmpH);
                d5 = d5 - (d8 * tmpH);
                e5 = e5 - (e8 * tmpH);
                f5 = f5 - (f8 * tmpH);
                g5 = g5 - (g8 * tmpH);
                h5 = h5 - (h8 * tmpH);
                i5 = i5 - (i8 * tmpH);
                j5 = j5 - (j8 * tmpH);
            }


            if (h6 != 0.0) {
                tmpH = h6;
                a6 = a6 - (a8 * tmpH);
                b6 = b6 - (b8 * tmpH);
                c6 = c6 - (c8 * tmpH);
                d6 = d6 - (d8 * tmpH);
                e6 = e6 - (e8 * tmpH);
                f6 = f6 - (f8 * tmpH);
                g6 = g6 - (g8 * tmpH);
                h6 = h6 - (h8 * tmpH);
                i6 = i6 - (i8 * tmpH);
                j6 = j6 - (j8 * tmpH);
            }

            if (h7 != 0.0) {
                tmpH = h7;
                a7 = a7 - (a8 * tmpH);
                b7 = b7 - (b8 * tmpH);
                c7 = c7 - (c8 * tmpH);
                d7 = d7 - (d8 * tmpH);
                e7 = e7 - (e8 * tmpH);
                f7 = f7 - (f8 * tmpH);
                g7 = g7 - (g8 * tmpH);
                h7 = h7 - (h8 * tmpH);
                i7 = i7 - (i8 * tmpH);
                j7 = j7 - (j8 * tmpH);
            }

            if (h9 != 0.0) {
                tmpH = h9;
                a9 = a9 - (a8 * tmpH);
                b9 = b9 - (b8 * tmpH);
                c9 = c9 - (c8 * tmpH);
                d9 = d9 - (d8 * tmpH);
                e9 = e9 - (e8 * tmpH);
                f9 = f9 - (f8 * tmpH);
                g9 = g9 - (g8 * tmpH);
                h9 = h9 - (h8 * tmpH);
                i9 = i9 - (i8 * tmpH);
                j9 = j9 - (j8 * tmpH);
            }

            //endregion

        } else if (i9 != 1.0) {
            tmpI = i9;
            a9 = Math.abs(a9 / tmpI);
            b9 = b9 / tmpI;
            c9 = c9 / tmpI;
            d9 = d9 / tmpI;
            e9 = e9 / tmpI;
            f9 = f9 / tmpI;
            g9 = g9 / tmpI;
            h9 = h9 / tmpI;
            i9 = i9 / tmpI;
            j9 = j9 / tmpI;

            //region I Column
            if (i1 != 0.0) {
                tmpI = i1;
                a1 = a1 - (a9 * tmpI);
                b1 = b1 - (b9 * tmpI);
                c1 = c1 - (c9 * tmpI);
                d1 = d1 - (d9 * tmpI);
                e1 = e1 - (e9 * tmpI);
                f1 = f1 - (f9 * tmpI);
                g1 = g1 - (g9 * tmpI);
                h1 = h1 - (h9 * tmpI);
                i1 = i1 - (i9 * tmpI);
                j1 = j1 - (j9 * tmpI);
            }

            if (i2 != 0.0) {
                tmpI = i2;
                a2 = a2 - (a9 * tmpI);
                b2 = b2 - (b9 * tmpI);
                c2 = c2 - (c9 * tmpI);
                d2 = d2 - (d9 * tmpI);
                e2 = e2 - (e9 * tmpI);
                f2 = f2 - (f9 * tmpI);
                g2 = g2 - (g9 * tmpI);
                h2 = h2 - (h9 * tmpI);
                i2 = i2 - (i9 * tmpI);
                j2 = j2 - (j9 * tmpI);
            }

            if (i3 != 0.0) {
                tmpI = i3;
                a3 = a3 - (a9 * tmpI);
                b3 = b3 - (b9 * tmpI);
                c3 = c3 - (c9 * tmpI);
                d3 = d3 - (d9 * tmpI);
                e3 = e3 - (e9 * tmpI);
                f3 = f3 - (f9 * tmpI);
                g3 = g3 - (g9 * tmpI);
                h3 = h3 - (h9 * tmpI);
                i3 = i3 - (i9 * tmpI);
                j3 = j3 - (j9 * tmpI);
            }

            if (i4 != 0.0) {
                tmpI = i4;
                a4 = a4 - (a9 * tmpI);
                b4 = b4 - (b9 * tmpI);
                c4 = c4 - (c9 * tmpI);
                d4 = d4 - (d9 * tmpI);
                e4 = e4 - (e9 * tmpI);
                f4 = f4 - (f9 * tmpI);
                g4 = g4 - (g9 * tmpI);
                h4 = h4 - (h9 * tmpI);
                i4 = i4 - (i9 * tmpI);
                j4 = j4 - (j9 * tmpI);
            }


            if (i5 != 0.0) {
                tmpI = i5;
                a5 = a5 - (a9 * tmpI);
                b5 = b5 - (b9 * tmpI);
                c5 = c5 - (c9 * tmpI);
                d5 = d5 - (d9 * tmpI);
                e5 = e5 - (e9 * tmpI);
                f5 = f5 - (f9 * tmpI);
                g5 = g5 - (g9 * tmpI);
                h5 = h5 - (h9 * tmpI);
                i5 = i5 - (i9 * tmpI);
                j5 = j5 - (j9 * tmpI);
            }

            if (i6 != 0.0) {
                tmpI = i6;
                a6 = a6 - (a9 * tmpI);
                b6 = b6 - (b9 * tmpI);
                c6 = c6 - (c9 * tmpI);
                d6 = d6 - (d9 * tmpI);
                e6 = e6 - (e9 * tmpI);
                f6 = f6 - (f9 * tmpI);
                g6 = g6 - (g9 * tmpI);
                h6 = h6 - (h9 * tmpI);
                i6 = i6 - (i9 * tmpI);
                j6 = j6 - (j9 * tmpI);
            }

            if (i7 != 0.0) {
                tmpI = i7;
                a7 = a7 - (a9 * tmpI);
                b7 = b7 - (b9 * tmpI);
                c7 = c7 - (c9 * tmpI);
                d7 = d7 - (d9 * tmpI);
                e7 = e7 - (e9 * tmpI);
                f7 = f7 - (f9 * tmpI);
                g7 = g7 - (g9 * tmpI);
                h7 = h7 - (h9 * tmpI);
                i7 = i7 - (i9 * tmpI);
                j7 = j7 - (j9 * tmpI);
            }

            if (i8 != 0.0) {
                tmpI = i8;
                a8 = a8 - (a9 * tmpI);
                b8 = b8 - (b9 * tmpI);
                c8 = c8 - (c9 * tmpI);
                d8 = d8 - (d9 * tmpI);
                e8 = e8 - (e9 * tmpI);
                f8 = f8 - (f9 * tmpI);
                g8 = g8 - (g9 * tmpI);
                h8 = h8 - (h9 * tmpI);
                i8 = i8 - (i9 * tmpI);
                j8 = j8 - (j9 * tmpI);
            }



            //endregion
        }


        a1 = math.rounding(a1, roundDigit);
        a2 = math.rounding(a2, roundDigit);
        a3 = math.rounding(a3, roundDigit);
        a4 = math.rounding(a4, roundDigit);
        a5 = math.rounding(a5, roundDigit);
        a6 = math.rounding(a6, roundDigit);
        a7 = math.rounding(a7, roundDigit);
        a8 = math.rounding(a8, roundDigit);
        a9 = math.rounding(a9, roundDigit);


        b1 = math.rounding(b1, roundDigit);
        b2 = math.rounding(b2, roundDigit);
        b3 = math.rounding(b3, roundDigit);
        b4 = math.rounding(b4, roundDigit);
        b5 = math.rounding(b5, roundDigit);
        b6 = math.rounding(b6, roundDigit);
        b7 = math.rounding(b7, roundDigit);
        b8 = math.rounding(b8, roundDigit);
        b9 = math.rounding(b9, roundDigit);

        c1 = math.rounding(c1, roundDigit);
        c2 = math.rounding(c2, roundDigit);
        c3 = math.rounding(c3, roundDigit);
        c4 = math.rounding(c4, roundDigit);
        c5 = math.rounding(c5, roundDigit);
        c6 = math.rounding(c6, roundDigit);
        c7 = math.rounding(c7, roundDigit);
        c8 = math.rounding(c8, roundDigit);
        c9 = math.rounding(c9, roundDigit);

        d1 = math.rounding(d1, roundDigit);
        d2 = math.rounding(d2, roundDigit);
        d3 = math.rounding(d3, roundDigit);
        d4 = math.rounding(d4, roundDigit);
        d5 = math.rounding(d5, roundDigit);
        d6 = math.rounding(d6, roundDigit);
        d7 = math.rounding(d7, roundDigit);
        d8 = math.rounding(d8, roundDigit);
        d9 = math.rounding(d9, roundDigit);

        e1 = math.rounding(e1, roundDigit);
        e2 = math.rounding(e2, roundDigit);
        e3 = math.rounding(e3, roundDigit);
        e4 = math.rounding(e4, roundDigit);
        e5 = math.rounding(e5, roundDigit);
        e6 = math.rounding(e6, roundDigit);
        e7 = math.rounding(e7, roundDigit);
        e8 = math.rounding(e8, roundDigit);
        e9 = math.rounding(e9, roundDigit);

        f1 = math.rounding(f1, roundDigit);
        f2 = math.rounding(f2, roundDigit);
        f3 = math.rounding(f3, roundDigit);
        f4 = math.rounding(f4, roundDigit);
        f5 = math.rounding(f5, roundDigit);
        f6 = math.rounding(f6, roundDigit);
        f7 = math.rounding(f7, roundDigit);
        f8 = math.rounding(f8, roundDigit);
        f9 = math.rounding(f9, roundDigit);

        g1 = math.rounding(g1, roundDigit);
        g2 = math.rounding(g2, roundDigit);
        g3 = math.rounding(g3, roundDigit);
        g4 = math.rounding(g4, roundDigit);
        g5 = math.rounding(g5, roundDigit);
        g6 = math.rounding(g6, roundDigit);
        g7 = math.rounding(g7, roundDigit);
        g8 = math.rounding(g8, roundDigit);
        g9 = math.rounding(g9, roundDigit);

        h1 = math.rounding(h1, roundDigit);
        h2 = math.rounding(h2, roundDigit);
        h3 = math.rounding(h3, roundDigit);
        h4 = math.rounding(h4, roundDigit);
        h5 = math.rounding(h5, roundDigit);
        h6 = math.rounding(h6, roundDigit);
        h7 = math.rounding(h7, roundDigit);
        h8 = math.rounding(h8, roundDigit);
        h9 = math.rounding(h9, roundDigit);

        i1 = math.rounding(i1, roundDigit);
        i2 = math.rounding(i2, roundDigit);
        i3 = math.rounding(i3, roundDigit);
        i4 = math.rounding(i4, roundDigit);
        i5 = math.rounding(i5, roundDigit);
        i6 = math.rounding(i6, roundDigit);
        i7 = math.rounding(i7, roundDigit);
        i8 = math.rounding(i8, roundDigit);
        i9 = math.rounding(i9, roundDigit);

        j1 = math.rounding(j1, roundDigit);
        j2 = math.rounding(j2, roundDigit);
        j3 = math.rounding(j3, roundDigit);
        j4 = math.rounding(j4, roundDigit);
        j5 = math.rounding(j5, roundDigit);
        j6 = math.rounding(j6, roundDigit);
        j7 = math.rounding(j7, roundDigit);
        j8 = math.rounding(j8, roundDigit);
        j9 = math.rounding(j9, roundDigit);


       /* if (d1.toString().length() > 3 || d2.toString().length() > 3 || d3.toString().length() > 3 || d4.toString().length() > 3) {
            d1 = math.rounding(d1, roundDigit);
            d2 = math.rounding(d2, roundDigit);
            d3 = math.rounding(d3, roundDigit);
            d4 = math.rounding(d4, roundDigit);
        }

        if (e1.toString().length() > 3 || e2.toString().length() > 3 || e3.toString().length() > 3 || e4.toString().length() > 3) {
            e1 = math.rounding(e1, roundDigit);
            e2 = math.rounding(e2, roundDigit);
            e3 = math.rounding(e3, roundDigit);
            e4 = math.rounding(e4, roundDigit);
        }*/

        inputA1.setText(String.valueOf(a1));
        inputA2.setText(String.valueOf(a2));
        inputA3.setText(String.valueOf(a3));
        inputA4.setText(String.valueOf(a4));
        inputA5.setText(String.valueOf(a5));
        inputA6.setText(String.valueOf(a6));
        inputA7.setText(String.valueOf(a7));
        inputA8.setText(String.valueOf(a8));
        inputA9.setText(String.valueOf(a9));

        inputB1.setText(String.valueOf(b1));
        inputB2.setText(String.valueOf(b2));
        inputB3.setText(String.valueOf(b3));
        inputB4.setText(String.valueOf(b4));
        inputB5.setText(String.valueOf(b5));
        inputB6.setText(String.valueOf(b6));
        inputB7.setText(String.valueOf(b7));
        inputB8.setText(String.valueOf(b8));
        inputB9.setText(String.valueOf(b9));

        inputC1.setText(String.valueOf(c1));
        inputC2.setText(String.valueOf(c2));
        inputC3.setText(String.valueOf(c3));
        inputC4.setText(String.valueOf(c4));
        inputC5.setText(String.valueOf(c5));
        inputC6.setText(String.valueOf(c6));
        inputC7.setText(String.valueOf(c7));
        inputC8.setText(String.valueOf(c8));
        inputC9.setText(String.valueOf(c9));

        inputD1.setText(String.valueOf(d1));
        inputD2.setText(String.valueOf(d2));
        inputD3.setText(String.valueOf(d3));
        inputD4.setText(String.valueOf(d4));
        inputD5.setText(String.valueOf(d5));
        inputD6.setText(String.valueOf(d6));
        inputD7.setText(String.valueOf(d7));
        inputD8.setText(String.valueOf(d8));
        inputD9.setText(String.valueOf(d9));

        inputE1.setText(String.valueOf(e1));
        inputE2.setText(String.valueOf(e2));
        inputE3.setText(String.valueOf(e3));
        inputE4.setText(String.valueOf(e4));
        inputE5.setText(String.valueOf(e5));
        inputE6.setText(String.valueOf(e6));
        inputE7.setText(String.valueOf(e7));
        inputE8.setText(String.valueOf(e8));
        inputE9.setText(String.valueOf(e9));

        inputF1.setText(String.valueOf(f1));
        inputF2.setText(String.valueOf(f2));
        inputF3.setText(String.valueOf(f3));
        inputF4.setText(String.valueOf(f4));
        inputF5.setText(String.valueOf(f5));
        inputF6.setText(String.valueOf(f6));
        inputF7.setText(String.valueOf(f7));
        inputF8.setText(String.valueOf(f8));
        inputF9.setText(String.valueOf(f9));

        inputG1.setText(String.valueOf(g1));
        inputG2.setText(String.valueOf(g2));
        inputG3.setText(String.valueOf(g3));
        inputG4.setText(String.valueOf(g4));
        inputG5.setText(String.valueOf(g5));
        inputG6.setText(String.valueOf(g6));
        inputG7.setText(String.valueOf(g7));
        inputG8.setText(String.valueOf(g8));
        inputG9.setText(String.valueOf(g9));

        inputH1.setText(String.valueOf(h1));
        inputH2.setText(String.valueOf(h2));
        inputH3.setText(String.valueOf(h3));
        inputH4.setText(String.valueOf(h4));
        inputH5.setText(String.valueOf(h5));
        inputH6.setText(String.valueOf(h6));
        inputH7.setText(String.valueOf(h7));
        inputH8.setText(String.valueOf(h8));
        inputH9.setText(String.valueOf(h9));

        inputI1.setText(String.valueOf(i1));
        inputI2.setText(String.valueOf(i2));
        inputI3.setText(String.valueOf(i3));
        inputI4.setText(String.valueOf(i4));
        inputI5.setText(String.valueOf(i5));
        inputI6.setText(String.valueOf(i6));
        inputI7.setText(String.valueOf(i7));
        inputI8.setText(String.valueOf(i8));
        inputI9.setText(String.valueOf(i9));

        inputJ1.setText(String.valueOf(j1));
        inputJ2.setText(String.valueOf(j2));
        inputJ3.setText(String.valueOf(j3));
        inputJ4.setText(String.valueOf(j4));
        inputJ5.setText(String.valueOf(j5));
        inputJ6.setText(String.valueOf(j6));
        inputJ7.setText(String.valueOf(j7));
        inputJ8.setText(String.valueOf(j8));
        inputJ9.setText(String.valueOf(j9));


    }
    //endregion

    //region Matriks 10x11
    public void matriks10x11(TextView inputA1, TextView inputA2, TextView inputA3, TextView inputA4, TextView inputA5,
                             TextView inputA6, TextView inputA7, TextView inputA8, TextView inputA9, TextView inputA10,
                             TextView inputB1, TextView inputB2, TextView inputB3, TextView inputB4, TextView inputB5,
                             TextView inputB6, TextView inputB7, TextView inputB8, TextView inputB9, TextView inputB10,
                             TextView inputC1, TextView inputC2, TextView inputC3, TextView inputC4, TextView inputC5,
                             TextView inputC6, TextView inputC7, TextView inputC8, TextView inputC9, TextView inputC10,
                             TextView inputD1, TextView inputD2, TextView inputD3, TextView inputD4, TextView inputD5,
                             TextView inputD6, TextView inputD7, TextView inputD8, TextView inputD9, TextView inputD10,
                             TextView inputE1, TextView inputE2, TextView inputE3, TextView inputE4, TextView inputE5,
                             TextView inputE6, TextView inputE7, TextView inputE8, TextView inputE9, TextView inputE10,
                             TextView inputF1, TextView inputF2, TextView inputF3, TextView inputF4, TextView inputF5,
                             TextView inputF6, TextView inputF7, TextView inputF8, TextView inputF9, TextView inputF10,
                             TextView inputG1, TextView inputG2, TextView inputG3, TextView inputG4, TextView inputG5,
                             TextView inputG6, TextView inputG7, TextView inputG8, TextView inputG9, TextView inputG10,
                             TextView inputH1, TextView inputH2, TextView inputH3, TextView inputH4, TextView inputH5,
                             TextView inputH6, TextView inputH7, TextView inputH8, TextView inputH9, TextView inputH10,
                             TextView inputI1, TextView inputI2, TextView inputI3, TextView inputI4, TextView inputI5,
                             TextView inputI6, TextView inputI7, TextView inputI8, TextView inputI9, TextView inputI10,
                             TextView inputJ1, TextView inputJ2, TextView inputJ3, TextView inputJ4, TextView inputJ5,
                             TextView inputJ6, TextView inputJ7, TextView inputJ8, TextView inputJ9, TextView inputJ10,
                             TextView inputK1, TextView inputK2, TextView inputK3, TextView inputK4, TextView inputK5,
                             TextView inputK6, TextView inputK7, TextView inputK8, TextView inputK9, TextView inputK10
    ) {
        //1a+2b+3c+4d+5e+6f=200


        //2   3  =  6
        //3   4  = 12

        Double a1, a2, a3, a4, a5, a6, a7, a8, a9, a10,
                b1, b2, b3, b4, b5, b6, b7, b8, b9, b10,
                c1, c2, c3, c4, c5, c6, c7, c8, c9, c10,
                d1, d2, d3, d4, d5, d6, d7, d8, d9, d10,
                e1, e2, e3, e4, e5, e6, e7, e8, e9, e10,
                f1, f2, f3, f4, f5, f6, f7, f8, f9, f10,
                g1, g2, g3, g4, g5, g6, g7, g8, g9, g10,
                h1, h2, h3, h4, h5, h6, h7, h8, h9, h10,
                i1, i2, i3, i4, i5, i6, i7, i8, i9, i10,
                j1, j2, j3, j4, j5, j6, j7, j8, j9, j10,
                k1, k2, k3, k4, k5, k6, k7, k8, k9, k10,
                tmpA, tmpB, tmpC, tmpD, tmpE, tmpF, tmpG, tmpH, tmpI, tmpJ, tmpK;

        //region Get Value
        a1 = Double.parseDouble(inputA1.getText().toString());
        a2 = Double.parseDouble(inputA2.getText().toString());
        a3 = Double.parseDouble(inputA3.getText().toString());
        a4 = Double.parseDouble(inputA4.getText().toString());
        a5 = Double.parseDouble(inputA5.getText().toString());
        a6 = Double.parseDouble(inputA6.getText().toString());
        a7 = Double.parseDouble(inputA7.getText().toString());
        a8 = Double.parseDouble(inputA8.getText().toString());
        a9 = Double.parseDouble(inputA9.getText().toString());
        a10 = Double.parseDouble(inputA10.getText().toString());

        b1 = Double.parseDouble(inputB1.getText().toString());
        b2 = Double.parseDouble(inputB2.getText().toString());
        b3 = Double.parseDouble(inputB3.getText().toString());
        b4 = Double.parseDouble(inputB4.getText().toString());
        b5 = Double.parseDouble(inputB5.getText().toString());
        b6 = Double.parseDouble(inputB6.getText().toString());
        b7 = Double.parseDouble(inputB7.getText().toString());
        b8 = Double.parseDouble(inputB8.getText().toString());
        b9 = Double.parseDouble(inputB9.getText().toString());
        b10 = Double.parseDouble(inputB10.getText().toString());

        c1 = Double.parseDouble(inputC1.getText().toString());
        c2 = Double.parseDouble(inputC2.getText().toString());
        c3 = Double.parseDouble(inputC3.getText().toString());
        c4 = Double.parseDouble(inputC4.getText().toString());
        c5 = Double.parseDouble(inputC5.getText().toString());
        c6 = Double.parseDouble(inputC6.getText().toString());
        c7 = Double.parseDouble(inputC7.getText().toString());
        c8 = Double.parseDouble(inputC8.getText().toString());
        c9 = Double.parseDouble(inputC9.getText().toString());
        c10 = Double.parseDouble(inputC10.getText().toString());

        d1 = Double.parseDouble(inputD1.getText().toString());
        d2 = Double.parseDouble(inputD2.getText().toString());
        d3 = Double.parseDouble(inputD3.getText().toString());
        d4 = Double.parseDouble(inputD4.getText().toString());
        d5 = Double.parseDouble(inputD5.getText().toString());
        d6 = Double.parseDouble(inputD6.getText().toString());
        d7 = Double.parseDouble(inputD7.getText().toString());
        d8 = Double.parseDouble(inputD8.getText().toString());
        d9 = Double.parseDouble(inputD9.getText().toString());
        d10 = Double.parseDouble(inputD10.getText().toString());

        e1 = Double.parseDouble(inputE1.getText().toString());
        e2 = Double.parseDouble(inputE2.getText().toString());
        e3 = Double.parseDouble(inputE3.getText().toString());
        e4 = Double.parseDouble(inputE4.getText().toString());
        e5 = Double.parseDouble(inputE5.getText().toString());
        e6 = Double.parseDouble(inputE6.getText().toString());
        e7 = Double.parseDouble(inputE7.getText().toString());
        e8 = Double.parseDouble(inputE8.getText().toString());
        e9 = Double.parseDouble(inputE9.getText().toString());
        e10 = Double.parseDouble(inputE10.getText().toString());

        f1 = Double.parseDouble(inputF1.getText().toString());
        f2 = Double.parseDouble(inputF2.getText().toString());
        f3 = Double.parseDouble(inputF3.getText().toString());
        f4 = Double.parseDouble(inputF4.getText().toString());
        f5 = Double.parseDouble(inputF5.getText().toString());
        f6 = Double.parseDouble(inputF6.getText().toString());
        f7 = Double.parseDouble(inputF7.getText().toString());
        f8 = Double.parseDouble(inputF8.getText().toString());
        f9 = Double.parseDouble(inputF9.getText().toString());
        f10 = Double.parseDouble(inputF10.getText().toString());

        g1 = Double.parseDouble(inputG1.getText().toString());
        g2 = Double.parseDouble(inputG2.getText().toString());
        g3 = Double.parseDouble(inputG3.getText().toString());
        g4 = Double.parseDouble(inputG4.getText().toString());
        g5 = Double.parseDouble(inputG5.getText().toString());
        g6 = Double.parseDouble(inputG6.getText().toString());
        g7 = Double.parseDouble(inputG7.getText().toString());
        g8 = Double.parseDouble(inputG8.getText().toString());
        g9 = Double.parseDouble(inputG9.getText().toString());
        g10 = Double.parseDouble(inputG10.getText().toString());

        h1 = Double.parseDouble(inputH1.getText().toString());
        h2 = Double.parseDouble(inputH2.getText().toString());
        h3 = Double.parseDouble(inputH3.getText().toString());
        h4 = Double.parseDouble(inputH4.getText().toString());
        h5 = Double.parseDouble(inputH5.getText().toString());
        h6 = Double.parseDouble(inputH6.getText().toString());
        h7 = Double.parseDouble(inputH7.getText().toString());
        h8 = Double.parseDouble(inputH8.getText().toString());
        h9 = Double.parseDouble(inputH9.getText().toString());
        h10 = Double.parseDouble(inputH10.getText().toString());

        i1 = Double.parseDouble(inputI1.getText().toString());
        i2 = Double.parseDouble(inputI2.getText().toString());
        i3 = Double.parseDouble(inputI3.getText().toString());
        i4 = Double.parseDouble(inputI4.getText().toString());
        i5 = Double.parseDouble(inputI5.getText().toString());
        i6 = Double.parseDouble(inputI6.getText().toString());
        i7 = Double.parseDouble(inputI7.getText().toString());
        i8 = Double.parseDouble(inputI8.getText().toString());
        i9 = Double.parseDouble(inputI9.getText().toString());
        i10 = Double.parseDouble(inputI10.getText().toString());

        j1 = Double.parseDouble(inputJ1.getText().toString());
        j2 = Double.parseDouble(inputJ2.getText().toString());
        j3 = Double.parseDouble(inputJ3.getText().toString());
        j4 = Double.parseDouble(inputJ4.getText().toString());
        j5 = Double.parseDouble(inputJ5.getText().toString());
        j6 = Double.parseDouble(inputJ6.getText().toString());
        j7 = Double.parseDouble(inputJ7.getText().toString());
        j8 = Double.parseDouble(inputJ8.getText().toString());
        j9 = Double.parseDouble(inputJ9.getText().toString());
        j10 = Double.parseDouble(inputJ10.getText().toString());

        k1 = Double.parseDouble(inputK1.getText().toString());
        k2 = Double.parseDouble(inputK2.getText().toString());
        k3 = Double.parseDouble(inputK3.getText().toString());
        k4 = Double.parseDouble(inputK4.getText().toString());
        k5 = Double.parseDouble(inputK5.getText().toString());
        k6 = Double.parseDouble(inputK6.getText().toString());
        k7 = Double.parseDouble(inputK7.getText().toString());
        k8 = Double.parseDouble(inputK8.getText().toString());
        k9 = Double.parseDouble(inputK9.getText().toString());
        k10 = Double.parseDouble(inputK10.getText().toString());
        //endregion


        if (a1 != 1.0) {
            b1 = b1 / a1;
            c1 = c1 / a1;
            d1 = d1 / a1;
            e1 = e1 / a1;
            f1 = f1 / a1;
            g1 = g1 / a1;
            h1 = h1 / a1;
            i1 = i1 / a1;
            j1 = j1 / a1;
            k1 = k1 / a1;
            a1 = a1 / a1;

            //region A Columnn
            if (a2 != 0.0) {
                tmpA = a2;
                a2 = Math.abs(a2 - (a1 * tmpA));
                b2 = b2 - (b1 * tmpA);
                c2 = c2 - (c1 * tmpA);
                d2 = d2 - (d1 * tmpA);
                e2 = e2 - (e1 * tmpA);
                f2 = f2 - (f1 * tmpA);
                g2 = g2 - (g1 * tmpA);
                h2 = h2 - (h1 * tmpA);
                i2 = i2 - (i1 * tmpA);
                j2 = j2 - (j1 * tmpA);
                k2 = k2 - (k1 * tmpA);
            }

            if (a3 != 0.0) {
                tmpA = a3;
                a3 = Math.abs(a3 - (a1 * tmpA));
                b3 = b3 - (b1 * tmpA);
                c3 = c3 - (c1 * tmpA);
                d3 = d3 - (d1 * tmpA);
                e3 = e3 - (e1 * tmpA);
                f3 = f3 - (f1 * tmpA);
                g3 = g3 - (g1 * tmpA);
                h3 = h3 - (h1 * tmpA);
                i3 = i3 - (i1 * tmpA);
                j3 = j3 - (j1 * tmpA);
                k3 = k3 - (k1 * tmpA);

            }
            if (a4 != 0.0) {
                tmpA = a4;
                a4 = Math.abs(a4 - (a1 * tmpA));
                b4 = b4 - (b1 * tmpA);
                c4 = c4 - (c1 * tmpA);
                d4 = d4 - (d1 * tmpA);
                e4 = e4 - (e1 * tmpA);
                f4 = f4 - (f1 * tmpA);
                g4 = g4 - (g1 * tmpA);
                h4 = h4 - (h1 * tmpA);
                i4 = i4 - (i1 * tmpA);
                j4 = j4 - (j1 * tmpA);
                k4 = k4 - (k1 * tmpA);
            }

            if (a5 != 0.0) {
                tmpA = a5;
                a5 = Math.abs(a5 - (a1 * tmpA));
                b5 = b5 - (b1 * tmpA);
                c5 = c5 - (c1 * tmpA);
                d5 = d5 - (d1 * tmpA);
                e5 = e5 - (e1 * tmpA);
                f5 = f5 - (f1 * tmpA);
                g5 = g5 - (g1 * tmpA);
                h5 = h5 - (h1 * tmpA);
                i5 = i5 - (i1 * tmpA);
                j5 = j5 - (j1 * tmpA);
                k5 = k5 - (k1 * tmpA);
            }

            if (a6 != 0.0) {
                tmpA = a6;
                a6 = Math.abs(a6 - (a1 * tmpA));
                b6 = b6 - (b1 * tmpA);
                c6 = c6 - (c1 * tmpA);
                d6 = d6 - (d1 * tmpA);
                e6 = e6 - (e1 * tmpA);
                f6 = f6 - (f1 * tmpA);
                g6 = g6 - (g1 * tmpA);
                h6 = h6 - (h1 * tmpA);
                i6 = i6 - (i1 * tmpA);
                j6 = j6 - (j1 * tmpA);
                k6 = k6 - (k1 * tmpA);
            }

            if (a7 != 0.0) {
                tmpA = a7;
                a7 = Math.abs(a7 - (a1 * tmpA));
                b7 = b7 - (b1 * tmpA);
                c7 = c7 - (c1 * tmpA);
                d7 = d7 - (d1 * tmpA);
                e7 = e7 - (e1 * tmpA);
                f7 = f7 - (f1 * tmpA);
                g7 = g7 - (g1 * tmpA);
                h7 = h7 - (h1 * tmpA);
                i7 = i7 - (i1 * tmpA);
                j7 = j7 - (j1 * tmpA);
                k7 = k7 - (k1 * tmpA);
            }

            if (a8 != 0.0) {
                tmpA = a8;
                a8 = Math.abs(a8 - (a1 * tmpA));
                b8 = b8 - (b1 * tmpA);
                c8 = c8 - (c1 * tmpA);
                d8 = d8 - (d1 * tmpA);
                e8 = e8 - (e1 * tmpA);
                f8 = f8 - (f1 * tmpA);
                g8 = g8 - (g1 * tmpA);
                h8 = h8 - (h1 * tmpA);
                i8 = i8 - (i1 * tmpA);
                j8 = j8 - (j1 * tmpA);
                k8 = k8 - (k1 * tmpA);
            }

            if (a9 != 0.0) {
                tmpA = a9;
                a9 = Math.abs(a9 - (a1 * tmpA));
                b9 = b9 - (b1 * tmpA);
                c9 = c9 - (c1 * tmpA);
                d9 = d9 - (d1 * tmpA);
                e9 = e9 - (e1 * tmpA);
                f9 = f9 - (f1 * tmpA);
                g9 = g9 - (g1 * tmpA);
                h9 = h9 - (h1 * tmpA);
                i9 = i9 - (i1 * tmpA);
                j9 = j9 - (j1 * tmpA);
                k9 = k9 - (k1 * tmpA);
            }

            if (a10 != 0.0) {
                tmpA = a10;
                a10 = Math.abs(a10 - (a1 * tmpA));
                b10 = b10 - (b1 * tmpA);
                c10 = c10 - (c1 * tmpA);
                d10 = d10 - (d1 * tmpA);
                e10 = e10 - (e1 * tmpA);
                f10 = f10 - (f1 * tmpA);
                g10 = g10 - (g1 * tmpA);
                h10 = h10 - (h1 * tmpA);
                i10 = i10 - (i1 * tmpA);
                j10 = j10 - (j1 * tmpA);
                k10 = k5 - (k1 * tmpA);
            }
            //endregion


        } else if (b2 != 1.0) {
            tmpB = b2;
            a2 = Math.abs(a2 / tmpB);
            b2 = b2 / tmpB;
            c2 = c2 / tmpB;
            d2 = d2 / tmpB;
            e2 = e2 / tmpB;
            f2 = f2 / tmpB;
            g2 = g2 / tmpB;
            h2 = h2 / tmpB;
            i2 = i2 / tmpB;
            j2 = j2 / tmpB;
            k2 = k2 / tmpB;


            //region B Column
            if (b1 != 0.0) {
                tmpB = b1;
                a1 = a1 - (a2 * tmpB);
                b1 = b1 - (b2 * tmpB);
                c1 = c1 - (c2 * tmpB);
                d1 = d1 - (d2 * tmpB);
                e1 = e1 - (e2 * tmpB);
                f1 = f1 - (f2 * tmpB);
                g1 = g1 - (g2 * tmpB);
                h1 = h1 - (h2 * tmpB);
                i1 = i1 - (i2 * tmpB);
                j1 = j1 - (j2 * tmpB);
                k1 = k1 - (k2 * tmpB);
            }

            if (b3 != 0.0) {
                tmpB = b3;
                a3 = a3 - (a2 * tmpB);
                b3 = b3 - (b2 * tmpB);
                c3 = c3 - (c2 * tmpB);
                d3 = d3 - (d2 * tmpB);
                e3 = e3 - (e2 * tmpB);
                f3 = f3 - (f2 * tmpB);
                g3 = g3 - (g2 * tmpB);
                h3 = h3 - (h2 * tmpB);
                i3 = i3 - (i2 * tmpB);
                j3 = j3 - (j2 * tmpB);
                k3 = k3 - (k2 * tmpB);
            }

            if (b4 != 0.0) {
                tmpB = b4;
                a4 = a4 - (a2 * tmpB);
                b4 = b4 - (b2 * tmpB);
                c4 = c4 - (c2 * tmpB);
                d4 = d4 - (d2 * tmpB);
                e4 = e4 - (e2 * tmpB);
                f4 = f4 - (f2 * tmpB);
                g4 = g4 - (g2 * tmpB);
                h4 = h4 - (h2 * tmpB);
                i4 = i4 - (i2 * tmpB);
                j4 = j4 - (j2 * tmpB);
                k4 = k4 - (k2 * tmpB);
            }

            if (b5 != 0.0) {
                tmpB = b5;
                a5 = a5 - (a2 * tmpB);
                b5 = b5 - (b2 * tmpB);
                c5 = c5 - (c2 * tmpB);
                d5 = d5 - (d2 * tmpB);
                e5 = e5 - (e2 * tmpB);
                f5 = f5 - (f2 * tmpB);
                g5 = g5 - (g2 * tmpB);
                h5 = h5 - (h2 * tmpB);
                i5 = i5 - (i2 * tmpB);
                j5 = j5 - (j2 * tmpB);
                k5 = k5 - (k2 * tmpB);
            }

            if (b6 != 0.0) {
                tmpB = b6;
                a6 = a6 - (a2 * tmpB);
                b6 = b6 - (b2 * tmpB);
                c6 = c6 - (c2 * tmpB);
                d6 = d6 - (d2 * tmpB);
                e6 = e6 - (e2 * tmpB);
                f6 = f6 - (f2 * tmpB);
                g6 = g6 - (g2 * tmpB);
                h6 = h6 - (h2 * tmpB);
                i6 = i6 - (i2 * tmpB);
                j6 = j6 - (j2 * tmpB);
                k6 = k6 - (k2 * tmpB);
            }

            if (b7 != 0.0) {
                tmpB = b7;
                a7 = a7 - (a2 * tmpB);
                b7 = b7 - (b2 * tmpB);
                c7 = c7 - (c2 * tmpB);
                d7 = d7 - (d2 * tmpB);
                e7 = e7 - (e2 * tmpB);
                f7 = f7 - (f2 * tmpB);
                g7 = g7 - (g2 * tmpB);
                h7 = h7 - (h2 * tmpB);
                i7 = i7 - (i2 * tmpB);
                j7 = j7 - (j2 * tmpB);
                k7 = k7 - (k2 * tmpB);
            }

            if (b8 != 0.0) {
                tmpB = b8;
                a8 = a8 - (a2 * tmpB);
                b8 = b8 - (b2 * tmpB);
                c8 = c8 - (c2 * tmpB);
                d8 = d8 - (d2 * tmpB);
                e8 = e8 - (e2 * tmpB);
                f8 = f8 - (f2 * tmpB);
                g8 = g8 - (g2 * tmpB);
                h8 = h8 - (h2 * tmpB);
                i8 = i8 - (i2 * tmpB);
                j8 = j8 - (j2 * tmpB);
                k8 = k8 - (k2 * tmpB);
            }

            if (b9 != 0.0) {
                tmpB = b9;
                a9 = a9 - (a2 * tmpB);
                b9 = b9 - (b2 * tmpB);
                c9 = c9 - (c2 * tmpB);
                d9 = d9 - (d2 * tmpB);
                e9 = e9 - (e2 * tmpB);
                f9 = f9 - (f2 * tmpB);
                g9 = g9 - (g2 * tmpB);
                h9 = h9 - (h2 * tmpB);
                i9 = i9 - (i2 * tmpB);
                j9 = j9 - (j2 * tmpB);
                k9 = k9 - (k2 * tmpB);
            }

            if (b10 != 0.0) {
                tmpB = b10;
                a10 = a10 - (a2 * tmpB);
                b10 = b10 - (b2 * tmpB);
                c10 = c10 - (c2 * tmpB);
                d10 = d10 - (d2 * tmpB);
                e10 = e10 - (e2 * tmpB);
                f10 = f10 - (f2 * tmpB);
                g10 = g10 - (g2 * tmpB);
                h10 = h10 - (h2 * tmpB);
                i10 = i10 - (i2 * tmpB);
                j10 = j10 - (j2 * tmpB);
                k10 = k10 - (k2 * tmpB);
            }
            //endregion


        } else if (c3 != 1.0) {
            tmpC = c3;
            a3 = Math.abs(a3 / tmpC);
            b3 = b3 / tmpC;
            c3 = c3 / tmpC;
            d3 = d3 / tmpC;
            e3 = e3 / tmpC;
            f3 = f3 / tmpC;
            g3 = g3 / tmpC;
            h3 = h3 / tmpC;
            i3 = i3 / tmpC;
            j3 = j3 / tmpC;
            k3 = j3 / tmpC;

            //region C Column
            if (c2 != 0.0) {
                tmpC = c2;
                a2 = a2 - (a3 * tmpC);
                b2 = b2 - (b3 * tmpC);
                c2 = c2 - (c3 * tmpC);
                d2 = d2 - (d3 * tmpC);
                e2 = e2 - (e3 * tmpC);
                f2 = f2 - (f3 * tmpC);
                g2 = g2 - (g3 * tmpC);
                h2 = h2 - (h3 * tmpC);
                i2 = i2 - (i3 * tmpC);
                j2 = j2 - (j3 * tmpC);
                k2 = k2 - (k3 * tmpC);
            }

            if (c1 != 0.0) {
                tmpC = c1;
                a1 = a1 - (a3 * tmpC);
                b1 = b1 - (b3 * tmpC);
                c1 = c1 - (c3 * tmpC);
                d1 = d1 - (d3 * tmpC);
                e1 = e1 - (e3 * tmpC);
                f1 = f1 - (f3 * tmpC);
                g1 = g1 - (g3 * tmpC);
                h1 = h1 - (h3 * tmpC);
                i1 = i1 - (i3 * tmpC);
                j1 = j1 - (j3 * tmpC);
                k1 = k1 - (k3 * tmpC);
            }

            if (c4 != 0.0) {
                tmpC = c4;
                a4 = a4 - (a3 * tmpC);
                b4 = b4 - (b3 * tmpC);
                c4 = c4 - (c3 * tmpC);
                d4 = d4 - (d3 * tmpC);
                e4 = e4 - (e3 * tmpC);
                f4 = f4 - (f3 * tmpC);
                g4 = g4 - (g3 * tmpC);
                h4 = h4 - (h3 * tmpC);
                i4 = i4 - (i3 * tmpC);
                j4 = j4 - (j3 * tmpC);
                k4 = k4 - (k3 * tmpC);
            }

            if (c5 != 0.0) {
                tmpC = c5;
                a5 = a5 - (a3 * tmpC);
                b5 = b5 - (b3 * tmpC);
                c5 = c5 - (c3 * tmpC);
                d5 = d5 - (d3 * tmpC);
                e5 = e5 - (e3 * tmpC);
                f5 = f5 - (f3 * tmpC);
                g5 = g5 - (g3 * tmpC);
                h5 = h5 - (h3 * tmpC);
                i5 = i5 - (i3 * tmpC);
                j5 = j5 - (j3 * tmpC);
                k5 = k5 - (k3 * tmpC);
            }

            if (c6 != 0.0) {
                tmpC = c6;
                a6 = a6 - (a3 * tmpC);
                b6 = b6 - (b3 * tmpC);
                c6 = c6 - (c3 * tmpC);
                d6 = d6 - (d3 * tmpC);
                e6 = e6 - (e3 * tmpC);
                f6 = f6 - (f3 * tmpC);
                g6 = g6 - (g3 * tmpC);
                h6 = h6 - (h3 * tmpC);
                i6 = i6 - (i3 * tmpC);
                j6 = j6 - (j3 * tmpC);
                k6 = k6 - (k3 * tmpC);
            }

            if (c7 != 0.0) {
                tmpC = c7;
                a7 = a7 - (a3 * tmpC);
                b7 = b7 - (b3 * tmpC);
                c7 = c7 - (c3 * tmpC);
                d7 = d7 - (d3 * tmpC);
                e7 = e7 - (e3 * tmpC);
                f7 = f7 - (f3 * tmpC);
                g7 = g7 - (g3 * tmpC);
                h7 = h7 - (h3 * tmpC);
                i7 = i7 - (i3 * tmpC);
                j7 = j7 - (j3 * tmpC);
                k7 = k7 - (k3 * tmpC);
            }

            if (c8 != 0.0) {
                tmpC = c8;
                a8 = a8 - (a3 * tmpC);
                b8 = b8 - (b3 * tmpC);
                c8 = c8 - (c3 * tmpC);
                d8 = d8 - (d3 * tmpC);
                e8 = e8 - (e3 * tmpC);
                f8 = f8 - (f3 * tmpC);
                g8 = g8 - (g3 * tmpC);
                h8 = h8 - (h3 * tmpC);
                i8 = i8 - (i3 * tmpC);
                j8 = j8 - (j3 * tmpC);
                k8 = k8 - (k3 * tmpC);
            }

            if (c9 != 0.0) {
                tmpC = c9;
                a9 = a9 - (a3 * tmpC);
                b9 = b9 - (b3 * tmpC);
                c9 = c9 - (c3 * tmpC);
                d9 = d9 - (d3 * tmpC);
                e9 = e9 - (e3 * tmpC);
                f9 = f9 - (f3 * tmpC);
                g9 = g9 - (g3 * tmpC);
                h9 = h9 - (h3 * tmpC);
                i9 = i9 - (i3 * tmpC);
                j9 = j9 - (j3 * tmpC);
                k9 = k9 - (k3 * tmpC);
            }

            if (c10 != 0.0) {
                tmpC = c10;
                a10 = a10 - (a3 * tmpC);
                b10 = b10 - (b3 * tmpC);
                c10 = c10 - (c3 * tmpC);
                d10 = d10 - (d3 * tmpC);
                e10 = e10 - (e3 * tmpC);
                f10 = f10 - (f3 * tmpC);
                g10 = g10 - (g3 * tmpC);
                h10 = h10 - (h3 * tmpC);
                i10 = i10 - (i3 * tmpC);
                j10 = j10 - (j3 * tmpC);
                k10 = k10 - (k3 * tmpC);
            }
            //endregion

        } else if (d4 != 1.0) {
            tmpD = d4;
            a4 = Math.abs(a4 / tmpD);
            b4 = b4 / tmpD;
            c4 = c4 / tmpD;
            d4 = d4 / tmpD;
            e4 = e4 / tmpD;
            f4 = f4 / tmpD;
            g4 = g4 / tmpD;
            h4 = h4 / tmpD;
            i4 = i4 / tmpD;
            j4 = j4 / tmpD;
            k4 = k4 / tmpD;

            //region D Column
            if (d1 != 0.0) {
                tmpD = d1;
                a1 = a1 - (a4 * tmpD);
                b1 = b1 - (b4 * tmpD);
                c1 = c1 - (c4 * tmpD);
                d1 = d1 - (d4 * tmpD);
                e1 = e1 - (e4 * tmpD);
                f1 = f1 - (f4 * tmpD);
                g1 = g1 - (g4 * tmpD);
                h1 = h1 - (h4 * tmpD);
                i1 = i1 - (i4 * tmpD);
                j1 = j1 - (j4 * tmpD);
                k1 = k1 - (k4 * tmpD);
            }

            if (d2 != 0.0) {
                tmpD = d2;
                a2 = a2 - (a4 * tmpD);
                b2 = b2 - (b4 * tmpD);
                c2 = c2 - (c4 * tmpD);
                d2 = d2 - (d4 * tmpD);
                e2 = e2 - (e4 * tmpD);
                f2 = f2 - (f4 * tmpD);
                g2 = g2 - (g4 * tmpD);
                h2 = h2 - (h4 * tmpD);
                i2 = i2 - (i4 * tmpD);
                j2 = j2 - (j4 * tmpD);
                k2 = k2 - (k4 * tmpD);
            }

            if (d3 != 0.0) {
                tmpD = d3;
                a3 = a3 - (a4 * tmpD);
                b3 = b3 - (b4 * tmpD);
                c3 = c3 - (c4 * tmpD);
                d3 = d3 - (d4 * tmpD);
                e3 = e3 - (e4 * tmpD);
                f3 = f3 - (f4 * tmpD);
                g3 = g3 - (g4 * tmpD);
                h3 = h3 - (h4 * tmpD);
                i3 = i3 - (i4 * tmpD);
                j3 = j3 - (j4 * tmpD);
                k3 = k3 - (k4 * tmpD);
            }

            if (d5 != 0.0) {
                tmpD = d5;
                a5 = a5 - (a4 * tmpD);
                b5 = b5 - (b4 * tmpD);
                c5 = c5 - (c4 * tmpD);
                d5 = d5 - (d4 * tmpD);
                e5 = e5 - (e4 * tmpD);
                f5 = f5 - (f4 * tmpD);
                g5 = g5 - (g4 * tmpD);
                h5 = h5 - (h4 * tmpD);
                i5 = i5 - (i4 * tmpD);
                j5 = j5 - (j4 * tmpD);
                k5 = k5 - (k4 * tmpD);
            }

            if (d6 != 0.0) {
                tmpD = d6;
                a6 = a6 - (a4 * tmpD);
                b6 = b6 - (b4 * tmpD);
                c6 = c6 - (c4 * tmpD);
                d6 = d6 - (d4 * tmpD);
                e6 = e6 - (e4 * tmpD);
                f6 = f6 - (f4 * tmpD);
                g6 = g6 - (g4 * tmpD);
                h6 = h6 - (h4 * tmpD);
                i6 = i6 - (i4 * tmpD);
                j6 = j6 - (j4 * tmpD);
                k6 = k6 - (k4 * tmpD);
            }

            if (d7 != 0.0) {
                tmpD = d7;
                a7 = a7 - (a4 * tmpD);
                b7 = b7 - (b4 * tmpD);
                c7 = c7 - (c4 * tmpD);
                d7 = d7 - (d4 * tmpD);
                e7 = e7 - (e4 * tmpD);
                f7 = f7 - (f4 * tmpD);
                g7 = g7 - (g4 * tmpD);
                h7 = h7 - (h4 * tmpD);
                i7 = i7 - (i4 * tmpD);
                j7 = j7 - (j4 * tmpD);
                k7 = k7 - (k4 * tmpD);
            }

            if (d8 != 0.0) {
                tmpD = d8;
                a8 = a8 - (a4 * tmpD);
                b8 = b8 - (b4 * tmpD);
                c8 = c8 - (c4 * tmpD);
                d8 = d8 - (d4 * tmpD);
                e8 = e8 - (e4 * tmpD);
                f8 = f8 - (f4 * tmpD);
                g8 = g8 - (g4 * tmpD);
                h8 = h8 - (h4 * tmpD);
                i8 = i8 - (i4 * tmpD);
                j8 = j8 - (j4 * tmpD);
                k8 = k8 - (k4 * tmpD);
            }

            if (d9 != 0.0) {
                tmpD = d9;
                a9 = a9 - (a4 * tmpD);
                b9 = b9 - (b4 * tmpD);
                c9 = c9 - (c4 * tmpD);
                d9 = d9 - (d4 * tmpD);
                e9 = e9 - (e4 * tmpD);
                f9 = f9 - (f4 * tmpD);
                g9 = g9 - (g4 * tmpD);
                h9 = h9 - (h4 * tmpD);
                i9 = i9 - (i4 * tmpD);
                j9 = j9 - (j4 * tmpD);
                k9 = k9 - (k4 * tmpD);
            }

            if (d10 != 0.0) {
                tmpD = d10;
                a10 = a10 - (a4 * tmpD);
                b10 = b10 - (b4 * tmpD);
                c10 = c10 - (c4 * tmpD);
                d10 = d10 - (d4 * tmpD);
                e10 = e10 - (e4 * tmpD);
                f10 = f10 - (f4 * tmpD);
                g10 = g10 - (g4 * tmpD);
                h10 = h10 - (h4 * tmpD);
                i10 = i10 - (i4 * tmpD);
                j10 = j10 - (j4 * tmpD);
                k10 = k10 - (k4 * tmpD);
            }
            //endregion

        } else if (e5 != 1.0) {
            tmpE = e5;
            a5 = Math.abs(a5 / tmpE);
            b5 = b5 / tmpE;
            c5 = c5 / tmpE;
            d5 = d5 / tmpE;
            e5 = e5 / tmpE;
            f5 = f5 / tmpE;
            g5 = g5 / tmpE;
            h5 = h5 / tmpE;
            i5 = i5 / tmpE;
            j5 = j5 / tmpE;
            k5 = k5 / tmpE;

            //region E Column
            if (e1 != 0.0) {
                tmpE = e1;
                a1 = a1 - (a5 * tmpE);
                b1 = b1 - (b5 * tmpE);
                c1 = c1 - (c5 * tmpE);
                d1 = d1 - (d5 * tmpE);
                e1 = e1 - (e5 * tmpE);
                f1 = f1 - (f5 * tmpE);
                g1 = g1 - (g5 * tmpE);
                h1 = h1 - (h5 * tmpE);
                i1 = i1 - (i5 * tmpE);
                j1 = j1 - (j5 * tmpE);
                k1 = k1 - (k5 * tmpE);
            }

            if (e2 != 0.0) {
                tmpE = e2;
                a2 = a2 - (a5 * tmpE);
                b2 = b2 - (b5 * tmpE);
                c2 = c2 - (c5 * tmpE);
                d2 = d2 - (d5 * tmpE);
                e2 = e2 - (e5 * tmpE);
                f2 = f2 - (f5 * tmpE);
                g2 = g2 - (g5 * tmpE);
                h2 = h2 - (h5 * tmpE);
                i2 = i2 - (i5 * tmpE);
                j2 = j2 - (j5 * tmpE);
                k2 = k2 - (k5 * tmpE);
            }

            if (e3 != 0.0) {
                tmpE = e3;
                a3 = a3 - (a5 * tmpE);
                b3 = b3 - (b5 * tmpE);
                c3 = c3 - (c5 * tmpE);
                d3 = d3 - (d5 * tmpE);
                e3 = e3 - (e5 * tmpE);
                f3 = f3 - (f5 * tmpE);
                g3 = g3 - (g5 * tmpE);
                h3 = h3 - (h5 * tmpE);
                i3 = i3 - (i5 * tmpE);
                j3 = j3 - (j5 * tmpE);
                k3 = k3 - (k5 * tmpE);
            }

            if (e4 != 0.0) {
                tmpE = e4;
                a4 = a4 - (a5 * tmpE);
                b4 = b4 - (b5 * tmpE);
                c4 = c4 - (c5 * tmpE);
                d4 = d4 - (d5 * tmpE);
                e4 = e4 - (e5 * tmpE);
                f4 = f4 - (f5 * tmpE);
                g4 = g4 - (g5 * tmpE);
                h4 = h4 - (h5 * tmpE);
                i4 = i4 - (i5 * tmpE);
                j4 = j4 - (j5 * tmpE);
                k4 = k4 - (k5 * tmpE);
            }

            if (e6 != 0.0) {
                tmpE = e6;
                a6 = a6 - (a5 * tmpE);
                b6 = b6 - (b5 * tmpE);
                c6 = c6 - (c5 * tmpE);
                d6 = d6 - (d5 * tmpE);
                e6 = e6 - (e5 * tmpE);
                f6 = f6 - (f5 * tmpE);
                g6 = g6 - (g5 * tmpE);
                h6 = h6 - (h5 * tmpE);
                i6 = i6 - (i5 * tmpE);
                j6 = j6 - (j5 * tmpE);
                k6 = k6 - (k5 * tmpE);
            }

            if (e7 != 0.0) {
                tmpE = e7;
                a7 = a7 - (a5 * tmpE);
                b7 = b7 - (b5 * tmpE);
                c7 = c7 - (c5 * tmpE);
                d7 = d7 - (d5 * tmpE);
                e7 = e7 - (e5 * tmpE);
                f7 = f7 - (f5 * tmpE);
                g7 = g7 - (g5 * tmpE);
                h7 = h7 - (h5 * tmpE);
                i7 = i7 - (i5 * tmpE);
                j7 = j7 - (j5 * tmpE);
                k7 = k7 - (k5 * tmpE);
            }

            if (e8 != 0.0) {
                tmpE = e8;
                a8 = a8 - (a5 * tmpE);
                b8 = b8 - (b5 * tmpE);
                c8 = c8 - (c5 * tmpE);
                d8 = d8 - (d5 * tmpE);
                e8 = e8 - (e5 * tmpE);
                f8 = f8 - (f5 * tmpE);
                g8 = g8 - (g5 * tmpE);
                h8 = h8 - (h5 * tmpE);
                i8 = i8 - (i5 * tmpE);
                j8 = j8 - (j5 * tmpE);
                k8 = k8 - (k5 * tmpE);
            }

            if (e9 != 0.0) {
                tmpE = e9;
                a9 = a9 - (a5 * tmpE);
                b9 = b9 - (b5 * tmpE);
                c9 = c9 - (c5 * tmpE);
                d9 = d9 - (d5 * tmpE);
                e9 = e9 - (e5 * tmpE);
                f9 = f9 - (f5 * tmpE);
                g9 = g9 - (g5 * tmpE);
                h9 = h9 - (h5 * tmpE);
                i9 = i9 - (i5 * tmpE);
                j9 = j9 - (j5 * tmpE);
                k9 = k9 - (k5 * tmpE);
            }

            if (e10 != 0.0) {
                tmpE = e10;
                a10 = a10 - (a5 * tmpE);
                b10 = b10 - (b5 * tmpE);
                c10 = c10 - (c5 * tmpE);
                d10 = d10 - (d5 * tmpE);
                e10 = e10 - (e5 * tmpE);
                f10 = f10 - (f5 * tmpE);
                g10 = g10 - (g5 * tmpE);
                h10 = h10 - (h5 * tmpE);
                i10 = i10 - (i5 * tmpE);
                j10 = j10 - (j5 * tmpE);
                k10 = k10 - (k5 * tmpE);
            }
            //endregion


        } else if (f6 != 1.0) {
            tmpF = f6;
            a6 = Math.abs(a6 / tmpF);
            b6 = b6 / tmpF;
            c6 = c6 / tmpF;
            d6 = d6 / tmpF;
            e6 = e6 / tmpF;
            f6 = f6 / tmpF;
            g6 = g6 / tmpF;
            h6 = h6 / tmpF;
            i6 = i6 / tmpF;
            j6 = j6 / tmpF;
            k6 = k6 / tmpF;

            //region F Column
            if (f1 != 0.0) {
                tmpF = f1;
                a1 = a1 - (a6 * tmpF);
                b1 = b1 - (b6 * tmpF);
                c1 = c1 - (c6 * tmpF);
                d1 = d1 - (d6 * tmpF);
                e1 = e1 - (e6 * tmpF);
                f1 = f1 - (f6 * tmpF);
                g1 = g1 - (g6 * tmpF);
                h1 = h1 - (h6 * tmpF);
                i1 = i1 - (i6 * tmpF);
                j1 = j1 - (j6 * tmpF);
                k1 = k1 - (k6 * tmpF);
            }

            if (f2 != 0.0) {
                tmpF = f2;
                a2 = a2 - (a6 * tmpF);
                b2 = b2 - (b6 * tmpF);
                c2 = c2 - (c6 * tmpF);
                d2 = d2 - (d6 * tmpF);
                e2 = e2 - (e6 * tmpF);
                f2 = f2 - (f6 * tmpF);
                g2 = g2 - (g6 * tmpF);
                h2 = h2 - (h6 * tmpF);
                i2 = i2 - (i6 * tmpF);
                j2 = j2 - (j6 * tmpF);
                k2 = k2 - (k6 * tmpF);
            }

            if (f3 != 0.0) {
                tmpF = f3;
                a3 = a3 - (a6 * tmpF);
                b3 = b3 - (b6 * tmpF);
                c3 = c3 - (c6 * tmpF);
                d3 = d3 - (d6 * tmpF);
                e3 = e3 - (e6 * tmpF);
                f3 = f3 - (f6 * tmpF);
                g3 = g3 - (g6 * tmpF);
                h3 = h3 - (h6 * tmpF);
                i3 = i3 - (i6 * tmpF);
                j3 = j3 - (j6 * tmpF);
                k3 = k3 - (k6 * tmpF);
            }

            if (f4 != 0.0) {
                tmpF = f4;
                a4 = a4 - (a6 * tmpF);
                b4 = b4 - (b6 * tmpF);
                c4 = c4 - (c6 * tmpF);
                d4 = d4 - (d6 * tmpF);
                e4 = e4 - (e6 * tmpF);
                f4 = f4 - (f6 * tmpF);
                g4 = g4 - (g6 * tmpF);
                h4 = h4 - (h6 * tmpF);
                i4 = i4 - (i6 * tmpF);
                j4 = j4 - (j6 * tmpF);
                k4 = k4 - (k6 * tmpF);
            }

            if (f5 != 0.0) {
                tmpF = f5;
                a5 = a5 - (a6 * tmpF);
                b5 = b5 - (b6 * tmpF);
                c5 = c5 - (c6 * tmpF);
                d5 = d5 - (d6 * tmpF);
                e5 = e5 - (e6 * tmpF);
                f5 = f5 - (f6 * tmpF);
                g5 = g5 - (g6 * tmpF);
                h5 = h5 - (h6 * tmpF);
                i5 = i5 - (i6 * tmpF);
                j5 = j5 - (j6 * tmpF);
                k5 = k5 - (k6 * tmpF);
            }

            if (f7 != 0.0) {
                tmpF = f7;
                a7 = a7 - (a6 * tmpF);
                b7 = b7 - (b6 * tmpF);
                c7 = c7 - (c6 * tmpF);
                d7 = d7 - (d6 * tmpF);
                e7 = e7 - (e6 * tmpF);
                f7 = f7 - (f6 * tmpF);
                g7 = g7 - (g6 * tmpF);
                h7 = h7 - (h6 * tmpF);
                i7 = i7 - (i6 * tmpF);
                j7 = j7 - (j6 * tmpF);
                k7 = k7 - (k6 * tmpF);
            }

            if (f8 != 0.0) {
                tmpF = f8;
                a8 = a8 - (a6 * tmpF);
                b8 = b8 - (b6 * tmpF);
                c8 = c8 - (c6 * tmpF);
                d8 = d8 - (d6 * tmpF);
                e8 = e8 - (e6 * tmpF);
                f8 = f8 - (f6 * tmpF);
                g8 = g8 - (g6 * tmpF);
                h8 = h8 - (h6 * tmpF);
                i8 = i8 - (i6 * tmpF);
                j8 = j8 - (j6 * tmpF);
                k8 = k8 - (k6 * tmpF);
            }

            if (f9 != 0.0) {
                tmpF = f9;
                a9 = a9 - (a6 * tmpF);
                b9 = b9 - (b6 * tmpF);
                c9 = c9 - (c6 * tmpF);
                d9 = d9 - (d6 * tmpF);
                e9 = e9 - (e6 * tmpF);
                f9 = f9 - (f6 * tmpF);
                g9 = g9 - (g6 * tmpF);
                h9 = h9 - (h6 * tmpF);
                i9 = i9 - (i6 * tmpF);
                j9 = j9 - (j6 * tmpF);
                k9 = k9 - (k6 * tmpF);
            }

            if (f10 != 0.0) {
                tmpF = f10;
                a10 = a10 - (a6 * tmpF);
                b10 = b10 - (b6 * tmpF);
                c10 = c10 - (c6 * tmpF);
                d10 = d10 - (d6 * tmpF);
                e10 = e10 - (e6 * tmpF);
                f10 = f10 - (f6 * tmpF);
                g10 = g10 - (g6 * tmpF);
                h10 = h10 - (h6 * tmpF);
                i10 = i10 - (i6 * tmpF);
                j10 = j10 - (j6 * tmpF);
                k10 = k10 - (k6 * tmpF);
            }
            //endregion
        }

        else if (g7 != 1.0) {
            tmpG = g7;
            a7 = Math.abs(a7 / tmpG);
            b7 = b7 / tmpG;
            c7 = c7 / tmpG;
            d7 = d7 / tmpG;
            e7 = e7 / tmpG;
            f7 = f7 / tmpG;
            g7 = g7 / tmpG;
            h7 = h7 / tmpG;
            i7 = i7 / tmpG;
            j7 = j7 / tmpG;
            k7 = k7 / tmpG;

            //region G Column
            if (g1 != 0.0) {
                tmpG = g1;
                a1 = a1 - (a7 * tmpG);
                b1 = b1 - (b7 * tmpG);
                c1 = c1 - (c7 * tmpG);
                d1 = d1 - (d7 * tmpG);
                e1 = e1 - (e7 * tmpG);
                f1 = f1 - (f7 * tmpG);
                g1 = g1 - (g7 * tmpG);
                h1 = h1 - (h7 * tmpG);
                i1 = i1 - (i7 * tmpG);
                j1 = j1 - (j7 * tmpG);
                k1 = k1 - (k7 * tmpG);
            }

            if (g2 != 0.0) {
                tmpG = g2;
                a2 = a2 - (a7 * tmpG);
                b2 = b2 - (b7 * tmpG);
                c2 = c2 - (c7 * tmpG);
                d2 = d2 - (d7 * tmpG);
                e2 = e2 - (e7 * tmpG);
                f2 = f2 - (f7 * tmpG);
                g2 = g2 - (g7 * tmpG);
                h2 = h2 - (h7 * tmpG);
                i2 = i2 - (i7 * tmpG);
                j2 = j2 - (j7 * tmpG);
                k2 = k2 - (k7 * tmpG);
            }

            if (g3 != 0.0) {
                tmpG = g3;
                a3 = a3 - (a7 * tmpG);
                b3 = b3 - (b7 * tmpG);
                c3 = c3 - (c7 * tmpG);
                d3 = d3 - (d7 * tmpG);
                e3 = e3 - (e7 * tmpG);
                f3 = f3 - (f7 * tmpG);
                g3 = g3 - (g7 * tmpG);
                h3 = h3 - (h7 * tmpG);
                i3 = i3 - (i7 * tmpG);
                j3 = j3 - (j7 * tmpG);
                k3 = k3 - (k7 * tmpG);
            }

            if (g4 != 0.0) {
                tmpG = g4;
                a4 = a4 - (a7 * tmpG);
                b4 = b4 - (b7 * tmpG);
                c4 = c4 - (c7 * tmpG);
                d4 = d4 - (d7 * tmpG);
                e4 = e4 - (e7 * tmpG);
                f4 = f4 - (f7 * tmpG);
                g4 = g4 - (g7 * tmpG);
                h4 = h4 - (h7 * tmpG);
                i4 = i4 - (i7 * tmpG);
                j4 = j4 - (j7 * tmpG);
                k4 = k4 - (k7 * tmpG);
            }

            if (g5 != 0.0) {
                tmpG = g5;
                a5 = a5 - (a7 * tmpG);
                b5 = b5 - (b7 * tmpG);
                c5 = c5 - (c7 * tmpG);
                d5 = d5 - (d7 * tmpG);
                e5 = e5 - (e7 * tmpG);
                f5 = f5 - (f7 * tmpG);
                g5 = g5 - (g7 * tmpG);
                h5 = h5 - (h7 * tmpG);
                i5 = i5 - (i7 * tmpG);
                j5 = j5 - (j7 * tmpG);
                k5 = k5 - (k7 * tmpG);
            }

            if (g6 != 0.0) {
                tmpG = g6;
                a6 = a6 - (a7 * tmpG);
                b6 = b6 - (b7 * tmpG);
                c6 = c6 - (c7 * tmpG);
                d6 = d6 - (d7 * tmpG);
                e6 = e6 - (e7 * tmpG);
                f6 = f6 - (f7 * tmpG);
                g6 = g6 - (g7 * tmpG);
                h6 = h6 - (h7 * tmpG);
                i6 = i6 - (i7 * tmpG);
                j6 = j6 - (j7 * tmpG);
                k6 = k6 - (k7 * tmpG);
            }

            if (g8 != 0.0) {
                tmpG = g8;
                a8 = a8 - (a7 * tmpG);
                b8 = b8 - (b7 * tmpG);
                c8 = c8 - (c7 * tmpG);
                d8 = d8 - (d7 * tmpG);
                e8 = e8 - (e7 * tmpG);
                f8 = f8 - (f7 * tmpG);
                g8 = g8 - (g7 * tmpG);
                h8 = h8 - (h7 * tmpG);
                i8 = i8 - (i7 * tmpG);
                j8 = j8 - (j7 * tmpG);
                k8 = k8 - (k7 * tmpG);
            }

            if (g9 != 0.0) {
                tmpG = g9;
                a9 = a9 - (a7 * tmpG);
                b9 = b9 - (b7 * tmpG);
                c9 = c9 - (c7 * tmpG);
                d9 = d9 - (d7 * tmpG);
                e9 = e9 - (e7 * tmpG);
                f9 = f9 - (f7 * tmpG);
                g9 = g9 - (g7 * tmpG);
                h9 = h9 - (h7 * tmpG);
                i9 = i9 - (i7 * tmpG);
                j9 = j9 - (j7 * tmpG);
                k9 = k9 - (k7 * tmpG);
            }

            if (g10 != 0.0) {
                tmpG = g10;
                a10 = a10 - (a7 * tmpG);
                b10 = b10 - (b7 * tmpG);
                c10 = c10 - (c7 * tmpG);
                d10 = d10 - (d7 * tmpG);
                e10 = e10 - (e7 * tmpG);
                f10 = f10 - (f7 * tmpG);
                g10 = g10 - (g7 * tmpG);
                h10 = h10 - (h7 * tmpG);
                i10 = i10 - (i7 * tmpG);
                j10 = j10 - (j7 * tmpG);
                k10 = k10 - (k7 * tmpG);
            }
            //endregion

        } else if (h8 != 1.0) {
            tmpH = h8;
            a8 = Math.abs(a8 / tmpH);
            b8 = b8 / tmpH;
            c8 = c8 / tmpH;
            d8 = d8 / tmpH;
            e8 = e8 / tmpH;
            f8 = f8 / tmpH;
            g8 = g8 / tmpH;
            h8 = h8 / tmpH;
            i8 = i8 / tmpH;
            j8 = j8 / tmpH;
            k8 = k8 / tmpH;

            //region H Column
            if (h1 != 0.0) {
                tmpH = h1;
                a1 = a1 - (a8 * tmpH);
                b1 = b1 - (b8 * tmpH);
                c1 = c1 - (c8 * tmpH);
                d1 = d1 - (d8 * tmpH);
                e1 = e1 - (e8 * tmpH);
                f1 = f1 - (f8 * tmpH);
                g1 = g1 - (g8 * tmpH);
                h1 = h1 - (h8 * tmpH);
                i1 = i1 - (i8 * tmpH);
                j1 = j1 - (j8 * tmpH);
                k1 = k1 - (k8 * tmpH);
            }

            if (h2 != 0.0) {
                tmpH = h2;
                a2 = a2 - (a8 * tmpH);
                b2 = b2 - (b8 * tmpH);
                c2 = c2 - (c8 * tmpH);
                d2 = d2 - (d8 * tmpH);
                e2 = e2 - (e8 * tmpH);
                f2 = f2 - (f8 * tmpH);
                g2 = g2 - (g8 * tmpH);
                h2 = h2 - (h8 * tmpH);
                i2 = i2 - (i8 * tmpH);
                j2 = j2 - (j8 * tmpH);
                k2 = k2 - (k8 * tmpH);
            }

            if (h3 != 0.0) {
                tmpH = h3;
                a3 = a3 - (a8 * tmpH);
                b3 = b3 - (b8 * tmpH);
                c3 = c3 - (c8 * tmpH);
                d3 = d3 - (d8 * tmpH);
                e3 = e3 - (e8 * tmpH);
                f3 = f3 - (f8 * tmpH);
                g3 = g3 - (g8 * tmpH);
                h3 = h3 - (h8 * tmpH);
                i3 = i3 - (i8 * tmpH);
                j3 = j3 - (j8 * tmpH);
                k3 = k3 - (k8 * tmpH);
            }

            if (h4 != 0.0) {
                tmpH = h4;
                a4 = a4 - (a8 * tmpH);
                b4 = b4 - (b8 * tmpH);
                c4 = c4 - (c8 * tmpH);
                d4 = d4 - (d8 * tmpH);
                e4 = e4 - (e8 * tmpH);
                f4 = f4 - (f8 * tmpH);
                g4 = g4 - (g8 * tmpH);
                h4 = h4 - (h8 * tmpH);
                i4 = i4 - (i8 * tmpH);
                j4 = j4 - (j8 * tmpH);
                k4 = k4 - (k8 * tmpH);
            }


            if (h5 != 0.0) {
                tmpH = h5;
                a5 = a5 - (a8 * tmpH);
                b5 = b5 - (b8 * tmpH);
                c5 = c5 - (c8 * tmpH);
                d5 = d5 - (d8 * tmpH);
                e5 = e5 - (e8 * tmpH);
                f5 = f5 - (f8 * tmpH);
                g5 = g5 - (g8 * tmpH);
                h5 = h5 - (h8 * tmpH);
                i5 = i5 - (i8 * tmpH);
                j5 = j5 - (j8 * tmpH);
                k5 = k5 - (k8 * tmpH);
            }


            if (h6 != 0.0) {
                tmpH = h6;
                a6 = a6 - (a8 * tmpH);
                b6 = b6 - (b8 * tmpH);
                c6 = c6 - (c8 * tmpH);
                d6 = d6 - (d8 * tmpH);
                e6 = e6 - (e8 * tmpH);
                f6 = f6 - (f8 * tmpH);
                g6 = g6 - (g8 * tmpH);
                h6 = h6 - (h8 * tmpH);
                i6 = i6 - (i8 * tmpH);
                j6 = j6 - (j8 * tmpH);
                k6 = k6 - (k8 * tmpH);
            }

            if (h7 != 0.0) {
                tmpH = h7;
                a7 = a7 - (a8 * tmpH);
                b7 = b7 - (b8 * tmpH);
                c7 = c7 - (c8 * tmpH);
                d7 = d7 - (d8 * tmpH);
                e7 = e7 - (e8 * tmpH);
                f7 = f7 - (f8 * tmpH);
                g7 = g7 - (g8 * tmpH);
                h7 = h7 - (h8 * tmpH);
                i7 = i7 - (i8 * tmpH);
                j7 = j7 - (j8 * tmpH);
                k7 = k7 - (k8 * tmpH);
            }

            if (h9 != 0.0) {
                tmpH = h9;
                a9 = a9 - (a8 * tmpH);
                b9 = b9 - (b8 * tmpH);
                c9 = c9 - (c8 * tmpH);
                d9 = d9 - (d8 * tmpH);
                e9 = e9 - (e8 * tmpH);
                f9 = f9 - (f8 * tmpH);
                g9 = g9 - (g8 * tmpH);
                h9 = h9 - (h8 * tmpH);
                i9 = i9 - (i8 * tmpH);
                j9 = j9 - (j8 * tmpH);
                k9 = k9 - (k8 * tmpH);
            }

            if (h10 != 0.0) {
                tmpH = h10;
                a10 = a10 - (a8 * tmpH);
                b10 = b10 - (b8 * tmpH);
                c10 = c10 - (c8 * tmpH);
                d10 = d10 - (d8 * tmpH);
                e10 = e10 - (e8 * tmpH);
                f10 = f10 - (f8 * tmpH);
                g10 = g10 - (g8 * tmpH);
                h10 = h10 - (h8 * tmpH);
                i10 = i10 - (i8 * tmpH);
                j10 = j10 - (j8 * tmpH);
                k10 = k10 - (k8 * tmpH);
            }
            //endregion

        } else if (i9 != 1.0) {
            tmpI = i9;
            a9 = Math.abs(a9 / tmpI);
            b9 = b9 / tmpI;
            c9 = c9 / tmpI;
            d9 = d9 / tmpI;
            e9 = e9 / tmpI;
            f9 = f9 / tmpI;
            g9 = g9 / tmpI;
            h9 = h9 / tmpI;
            i9 = i9 / tmpI;
            j9 = j9 / tmpI;
            k9 = k9 / tmpI;

            //region I Column
            if (i1 != 0.0) {
                tmpI = i1;
                a1 = a1 - (a9 * tmpI);
                b1 = b1 - (b9 * tmpI);
                c1 = c1 - (c9 * tmpI);
                d1 = d1 - (d9 * tmpI);
                e1 = e1 - (e9 * tmpI);
                f1 = f1 - (f9 * tmpI);
                g1 = g1 - (g9 * tmpI);
                h1 = h1 - (h9 * tmpI);
                i1 = i1 - (i9 * tmpI);
                j1 = j1 - (j9 * tmpI);
                k1 = k1 - (k9 * tmpI);
            }

            if (i2 != 0.0) {
                tmpI = i2;
                a2 = a2 - (a9 * tmpI);
                b2 = b2 - (b9 * tmpI);
                c2 = c2 - (c9 * tmpI);
                d2 = d2 - (d9 * tmpI);
                e2 = e2 - (e9 * tmpI);
                f2 = f2 - (f9 * tmpI);
                g2 = g2 - (g9 * tmpI);
                h2 = h2 - (h9 * tmpI);
                i2 = i2 - (i9 * tmpI);
                j2 = j2 - (j9 * tmpI);
                k2 = k2 - (k9 * tmpI);
            }

            if (i3 != 0.0) {
                tmpI = i3;
                a3 = a3 - (a9 * tmpI);
                b3 = b3 - (b9 * tmpI);
                c3 = c3 - (c9 * tmpI);
                d3 = d3 - (d9 * tmpI);
                e3 = e3 - (e9 * tmpI);
                f3 = f3 - (f9 * tmpI);
                g3 = g3 - (g9 * tmpI);
                h3 = h3 - (h9 * tmpI);
                i3 = i3 - (i9 * tmpI);
                j3 = j3 - (j9 * tmpI);
                k3 = k3 - (k9 * tmpI);
            }

            if (i4 != 0.0) {
                tmpI = i4;
                a4 = a4 - (a9 * tmpI);
                b4 = b4 - (b9 * tmpI);
                c4 = c4 - (c9 * tmpI);
                d4 = d4 - (d9 * tmpI);
                e4 = e4 - (e9 * tmpI);
                f4 = f4 - (f9 * tmpI);
                g4 = g4 - (g9 * tmpI);
                h4 = h4 - (h9 * tmpI);
                i4 = i4 - (i9 * tmpI);
                j4 = j4 - (j9 * tmpI);
                k4 = k4 - (k9 * tmpI);
            }


            if (i5 != 0.0) {
                tmpI = i5;
                a5 = a5 - (a9 * tmpI);
                b5 = b5 - (b9 * tmpI);
                c5 = c5 - (c9 * tmpI);
                d5 = d5 - (d9 * tmpI);
                e5 = e5 - (e9 * tmpI);
                f5 = f5 - (f9 * tmpI);
                g5 = g5 - (g9 * tmpI);
                h5 = h5 - (h9 * tmpI);
                i5 = i5 - (i9 * tmpI);
                j5 = j5 - (j9 * tmpI);
                k5 = k5 - (k9 * tmpI);
            }

            if (i6 != 0.0) {
                tmpI = i6;
                a6 = a6 - (a9 * tmpI);
                b6 = b6 - (b9 * tmpI);
                c6 = c6 - (c9 * tmpI);
                d6 = d6 - (d9 * tmpI);
                e6 = e6 - (e9 * tmpI);
                f6 = f6 - (f9 * tmpI);
                g6 = g6 - (g9 * tmpI);
                h6 = h6 - (h9 * tmpI);
                i6 = i6 - (i9 * tmpI);
                j6 = j6 - (j9 * tmpI);
                k6 = k6 - (k9 * tmpI);
            }

            if (i7 != 0.0) {
                tmpI = i7;
                a7 = a7 - (a9 * tmpI);
                b7 = b7 - (b9 * tmpI);
                c7 = c7 - (c9 * tmpI);
                d7 = d7 - (d9 * tmpI);
                e7 = e7 - (e9 * tmpI);
                f7 = f7 - (f9 * tmpI);
                g7 = g7 - (g9 * tmpI);
                h7 = h7 - (h9 * tmpI);
                i7 = i7 - (i9 * tmpI);
                j7 = j7 - (j9 * tmpI);
                k7 = k7 - (k9 * tmpI);
            }

            if (i8 != 0.0) {
                tmpI = i8;
                a8 = a8 - (a9 * tmpI);
                b8 = b8 - (b9 * tmpI);
                c8 = c8 - (c9 * tmpI);
                d8 = d8 - (d9 * tmpI);
                e8 = e8 - (e9 * tmpI);
                f8 = f8 - (f9 * tmpI);
                g8 = g8 - (g9 * tmpI);
                h8 = h8 - (h9 * tmpI);
                i8 = i8 - (i9 * tmpI);
                j8 = j8 - (j9 * tmpI);
                k8 = k8 - (k9 * tmpI);
            }


            if (i10 != 0.0) {
                tmpI = i10;
                a10 = a10 - (a9 * tmpI);
                b10 = b10 - (b9 * tmpI);
                c10 = c10 - (c9 * tmpI);
                d10 = d10 - (d9 * tmpI);
                e10 = e10 - (e9 * tmpI);
                f10 = f10 - (f9 * tmpI);
                g10 = g10 - (g9 * tmpI);
                h10 = h10 - (h9 * tmpI);
                i10 = i10 - (i9 * tmpI);
                j10 = j10 - (j9 * tmpI);
                k10 = k10 - (k9 * tmpI);
            }
            //endregion
        }

        else if (j10 != 1.0) {
            tmpJ = j10;
            a10 = Math.abs(a10 / tmpJ);
            b10 = b10 / tmpJ;
            c10 = c10 / tmpJ;
            d10 = d10 / tmpJ;
            e10 = e10 / tmpJ;
            f10 = f10 / tmpJ;
            g10 = g10 / tmpJ;
            h10 = h10 / tmpJ;
            i10 = i10 / tmpJ;
            j10 = j10 / tmpJ;
            k10 = k10 / tmpJ;

            //region J Column
            if (j1 != 0.0) {
                tmpJ = j1;
                a1 = a1 - (a10 * tmpJ);
                b1 = b1 - (b10 * tmpJ);
                c1 = c1 - (c10 * tmpJ);
                d1 = d1 - (d10 * tmpJ);
                e1 = e1 - (e10 * tmpJ);
                f1 = f1 - (f10 * tmpJ);
                g1 = g1 - (g10 * tmpJ);
                h1 = h1 - (h10 * tmpJ);
                i1 = i1 - (i10 * tmpJ);
                j1 = j1 - (j10 * tmpJ);
                k1 = k1 - (k10 * tmpJ);
            }

            if (j2 != 0.0) {
                tmpJ = j2;
                a2 = a2 - (a10 * tmpJ);
                b2 = b2 - (b10 * tmpJ);
                c2 = c2 - (c10 * tmpJ);
                d2 = d2 - (d10 * tmpJ);
                e2 = e2 - (e10 * tmpJ);
                f2 = f2 - (f10 * tmpJ);
                g2 = g2 - (g10 * tmpJ);
                h2 = h2 - (h10 * tmpJ);
                i2 = i2 - (i10 * tmpJ);
                j2 = j2 - (j10 * tmpJ);
                k2 = k2 - (k10 * tmpJ);
            }

            if (j3 != 0.0) {
                tmpJ = j3;
                a3 = a3 - (a10 * tmpJ);
                b3 = b3 - (b10 * tmpJ);
                c3 = c3 - (c10 * tmpJ);
                d3 = d3 - (d10 * tmpJ);
                e3 = e3 - (e10 * tmpJ);
                f3 = f3 - (f10 * tmpJ);
                g3 = g3 - (g10 * tmpJ);
                h3 = h3 - (h10 * tmpJ);
                i3 = i3 - (i10 * tmpJ);
                j3 = j3 - (j10 * tmpJ);
                k3 = k3 - (k10 * tmpJ);
            }

            if (j4 != 0.0) {
                tmpJ = j4;
                a4 = a4 - (a10 * tmpJ);
                b4 = b4 - (b10 * tmpJ);
                c4 = c4 - (c10 * tmpJ);
                d4 = d4 - (d10 * tmpJ);
                e4 = e4 - (e10 * tmpJ);
                f4 = f4 - (f10 * tmpJ);
                g4 = g4 - (g10 * tmpJ);
                h4 = h4 - (h10 * tmpJ);
                i4 = i4 - (i10 * tmpJ);
                j4 = j4 - (j10 * tmpJ);
                k4 = k4 - (k10 * tmpJ);
            }

            if (j5 != 0.0) {
                tmpJ = j5;
                a5 = a5 - (a10 * tmpJ);
                b5 = b5 - (b10 * tmpJ);
                c5 = c5 - (c10 * tmpJ);
                d5 = d5 - (d10 * tmpJ);
                e5 = e5 - (e10 * tmpJ);
                f5 = f5 - (f10 * tmpJ);
                g5 = g5 - (g10 * tmpJ);
                h5 = h5 - (h10 * tmpJ);
                i5 = i5 - (i10 * tmpJ);
                j5 = j5 - (j10 * tmpJ);
                k5 = k5 - (k10 * tmpJ);
            }

            if (j6 != 0.0) {
                tmpJ = j6;
                a6 = a6 - (a10 * tmpJ);
                b6 = b6 - (b10 * tmpJ);
                c6 = c6 - (c10 * tmpJ);
                d6 = d6 - (d10 * tmpJ);
                e6 = e6 - (e10 * tmpJ);
                f6 = f6 - (f10 * tmpJ);
                g6 = g6 - (g10 * tmpJ);
                h6 = h6 - (h10 * tmpJ);
                i6 = i6 - (i10 * tmpJ);
                j6 = j6 - (j10 * tmpJ);
                k6 = k6 - (k10 * tmpJ);
            }

            if (j7 != 0.0) {
                tmpJ = j7;
                a7 = a7 - (a10 * tmpJ);
                b7 = b7 - (b10 * tmpJ);
                c7 = c7 - (c10 * tmpJ);
                d7 = d7 - (d10 * tmpJ);
                e7 = e7 - (e10 * tmpJ);
                f7 = f7 - (f10 * tmpJ);
                g7 = g7 - (g10 * tmpJ);
                h7 = h7 - (h10 * tmpJ);
                i7 = i7 - (i10 * tmpJ);
                j7 = j7 - (j10 * tmpJ);
                k7 = k7 - (k10 * tmpJ);
            }

            if (j8 != 0.0) {
                tmpJ = j8;
                a8 = a8 - (a10 * tmpJ);
                b8 = b8 - (b10 * tmpJ);
                c8 = c8 - (c10 * tmpJ);
                d8 = d8 - (d10 * tmpJ);
                e8 = e8 - (e10 * tmpJ);
                f8 = f8 - (f10 * tmpJ);
                g8 = g8 - (g10 * tmpJ);
                h8 = h8 - (h10 * tmpJ);
                i8 = i8 - (i10 * tmpJ);
                j8 = j8 - (j10 * tmpJ);
                k8 = k8 - (k10 * tmpJ);
            }

            if (j9 != 0.0) {
                tmpJ = j9;
                a9 = a9 - (a10 * tmpJ);
                b9 = b9 - (b10 * tmpJ);
                c9 = c9 - (c10 * tmpJ);
                d9 = d9 - (d10 * tmpJ);
                e9 = e9 - (e10 * tmpJ);
                f9 = f9 - (f10 * tmpJ);
                g9 = g9 - (g10 * tmpJ);
                h9 = h9 - (h10 * tmpJ);
                i9 = i9 - (i10 * tmpJ);
                j9 = j9 - (j10 * tmpJ);
                k9 = k9 - (k10 * tmpJ);
            }

            if (e10 != 0.0) {
                tmpJ = j10;
                a10 = a10 - (a10 * tmpJ);
                b10 = b10 - (b10 * tmpJ);
                c10 = c10 - (c10 * tmpJ);
                d10 = d10 - (d10 * tmpJ);
                e10 = e10 - (e10 * tmpJ);
                f10 = f10 - (f10 * tmpJ);
                g10 = g10 - (g10 * tmpJ);
                h10 = h10 - (h10 * tmpJ);
                i10 = i10 - (i10 * tmpJ);
                j10 = j10 - (j10 * tmpJ);
                k10 = k10 - (k10 * tmpJ);
            }
            //endregion

        }

        a1 = math.rounding(a1, roundDigit);
        a2 = math.rounding(a2, roundDigit);
        a3 = math.rounding(a3, roundDigit);
        a4 = math.rounding(a4, roundDigit);
        a5 = math.rounding(a5, roundDigit);
        a6 = math.rounding(a6, roundDigit);
        a7 = math.rounding(a7, roundDigit);
        a8 = math.rounding(a8, roundDigit);
        a9 = math.rounding(a9, roundDigit);
        a10 = math.rounding(a10, roundDigit);


        b1 = math.rounding(b1, roundDigit);
        b2 = math.rounding(b2, roundDigit);
        b3 = math.rounding(b3, roundDigit);
        b4 = math.rounding(b4, roundDigit);
        b5 = math.rounding(b5, roundDigit);
        b6 = math.rounding(b6, roundDigit);
        b7 = math.rounding(b7, roundDigit);
        b8 = math.rounding(b8, roundDigit);
        b9 = math.rounding(b9, roundDigit);
        b10 = math.rounding(b10, roundDigit);

        c1 = math.rounding(c1, roundDigit);
        c2 = math.rounding(c2, roundDigit);
        c3 = math.rounding(c3, roundDigit);
        c4 = math.rounding(c4, roundDigit);
        c5 = math.rounding(c5, roundDigit);
        c6 = math.rounding(c6, roundDigit);
        c7 = math.rounding(c7, roundDigit);
        c8 = math.rounding(c8, roundDigit);
        c9 = math.rounding(c9, roundDigit);
        c10 = math.rounding(c10, roundDigit);

        d1 = math.rounding(d1, roundDigit);
        d2 = math.rounding(d2, roundDigit);
        d3 = math.rounding(d3, roundDigit);
        d4 = math.rounding(d4, roundDigit);
        d5 = math.rounding(d5, roundDigit);
        d6 = math.rounding(d6, roundDigit);
        d7 = math.rounding(d7, roundDigit);
        d8 = math.rounding(d8, roundDigit);
        d9 = math.rounding(d9, roundDigit);
        d10 = math.rounding(d10, roundDigit);

        e1 = math.rounding(e1, roundDigit);
        e2 = math.rounding(e2, roundDigit);
        e3 = math.rounding(e3, roundDigit);
        e4 = math.rounding(e4, roundDigit);
        e5 = math.rounding(e5, roundDigit);
        e6 = math.rounding(e6, roundDigit);
        e7 = math.rounding(e7, roundDigit);
        e8 = math.rounding(e8, roundDigit);
        e9 = math.rounding(e9, roundDigit);
        e10 = math.rounding(e10, roundDigit);

        f1 = math.rounding(f1, roundDigit);
        f2 = math.rounding(f2, roundDigit);
        f3 = math.rounding(f3, roundDigit);
        f4 = math.rounding(f4, roundDigit);
        f5 = math.rounding(f5, roundDigit);
        f6 = math.rounding(f6, roundDigit);
        f7 = math.rounding(f7, roundDigit);
        f8 = math.rounding(f8, roundDigit);
        f9 = math.rounding(f9, roundDigit);
        f10 = math.rounding(f10, roundDigit);

        g1 = math.rounding(g1, roundDigit);
        g2 = math.rounding(g2, roundDigit);
        g3 = math.rounding(g3, roundDigit);
        g4 = math.rounding(g4, roundDigit);
        g5 = math.rounding(g5, roundDigit);
        g6 = math.rounding(g6, roundDigit);
        g7 = math.rounding(g7, roundDigit);
        g8 = math.rounding(g8, roundDigit);
        g9 = math.rounding(g9, roundDigit);
        g10 = math.rounding(g10, roundDigit);

        h1 = math.rounding(h1, roundDigit);
        h2 = math.rounding(h2, roundDigit);
        h3 = math.rounding(h3, roundDigit);
        h4 = math.rounding(h4, roundDigit);
        h5 = math.rounding(h5, roundDigit);
        h6 = math.rounding(h6, roundDigit);
        h7 = math.rounding(h7, roundDigit);
        h8 = math.rounding(h8, roundDigit);
        h9 = math.rounding(h9, roundDigit);
        h10 = math.rounding(h10, roundDigit);

        i1 = math.rounding(i1, roundDigit);
        i2 = math.rounding(i2, roundDigit);
        i3 = math.rounding(i3, roundDigit);
        i4 = math.rounding(i4, roundDigit);
        i5 = math.rounding(i5, roundDigit);
        i6 = math.rounding(i6, roundDigit);
        i7 = math.rounding(i7, roundDigit);
        i8 = math.rounding(i8, roundDigit);
        i9 = math.rounding(i9, roundDigit);
        i10 = math.rounding(i10, roundDigit);

        j1 = math.rounding(j1, roundDigit);
        j2 = math.rounding(j2, roundDigit);
        j3 = math.rounding(j3, roundDigit);
        j4 = math.rounding(j4, roundDigit);
        j5 = math.rounding(j5, roundDigit);
        j6 = math.rounding(j6, roundDigit);
        j7 = math.rounding(j7, roundDigit);
        j8 = math.rounding(j8, roundDigit);
        j9 = math.rounding(j9, roundDigit);
        j10 = math.rounding(j10, roundDigit);

        k1 = math.rounding(k1, roundDigit);
        k2 = math.rounding(k2, roundDigit);
        k3 = math.rounding(k3, roundDigit);
        k4 = math.rounding(k4, roundDigit);
        k5 = math.rounding(k5, roundDigit);
        k6 = math.rounding(k6, roundDigit);
        k7 = math.rounding(k7, roundDigit);
        k8 = math.rounding(k8, roundDigit);
        k9 = math.rounding(k9, roundDigit);
        k10 = math.rounding(k10, roundDigit);

       /* if (d1.toString().length() > 3 || d2.toString().length() > 3 || d3.toString().length() > 3 || d4.toString().length() > 3) {
            d1 = math.rounding(d1, roundDigit);
            d2 = math.rounding(d2, roundDigit);
            d3 = math.rounding(d3, roundDigit);
            d4 = math.rounding(d4, roundDigit);
        }

        if (e1.toString().length() > 3 || e2.toString().length() > 3 || e3.toString().length() > 3 || e4.toString().length() > 3) {
            e1 = math.rounding(e1, roundDigit);
            e2 = math.rounding(e2, roundDigit);
            e3 = math.rounding(e3, roundDigit);
            e4 = math.rounding(e4, roundDigit);
        }*/

        inputA1.setText(String.valueOf(a1));
        inputA2.setText(String.valueOf(a2));
        inputA3.setText(String.valueOf(a3));
        inputA4.setText(String.valueOf(a4));
        inputA5.setText(String.valueOf(a5));
        inputA6.setText(String.valueOf(a6));
        inputA7.setText(String.valueOf(a7));
        inputA8.setText(String.valueOf(a8));
        inputA9.setText(String.valueOf(a9));
        inputA10.setText(String.valueOf(a10));

        inputB1.setText(String.valueOf(b1));
        inputB2.setText(String.valueOf(b2));
        inputB3.setText(String.valueOf(b3));
        inputB4.setText(String.valueOf(b4));
        inputB5.setText(String.valueOf(b5));
        inputB6.setText(String.valueOf(b6));
        inputB7.setText(String.valueOf(b7));
        inputB8.setText(String.valueOf(b8));
        inputB9.setText(String.valueOf(b9));
        inputB10.setText(String.valueOf(b10));

        inputC1.setText(String.valueOf(c1));
        inputC2.setText(String.valueOf(c2));
        inputC3.setText(String.valueOf(c3));
        inputC4.setText(String.valueOf(c4));
        inputC5.setText(String.valueOf(c5));
        inputC6.setText(String.valueOf(c6));
        inputC7.setText(String.valueOf(c7));
        inputC8.setText(String.valueOf(c8));
        inputC9.setText(String.valueOf(c9));
        inputC10.setText(String.valueOf(c10));

        inputD1.setText(String.valueOf(d1));
        inputD2.setText(String.valueOf(d2));
        inputD3.setText(String.valueOf(d3));
        inputD4.setText(String.valueOf(d4));
        inputD5.setText(String.valueOf(d5));
        inputD6.setText(String.valueOf(d6));
        inputD7.setText(String.valueOf(d7));
        inputD8.setText(String.valueOf(d8));
        inputD9.setText(String.valueOf(d9));
        inputD10.setText(String.valueOf(d10));

        inputE1.setText(String.valueOf(e1));
        inputE2.setText(String.valueOf(e2));
        inputE3.setText(String.valueOf(e3));
        inputE4.setText(String.valueOf(e4));
        inputE5.setText(String.valueOf(e5));
        inputE6.setText(String.valueOf(e6));
        inputE7.setText(String.valueOf(e7));
        inputE8.setText(String.valueOf(e8));
        inputE9.setText(String.valueOf(e9));
        inputE10.setText(String.valueOf(e10));

        inputF1.setText(String.valueOf(f1));
        inputF2.setText(String.valueOf(f2));
        inputF3.setText(String.valueOf(f3));
        inputF4.setText(String.valueOf(f4));
        inputF5.setText(String.valueOf(f5));
        inputF6.setText(String.valueOf(f6));
        inputF7.setText(String.valueOf(f7));
        inputF8.setText(String.valueOf(f8));
        inputF9.setText(String.valueOf(f9));
        inputF10.setText(String.valueOf(f10));

        inputG1.setText(String.valueOf(g1));
        inputG2.setText(String.valueOf(g2));
        inputG3.setText(String.valueOf(g3));
        inputG4.setText(String.valueOf(g4));
        inputG5.setText(String.valueOf(g5));
        inputG6.setText(String.valueOf(g6));
        inputG7.setText(String.valueOf(g7));
        inputG8.setText(String.valueOf(g8));
        inputG9.setText(String.valueOf(g9));
        inputG10.setText(String.valueOf(g10));

        inputH1.setText(String.valueOf(h1));
        inputH2.setText(String.valueOf(h2));
        inputH3.setText(String.valueOf(h3));
        inputH4.setText(String.valueOf(h4));
        inputH5.setText(String.valueOf(h5));
        inputH6.setText(String.valueOf(h6));
        inputH7.setText(String.valueOf(h7));
        inputH8.setText(String.valueOf(h8));
        inputH9.setText(String.valueOf(h9));
        inputH10.setText(String.valueOf(h10));

        inputI1.setText(String.valueOf(i1));
        inputI2.setText(String.valueOf(i2));
        inputI3.setText(String.valueOf(i3));
        inputI4.setText(String.valueOf(i4));
        inputI5.setText(String.valueOf(i5));
        inputI6.setText(String.valueOf(i6));
        inputI7.setText(String.valueOf(i7));
        inputI8.setText(String.valueOf(i8));
        inputI9.setText(String.valueOf(i9));
        inputI10.setText(String.valueOf(i10));

        inputJ1.setText(String.valueOf(j1));
        inputJ2.setText(String.valueOf(j2));
        inputJ3.setText(String.valueOf(j3));
        inputJ4.setText(String.valueOf(j4));
        inputJ5.setText(String.valueOf(j5));
        inputJ6.setText(String.valueOf(j6));
        inputJ7.setText(String.valueOf(j7));
        inputJ8.setText(String.valueOf(j8));
        inputJ9.setText(String.valueOf(j9));
        inputJ10.setText(String.valueOf(j10));

        inputK1.setText(String.valueOf(k1));
        inputK2.setText(String.valueOf(k2));
        inputK3.setText(String.valueOf(k3));
        inputK4.setText(String.valueOf(k4));
        inputK5.setText(String.valueOf(k5));
        inputK6.setText(String.valueOf(k6));
        inputK7.setText(String.valueOf(k7));
        inputK8.setText(String.valueOf(k8));
        inputK9.setText(String.valueOf(k9));
        inputK10.setText(String.valueOf(k10));


    }
    //endregion

    //endregion


}
