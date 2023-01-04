package com.example.unite4_karar_ve_dongu_yapilari;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class  Uyg3Activity extends AppCompatActivity {

    EditText editText_KullaniciAdi, editText_Sifresi;
    Button button_Onayla;

    final String kullaniciAdi = "Arda";
    final String sifre = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg3_activity);
        editText_KullaniciAdi = findViewById(R.id.txtKulAdi);
        editText_Sifresi = findViewById(R.id.txtSifre);
        button_Onayla = findViewById(R.id.btnLogin);



    }

    public void onayla(View view) {
        String kullaniciAdiGiris = editText_KullaniciAdi.getText().toString();
        String sifreGiris = editText_Sifresi.getText().toString();


        if (kullaniciAdi.equals(kullaniciAdiGiris) && sifre.equals(sifreGiris)) {
            Toast.makeText(Uyg3Activity.this,"Giriş Başarılı.",Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(Uyg3Activity.this,"Kullanıcı adı veya şifreniz hatalı!",Toast.LENGTH_LONG).show();
        }
    }

}
