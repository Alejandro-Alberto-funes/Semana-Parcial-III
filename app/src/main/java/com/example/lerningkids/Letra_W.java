package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_W extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_w);

        ImageButton btnsonidow= findViewById(R.id.btnSonidoW);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.w);
        btnsonidow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsalirw = findViewById(R.id.btnSalirW);
        btnsalirw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_W.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}