package com.example.kaanbalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PComunes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void ColoresIntent(View view) {
        Intent a = new Intent(PComunes.this, Colores.class);
        finish();

    }

    public void NumerosIntent(View view) {
        Intent a = new Intent(PComunes.this, Numeros.class);
       finish();

    }

    public void AnimalesIntent(View view) {
        Intent a = new Intent(PComunes.this,MainActivity.class);
        finish();

    }

    public void PPartesIntent(View view) {
        Intent a = new Intent(PComunes.this, PPartes.class);
        finish();

    }

    public void  PComunesIntent(View view) {
        Intent a = new Intent(PComunes.this, Abecedario.class);
        finish();


    }

}

