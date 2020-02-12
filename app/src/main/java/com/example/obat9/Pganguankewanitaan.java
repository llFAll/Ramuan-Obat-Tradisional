package com.example.obat9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pganguankewanitaan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pganguankewanitaan);
    }
    public void Chlamydia(View view) {
        Intent intent = new Intent(Pganguankewanitaan.this, PGWchlamydia.class);
        startActivity(intent);
    }
    public void Endometriosis(View view) {
        Intent intent = new Intent(Pganguankewanitaan.this, PGWendometriosis.class);
        startActivity(intent);
    }
    public void Fibroid_Rahim(View view) {
        Intent intent = new Intent(Pganguankewanitaan.this, PGWfibroidrahim.class);
        startActivity(intent);
    }
    public void Gonore(View view) {
        Intent intent = new Intent(Pganguankewanitaan.this, PGWgonore.class);
        startActivity(intent);
    }
    public void Keputihan(View view) {
        Intent intent = new Intent(Pganguankewanitaan.this, PGWkeputihan.class);
        startActivity(intent);
    }
    public void Kutil_Kelamin(View view) {
        Intent intent = new Intent(Pganguankewanitaan.this, PGWkutilkelamin.class);
        startActivity(intent);
    }
    public void Lupus(View view) {
        Intent intent = new Intent(Pganguankewanitaan.this, PGWlupus.class);
        startActivity(intent);
    }
    public void Multiple_sclerosis(View view) {
        Intent intent = new Intent(Pganguankewanitaan.this, PGWms.class);
        startActivity(intent);
    }
    public void Sifilis(View view) {
        Intent intent = new Intent(Pganguankewanitaan.this, PGWsifilis.class);
        startActivity(intent);
    }
    public void Trikomoniasis(View view) {
        Intent intent = new Intent(Pganguankewanitaan.this, PGWtrikomoniasis.class);
        startActivity(intent);
    }
}
