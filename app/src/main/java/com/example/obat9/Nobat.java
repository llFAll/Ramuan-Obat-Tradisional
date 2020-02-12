package com.example.obat9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Nobat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nobat);
    }
    public void Nkunyit(View view) {
        Intent intent = new Intent(Nobat.this, Nkunyit.class);
        startActivity(intent);
    }
    public void Nlengkuas(View view) {
        Intent intent = new Intent(Nobat.this, Nlengkuas.class);
        startActivity(intent);
    }
    public void Ntemulawak(View view) {
        Intent intent = new Intent(Nobat.this, Ntemulawak.class);
        startActivity(intent);
    }
    public void Njahe(View view) {
        Intent intent = new Intent(Nobat.this, Njahe.class);
        startActivity(intent);
    }
    public void Ndaunsirih(View view) {
        Intent intent = new Intent(Nobat.this, Ndaunsirih.class);
        startActivity(intent);
    }
    public void Ngandarusa(View view) {
        Intent intent = new Intent(Nobat.this, Ngandarusa.class);
        startActivity(intent);
    }
    public void Nsambiloto(View view) {
        Intent intent = new Intent(Nobat.this, Nsambiloto.class);
        startActivity(intent);
    }
    public void Ngendola(View view) {
        Intent intent = new Intent(Nobat.this, Ngendola.class);
        startActivity(intent);
    }
    public void Nkencur(View view) {
        Intent intent = new Intent(Nobat.this, Nkencur.class);
        startActivity(intent);
    }
    public void Nbrotowali(View view) {
        Intent intent = new Intent(Nobat.this, Nbrotowali.class);
        startActivity(intent);
    }
}
