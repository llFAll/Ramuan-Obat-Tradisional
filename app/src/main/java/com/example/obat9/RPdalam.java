package com.example.obat9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RPdalam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpdalam);
    }
    public void RAnemia(View view) {
        Intent intent = new Intent(RPdalam.this, RPDanemia.class);
        startActivity(intent);
    }

    public void RGinjal(View view) {
        Intent intent = new Intent(RPdalam.this, RPDginjal.class);
        startActivity(intent);
    }
    public void RDiabetes(View view) {
        Intent intent = new Intent(RPdalam.this, RPDdiabetes.class);
        startActivity(intent);
    }
    public void RLeuki(View view) {
        Intent intent = new Intent(RPdalam.this, RPDleuki.class);
        startActivity(intent);
    }
    public void RMalaria(View view) {
        Intent intent = new Intent(RPdalam.this, RPDmalaria.class);
        startActivity(intent);
    }
    public void RRadangMata(View view) {
        Intent intent = new Intent(RPdalam.this, RPDradangmata.class);
        startActivity(intent);
    }
    public void RRematik(View view) {
        Intent intent = new Intent(RPdalam.this, RPDrematik.class);
        startActivity(intent);
    }
    public void RStroke(View view) {
        Intent intent = new Intent(RPdalam.this, RPDstroke.class);
        startActivity(intent);
    }
    public void RTDT(View view) {
        Intent intent = new Intent(RPdalam.this, RPDdarahtinggi.class);
        startActivity(intent);
    }
    public void RTifus(View view) {
        Intent intent = new Intent(RPdalam.this, RPDtifus.class);
        startActivity(intent);
    }
}
