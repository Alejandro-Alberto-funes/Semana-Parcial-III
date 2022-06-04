package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_X extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_x);

        ImageButton btnsonidox= findViewById(R.id.btnSonidoX);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.x);
        btnsonidox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsalirx = findViewById(R.id.btnSalirX);
        btnsalirx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_X.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}