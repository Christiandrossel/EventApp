package com.dude.eventapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ladeEventList(View view){
        Intent i = new Intent(getApplicationContext(), EventListActivity.class);
        startActivity(i);
    }

    public void buttonClick(View view){
        Intent i = new Intent(getApplicationContext(), ImageListActivity.class);
        startActivity(i);
    }


}
