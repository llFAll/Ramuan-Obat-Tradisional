package com.example.obat9;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ToggleButton;

public class PAPENradangususbuntu extends AppCompatActivity {
    //Mendefinisikan MediaPlayer sebagai audioBackground
    MediaPlayer audioBackground;
    ImageButton myImageButton;
    /*Variabel untuk ToggleButton kita beri nama dengan myToggle*/
    ToggleButton myToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_papenradangususbuntu);
        //Memberi definisi di onCreate untuk toggle
        myToggle = (ToggleButton) findViewById(R.id.toggleSound);

        //Memanggil file my_sound pada folder raw
        audioBackground = MediaPlayer.create(this, R.raw.suara018radangususbuntu);
        //Set looping ke true untuk mengulang audio jika telah selesai
        audioBackground.setLooping(false);
        //Set volume audio agar berbunyi
        audioBackground.setVolume(1,1);
        //Memulai audio
        audioBackground.start(); //Memberi definisi di onCreate untuk imagebutton
        myImageButton = (ImageButton) findViewById(R.id.imageButton);
    }


    public  void  onImageButton (View view){
        audioBackground.seekTo(0);
        audioBackground.start();
    }

	/*Mendefinisikan fungsi onToggleClicked dengan
	pengkondisian standar if/else*/

    public void onToggleClicked(View view) {
        boolean on = ((ToggleButton) view).isChecked();

        if (on)
        {
            /*Mematikan suara audio*/
            audioBackground.pause();
        } else
        {
            /*Menghidupkan kembali audio background*/
            audioBackground.start();
        }
    }


    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        audioBackground.stop();
        PAPENradangususbuntu.this.finish();
    }
    public void Rradangususbuntu(View view) {
        Intent intent = new Intent(PAPENradangususbuntu.this, RPPENususbuntu.class);
        startActivity(intent);
        audioBackground.stop();
        PAPENradangususbuntu.this.finish();
    }
}