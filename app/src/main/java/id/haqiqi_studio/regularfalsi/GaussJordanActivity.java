package id.haqiqi_studio.regularfalsi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class GaussJordanActivity extends AppCompatActivity {

    Matriks matriks = new Matriks();

    EditText inputA1, inputA2, inputB1, inputB2, inputC1, inputC2;

    TextView a1, a2, b1, b2, c1, c2;
    TextView a11, a22, b11, b22, c11, c22;
    TextView a111, a222, b111, b222, c111, c222;

    LinearLayout linearLayout1, container, viewGroup;
    Button resX, resY;


    String x1, x2,  y1, y2, flag = "Hide";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gauss_jordan);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        init();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (inputA1.getText().toString().matches("") || inputA2.getText().toString().matches("") ||
                        inputB1.getText().toString().matches("") || inputB2.getText().toString().matches("") ||
                        inputC1.getText().toString().matches("") || inputC2.getText().toString().matches("")) {
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
                            b1.setText(inputB1.getText());
                            b2.setText(inputB2.getText());
                            c1.setText(inputC1.getText());
                            c2.setText(inputC2.getText());
                            matriks.matriks2x3(a1, a2, b1, b2, c1, c2);
                        }
                        else if (i==1) {
                            a11.setText(a1.getText());
                            a22.setText(a2.getText());
                            b11.setText(b1.getText());
                            b22.setText(b2.getText());
                            c11.setText(c1.getText());
                            c22.setText(c2.getText());
                            matriks.matriks2x3(a11, a22, b11, b22, c11, c22);
                        }
                        else if (i==2) {
                            a111.setText(a11.getText());
                            a222.setText(a22.getText());
                            b111.setText(b11.getText());
                            b222.setText(b22.getText());
                            c111.setText(c11.getText());
                            c222.setText(c22.getText());
                            matriks.matriks2x3(a111, a222, b111, b222, c111, c222);
                        }
                    }

                }

            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_jordan, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_celledit) {
            // startActivity(new Intent(getApplicationContext(), ));
            if (flag == "Hide") {
                linearLayout1.setVisibility(View.INVISIBLE);
                flag = "Show";
            }
            else {
                linearLayout1.setVisibility(View.VISIBLE);
                flag = "Hide";
            }
        }
        else {
        }

        return true;
    }

    void init() {
        linearLayout1 = findViewById(R.id.header);
        container = findViewById(R.id.container);
        viewGroup = findViewById(R.id.viewGroup);

        inputA1 = findViewById(R.id.inputA1);
        inputA2 = findViewById(R.id.inputA2);
        inputB1 = findViewById(R.id.inputB1);
        inputB2 = findViewById(R.id.inputB2);
        inputC1 = findViewById(R.id.inputC1);
        inputC2 = findViewById(R.id.inputC2);


        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);

        a11 = findViewById(R.id.a11);
        a22 = findViewById(R.id.a22);
        b11 = findViewById(R.id.b11);
        b22 = findViewById(R.id.b22);
        c11 = findViewById(R.id.c11);
        c22 = findViewById(R.id.c22);

        a111 = findViewById(R.id.a111);
        a222 = findViewById(R.id.a222);
        b111 = findViewById(R.id.b111);
        b222 = findViewById(R.id.b222);
        c111 = findViewById(R.id.c111);
        c222 = findViewById(R.id.c222);

    }

}
