package com.example.vicky.courtside;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class football extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football);
    }

    public void xl(View v) { //this method should generate automatically

        Intent intent=new Intent(this,xlr.class);

        startActivity(intent);

    }

    public void pp(View v)
    {
        Intent intent=new Intent(this,Powerplay.class);

        startActivity(intent);
    }

    public void lp(View v)
    {
        Intent intent=new Intent(this,letsplay.class);

        startActivity(intent);
    }

    public void md(View v)
    {
        Intent intent=new Intent(this,Matchday.class);

        startActivity(intent);
    }
}
