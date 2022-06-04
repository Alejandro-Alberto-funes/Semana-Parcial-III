package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_Z extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_z);

        ImageButton btnsonidoz= findViewById(R.id.btnSonidoZ);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.z);
        btnsonidoz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsalirz = findViewById(R.id.btnSalirZ);
        btnsalirz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_Z.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}