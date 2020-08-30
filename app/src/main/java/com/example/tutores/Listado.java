package com.example.tutores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Listado extends AppCompatActivity {
    private ImageView re,imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
        re = findViewById(R.id.re);
        imagen = findViewById(R.id.imagview);
        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterActivity=new Intent(getApplicationContext(),Agendar.class);
                startActivity(RegisterActivity);
                finish();
            }
        });
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterActivity=new Intent(getApplicationContext(),Materias.class);
                startActivity(RegisterActivity);
                finish();
            }
        });
    }
}