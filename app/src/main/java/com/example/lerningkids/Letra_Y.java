package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_Y extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_y);

        ImageButton btnsonidoy= findViewById(R.id.btnSonidoY);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.y);
        btnsonidoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsaliry = findViewById(R.id.btnSalirY);
        btnsaliry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_Y.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}