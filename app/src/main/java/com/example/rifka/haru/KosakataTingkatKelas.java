package com.example.rifka.haru;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Rifka on 20/01/2018.
 */

public class KosakataTingkatKelas extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer sound;
    int idx = 0;

    ImageView satu, dua, tiga, empat, lima, enam, tujuh, delapan, sembilan, sepuluh, sebelas, duabelas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //layar fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_kosakata_tingkat_kelas);

        //button
        satu = (ImageView) findViewById(R.id.btn_satu);
        dua = (ImageView) findViewById(R.id.btn_dua);
        tiga = (ImageView) findViewById(R.id.btn_tiga);
        empat = (ImageView) findViewById(R.id.btn_empat);
        lima = (ImageView) findViewById(R.id.btn_lima);
        enam = (ImageView) findViewById(R.id.btn_enam);
        tujuh = (ImageView) findViewById(R.id.btn_tujuh);
        delapan = (ImageView) findViewById(R.id.btn_delapan);
        sembilan = (ImageView) findViewById(R.id.btn_sembilan);
        sepuluh = (ImageView) findViewById(R.id.btn_sepuluh);
        sebelas = (ImageView) findViewById(R.id.btn_sebelas);
        duabelas = (ImageView) findViewById(R.id.btn_duabelas);

        satu.setOnClickListener(this);
        dua.setOnClickListener(this);
        tiga.setOnClickListener(this);
        empat.setOnClickListener(this);
        lima.setOnClickListener(this);
        enam.setOnClickListener(this);
        tujuh.setOnClickListener(this);
        delapan.setOnClickListener(this);
        sembilan.setOnClickListener(this);
        sepuluh.setOnClickListener(this);
        sebelas.setOnClickListener(this);
        duabelas.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(sound != null){
            sound.stop();
        }
        switch (v.getId()){
            case R.id.btn_satu:
                sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.satu);
                sound.start();
                break;
            case R.id.btn_dua:
                sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.dua);
                sound.start();
                break;
            case R.id.btn_tiga:
                sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.tiga);
                sound.start();
                break;
            case R.id.btn_empat:
                sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.empat);
                sound.start();
                break;
            case R.id.btn_lima:
                sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.lima);
                sound.start();
                break;
            case R.id.btn_enam:
                sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.enam);
                sound.start();
                break;
            case R.id.btn_tujuh:
                sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.tujuh);
                sound.start();
                break;
            case R.id.btn_delapan:
                sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.delapan);
                sound.start();
                break;
            case R.id.btn_sembilan:
                sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.sembilan);
                sound.start();
                break;
            case R.id.btn_sepuluh:
                sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.sepuluh);
                sound.start();
                break;
            case R.id.btn_sebelas:
                sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.sebelas);
                sound.start();
                break;
            case R.id.btn_duabelas:
                sound = MediaPlayer.create(KosakataTingkatKelas.this, R.raw.duabelas);
                sound.start();
                break;
            default:
                break;
        }
    }
}