package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void maps(View v){
        Intent it = new Intent(Intent.ACTION_VIEW);
        String url = "https://www.google.co.id/maps/place/KOS+PUTRA+EXCLUSIVE+PAK+BUDI/@-7.0186342,110.4651338,17z/data=!3m1!4b1!4m5!3m4!1s0x2e708d68253d4b83:0xd99f99e3d5081c6a!8m2!3d-7.0186395!4d110.4673225";
        it.setData(Uri.parse(url));
        startActivity(it);
    }

    public void panggil(View v){
        String Nomer = "085340028980";
        Intent memanggil = new Intent(Intent.ACTION_DIAL);
        memanggil.setData(Uri.fromParts("tel:",Nomer,null));
        startActivity(memanggil);
    }

    public void emai(View v){
        Intent it = new Intent(Intent.ACTION_VIEW);
        String url = "11202113310.dinus.aac.id";
        it.setData(Uri.parse(url));
        startActivity(it);

    }

}