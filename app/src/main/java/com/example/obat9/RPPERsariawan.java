package com.example.obat9;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class RPPERsariawan extends AppCompatActivity {
    //Mendefinisikan MediaPlayer sebagai audioBackground
    MediaPlayer audioBackground;
    ImageButton myImageButton;
    /*Variabel untuk ToggleButton kita beri nama dengan myToggle*/
    ToggleButton myToggle;

    CarouselView carouselView;
    int[] sampleImages = {R.drawable.sariawan1, R.drawable.sariawan2, R.drawable.sariawan3};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rppersariawan);
        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

        //Memberi definisi di onCreate untuk toggle
        myToggle = (ToggleButton) findViewById(R.id.toggleSound);

        //Memanggil file my_sound pada folder raw
        audioBackground = MediaPlayer.create(this, R.raw.rssariawan);
        //Set looping ke true untuk mengulang audio jika telah selesai
        audioBackground.setLooping(false);
        //Set volume audio agar berbunyi
        audioBackground.setVolume(1,1);
        //Memulai audio
        audioBackground.start();
        //Memberi definisi di onCreate untuk imagebutton
        myImageButton = (ImageButton) findViewById(R.id.imageButton);
    }


    public  void  onImageButton (View view){
        audioBackground.seekTo(0);
        audioBackground.start();
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
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

    public void Jpenyakit(View view) {
        Intent intent = new Intent(RPPERsariawan.this, PAPERsariawan.class);
        startActivity(intent);
        audioBackground.stop();
        RPPERsariawan.this.finish();
    }

    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        audioBackground.stop();
        RPPERsariawan.this.finish();
    }
}

