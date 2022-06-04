package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_U extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_u);

        ImageButton btnsonidou= findViewById(R.id.btnSonidoU);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.u);
        btnsonidou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsaliru = findViewById(R.id.btnSalirU);
        btnsaliru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_U.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}