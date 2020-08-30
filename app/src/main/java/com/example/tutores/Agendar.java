package com.example.tutores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Agendar extends AppCompatActivity {
    private ImageView conf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendar);
        conf = findViewById(R.id.confirm);
        conf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterActivity=new Intent(getApplicationContext(),Entrada.class);
                showMesagge("Tutoria Agendada");
                startActivity(RegisterActivity);
                finish();
            }
        });

    }
    private void showMesagge(String text) {
        Toast.makeText(getApplicationContext(),text, Toast.LENGTH_LONG).show();


    }
}