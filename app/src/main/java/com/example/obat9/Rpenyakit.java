package com.example.obat9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Rpenyakit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpenyakit);
    }
    public void RPdalam(View view) {
        Intent intent = new Intent(Rpenyakit.this, RPdalam.class);
        startActivity(intent);
    }
    public void RPkulit(View view) {
        Intent intent = new Intent(Rpenyakit.this, RPkulit.class);
        startActivity(intent);
    }
    public void RPpencernaan(View view) {
        Intent intent = new Intent(Rpenyakit.this, RPpencernaan.class);
        startActivity(intent);
    }
    public void RPpernafasan(View view) {
        Intent intent = new Intent(Rpenyakit.this, RPpernafasan.class);
        startActivity(intent);
    }
    public void RPgangguankewanitaan(View view) {
        Intent intent = new Intent(Rpenyakit.this, RPganguankewanitaan.class);
        startActivity(intent);
    }
}
