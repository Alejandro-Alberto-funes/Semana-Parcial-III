package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_V extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_v);

        ImageButton btnsonidov= findViewById(R.id.btnSonidoV);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.v);
        btnsonidov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsalirv = findViewById(R.id.btnSalirV);
        btnsalirv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_V.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}