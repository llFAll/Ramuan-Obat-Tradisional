package com.example.obat9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Kuis extends AppCompatActivity {
    LinearLayout mlinePilGan;	//variabel baru bertipe LinearLayout

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);
        //menyambungkan variabel pada MainActivity.java dengan id pada activity_main
        //pastikan tipe data variabel dengan view id sama
        mlinePilGan = (LinearLayout) findViewById(R.id.linePilGan);

        //memberi aksi ketika diklik
        mlinePilGan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //hasil aksinya ditulis disini (dalam method onClick)
                //pada kali ini hasil yang diinginkan adalah pindah activity, maka

                //membuat objek baru dari kelas intent,
                //dari MainActivity akan pindah ke KuisPilihaGanda
                Intent i = new Intent(Kuis.this, KuisPilihanGanda.class);
                startActivity(i); //jalankan Intent
                finish();
            }
        });

    }
    public void MulaiKuis(View view) {
        Intent intent = new Intent(Kuis.this, KuisPilihanGanda.class);
        startActivity(intent);
    }

}
