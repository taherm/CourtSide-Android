package com.example.vicky.courtside;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Matchday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matchday);
    }

    public void navm(View v)
    {
        Uri gmmIntentUri = Uri.parse("google.navigation:q=match+day");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }

    public void book(View v)
    {
        Intent intent=new Intent(this,booking.class);
        Bundle extras = new Bundle();
        extras.putString("price","1000");
        extras.putString("court","Match Day");
        extras.putInt("cid",3);
        intent.putExtras(extras);
        startActivity(intent);

    }
    public void can(View v)
    {
        Intent intent=new Intent(this,Cancel.class);
        Bundle extra = new Bundle();
        extra.putInt("custid",3);
        intent.putExtras(extra);
        startActivity(intent);
    }
}
