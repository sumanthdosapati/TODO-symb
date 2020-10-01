package com.symb.todo;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.symb.todo.view.MainActivity;

public class Splash extends AppCompatActivity {

    private static int SPLASH_TIME_OUT =1200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent n=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(n);
                finish();
            }
        },SPLASH_TIME_OUT);
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        finish();





    }
}