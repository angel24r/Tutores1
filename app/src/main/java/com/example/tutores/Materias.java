package com.example.tutores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Materias extends AppCompatActivity {
    ImageView espanol,mate,ciencias,negocios,humanidades,re;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materias);
        espanol= findViewById(R.id.espanol);
        mate = findViewById(R.id.mate);
        ciencias= findViewById(R.id.ciencias);
        negocios = findViewById(R.id.negocios);
        humanidades = findViewById(R.id.humanidades);
        re = findViewById(R.id.re2);
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterActivity=new Intent(getApplicationContext(),Entrada.class);
                startActivity(RegisterActivity);
                finish();
            }
        });

        espanol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterActivity=new Intent(getApplicationContext(),Listado.class);
                startActivity(RegisterActivity);
                finish();
            }
        });
        mate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterActivity=new Intent(getApplicationContext(),Listado.class);
                startActivity(RegisterActivity);
                finish();
            }
        });
        ciencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterActivity=new Intent(getApplicationContext(),Listado.class);
                startActivity(RegisterActivity);
                finish();
            }
        });
        negocios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterActivity=new Intent(getApplicationContext(),Listado.class);
                startActivity(RegisterActivity);
                finish();
            }
        });
        humanidades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterActivity=new Intent(getApplicationContext(),Listado.class);
                startActivity(RegisterActivity);
                finish();
            }
        });
    }
}