package id.haqiqi_studio.regularfalsi;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.util.Rfc822Token;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Jordan6x7 extends AppCompatActivity {

    Matriks matriks = new Matriks();

    EditText inputA1, inputA2, inputA3, inputA4, inputA5, inputA6, inputA7, inputA8, inputA9, inputA10,
            inputB1, inputB2, inputB3, inputB4, inputB5, inputB6, inputB7, inputB8, inputB9, inputB10,
            inputC1, inputC2, inputC3, inputC4, inputC5, inputC6, inputC7, inputC8, inputC9, inputC10,
            inputD1, inputD2, inputD3, inputD4, inputD5, inputD6, inputD7, inputD8, inputD9, inputD10,
            inputE1, inputE2, inputE3, inputE4, inputE5, inputE6, inputE7, inputE8, inputE9, inputE10,
            inputF1, inputF2, inputF3, inputF4, inputF5, inputF6, inputF7, inputF8, inputF9, inputF10,
            inputG1, inputG2, inputG3, inputG4, inputG5, inputG6, inputG7, inputG8, inputG9, inputG10,
            inputH1, inputH2, inputH3, inputH4, inputH5, inputH6, inputH7, inputH8, inputH9, inputH10,
            inputI1, inputI2, inputI3, inputI4, inputI5, inputI6, inputI7, inputI8, inputI9, inputI10,
            inputJ1, inputJ2, inputJ3, inputJ4, inputJ5, inputJ6, inputJ7, inputJ8, inputJ9, inputJ10,
            inputK1, inputK2, inputK3, inputK4, inputK5, inputK6, inputK7, inputK8, inputK9, inputK10;

    TextView a1, a2, a3, a4, a5, a6, a7, a8, a9, a10,
            b1, b2, b3, b4, b5, b6, b7, b8, b9, b10,
            c1, c2, c3,c4, c5, c6, c7, c8, c9, c10,
            d1, d2, d3, d4, d5, d6, d7, d8, d9, d10,
            e1, e2, e3, e4, e5, e6, e7, e8, e9, e10,
            f1, f2, f3, f4, f5, f6, f7, f8, f9, f10,
            g1, g2, g3, g4, g5, g6, g7, g8, g9, g10,
            h1, h2, h3, h4, h5, h6, h7, h8, h9, h10,
            i1, i2, i3, i4, i5, i6, i7, i8, i9, i10,
            j1, j2, j3, j4, j5, j6, j7, j8, j9, j10,
            k1, k2, k3, k4, k5, k6, k7, k8, k9, k10;

    TextView a11, a22, a33, a44, b11, b22, b33, b44, c11, c22, c33, c44, d11, d22, d33, d44, e11, e22, e33, e44;
    TextView a111, a222, a333, a444, b111, b222, b333, b444, c111, c222, c333, c444, d111, d222, d333, d444,
            e111, e222, e333, e444;

    TextView a1111, a2222, a3333, a4444, b1111, b2222, b3333, b4444, c1111, c2222, c3333, c4444,
            d1111, d2222, d3333, d4444, e1111, e2222, e3333, e4444;

    LinearLayout linearLayout1, container, isi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jordan6x7);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        init();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                execute();
            }
        });
    }

    void init() {
        linearLayout1 = findViewById(R.id.linear1);
        container = findViewById(R.id.container);
        isi = findViewById(R.id.isi);

        inputA1 = findViewById(R.id.inputA1);
        inputA2 = findViewById(R.id.inputA2);
        inputA3 = findViewById(R.id.inputA3);
        inputA4 = findViewById(R.id.inputA4);
        inputA5 = findViewById(R.id.inputA5);
        inputA6 = findViewById(R.id.inputA6);

        inputB1 = findViewById(R.id.inputB1);
        inputB2 = findViewById(R.id.inputB2);
        inputB3 = findViewById(R.id.inputB3);
        inputB4 = findViewById(R.id.inputB4);
        inputB5 = findViewById(R.id.inputB5);
        inputB6 = findViewById(R.id.inputB6);

        inputC1 = findViewById(R.id.inputC1);
        inputC2 = findViewById(R.id.inputC2);
        inputC3 = findViewById(R.id.inputC3);
        inputC4 = findViewById(R.id.inputC4);
        inputC5 = findViewById(R.id.inputC5);
        inputC6 = findViewById(R.id.inputC6);

        inputD1 = findViewById(R.id.inputD1);
        inputD2 = findViewById(R.id.inputD2);
        inputD3 = findViewById(R.id.inputD3);
        inputD4 = findViewById(R.id.inputD4);
        inputD5 = findViewById(R.id.inputD5);
        inputD6 = findViewById(R.id.inputD6);

        inputE1 = findViewById(R.id.inputE1);
        inputE2 = findViewById(R.id.inputE2);
        inputE3 = findViewById(R.id.inputE3);
        inputE4 = findViewById(R.id.inputE4);
        inputE5 = findViewById(R.id.inputE5);
        inputE6 = findViewById(R.id.inputE6);

        inputF1 = findViewById(R.id.inputF1);
        inputF2 = findViewById(R.id.inputF2);
        inputF3 = findViewById(R.id.inputF3);
        inputF4 = findViewById(R.id.inputF4);
        inputF5 = findViewById(R.id.inputF5);
        inputF6 = findViewById(R.id.inputF6);

        inputG1 = findViewById(R.id.inputG1);
        inputG2 = findViewById(R.id.inputG2);
        inputG3 = findViewById(R.id.inputG3);
        inputG4 = findViewById(R.id.inputG4);
        inputG5 = findViewById(R.id.inputG5);
        inputG6 = findViewById(R.id.inputG6);


        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        a3 = findViewById(R.id.a3);
        a4 = findViewById(R.id.a4);
        a5 = findViewById(R.id.a5);
        a6 = findViewById(R.id.a6);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);


        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);
        c6 = findViewById(R.id.c6);


        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);
        d3 = findViewById(R.id.d3);
        d4 = findViewById(R.id.d4);
        d5 = findViewById(R.id.d5);
        d6 = findViewById(R.id.d6);


        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        e3 = findViewById(R.id.e3);
        e4 = findViewById(R.id.e4);
        e5 = findViewById(R.id.e5);
        e6 = findViewById(R.id.e6);


        f1 = findViewById(R.id.f1);
        f2 = findViewById(R.id.f2);
        f3 = findViewById(R.id.f3);
        f4 = findViewById(R.id.f4);
        f5 = findViewById(R.id.f5);
        f6 = findViewById(R.id.f6);

        g1 = findViewById(R.id.g1);
        g2 = findViewById(R.id.g2);
        g3 = findViewById(R.id.g3);
        g4 = findViewById(R.id.g4);
        g5 = findViewById(R.id.g5);
        g6 = findViewById(R.id.g6);


    }

    void execute() {
        if (inputA1.getText().toString().matches("") || inputA2.getText().toString().matches("") || inputA3.getText().toString().matches("") ||
                inputB1.getText().toString().matches("") || inputB2.getText().toString().matches("") || inputB3.getText().toString().matches("") ||
                inputC1.getText().toString().matches("") || inputC2.getText().toString().matches("") || inputC3.getText().toString().matches("") ||
                inputD1.getText().toString().matches("") || inputD2.getText().toString().matches("") || inputD3.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Jangan ada yang kosong!", Toast.LENGTH_SHORT).show();
        } else {
            isi.setVisibility(View.VISIBLE);


            for (int i = 0; i < 6; i++) {

                if (i == 0) {
                    a1.setText(inputA1.getText());
                    a2.setText(inputA2.getText());
                    a3.setText(inputA3.getText());
                    a4.setText(inputA4.getText());
                    a5.setText(inputA5.getText());
                    a6.setText(inputA6.getText());

                    b1.setText(inputB1.getText());
                    b2.setText(inputB2.getText());
                    b3.setText(inputB3.getText());
                    b4.setText(inputB4.getText());
                    b5.setText(inputB5.getText());
                    b6.setText(inputB6.getText());

                    c1.setText(inputC1.getText());
                    c2.setText(inputC2.getText());
                    c3.setText(inputC3.getText());
                    c4.setText(inputC4.getText());
                    c5.setText(inputC5.getText());
                    c6.setText(inputC6.getText());

                    d1.setText(inputD1.getText());
                    d2.setText(inputD2.getText());
                    d3.setText(inputD3.getText());
                    d4.setText(inputD4.getText());
                    d5.setText(inputD5.getText());
                    d6.setText(inputD6.getText());

                    e1.setText(inputE1.getText());
                    e2.setText(inputE2.getText());
                    e3.setText(inputE3.getText());
                    e4.setText(inputE4.getText());
                    e5.setText(inputE5.getText());
                    e6.setText(inputE6.getText());

                    f1.setText(inputF1.getText());
                    f2.setText(inputF2.getText());
                    f3.setText(inputF3.getText());
                    f4.setText(inputF4.getText());
                    f5.setText(inputF5.getText());
                    f6.setText(inputF6.getText());

                    g1.setText(inputG1.getText());
                    g2.setText(inputG2.getText());
                    g3.setText(inputG3.getText());
                    g4.setText(inputG4.getText());
                    g5.setText(inputG5.getText());
                    g6.setText(inputG6.getText());


                    matriks.matriks6x7(a1, a2, a3, a4, a5, a6,
                            b1, b2, b3, b4, b5, b6,
                            c1, c2, c3, c4, c5, c6,
                            d1, d2, d3, d4, d5, d6,
                            e1, e2, e3, e4, e5, e6,
                            f1, f2, f3, f4, f5, f6,
                            g1, g2, g3, g4, g5, g6);
                }
                else {
                    a1.setText(a1.getText());
                    a2.setText(a2.getText());
                    a3.setText(a3.getText());
                    a4.setText(a4.getText());
                    a5.setText(a5.getText());
                    a6.setText(a6.getText());

                    b1.setText(b1.getText());
                    b2.setText(b2.getText());
                    b3.setText(b3.getText());
                    b4.setText(b4.getText());
                    b5.setText(b5.getText());
                    b6.setText(b6.getText());

                    c1.setText(c1.getText());
                    c2.setText(c2.getText());
                    c3.setText(c3.getText());
                    c4.setText(c4.getText());
                    c5.setText(c5.getText());
                    c6.setText(c6.getText());

                    d1.setText(d1.getText());
                    d2.setText(d2.getText());
                    d3.setText(d3.getText());
                    d4.setText(d4.getText());
                    d5.setText(d5.getText());
                    d6.setText(d6.getText());

                    e1.setText(e1.getText());
                    e2.setText(e2.getText());
                    e3.setText(e3.getText());
                    e4.setText(e4.getText());
                    e5.setText(e5.getText());
                    e6.setText(e6.getText());

                    f1.setText(f1.getText());
                    f2.setText(f2.getText());
                    f3.setText(f3.getText());
                    f4.setText(f4.getText());
                    f5.setText(f5.getText());
                    f6.setText(f6.getText());

                    g1.setText(g1.getText());
                    g2.setText(g2.getText());
                    g3.setText(g3.getText());
                    g4.setText(g4.getText());
                    g5.setText(g5.getText());
                    g6.setText(g6.getText());



                    matriks.matriks6x7(a1, a2, a3, a4, a5, a6,
                            b1, b2, b3, b4, b5, b6,
                            c1, c2, c3, c4, c5, c6,
                            d1, d2, d3, d4, d5, d6,
                            e1, e2, e3, e4, e5, e6,
                            f1, f2, f3, f4, f5, f6,
                            g1, g2, g3, g4, g5, g6);
                }

            }
        }
    }

}
