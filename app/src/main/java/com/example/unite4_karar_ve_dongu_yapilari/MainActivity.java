package com.example.unite4_karar_ve_dongu_yapilari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void uyg1Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg1Activity.class);
        startActivity(i);
    }

    public void uyg2Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg2Activity.class);
        startActivity(i);
    }

    public void btnUyg3(View view) {
        Intent i = new Intent(MainActivity.this, Uyg3Activity.class);
        startActivity(i);
    }
    public void btnUyg4(View view) {
        Intent i = new Intent(MainActivity.this, Uyg4Activity.class);
        startActivity(i);
    }
    public void btnUyg7(View view) {
        Intent i = new Intent(MainActivity.this, Uyg7Activity.class);
        startActivity(i);
    }
    public void btnUyg8(View view) {
        Intent i = new Intent(MainActivity.this, Uyg8Activity.class);
        startActivity(i);
    }

}
