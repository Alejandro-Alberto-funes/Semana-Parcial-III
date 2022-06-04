package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class VocalA extends AppCompatActivity {
MediaPlayer mp;
ImageButton btnreproducir;
Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocal_a);

        btnreproducir=(ImageButton) findViewById(R.id.btnletraa);
        mp= MediaPlayer.create(this, R.raw.aletra);
        btnreproducir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               mp.start();
            }
        });
        regresar=(Button) findViewById(R.id.btnvolver);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r=new Intent(VocalA.this, Basico.class);
                startActivity(r);

            }
        });
    }
}