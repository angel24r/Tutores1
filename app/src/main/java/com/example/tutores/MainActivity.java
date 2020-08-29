package com.example.tutores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
         EditText txt_usuario=(EditText)findViewById(R.id.txt_usuario);
         EditText txt_password=(EditText)findViewById(R.id.txt_password);
        ImageButton sing=(ImageButton)findViewById(R.id.singup);
        
    }
}