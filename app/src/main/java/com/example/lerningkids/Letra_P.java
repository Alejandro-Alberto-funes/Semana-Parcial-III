package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_P extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_p);

        ImageButton btnsonidop= findViewById(R.id.btnSonidoP);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.p);
        btnsonidop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsalirp = findViewById(R.id.btnSalirP);
        btnsalirp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_P.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}