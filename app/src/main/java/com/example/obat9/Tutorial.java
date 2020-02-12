package com.example.obat9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tutorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
    }
    public void Tanemia(View view) {
        Intent intent = new Intent(Tutorial.this, Tanemia.class);
        startActivity(intent);
    }
    public void TGinjal(View view) {
        Intent intent = new Intent(Tutorial.this, Tbatuginjal.class);
        startActivity(intent);
    }
    public void TDiabetes(View view) {
        Intent intent = new Intent(Tutorial.this, Tdiabetes.class);
        startActivity(intent);
    }
    public void TLeukimia(View view) {
        Intent intent = new Intent(Tutorial.this, Tleukimia.class);
        startActivity(intent);
    }
    public void TMalaria(View view) {
        Intent intent = new Intent(Tutorial.this, Tmalaria.class);
        startActivity(intent);
    }
    public void TRadangMata(View view) {
        Intent intent = new Intent(Tutorial.this, Tradangmata.class);
        startActivity(intent);
    }
    public void TRematik(View view) {
        Intent intent = new Intent(Tutorial.this, Trematik.class);
        startActivity(intent);
    }
    public void TStroke(View view) {
        Intent intent = new Intent(Tutorial.this, Tstroke.class);
        startActivity(intent);
    }
    public void TTDT(View view) {
        Intent intent = new Intent(Tutorial.this, Ttdt.class);
        startActivity(intent);
    }
    public void TTifus(View view) {
        Intent intent = new Intent(Tutorial.this, Ttifus.class);
        startActivity(intent);
    }
}
