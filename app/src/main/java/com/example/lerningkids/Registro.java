package com.example.lerningkids;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registro extends AppCompatActivity {
    EditText username , password , repassword ;
    Button signup , signin ;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        repassword = (EditText) findViewById(R.id.repassword); // new
        signup = (Button) findViewById(R.id.signup);
        signin = (Button) findViewById(R.id.signin);
        DB = new DBHelper(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String repass = repassword.getText().toString();

                if (TextUtils.isEmpty(user) || TextUtils.isEmpty(pass) || TextUtils.isEmpty(repass))
                    Toast.makeText(Registro.this, "Llena todos los campos", Toast.LENGTH_SHORT).show();
                else {
                    if(pass.equals(repass)){
                        Boolean checkuser =DB.checkusername(user);
                        if(checkuser==false)
                        {
                            Boolean insert = DB.insertData(user,pass);
                            if(insert==true){
                                Toast.makeText(Registro.this, "Registrado exitosamente", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), Menu.class);
                                startActivity(intent);
                            }else{
                                Toast.makeText(Registro.this, "Error al registrarte", Toast.LENGTH_SHORT).show();
                            }
                        }else{
                            Toast.makeText(Registro.this, "Este Usuario ya existe, intenta con otro", Toast.LENGTH_SHORT).show();
                        }
                    } else{
                        Toast.makeText(Registro.this, "Error! Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Sesion.class);
                startActivity(intent);
            }
        });


    }
}