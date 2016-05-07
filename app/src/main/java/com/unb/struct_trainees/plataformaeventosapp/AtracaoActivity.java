package com.unb.struct_trainees.plataformaeventosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AtracaoActivity extends AppCompatActivity {
    String titulo = "Sobre";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atracao);

        TextView tv = (TextView) findViewById(R.id.atracao_text_titulo);
        tv.setText(titulo);
    }
}
