package com.example.vicky.courtside;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tennis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tennis);
    }

    public void bull(View v) { //this method should generate automatically

        Intent intent=new Intent(this,bulldog.class);

        startActivity(intent);

    }

    public void ken(View v)
    {
        Intent intent=new Intent(this,kinesis.class);

        startActivity(intent);
    }

    public void noah(View v)
    {
        Intent intent=new Intent(this,noah.class);

        startActivity(intent);
    }

    public void tps(View v)
    {
        Intent intent=new Intent(this,topspin.class);

        startActivity(intent);
    }
}
