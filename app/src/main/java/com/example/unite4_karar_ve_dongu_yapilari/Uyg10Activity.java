package com.example.unite4_karar_ve_dongu_yapilari;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Uyg10Activity extends AppCompatActivity {
    EditText number;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg10_activity);
        number = findViewById(R.id.txtSayi);
        button = findViewById(R.id.btnOnayla);
        textView = findViewById(R.id.textView2);
    }
    public void btnOnayla (View view) {
        int sayi = Integer.parseInt(number.getText().toString());
        int sayac=1;
        long sonuc=1;
        while(sayac<=sayi){
            sonuc=sonuc*sayac;
            sayac++;
        }
        textView.setText("Sonuç: "+sonuc);
    }
}
