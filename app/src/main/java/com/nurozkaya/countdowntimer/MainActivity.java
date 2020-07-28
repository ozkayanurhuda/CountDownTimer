package com.nurozkaya.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        new CountDownTimer(10000,1000) { // 10 sanniye saysın istiyosak 10000,nasıl bir aralıkta saysın(saniyede bir dedik o da 1000)

            @Override
            public void onTick(long l) { //her 1 sn de bir ne yapayım
                textView.setText("Left: " +l/1000); // 10 9 8 7 diye inmesini sağlıyor

            }

            @Override
            public void onFinish() { // bitince ne yapayım
                Toast.makeText(getApplicationContext(),"Done!",Toast.LENGTH_LONG).show();
                textView.setText("Finished");

            }
        }.start(); // countdowntiemın parantezi
    }
}