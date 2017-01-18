package com.example.vicky.courtside;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cricket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricket);
    }

    public void enliven(View v) { //this method should generate automatically

        Intent intent=new Intent(this,Enlivensports.class);

        startActivity(intent);

    }

    public void mg(View v)
    {
        Intent intent=new Intent(this,Magniumsports.class);

        startActivity(intent);
    }

    public void ms(View v)
    {
        Intent intent=new Intent(this,Msground.class);

        startActivity(intent);
    }

    public void utd(View v)
    {
        Intent intent=new Intent(this,unitedsports.class);

        startActivity(intent);
    }
}
