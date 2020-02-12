package com.example.obat9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pdalam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdalam);
    }
    public void Anemia(View view) {
        Intent intent = new Intent(Pdalam.this, PDanemia.class);
        startActivity(intent);
    }

    public void Ginjal(View view) {
        Intent intent = new Intent(Pdalam.this, PDginjal.class);
        startActivity(intent);
    }
    public void Diabetes(View view) {
        Intent intent = new Intent(Pdalam.this, PDdiabetes.class);
        startActivity(intent);
    }
    public void Leuki(View view) {
        Intent intent = new Intent(Pdalam.this, PDleuki.class);
        startActivity(intent);
    }
    public void Malaria(View view) {
        Intent intent = new Intent(Pdalam.this, PDmalaria.class);
        startActivity(intent);
    }
    public void RadangMata(View view) {
        Intent intent = new Intent(Pdalam.this, PDradangmata.class);
        startActivity(intent);
    }
    public void Rematik(View view) {
        Intent intent = new Intent(Pdalam.this, PDrematik.class);
        startActivity(intent);
    }
    public void Stroke(View view) {
        Intent intent = new Intent(Pdalam.this, PDstroke.class);
        startActivity(intent);
    }
    public void TDT(View view) {
        Intent intent = new Intent(Pdalam.this, PDdarahtinggi.class);
        startActivity(intent);
    }
    public void Tifus(View view) {
        Intent intent = new Intent(Pdalam.this, PDtifus.class);
        startActivity(intent);
    }
}
