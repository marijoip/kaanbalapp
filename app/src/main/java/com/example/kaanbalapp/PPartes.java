package com.example.kaanbalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PPartes extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void ColoresIntent(View view) {
        Intent a = new Intent(PPartes.this, Colores.class);
        startActivity(a);

    }

    public void NumerosIntent(View view) {
        Intent a = new Intent(PPartes.this, Numeros.class);
        startActivity(a);

    }

    public void AnimalesIntent(View view) {
        Intent a = new Intent(PPartes.this,MainActivity.class);
        startActivity(a);

    }

    public void AbecedarioIntent(View view) {
        Intent a = new Intent(PPartes.this, Abecedario.class);
        startActivity(a);

    }

    public void  PComunesIntent(View view) {
        Intent a = new Intent(PPartes.this, PComunes.class);
        startActivity(a);


    }

}

