package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_N extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_n);

        ImageButton btnsonidon= findViewById(R.id.btnSonidoN);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.n);
        btnsonidon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsalirn = findViewById(R.id.btnSalirN);
        btnsalirn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_N.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}