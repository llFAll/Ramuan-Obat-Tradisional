package com.example.obat9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RPganguankewanitaan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpganguankewanitaan);
    }
    public void RChlamydia(View view) {
        Intent intent = new Intent(RPganguankewanitaan.this, RPGchlamydia.class);
        startActivity(intent);
    }
    public void REndometriosis(View view) {
        Intent intent = new Intent(RPganguankewanitaan.this, RPGendometriosis.class);
        startActivity(intent);
    }
    public void RFibroid_Rahim(View view) {
        Intent intent = new Intent(RPganguankewanitaan.this, RPGfibroid.class);
        startActivity(intent);
    }
    public void RGonore(View view) {
        Intent intent = new Intent(RPganguankewanitaan.this, RPGgonore.class);
        startActivity(intent);
    }
    public void RKeputihan(View view) {
        Intent intent = new Intent(RPganguankewanitaan.this, RPGkeputihan.class);
        startActivity(intent);
    }
    public void RKutil_Kelamin(View view) {
        Intent intent = new Intent(RPganguankewanitaan.this, RPGkutilkelamin.class);
        startActivity(intent);
    }
    public void RLupus(View view) {
        Intent intent = new Intent(RPganguankewanitaan.this, RPGlupus.class);
        startActivity(intent);
    }
    public void RKankerselviks(View view) {
        Intent intent = new Intent(RPganguankewanitaan.this, RPGkankerserviks.class);
        startActivity(intent);
    }
    public void RSifilis(View view) {
        Intent intent = new Intent(RPganguankewanitaan.this, RPGsifilis.class);
        startActivity(intent);
    }
    public void RTrikomoniasis(View view) {
        Intent intent = new Intent(RPganguankewanitaan.this, RPGtrikomoniasis.class);
        startActivity(intent);
    }
}
