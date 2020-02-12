package com.example.obat9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ppernafasan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppernafasan);
    }
    public void Asma(View view) {
        Intent intent = new Intent(Ppernafasan.this, PAPERasma.class);
        startActivity(intent);
    }
    public void Batuk(View view) {
        Intent intent = new Intent(Ppernafasan.this, PAPERbatuk.class);
        startActivity(intent);
    }
    public void Bronkitis(View view) {
        Intent intent = new Intent(Ppernafasan.this, PAPERbrokitis.class);
        startActivity(intent);
    }
    public void Difteri(View view) {
        Intent intent = new Intent(Ppernafasan.this, PAPERdifteri.class);
        startActivity(intent);
    }
    public void FLu(View view) {
        Intent intent = new Intent(Ppernafasan.this, PAPERflu.class);
        startActivity(intent);
    }
    public void Gondongan(View view) {
        Intent intent = new Intent(Ppernafasan.this, PAPERgondongan.class);
        startActivity(intent);
    }
    public void Peluritis(View view) {
        Intent intent = new Intent(Ppernafasan.this, PAPERpleuritis.class);
        startActivity(intent);
    }
    public void Amandel(View view) {
        Intent intent = new Intent(Ppernafasan.this, PAPERamandel.class);
        startActivity(intent);
    }
    public void Sariawan(View view) {
        Intent intent = new Intent(Ppernafasan.this, PAPERsariawan.class);
        startActivity(intent);
    }
    public void TBC(View view) {
        Intent intent = new Intent(Ppernafasan.this, PAPERtbc.class);
        startActivity(intent);
    }
}
