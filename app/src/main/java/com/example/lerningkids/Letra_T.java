package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_T extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_t);

        ImageButton btnsonidot= findViewById(R.id.btnSonidoT);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.t);
        btnsonidot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsalirt = findViewById(R.id.btnSalirT);
        btnsalirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_T.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}