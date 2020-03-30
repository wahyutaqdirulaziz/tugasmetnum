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

public class Jordan3x4Activity extends AppCompatActivity {

    Matriks matriks = new Matriks();

    EditText inputA1, inputA2, inputA3, inputB1, inputB2, inputB3, inputC1, inputC2, inputC3, inputD1, inputD2, inputD3;

    TextView a1, a2, a3, b1, b2, b3, c1, c2, c3, d1, d2, d3;
    TextView a11, a22, a33, b11, b22, b33, c11, c22, c33, d11, d22, d33;
    TextView a111, a222, a333, b111, b222, b333, c111, c222, c333, d111, d222, d333;
    TextView a1111, a2222, a3333, b1111, b2222, b3333, c1111, c2222, c3333, d1111, d2222, d3333;

    LinearLayout linearLayout1, container;


    String x1, x2,  y1, y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jordan3x4);
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

                    x1 = a1.getText().toString();
                    y1 = b1.getText().toString();

                    x2 = a2.getText().toString();
                    y2 = b2.getText().toString();

                    for (int i=0; i<3; i++) {
                        if (i==0) {
                            a1.setText(inputA1.getText());
                            a2.setText(inputA2.getText());
                            a3.setText(inputA3.getText());
                            b1.setText(inputB1.getText());
                            b2.setText(inputB2.getText());
                            b3.setText(inputB3.getText());
                            c1.setText(inputC1.getText());
                            c2.setText(inputC2.getText());
                            c3.setText(inputC3.getText());
                            d1.setText(inputD1.getText());
                            d2.setText(inputD2.getText());
                            d3.setText(inputD3.getText());
                            matriks.matriks3x4(a1, a2, a3, b1, b2, b3, c1, c2, c3, d1, d2, d3);
                        }
                        else if (i==1) {
                            a11.setText(a1.getText());
                            a22.setText(a2.getText());
                            a33.setText(a3.getText());
                            b11.setText(b1.getText());
                            b22.setText(b2.getText());
                            b33.setText(b3.getText());
                            c11.setText(c1.getText());
                            c22.setText(c2.getText());
                            c33.setText(c3.getText());
                            d11.setText(d1.getText());
                            d22.setText(d2.getText());
                            d33.setText(d3.getText());
                            matriks.matriks3x4(a11, a22, a33, b11, b22, b33, c11, c22, c33, d11, d22, d33);
                        }
                        else if (i==2) {
                            a111.setText(a11.getText());
                            a222.setText(a22.getText());
                            a333.setText(a33.getText());
                            b111.setText(b11.getText());
                            b222.setText(b22.getText());
                            b333.setText(b33.getText());
                            c111.setText(c11.getText());
                            c222.setText(c22.getText());
                            c333.setText(c33.getText());
                            d111.setText(d11.getText());
                            d222.setText(d22.getText());
                            d333.setText(d33.getText());
                            matriks.matriks3x4(a111, a222, a333, b111, b222, b333, c111, c222, c333, d111, d222, d333);
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
        inputB1 = findViewById(R.id.inputB1);
        inputB2 = findViewById(R.id.inputB2);
        inputB3 = findViewById(R.id.inputB3);
        inputC1 = findViewById(R.id.inputC1);
        inputC2 = findViewById(R.id.inputC2);
        inputC3 = findViewById(R.id.inputC3);
        inputD1 = findViewById(R.id.inputD1);
        inputD2 = findViewById(R.id.inputD2);
        inputD3 = findViewById(R.id.inputD3);


        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        a3 = findViewById(R.id.a3);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);
        d3 = findViewById(R.id.d3);

        a11 = findViewById(R.id.a11);
        a22 = findViewById(R.id.a22);
        a33 = findViewById(R.id.a33);
        b11 = findViewById(R.id.b11);
        b22 = findViewById(R.id.b22);
        b33 = findViewById(R.id.b33);
        c11 = findViewById(R.id.c11);
        c22 = findViewById(R.id.c22);
        c33 = findViewById(R.id.c33);
        d11 = findViewById(R.id.d11);
        d22 = findViewById(R.id.d22);
        d33 = findViewById(R.id.d33);

        a111 = findViewById(R.id.a111);
        a222 = findViewById(R.id.a222);
        a333 = findViewById(R.id.a333);
        b111 = findViewById(R.id.b111);
        b222 = findViewById(R.id.b222);
        b333 = findViewById(R.id.b333);
        c111 = findViewById(R.id.c111);
        c222 = findViewById(R.id.c222);
        c333 = findViewById(R.id.c333);
        d111 = findViewById(R.id.d111);
        d222 = findViewById(R.id.d222);
        d333 = findViewById(R.id.d333);

    }

}
