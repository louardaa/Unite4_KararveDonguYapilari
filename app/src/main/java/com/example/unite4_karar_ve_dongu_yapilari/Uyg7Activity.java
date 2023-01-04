package com.example.unite4_karar_ve_dongu_yapilari;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg7_activity);

    }

    protected void onResume() {
        int sonuc;
        super.onResume();
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            sonuc = i;
            switch (sonuc) {
                case 1:
                    i = i * 1;
                    break;


            }
        }
    }
}










