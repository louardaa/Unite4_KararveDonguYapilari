package com.example.unite4_karar_ve_dongu_yapilari;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Uyg4Activity<Switch> extends AppCompatActivity {
    Switch konumServisleri, konumGonder, konumAl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg4_activity);
        konumServisleri = (Switch) findViewById(R.id.KonumServisi);
        konumAl = (Switch) findViewById(R.id.KonumAl);
        konumGonder = (Switch) findViewById(R.id.KonumGonder);
    }

}

