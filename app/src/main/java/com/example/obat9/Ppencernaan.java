package com.example.obat9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ppencernaan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppencernaan);
    }
    public void Batu_Kandung_Kemih(View view) {
        Intent intent = new Intent(Ppencernaan.this, PAPENbatukandungkemih.class);
        startActivity(intent);
    }
    public void Cacingan(View view) {
        Intent intent = new Intent(Ppencernaan.this, PAPENcacingan.class);
        startActivity(intent);
    }
    public void Diare(View view) {
        Intent intent = new Intent(Ppencernaan.this, PAPENdiare.class);
        startActivity(intent);
    }
    public void Disentri(View view) {
        Intent intent = new Intent(Ppencernaan.this, PAPENdisentri.class);
        startActivity(intent);
    }
    public void Hepatitis(View view) {
        Intent intent = new Intent(Ppencernaan.this, PAPENhepatitis.class);
        startActivity(intent);
    }
    public void Infeksi_Saluran_Kemih(View view) {
        Intent intent = new Intent(Ppencernaan.this, PAPENinfeksisalurankemih.class);
        startActivity(intent);
    }
    public void Maag(View view) {
        Intent intent = new Intent(Ppencernaan.this, PAPENmaag.class);
        startActivity(intent);
    }
    public void Radang_Usus(View view) {
        Intent intent = new Intent(Ppencernaan.this, PAPENradangususbuntu.class);
        startActivity(intent);
    }
    public void Sembelit(View view) {
        Intent intent = new Intent(Ppencernaan.this, PAPENsembelit.class);
        startActivity(intent);
    }
    public void Wasir(View view) {
        Intent intent = new Intent(Ppencernaan.this, PAPENwasir.class);
        startActivity(intent);
    }
}
