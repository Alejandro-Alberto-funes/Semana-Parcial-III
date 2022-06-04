package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Numeros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);

        Button btnmenu = findViewById(R.id.btnMenu2);
        btnmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salirmenu= new Intent(Numeros.this,Menu.class);
                startActivity(salirmenu);
            }
        });

        Button btcero= findViewById(R.id.btcero);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.cero);
        btcero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btuno= findViewById(R.id.btuno);
        MediaPlayer mp1 = MediaPlayer.create(this, R.raw.uno);
        btuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp1.start(); }
        });

        Button btdos= findViewById(R.id.btdos);
        MediaPlayer mp2 = MediaPlayer.create(this, R.raw.dos);
        btdos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp2.start(); }
        });

        Button bttres= findViewById(R.id.bttres);
        MediaPlayer mp3 = MediaPlayer.create(this, R.raw.tres);
        bttres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp3.start(); }
        });

        Button btcuatro= findViewById(R.id.btcuatro);
        MediaPlayer mp4 = MediaPlayer.create(this, R.raw.cuatro);
        btcuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp4.start(); }
        });

        Button btcinco= findViewById(R.id.btcinco);
        MediaPlayer mp5 = MediaPlayer.create(this, R.raw.cinco);
        btcinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp5.start(); }
        });

        Button btseis= findViewById(R.id.btseis);
        MediaPlayer mp6 = MediaPlayer.create(this, R.raw.seis);
        btseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp6.start(); }
        });

        Button btsiete= findViewById(R.id.btsiete);
        MediaPlayer mp7 = MediaPlayer.create(this, R.raw.siete);
        btsiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp7.start(); }
        });

        Button btocho= findViewById(R.id.btocho);
        MediaPlayer mp8 = MediaPlayer.create(this, R.raw.ocho);
        btocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp8.start(); }
        });

        Button btnueve= findViewById(R.id.btnueve);
        MediaPlayer mp9 = MediaPlayer.create(this, R.raw.nueve);
        btnueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp9.start(); }
        });
    }
}