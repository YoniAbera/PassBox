package com.example.yon.passbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StartingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);

        Thread starter = new Thread(){
          public void run(){
              try{
                  sleep(5000);
              }catch (InterruptedException e){

                  e.printStackTrace();

              } finally {

                  Intent i = new  Intent(getApplicationContext(),LoginActivity.class);
                  startActivity(i);

              }
          }
        };
        starter.start();
    }
}
