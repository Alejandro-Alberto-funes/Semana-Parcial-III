package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_L extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_l);

        ImageButton btnsonidol= findViewById(R.id.btnSonidoL);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.l);
        btnsonidol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsalirl = findViewById(R.id.btnSalirL);
        btnsalirl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_L.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}