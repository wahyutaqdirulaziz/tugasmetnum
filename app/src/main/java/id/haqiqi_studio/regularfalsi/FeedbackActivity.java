package id.haqiqi_studio.regularfalsi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.MultiAutoCompleteTextView;

public class FeedbackActivity extends AppCompatActivity {
MultiAutoCompleteTextView feecback;
Utils utils = new Utils();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        feecback = findViewById(R.id.feedback);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fd = feecback.getText().toString();
                if (fd.matches("")) {
                    Snackbar.make(view, "Kolom komentar masing kosong", Snackbar.LENGTH_SHORT).show();
                }
                else {
                  composeEmail( fd);
                }
            }
        });
    }

    void composeEmail( String text) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"+"wahyudipe6@gmail.com")); // only email apps should handle this
       // intent.putExtra(Intent.EXTRA_EMAIL, address);
        intent.putExtra(Intent.EXTRA_TEXT, text);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}
