package com.example.obat9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private static final int TIME_INTERVAL=2000;
    private long mBackPressed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Jpenyakit(View view) {
        Intent intent = new Intent(MainActivity.this, Jpenyakit.class);
        startActivity(intent);
    }

    public void Rpenyakit(View view) {
        Intent intent = new Intent(MainActivity.this, Rpenyakit.class);
        startActivity(intent);
    }
    public void Nobat(View view) {
        Intent intent = new Intent(MainActivity.this, Nobat.class);
        startActivity(intent);
    }
    public void Tentang(View view) {
        Intent intent = new Intent(MainActivity.this, Tentang.class);
        startActivity(intent);
    }
    public void Tutorial(View view) {
        Intent intent = new Intent(MainActivity.this, Tutorial.class);
        startActivity(intent);
    }
    public void Bantuan(View view) {
        Intent intent = new Intent(MainActivity.this, Bantuan.class);
        startActivity(intent);
    }
    public void Kuis(View view) {
        Intent intent = new Intent(MainActivity.this, Kuis.class);
        startActivity(intent);
    }
    public void onBackPressed() {
        Intent StarMain =new Intent(Intent.ACTION_MAIN);
        StarMain.addCategory(Intent.CATEGORY_HOME);
        StarMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(StarMain);
    }
}

