package com.example.tutores;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {
    private  EditText txt_usuario,txt_password;
    private Button btnlogin;
    private ProgressBar login_progress;
    private FirebaseAuth mAuth;
    private Intent Home;
    private ImageView LoginPhoto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txt_usuario=findViewById(R.id.txt_usuario);
        txt_password=findViewById(R.id.txt_password);
        btnlogin=findViewById(R.id.btnlogin);
        mAuth=FirebaseAuth.getInstance();
        Home=new Intent(this, com.example.tutores.Home.class);
        LoginPhoto=findViewById(R.id.singup);
        login_progress=findViewById(R.id.login_progress);
        LoginPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RegisterActivity=new Intent(getApplicationContext(),Registro.class);
                startActivity(RegisterActivity);
                finish();

            }
        });

        ImageButton sing=(ImageButton)findViewById(R.id.singup);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                login_progress.setVisibility(View.VISIBLE);
                btnlogin.setVisibility(View.INVISIBLE);
                final String mail=txt_usuario.getText().toString();
                final String password=txt_password.getText().toString();

                if (mail.isEmpty() || password.isEmpty()){
                    showMesagge("Verifique su informacion");
                    btnlogin.setVisibility(View.VISIBLE);
                    login_progress.setVisibility(View.INVISIBLE);
                }
                else
                {

                    signIn(mail,password);

                }
            }
        });
    }

    private void signIn(String mail, String password) {
        mAuth.signInWithEmailAndPassword(mail, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    login_progress.setVisibility(View.INVISIBLE);
                    btnlogin.setVisibility(View.VISIBLE);
                    updateUI();

                }else{
                    showMesagge(task.getException().getMessage());
                    btnlogin.setVisibility(View.VISIBLE);
                    login_progress.setVisibility(View.INVISIBLE);
                }

            }
            });

    }

    private void updateUI() {
        startActivity(Home);
        finish();


    }

    private void showMesagge(String text) {
        Toast.makeText(getApplicationContext(),text, Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser User=mAuth.getCurrentUser();
        if(User !=null){
            updateUI();
        }

    }
}