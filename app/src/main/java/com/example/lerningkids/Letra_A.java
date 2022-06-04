package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_a);

        ImageButton btnsonidoa= findViewById(R.id.btnSonidoA);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.a);
        btnsonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsalira = findViewById(R.id.btnSalirA);
        btnsalira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_A.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}