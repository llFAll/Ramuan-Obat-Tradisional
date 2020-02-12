package com.example.obat9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Jpenyakit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jpenyakit);
    }
    public void Pdalam(View view) {
        Intent intent = new Intent(Jpenyakit.this, Pdalam.class);
        startActivity(intent);
    }
    public void Pkulit(View view) {
        Intent intent = new Intent(Jpenyakit.this, Pkulit.class);
        startActivity(intent);
    }
    public void Ppencernaan(View view) {
        Intent intent = new Intent(Jpenyakit.this, Ppencernaan.class);
        startActivity(intent);
    }
    public void Ppernafasan(View view) {
        Intent intent = new Intent(Jpenyakit.this, Ppernafasan.class);
        startActivity(intent);
    }
    public void Pgangguankewanitaan(View view) {
        Intent intent = new Intent(Jpenyakit.this, Pganguankewanitaan.class);
        startActivity(intent);
    }

}
