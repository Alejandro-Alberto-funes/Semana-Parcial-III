package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class VocalE extends AppCompatActivity {
MediaPlayer mpaudio;
ImageButton raudioE;
Button btnregresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocal_e);
        raudioE=(ImageButton)findViewById(R.id.btnletrae);
        mpaudio=MediaPlayer.create(this,R.raw.letrae);
        raudioE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpaudio.start();
            }
        });
        btnregresar=(Button)findViewById(R.id.btRegresar);
        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r= new Intent(VocalE.this, Basico.class);
                startActivity(r);
            }
        });
    }
}