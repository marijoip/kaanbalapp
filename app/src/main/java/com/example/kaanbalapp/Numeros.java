package com.example.kaanbalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Numeros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void ColoresIntent(View view) {
        Intent a = new Intent(Numeros.this, Colores.class);
        startActivity(a);

    }

    public void Abecedario(View view) {
        Intent a = new Intent(Numeros.this, Abecedario.class);
        startActivity(a);

    }

    public void AnimalesIntent(View view) {
        Intent a = new Intent(Numeros.this,MainActivity.class);
        startActivity(a);

    }

    public void PPartesIntent(View view) {
        Intent a = new Intent(Numeros.this, PPartes.class);
        startActivity(a);

    }

    public void  PComunesIntent(View view) {
        Intent a = new Intent(Numeros.this, PComunes.class);
        startActivity(a);


    }

}

