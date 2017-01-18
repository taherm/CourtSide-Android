package com.example.vicky.courtside;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class badminton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badminton);
    }

    public void bull(View v) { //this method should generate automatically

        Intent intent=new Intent(this,argon.class);

        startActivity(intent);

    }

    public void ken(View v)
    {
        Intent intent=new Intent(this,Ftouch.class);

        startActivity(intent);
    }

    public void noah(View v)
    {
        Intent intent=new Intent(this,namma.class);

        startActivity(intent);
    }

    public void tps(View v)
    {
        Intent intent=new Intent(this,playmania.class);

        startActivity(intent);
    }
}
