package com.example.obat9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RPpencernaan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rppencernaan);
    }
    public void RBatu_Kandung_Kemih(View view) {
        Intent intent = new Intent(RPpencernaan.this, RPPENkandungkemih.class);
        startActivity(intent);
    }
    public void RCacingan(View view) {
        Intent intent = new Intent(RPpencernaan.this, RPPENcacingan.class);
        startActivity(intent);
    }
    public void RDiare(View view) {
        Intent intent = new Intent(RPpencernaan.this, RPPENdiare.class);
        startActivity(intent);
    }
    public void RDisentri(View view) {
        Intent intent = new Intent(RPpencernaan.this, RPPENdisentri.class);
        startActivity(intent);
    }
    public void RHepatitis(View view) {
        Intent intent = new Intent(RPpencernaan.this, RPPENhepatitis.class);
        startActivity(intent);
    }
    public void RInfeksi_Saluran_Kemih(View view) {
        Intent intent = new Intent(RPpencernaan.this, RPPENinfeksisalurankemih.class);
        startActivity(intent);
    }
    public void RMaag(View view) {
        Intent intent = new Intent(RPpencernaan.this, RPPENmaag.class);
        startActivity(intent);
    }
    public void RRadang_Usus(View view) {
        Intent intent = new Intent(RPpencernaan.this, RPPENususbuntu.class);
        startActivity(intent);
    }
    public void RSembelit(View view) {
        Intent intent = new Intent(RPpencernaan.this, RPPENsembelit.class);
        startActivity(intent);
    }
    public void RWasir(View view) {
        Intent intent = new Intent(RPpencernaan.this, RPPENwasir.class);
        startActivity(intent);
    }
}
