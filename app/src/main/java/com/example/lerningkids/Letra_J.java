package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_J extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_j);

        ImageButton btnsonidoj= findViewById(R.id.btnSonidoJ);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.j);
        btnsonidoj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsalirj = findViewById(R.id.btnSalirJ);
        btnsalirj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_J.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}