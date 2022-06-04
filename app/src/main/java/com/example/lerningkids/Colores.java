package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Colores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores);

        ImageButton btverde= findViewById(R.id.btVerde);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.verde);
        btverde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        ImageButton btanaranjado= findViewById(R.id.btAnaranjado);
        MediaPlayer mp1 = MediaPlayer.create(this, R.raw.anaranjado);
        btanaranjado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp1.start(); }
        });

        ImageButton btmorado= findViewById(R.id.btMorado);
        MediaPlayer mp2 = MediaPlayer.create(this, R.raw.morado);
        btmorado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp2.start(); }
        });

        ImageButton btrosado= findViewById(R.id.btRosado);
        MediaPlayer mp3 = MediaPlayer.create(this, R.raw.rosado);
        btrosado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp3.start(); }
        });

        ImageButton btazul= findViewById(R.id.btAzul);
        MediaPlayer mp4 = MediaPlayer.create(this, R.raw.azul);
        btazul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp4.start(); }
        });

        ImageButton btceleste= findViewById(R.id.btCeleste);
        MediaPlayer mp5 = MediaPlayer.create(this, R.raw.celeste);
        btceleste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp5.start(); }
        });

        ImageButton btamarillo= findViewById(R.id.btAmarillo);
        MediaPlayer mp6 = MediaPlayer.create(this, R.raw.amarillo);
        btamarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp6.start(); }
        });

        ImageButton btcafe= findViewById(R.id.btCafe);
        MediaPlayer mp7 = MediaPlayer.create(this, R.raw.cafe);
        btcafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp7.start(); }
        });

        ImageButton btblanco= findViewById(R.id.btBlanco);
        MediaPlayer mp8 = MediaPlayer.create(this, R.raw.blanco);
        btblanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp8.start(); }
        });

        ImageButton btnegro= findViewById(R.id.btNegro);
        MediaPlayer mp9 = MediaPlayer.create(this, R.raw.negro);
        btnegro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp9.start(); }
        });

        ImageButton btrojo= findViewById(R.id.btRojo);
        MediaPlayer mp10 = MediaPlayer.create(this, R.raw.rojo);
        btrojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp10.start(); }
        });

        Button btnsalircolor = findViewById(R.id.btnSalircolor);
        btnsalircolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Colores.this,Menu.class);
                startActivity(salir);
            }
        });

    }
}