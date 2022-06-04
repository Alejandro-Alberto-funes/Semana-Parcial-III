package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_D extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_d);

        ImageButton btnsonidod= findViewById(R.id.btnSonidoD);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.d);
        btnsonidod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsalird = findViewById(R.id.btnSalirD);
        btnsalird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_D.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}