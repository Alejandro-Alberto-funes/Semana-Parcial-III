package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_Q extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_q);

        ImageButton btnsonidoq= findViewById(R.id.btnSonidoQ);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.q);
        btnsonidoq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsalirq = findViewById(R.id.btnSalirQ);
        btnsalirq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_Q.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}