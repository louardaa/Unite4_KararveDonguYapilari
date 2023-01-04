package com.example.unite4_karar_ve_dongu_yapilari;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg6Activity extends AppCompatActivity {
    EditText txtay;
    TextView txtView ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg6_activity);

        txtay = findViewById(R.id.txtay);
        txtView = findViewById(R.id.txtView);

    }
    public void btnOnayla(View view){
        int sayiay = Integer.parseInt(txtay.getText().toString());
        String ay ="";

        switch (sayiay){
                case 1:
                ay="Ocak";
                break;
                case 2:
                ay="Şubat";
                break;
                case 3:
                ay="Mart";
                break;
                case 4:
                ay="Nisan";
                break;
                case 5:
                ay="Mayıs";
                break;
                case 6:
                ay="Haziran";
                break;
                case 7:
                ay="Temmuz";
                break;
                case 8:
                ay="Ağustos";
                break;
                case 9:
                ay="Eylül";
                break;
                case 10:
                ay="Ekim";
                break;
                case 11:
                ay="Kasım";
                break;
                case 12:
                ay="Aralık";
            default:
                ay="Hatalı Bilgi";
                break;
        }
        txtView.setText(ay);
    }
}
