package com.example.tutores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         EditText txt_usuario=(EditText)findViewById(R.id.txt_usuario);
         EditText txt_password=(EditText)findViewById(R.id.txt_password);
        ImageButton sing=(ImageButton)findViewById(R.id.singup);
        
    }
}