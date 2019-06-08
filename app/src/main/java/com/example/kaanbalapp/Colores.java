package com.example.kaanbalapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Colores extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void AbecedarioIntent(View view) {
        Intent a = new Intent(Colores.this, Abecedario.class);
        startActivity(a);

    }

    public void NumerosIntent(View view) {
        Intent a = new Intent(Colores.this, Numeros.class);
        startActivity(a);

    }

    public void AnimalesIntent(View view) {
        Intent a = new Intent(Colores.this,MainActivity.class);
        startActivity(a);

    }

    public void PPartesIntent(View view) {
        Intent a = new Intent(Colores.this, PPartes.class);
        startActivity(a);

    }

    public void  PComunesIntent(View view) {
        Intent a = new Intent(Colores.this, PComunes.class);
        startActivity(a);


    }

}

