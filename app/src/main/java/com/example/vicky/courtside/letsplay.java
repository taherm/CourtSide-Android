package com.example.vicky.courtside;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class letsplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letsplay);
    }

    public void navl(View v)
    {
        Uri gmmIntentUri = Uri.parse("google.navigation:q=lets+play");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }

    public void book(View v)
    {
        Intent intent=new Intent(this,booking.class);
        Bundle extras = new Bundle();
        extras.putString("price","2400");
        extras.putString("court","Lets Play");
        extras.putInt("cid",1);
        intent.putExtras(extras);
        startActivity(intent);

    }
    public void can(View v)
    {
        Intent intent=new Intent(this,Cancel.class);
        Bundle extra = new Bundle();
        extra.putInt("custid",1);
        intent.putExtras(extra);
        startActivity(intent);
    }
}
