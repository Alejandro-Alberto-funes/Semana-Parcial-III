package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Sesion extends AppCompatActivity {
    TextView txtregistro;
    EditText username , password;
    MediaPlayer mp;
    Button btnsonido;
    Button signin;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion);
        txtregistro=(TextView)findViewById(R.id.txtregistro);
        txtregistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e= new Intent(Sesion.this, Registro.class);
                startActivity(e);

            }
        });
        username = findViewById(R.id.username1);
        password =findViewById(R.id.password1);
        signin = findViewById(R.id.signin1);
        btnsonido = (Button)findViewById(R.id.signin1);
        mp = MediaPlayer.create(this, R.raw.sonidoin);
        DB = new DBHelper(this);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(TextUtils.isEmpty(user) || TextUtils.isEmpty(pass))
                    Toast.makeText(Sesion.this,"Llena todos los campos",Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass = DB.checkusernamepassword(user,pass);
                    if(checkuserpass==true){
                        Toast.makeText(Sesion.this,"Bienvenido, inicio de sesion exitoso",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),Menu.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(Sesion.this,"Inicia de sesion fallido, intentalo de nuevo",Toast.LENGTH_SHORT).show();
                    }
                }



            }
        });
    }
}