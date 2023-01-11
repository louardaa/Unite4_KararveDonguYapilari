package com.example.unite4_karar_ve_dongu_yapilari;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg5Activity extends AppCompatActivity {
    EditText editTextNot1, editTextNot2, editTextNot3;
    Button buttonOnayla;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg5_activity);

        editTextNot1 = findViewById(R.id.editTextNumber_Not1);
        editTextNot2 = findViewById(R.id.editTextNumber_Not2);
        editTextNot3 = findViewById(R.id.editTextNumber_Not3);
    }

    public void btnOnayla(View view) {
        int not1 = Integer.parseInt(editTextNot1.getText().toString());
        int not2 = Integer.parseInt(editTextNot2.getText().toString());
        int not3 = Integer.parseInt(editTextNot3.getText().toString());

        float ort = (not1 + not2 + not3) / 3;
        if (not1 > 100 || not2 > 100 || not3 > 100) {
            Toast.makeText(this, "Lütfen 0-100 arasında not giriniz.", Toast.LENGTH_LONG).show();
            return;
        }
        if (ort >= 0 && ort < 25) {
            Toast.makeText(this, "0 ile kaldınız.", Toast.LENGTH_LONG).show();

        } else if (ort >= 25 && ort < 45) {
            Toast.makeText(this, "1 ile geçtiniz.", Toast.LENGTH_LONG).show();
        } else if (ort >= 45 && ort < 55) {
            Toast.makeText(this, "2 ile geçtiniz.", Toast.LENGTH_LONG).show();

        } else if (ort >= 55 && ort < 70) {
            Toast.makeText(this, "3 ile geçtiniz.", Toast.LENGTH_LONG).show();
        } else if (ort >= 70 && ort < 85) {
            Toast.makeText(this, "4 ile geçtiniz.", Toast.LENGTH_LONG).show();

        } else if (ort >= 85 && ort < 100) {
            Toast.makeText(this, "5 ile geçtiniz.", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Düzgün gir!.", Toast.LENGTH_LONG).show();
        }
    }
}
