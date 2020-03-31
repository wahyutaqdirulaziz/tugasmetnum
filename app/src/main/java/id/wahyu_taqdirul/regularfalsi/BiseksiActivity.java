package id.haqiqi_studio.regularfalsi;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import id.haqiqi_studio.regularfalsi.ListviewAdapter;
import id.haqiqi_studio.regularfalsi.R;

import java.util.ArrayList;
import java.util.Arrays;

import id.haqiqi_studio.regularfalsi.Biseksi;
import id.haqiqi_studio.regularfalsi.MathFunction;
import id.haqiqi_studio.regularfalsi.Model;

public class BiseksiActivity extends AppCompatActivity {
    private ArrayList<Model> list;
    Biseksi bs = new Biseksi();
    MathFunction math = new MathFunction();
    ListView lview;
    String function = "x^2-7x+1";
    EditText func, nilai1, nilai2, dec;
    TextView result;
    int round = 3;
    Double a = 0.0;
    Double b = 10.0;
    Double w, c;
    Double fa, fb, fc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biseksi);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("BISEKSI");
        setSupportActionBar(toolbar);



        func = findViewById(R.id.function);
        nilai1 = findViewById(R.id.nilai1);
        nilai2 = findViewById(R.id.nilai2);
        result = findViewById(R.id.result);
        dec = findViewById(R.id.dec);



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //double val = rf.fa("2x^2-6x+1", 2);
                //Toast.makeText(getApplicationContext(), String.valueOf(result), Toast.LENGTH_SHORT).show();
                if (func.getText().toString().matches("") ||
                        nilai1.getText().toString().matches("") ||
                        nilai2.getText().toString().matches("")) {

                    Snackbar.make(v, "Make sure all fields filled", Toast.LENGTH_SHORT).show();
                }
                else {
                /*   function = "2x^2+x-1";
                   Double hasil = math.initializeFunction(function,  3);
                   result.setText(String.valueOf(hasil));

                   Toast.makeText(getApplicationContext(), function.substring(4, 6), Toast.LENGTH_SHORT).show();
*/
                    try {
                        if (function.length() >= 10) {
                            Toast.makeText(getApplicationContext(), "Sorry :( App cant accept this function.", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            showData();
                        }
                    }
                    catch (Exception e) {
                        Snackbar.make(v, e.toString(), Snackbar.LENGTH_LONG).show();
                    }
                }
                //math.printFunction(getApplicationContext());
                //2(3)^2+(3)-1
                //18+2
                //20

                //2(3)^2+3(3)-1
                //36+9-1
                //44

            }
        });


    }

    void showData() {
        round = Integer.parseInt(dec.getText().toString());
        if (dec.getText().toString().matches("")) {
            round = 3;
        }

        function = func.getText().toString();
        a = Double.valueOf(nilai1.getText().toString());
        b = Double.valueOf(nilai2.getText().toString());
        list = new ArrayList<Model>();
        lview = (ListView) findViewById(R.id.listview);
        ListviewAdapter adapter = new ListviewAdapter(this, list);
        lview.setAdapter(adapter);

        populateList();

        adapter.notifyDataSetChanged();

        lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                String no = ((TextView) view.findViewById(R.id.txtNo)).getText().toString();
                String fa = ((TextView) view.findViewById(R.id.txtFA)).getText().toString();
                String fb = ((TextView) view.findViewById(R.id.txtFB)).getText().toString();
                String fc = ((TextView) view.findViewById(R.id.txtFC)).getText().toString();
                String erc = ((TextView) view.findViewById(R.id.txtERC)).getText().toString();

                Toast.makeText(getApplicationContext(),
                        "F(a) : " + fa + "\n"
                                + "F(b) : " + fb + "\n"
                                + "c : " + c + "\n"
                                + "F(c) : " + fc + "\n"
                                + "Erc : " + erc, Toast.LENGTH_LONG).show();
            }
        });
    }

    private void populateList() {
        round = Integer.parseInt(dec.getText().toString());
        if (dec.getText().toString().matches("")) {
            round = 3;
        }

        fa = math.initializeFunction(function, a);
        fb = math.initializeFunction(function, b);
        c = bs.getC(a, b);
        Double faRounded, fbRounded, fcRounded, cRounded, ercRounded;
        double erc = 0.0;
        double c1, c2;
        fc = math.initializeFunction(function, c);

      /*  Toast.makeText(getApplicationContext(), "A: " + math.getSignA(fa) + " ,B:" +
        math.getSignB(fb) + " ,C: " + math.getSignC(fc), Toast.LENGTH_SHORT).show();*/


      /*  Toast.makeText(getApplicationContext(), String.valueOf(fa) + " " +
                String.valueOf(fb) + " " +
                String.valueOf(w) + " " +
                String.valueOf(c), Toast.LENGTH_LONG).show();*/



        for (int i= 0; i<100; i++){
            faRounded = math.rounding(fa, round);
            fbRounded = math.rounding(fb, round);
            cRounded = math.rounding(c, round);
            fcRounded = math.rounding(fc, round);
            ercRounded = math.rounding(erc, 2);


            list.add(new Model(i, faRounded, fbRounded, cRounded, fcRounded, ercRounded));


            if (bs.compareSignAB(fa, fb)) {
                break;
            }

            if (math.rounding(fc, round) == 0.0) {
                break;
            }

            if (bs.ifFaFc(fa, fc)) {
                a = c;
                fa = math.initializeFunction(function, a);
            }
            if (bs.ifFbFc(fb, fc)) {
                b = c;
                fb = math.initializeFunction(function, b);
            }


            c = bs.getC(a, b);

            fc = math.initializeFunction(function, c);
            //c2 = c;

            //erc = math.calcERC(c2, c1);

        }
        if (bs.ifFaFc(fa, fc)) {
            Toast.makeText(getApplicationContext(), "TRUE", Toast.LENGTH_LONG).show();
        }

        c = math.rounding(c, round);
        //Toast.makeText(getApplicationContext(), String.valueOf(erc), Toast.LENGTH_LONG).show();
        result.setText(String.valueOf(c));


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_clear) {
            result.setText("");
            func.setText("");
            nilai1.setText("1");
            nilai2.setText("9");

            lview.setAdapter(null);

            func.setSelected(true);

        }

        return super.onOptionsItemSelected(item);
    }
}
