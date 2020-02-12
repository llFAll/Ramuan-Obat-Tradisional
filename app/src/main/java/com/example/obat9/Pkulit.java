package com.example.obat9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pkulit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pkulit);
    }
    public void Alergi(View view) {
        Intent intent = new Intent(Pkulit.this, PKalergi.class);
        startActivity(intent);
    }
    public void Bisul(View view) {
        Intent intent = new Intent(Pkulit.this, PKbisul.class);
        startActivity(intent);
    }
    public void Cacar_Air(View view) {
        Intent intent = new Intent(Pkulit.this, PKcacarair.class);
        startActivity(intent);
    }
    public void Campak(View view) {
        Intent intent = new Intent(Pkulit.this, PKcampak.class);
        startActivity(intent);
    }
    public void Koreng(View view) {
        Intent intent = new Intent(Pkulit.this, PKkoreng.class);
        startActivity(intent);
    }
    public void Kurap(View view) {
        Intent intent = new Intent(Pkulit.this, PKkurap.class);
        startActivity(intent);
    }
    public void Kutil(View view) {
        Intent intent = new Intent(Pkulit.this, PKkutil.class);
        startActivity(intent);
    }
    public void Kusta(View view) {
        Intent intent = new Intent(Pkulit.this, PKkusta.class);
        startActivity(intent);
    }
    public void Luka_Bakar(View view) {
        Intent intent = new Intent(Pkulit.this, PKlukabakar.class);
        startActivity(intent);
    }
    public void Panu(View view) {
        Intent intent = new Intent(Pkulit.this, PKpanu.class);
        startActivity(intent);
    }
}
