package com.example.unite4_karar_ve_dongu_yapilari;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Uyg1Activity extends AppCompatActivity {
    EditText number;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg1_activity);

        button=findViewById(R.id.uyg1btn);
        number=findViewById(R.id.uyg1edittxt);
    }
    public void kontrolEt(View view){
        int sayi = Integer.parseInt(number.getText().toString());
        if(sayi>100){
            Toast.makeText(this, "100’den Büyük Not Olamaz", Toast.LENGTH_SHORT).show();
        }
    }

}
