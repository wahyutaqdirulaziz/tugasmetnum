package id.haqiqi_studio.regularfalsi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GaussJordanSelector extends AppCompatActivity {

    Button gauss2x3, gauss3x4, gauss4x5, gauss5x6,
            gauss6x7, gauss7x8, gauss8x9, gauss9x10, gauss10x11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gauss_jordan_selector);

        gauss2x3 = findViewById(R.id.gauss2x3);
        gauss3x4 = findViewById(R.id.gauss3x4);
        gauss4x5 = findViewById(R.id.gauss4x5);
        gauss5x6 = findViewById(R.id.gauss5x6);
        gauss6x7 = findViewById(R.id.gauss6x7);
        gauss7x8 = findViewById(R.id.gauss7x8);
        gauss8x9 = findViewById(R.id.gauss8x9);
        gauss9x10 = findViewById(R.id.gauss9x10);
        gauss10x11 = findViewById(R.id.gauss10x11);

        gauss2x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), GaussJordanActivity.class));
            }
        });

        gauss3x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Jordan3x4Activity.class));
            }
        });
        gauss3x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Jordan3x4Activity.class));
            }
        });
        gauss4x5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Jordan4x5.class));
            }
        });

        gauss5x6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Jordan5x6.class));
            }
        });

        gauss6x7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Jordan6x7.class));
            }
        });

        gauss7x8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Jordan7x8.class));
            }
        });

        gauss8x9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Jordan8x9.class));
            }
        });

        gauss9x10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Jordan9x10.class));
            }
        });

        gauss10x11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Jordan10x11.class));
            }
        });

    }
}
