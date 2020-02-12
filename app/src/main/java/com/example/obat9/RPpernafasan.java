package com.example.obat9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RPpernafasan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rppernafasan);
    }
    public void RAsma(View view) {
        Intent intent = new Intent(RPpernafasan.this, RPPERasma.class);
        startActivity(intent);
    }
    public void RBatuk(View view) {
        Intent intent = new Intent(RPpernafasan.this, RPPERbatuk.class);
        startActivity(intent);
    }
    public void RBronkitis(View view) {
        Intent intent = new Intent(RPpernafasan.this, RPPERbronkitis.class);
        startActivity(intent);
    }
    public void RDifteri(View view) {
        Intent intent = new Intent(RPpernafasan.this, RPPERdifteri.class);
        startActivity(intent);
    }
    public void RFLu(View view) {
        Intent intent = new Intent(RPpernafasan.this, RPPERflu.class);
        startActivity(intent);
    }
    public void RGondongan(View view) {
        Intent intent = new Intent(RPpernafasan.this, RPPERgondongan.class);
        startActivity(intent);
    }
    public void RPeluritis(View view) {
        Intent intent = new Intent(RPpernafasan.this, RPPERpleuritis.class);
        startActivity(intent);
    }
    public void RAmandel(View view) {
        Intent intent = new Intent(RPpernafasan.this, RPPERamandel.class);
        startActivity(intent);
    }
    public void RSariawan(View view) {
        Intent intent = new Intent(RPpernafasan.this, RPPERsariawan.class);
        startActivity(intent);
    }
    public void RTBC(View view) {
        Intent intent = new Intent(RPpernafasan.this, RPPERtbc.class);
        startActivity(intent);
    }
}
