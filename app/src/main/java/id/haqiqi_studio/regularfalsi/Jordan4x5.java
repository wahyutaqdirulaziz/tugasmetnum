package id.haqiqi_studio.regularfalsi;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Jordan4x5 extends AppCompatActivity {

     Matriks matriks = new Matriks();

    android.widget.EditText inputA1, inputA2, inputA3, inputA4,
    inputB1, inputB2, inputB3, inputB4,
    inputC1, inputC2, inputC3, inputC4,
    inputD1, inputD2, inputD3, inputD4,
    inputE1, inputE2, inputE3, inputE4;

    TextView a1, a2, a3, a4, b1, b2, b3, b4, c1, c2, c3,c4,  d1, d2, d3, d4, e1, e2, e3, e4;
    TextView a11, a22, a33, a44, b11, b22, b33, b44, c11, c22, c33, c44, d11, d22, d33, d44, e11, e22, e33, e44;
    TextView a111, a222, a333, a444, b111, b222, b333, b444, c111, c222, c333, c444, d111, d222, d333, d444,
    e111, e222, e333, e444;

    TextView a1111, a2222, a3333, a4444, b1111, b2222, b3333, b4444, c1111, c2222, c3333, c4444,
    d1111, d2222, d3333, d4444, e1111, e2222, e3333, e4444;

    LinearLayout linearLayout1, container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jordan4x5);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        init();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (inputA1.getText().toString().matches("") || inputA2.getText().toString().matches("") || inputA3.getText().toString().matches("") ||
                        inputB1.getText().toString().matches("") || inputB2.getText().toString().matches("") || inputB3.getText().toString().matches("") ||
                        inputC1.getText().toString().matches("") || inputC2.getText().toString().matches("") || inputC3.getText().toString().matches("") ||
                        inputD1.getText().toString().matches("") || inputD2.getText().toString().matches("") || inputD3.getText().toString().matches(""))
                          {
                    Toast.makeText(getApplicationContext(), "Jangan ada yang kosong!", Toast.LENGTH_SHORT).show();
                }
                else {
                    container.setVisibility(View.VISIBLE);


                    for (int i=0; i<4; i++) {
                        if (i==0) {
                            a1.setText(inputA1.getText());
                            a2.setText(inputA2.getText());
                            a3.setText(inputA3.getText());
                            a4.setText(inputA4.getText());
                            b1.setText(inputB1.getText());
                            b2.setText(inputB2.getText());
                            b3.setText(inputB3.getText());
                            b4.setText(inputB4.getText());
                            c1.setText(inputC1.getText());
                            c2.setText(inputC2.getText());
                            c3.setText(inputC3.getText());
                            c4.setText(inputC4.getText());
                            d1.setText(inputD1.getText());
                            d2.setText(inputD2.getText());
                            d3.setText(inputD3.getText());
                            d4.setText(inputD4.getText());
                            e1.setText(inputE1.getText());
                            e2.setText(inputE2.getText());
                            e3.setText(inputE3.getText());
                            e4.setText(inputE4.getText());
                            matriks.matriks4x5(a1, a2, a3, a4, b1, b2, b3, b4, c1, c2, c3, c4, d1, d2, d3, d4, e1, e2, e3, e4);
                        }
                        else if (i==1) {
                            a11.setText(a1.getText());
                            a22.setText(a2.getText());
                            a33.setText(a3.getText());
                            a44.setText(a4.getText());
                            b11.setText(b1.getText());
                            b22.setText(b2.getText());
                            b33.setText(b3.getText());
                            b44.setText(b4.getText());
                            c11.setText(c1.getText());
                            c22.setText(c2.getText());
                            c33.setText(c3.getText());
                            c44.setText(c4.getText());
                            d11.setText(d1.getText());
                            d22.setText(d2.getText());
                            d33.setText(d3.getText());
                            d44.setText(d4.getText());
                            e11.setText(e1.getText());
                            e22.setText(e2.getText());
                            e33.setText(e3.getText());
                            e44.setText(e4.getText());
                            matriks.matriks4x5(a11, a22, a33, a44, b11, b22, b33, b44, c11, c22, c33, c44,
                             d11, d22, d33, d44, e11, e22, e33, e44);
                        }
                        else if (i==2) {
                            a111.setText(a11.getText());
                            a222.setText(a22.getText());
                            a333.setText(a33.getText());
                            a444.setText(a44.getText());
                            b111.setText(b11.getText());
                            b222.setText(b22.getText());
                            b333.setText(b33.getText());
                            b444.setText(b44.getText());
                            c111.setText(c11.getText());
                            c222.setText(c22.getText());
                            c333.setText(c33.getText());
                            c444.setText(c44.getText());
                            d111.setText(d11.getText());
                            d222.setText(d22.getText());
                            d333.setText(d33.getText());
                            d444.setText(d44.getText());
                            e111.setText(e11.getText());
                            e222.setText(e22.getText());
                            e333.setText(e33.getText());
                            e444.setText(e44.getText());
                            matriks.matriks4x5(a111, a222, a333, a444, b111, b222, b333, b444, c111, c222, c333, c444,
                            d111, d222, d333, d444, e111, e222, e333, e444);
                        } else if (i==2) {
                            a111.setText(a11.getText());
                            a222.setText(a22.getText());
                            a333.setText(a33.getText());
                            a444.setText(a44.getText());
                            b111.setText(b11.getText());
                            b222.setText(b22.getText());
                            b333.setText(b33.getText());
                            b444.setText(b44.getText());
                            c111.setText(c11.getText());
                            c222.setText(c22.getText());
                            c333.setText(c33.getText());
                            c444.setText(c44.getText());
                            d111.setText(d11.getText());
                            d222.setText(d22.getText());
                            d333.setText(d33.getText());
                            d444.setText(d44.getText());
                            e111.setText(e11.getText());
                            e222.setText(e22.getText());
                            e333.setText(e33.getText());
                            e444.setText(e44.getText());
                            matriks.matriks4x5(a111, a222, a333, a444, b111, b222, b333, b444, c111, c222, c333, c444,
                            d111, d222, d333, d444, e111, e222, e333, e444);
                        }
                         else if (i==3) {
                            a1111.setText(a111.getText());
                            a2222.setText(a222.getText());
                            a3333.setText(a333.getText());
                            a4444.setText(a444.getText());
                            b1111.setText(b111.getText());
                            b2222.setText(b222.getText());
                            b3333.setText(b333.getText());
                            b4444.setText(b444.getText());
                            c1111.setText(c111.getText());
                            c2222.setText(c222.getText());
                            c3333.setText(c333.getText());
                            c4444.setText(c444.getText());
                            d1111.setText(d111.getText());
                            d2222.setText(d222.getText());
                            d3333.setText(d333.getText());
                            d4444.setText(d444.getText());
                            e1111.setText(e111.getText());
                            e2222.setText(e222.getText());
                            e3333.setText(e333.getText());
                            e4444.setText(e444.getText());
                            matriks.matriks4x5(a1111, a2222, a3333, a4444, b1111, b2222, b3333, b4444, c1111, c2222, c3333, c4444,
                            d1111, d2222, d3333, d4444, e1111, e2222, e3333, e4444);
                        }
                    }

                }

            }

        });
    }

    void init() {
        linearLayout1 = findViewById(R.id.linear1);
        container = findViewById(R.id.container);

        inputA1 = findViewById(R.id.inputA1);
        inputA2 = findViewById(R.id.inputA2);
        inputA3 = findViewById(R.id.inputA3);
        inputA4 = findViewById(R.id.inputA4);
        inputB1 = findViewById(R.id.inputB1);
        inputB2 = findViewById(R.id.inputB2);
        inputB3 = findViewById(R.id.inputB3);
        inputB4 = findViewById(R.id.inputB4);
        inputC1 = findViewById(R.id.inputC1);
        inputC2 = findViewById(R.id.inputC2);
        inputC3 = findViewById(R.id.inputC3);
        inputC4 = findViewById(R.id.inputC4);
        inputD1 = findViewById(R.id.inputD1);
        inputD2 = findViewById(R.id.inputD2);
        inputD3 = findViewById(R.id.inputD3);
        inputD4 = findViewById(R.id.inputD4);
        inputE1 = findViewById(R.id.inputE1);
        inputE2 = findViewById(R.id.inputE2);
        inputE3 = findViewById(R.id.inputE3);
        inputE4 = findViewById(R.id.inputE4);


        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        a3 = findViewById(R.id.a3);
        a4 = findViewById(R.id.a4);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);
        d3 = findViewById(R.id.d3);
        d4 = findViewById(R.id.d4);
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        e3 = findViewById(R.id.e3);
        e4 = findViewById(R.id.e4);

        a11 = findViewById(R.id.a11);
        a22 = findViewById(R.id.a22);
        a33 = findViewById(R.id.a33);
        a44 = findViewById(R.id.a44);
        b11 = findViewById(R.id.b11);
        b22 = findViewById(R.id.b22);
        b33 = findViewById(R.id.b33);
        b44 = findViewById(R.id.b44);
        c11 = findViewById(R.id.c11);
        c22 = findViewById(R.id.c22);
        c33 = findViewById(R.id.c33);
        c44 = findViewById(R.id.c44);
        d11 = findViewById(R.id.d11);
        d22 = findViewById(R.id.d22);
        d33 = findViewById(R.id.d33);
        d44 = findViewById(R.id.d44);
        e11 = findViewById(R.id.e11);
        e22 = findViewById(R.id.e22);
        e33 = findViewById(R.id.e33);
        e44 = findViewById(R.id.e44);

        a111 = findViewById(R.id.a111);
        a222 = findViewById(R.id.a222);
        a333 = findViewById(R.id.a333);
        a444 = findViewById(R.id.a444);
        b111 = findViewById(R.id.b111);
        b222 = findViewById(R.id.b222);
        b333 = findViewById(R.id.b333);
        b444 = findViewById(R.id.b444);
        c111 = findViewById(R.id.c111);
        c222 = findViewById(R.id.c222);
        c333 = findViewById(R.id.c333);
        c444 = findViewById(R.id.c444);
        d111 = findViewById(R.id.d111);
        d222 = findViewById(R.id.d222);
        d333 = findViewById(R.id.d333);
        d444 = findViewById(R.id.d444);
        e111 = findViewById(R.id.e111);
        e222 = findViewById(R.id.e222);
        e333 = findViewById(R.id.e333);
        e444 = findViewById(R.id.e444);

        a1111 = findViewById(R.id.a1111);
        a2222 = findViewById(R.id.a2222);
        a3333 = findViewById(R.id.a3333);
        a4444 = findViewById(R.id.a4444);
        b1111 = findViewById(R.id.b1111);
        b2222 = findViewById(R.id.b2222);
        b3333 = findViewById(R.id.b3333);
        b4444 = findViewById(R.id.b4444);
        c1111 = findViewById(R.id.c1111);
        c2222 = findViewById(R.id.c2222);
        c3333 = findViewById(R.id.c3333);
        c4444 = findViewById(R.id.c4444);
        d1111 = findViewById(R.id.d1111);
        d2222 = findViewById(R.id.d2222);
        d3333 = findViewById(R.id.d3333);
        d4444 = findViewById(R.id.d4444);
        e1111 = findViewById(R.id.e1111);
        e2222 = findViewById(R.id.e2222);
        e3333 = findViewById(R.id.e3333);
        e4444 = findViewById(R.id.e4444);

    }

}
