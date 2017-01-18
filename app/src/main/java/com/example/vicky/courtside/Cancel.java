package com.example.vicky.courtside;

import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.google.common.collect.Range;

public class Cancel extends AppCompatActivity implements View.OnClickListener {

    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS = 0;
    DataManager dm;
    EditText bkid,phno;
    String message;
    ImageButton bt;
    int cid;
    private AwesomeValidation awesomeValidation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancel);

        Intent intent = getIntent();
        Bundle extra = intent.getExtras();
        cid=extra.getInt("custid");

        dm = new DataManager(this);
        bkid=(EditText)findViewById(R.id.bokid);
        phno=(EditText)findViewById(R.id.phno);
        bt = (ImageButton) findViewById(R.id.can);
        bt.setOnClickListener(this);
        message="Hello,your booking on Courtside with booking id "+bkid+" has been cancelled.";
        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
        awesomeValidation.addValidation(this, R.id.phno, "^[2-9]{2}[0-9]{8}$",R.string.mobileerror);

    }

    @Override
    public void onClick(View view) {

        if (awesomeValidation.validate()) {
            switch (cid) {
                case 1:
                    letsplay();
                    break;
                case 2:
                    power();
                    break;
                case 3:
                    matchday();
                    break;
                case 4:
                    xlr8();
                    break;
                case 5:
                    enlive();
                    break;
                case 6:
                    chinna();
                    break;
                case 7:
                    msg();
                    break;
                case 8:
                    uns();
                    break;
                case 9:
                    ar();
                    break;
                case 10:
                    ft();
                    break;
                case 11:
                    jp();
                    break;
                case 12:
                    pm();
                    break;
                case 13:
                    bd();
                    break;
                case 14:
                    ka();
                    break;
                case 15:
                    no();
                    break;
                case 16:
                    tp();
                    break;

                default:
                    Toast.makeText(this, "Invalid court name", Toast.LENGTH_SHORT).show();
            }
        }
        else {
            Toast.makeText(Cancel.this, "Enter all details correctly", Toast.LENGTH_SHORT).show();
        }

    }

    public void letsplay()
    {
        Boolean flag=false;

        flag=dm.dellp(bkid.getText().toString(),phno.getText().toString());
        if (flag==false)
        {
            Toast.makeText(this,"Enter a valid Booking Id or Phone Number",Toast.LENGTH_SHORT).show();
        }
        else {
            dm.deletelp(bkid.getText().toString(),phno.getText().toString());
            Toast.makeText(Cancel.this, "Booking has been Cancelled", Toast.LENGTH_SHORT).show();



            Intent intent=new Intent(getApplicationContext(),Cancel.class);


            PendingIntent pi= PendingIntent.getActivity(getApplicationContext(), 0, intent,0);



            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message,pi, null);
            Toast.makeText(getApplicationContext(), "SMS sent.",
                    Toast.LENGTH_LONG).show();
            //showData(dm.selectAll());
        }
    }
    public void power()
    {
        Boolean flag=false;

        flag=dm.delpp(bkid.getText().toString(),phno.getText().toString());
        if (flag==false)
        {
            Toast.makeText(this,"Enter a valid Booking Id or Phone Number",Toast.LENGTH_SHORT).show();
        }
        else {
            dm.deletepp(bkid.getText().toString(),phno.getText().toString());
            Toast.makeText(Cancel.this, "Booking has been Cancelled", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.",
                    Toast.LENGTH_LONG).show();

        }
    }

    public void matchday()
    {
        Boolean flag=false;

        flag=dm.delmd(bkid.getText().toString(),phno.getText().toString());
        if (flag==false)
        {
            Toast.makeText(this,"Enter a valid Booking Id or Phone Number",Toast.LENGTH_SHORT).show();
        }
        else {
            dm.deletemd(bkid.getText().toString(),phno.getText().toString());
            Toast.makeText(Cancel.this, "Booking has been Cancelled", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
           // Toast.makeText(getApplicationContext(), "SMS sent.",
                  //  Toast.LENGTH_LONG).show();
            phno.setText("");
            bkid.setText("");

        }
    }

    public void xlr8()
    {
        Boolean flag=false;

        flag=dm.delxl(bkid.getText().toString(),phno.getText().toString());
        if (flag==false)
        {
            Toast.makeText(this,"Enter a valid Booking Id or Phone Number",Toast.LENGTH_SHORT).show();
        }
        else {
            dm.deletexl(bkid.getText().toString(),phno.getText().toString());
            Toast.makeText(Cancel.this, "Booking has been Cancelled", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
           // Toast.makeText(getApplicationContext(), "SMS sent.",
                 //   Toast.LENGTH_LONG).show();

        }
    }

    public void ar()
    {
        Boolean flag=false;

        flag=dm.delar(bkid.getText().toString(),phno.getText().toString());
        if (flag==false)
        {
            Toast.makeText(this,"Enter a valid Booking Id or Phone Number",Toast.LENGTH_SHORT).show();
        }
        else {
            dm.deletear(bkid.getText().toString(),phno.getText().toString());
            Toast.makeText(Cancel.this, "Booking has been Cancelled", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
           // Toast.makeText(getApplicationContext(), "SMS sent.",
             //       Toast.LENGTH_LONG).show();

        }
    }

    public void ft()
    {
        Boolean flag=false;

        flag=dm.delft(bkid.getText().toString(),phno.getText().toString());
        if (flag==false)
        {
            Toast.makeText(this,"Enter a valid Booking Id or Phone Number",Toast.LENGTH_SHORT).show();
        }
        else {
            dm.deleteft(bkid.getText().toString(),phno.getText().toString());
            Toast.makeText(Cancel.this, "Booking has been Cancelled", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
          //  Toast.makeText(getApplicationContext(), "SMS sent.",
            //        Toast.LENGTH_LONG).show();

        }
    }

    public void jp()
    {
        Boolean flag=false;

        flag=dm.deljp(bkid.getText().toString(),phno.getText().toString());
        if (flag==false)
        {
            Toast.makeText(this,"Enter a valid Booking Id or Phone Number",Toast.LENGTH_SHORT).show();
        }
        else {
            dm.deletejp(bkid.getText().toString(),phno.getText().toString());
            Toast.makeText(Cancel.this, "Booking has been Cancelled", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
          //  Toast.makeText(getApplicationContext(), "SMS sent.",
            //        Toast.LENGTH_LONG).show();

        }
    }

    public void pm()
    {
        Boolean flag=false;

        flag=dm.delpm(bkid.getText().toString(),phno.getText().toString());
        if (flag==false)
        {
            Toast.makeText(this,"Enter a valid Booking Id or Phone Number",Toast.LENGTH_SHORT).show();
        }
        else {
            dm.deletepm(bkid.getText().toString(),phno.getText().toString());
            Toast.makeText(Cancel.this, "Booking has been Cancelled", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
           // Toast.makeText(getApplicationContext(), "SMS sent.",
             //       Toast.LENGTH_LONG).show();

        }
    }

    public void enlive()
    {
        Boolean flag=false;

        flag=dm.delen(bkid.getText().toString(),phno.getText().toString());
        if (flag==false)
        {
            Toast.makeText(this,"Enter a valid Booking Id or Phone Number",Toast.LENGTH_SHORT).show();
        }
        else {
            dm.deleteen(bkid.getText().toString(),phno.getText().toString());
            Toast.makeText(Cancel.this, "Booking has been Cancelled", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
           // Toast.makeText(getApplicationContext(), "SMS sent.",
             //       Toast.LENGTH_LONG).show();

        }
    }

    public void chinna()
    {
        Boolean flag=false;

        flag=dm.delcs(bkid.getText().toString(),phno.getText().toString());
        if (flag==false)
        {
            Toast.makeText(this,"Enter a valid Booking Id or Phone Number",Toast.LENGTH_SHORT).show();
        }
        else {
            dm.deletecs(bkid.getText().toString(),phno.getText().toString());
            Toast.makeText(Cancel.this, "Booking has been Cancelled", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
          //  Toast.makeText(getApplicationContext(), "SMS sent.",
            //        Toast.LENGTH_LONG).show();

        }
    }

    public void msg()
    {
        Boolean flag=false;

        flag=dm.delms(bkid.getText().toString(),phno.getText().toString());
        if (flag==false)
        {
            Toast.makeText(this,"Enter a valid Booking Id or Phone Number",Toast.LENGTH_SHORT).show();
        }
        else {
            dm.deletems(bkid.getText().toString(),phno.getText().toString());
            Toast.makeText(Cancel.this, "Booking has been Cancelled", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
          //  Toast.makeText(getApplicationContext(), "SMS sent.",
            //        Toast.LENGTH_LONG).show();

        }
    }

    public void uns()
    {
        Boolean flag=false;

        flag=dm.delus(bkid.getText().toString(),phno.getText().toString());
        if (flag==false)
        {
            Toast.makeText(this,"Enter a valid Booking Id or Phone Number",Toast.LENGTH_SHORT).show();
        }
        else {
            dm.deleteus(bkid.getText().toString(),phno.getText().toString());
            Toast.makeText(Cancel.this, "Booking has been Cancelled", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
           // Toast.makeText(getApplicationContext(), "SMS sent.",
             //       Toast.LENGTH_LONG).show();

        }
    }

    public void bd()
    {
        Boolean flag=false;

        flag=dm.delbd(bkid.getText().toString(),phno.getText().toString());
        if (flag==false)
        {
            Toast.makeText(this,"Enter a valid Booking Id or Phone Number",Toast.LENGTH_SHORT).show();
        }
        else {
            dm.deletebd(bkid.getText().toString(),phno.getText().toString());
            Toast.makeText(Cancel.this, "Booking has been Cancelled", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
          //  Toast.makeText(getApplicationContext(), "SMS sent.",
            //        Toast.LENGTH_LONG).show();

        }
    }

    public void ka()
    {
        Boolean flag=false;

        flag=dm.delks(bkid.getText().toString(),phno.getText().toString());
        if (flag==false)
        {
            Toast.makeText(this,"Enter a valid Booking Id or Phone Number",Toast.LENGTH_SHORT).show();
        }
        else {
            dm.deleteks(bkid.getText().toString(),phno.getText().toString());
            Toast.makeText(Cancel.this, "Booking has been Cancelled", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
           // Toast.makeText(getApplicationContext(), "SMS sent.",
             //       Toast.LENGTH_LONG).show();

        }
    }

    public void no()
    {
        Boolean flag=false;

        flag=dm.delno(bkid.getText().toString(),phno.getText().toString());
        if (flag==false)
        {
            Toast.makeText(this,"Enter a valid Booking Id or Phone Number",Toast.LENGTH_SHORT).show();
        }
        else {
            dm.deleteno(bkid.getText().toString(),phno.getText().toString());
            Toast.makeText(Cancel.this, "Booking has been Cancelled", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
           // Toast.makeText(getApplicationContext(), "SMS sent.",
             //       Toast.LENGTH_LONG).show();

        }
    }

    public void tp()
    {
        Boolean flag=false;

        flag=dm.delts(bkid.getText().toString(),phno.getText().toString());
        if (flag==false)
        {
            Toast.makeText(this,"Enter a valid Booking Id or Phone Number",Toast.LENGTH_SHORT).show();
        }
        else {
            dm.deletets(bkid.getText().toString(),phno.getText().toString());
            Toast.makeText(Cancel.this, "Booking has been Cancelled", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.",
                   Toast.LENGTH_LONG).show();

        }
    }
}
