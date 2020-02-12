package com.example.obat9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RPkulit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpkulit);
    }
    public void RAlergi(View view) {
        Intent intent = new Intent(RPkulit.this, RPKalergi.class);
        startActivity(intent);
    }
    public void RBisul(View view) {
        Intent intent = new Intent(RPkulit.this, RPKbisul.class);
        startActivity(intent);
    }
    public void RCacar_Air(View view) {
        Intent intent = new Intent(RPkulit.this, RPKcacarair.class);
        startActivity(intent);
    }
    public void RCampak(View view) {
        Intent intent = new Intent(RPkulit.this, RPKcampak.class);
        startActivity(intent);
    }
    public void RKoreng(View view) {
        Intent intent = new Intent(RPkulit.this, RPKkoreng.class);
        startActivity(intent);
    }
    public void RKurap(View view) {
        Intent intent = new Intent(RPkulit.this, RPKkurap.class);
        startActivity(intent);
    }
    public void RKutil(View view) {
        Intent intent = new Intent(RPkulit.this, RPKkutil.class);
        startActivity(intent);
    }
    public void RKusta(View view) {
        Intent intent = new Intent(RPkulit.this, RPKkusta.class);
        startActivity(intent);
    }
    public void RLuka_Bakar(View view) {
        Intent intent = new Intent(RPkulit.this, RPKlukabakar.class);
        startActivity(intent);
    }
    public void RPanu(View view) {
        Intent intent = new Intent(RPkulit.this, RPKpanu.class);
        startActivity(intent);
    }
}
