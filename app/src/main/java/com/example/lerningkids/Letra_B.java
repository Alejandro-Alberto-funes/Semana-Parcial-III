package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_B extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_b);

        ImageButton btnsonidob= findViewById(R.id.btnSonidoB);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.b);
        btnsonidob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsalirb = findViewById(R.id.btnSalirB);
        btnsalirb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_B.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}