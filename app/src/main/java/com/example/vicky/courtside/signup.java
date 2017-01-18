package com.example.vicky.courtside;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.google.common.collect.Range;

import java.util.Random;

public class signup extends AppCompatActivity implements View.OnClickListener {

    private EditText cname;
    private EditText email;
    private EditText pass;
    private EditText phno;
    Button btn;
    DataManager dm;
    static String otp,otp2;
    int num,flag=0;
    EditText ot;
    private AwesomeValidation awesomeValidation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        btn = (Button) findViewById(R.id.btn);
        dm = new DataManager(this);
        btn.setOnClickListener(this);
        cname = (EditText) findViewById(R.id.bkid);
        email = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.passwrd);
        phno = (EditText) findViewById(R.id.phno);
        ot=(EditText)findViewById(R.id.ot);

        Random r = new Random();
        num = r.nextInt(999 - 100) + 100;
        otp=(Integer.toString(num));
        otp2=(Integer.toString(num));
        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);


        awesomeValidation.addValidation(this, R.id.bkid, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$",R.string.nameerror);
        awesomeValidation.addValidation(this, R.id.email, Patterns.EMAIL_ADDRESS,R.string.emailerror);
        awesomeValidation.addValidation(this, R.id.phno, "^[2-9]{2}[0-9]{8}$",R.string.mobileerror);
    }




    public void s(View v) {


        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Mail m = new Mail("courtside.blr@gmail.com", "vickytheboss");

        String[] toArr = {email.getText().toString()};
        m.setTo(toArr);
        String s="Hello "+cname.getText().toString()+" your OTP is : "+otp+" .Thanks for joining Courtside.";
        m.setBody(s);


        try {


            if (m.send()) {
                Toast.makeText(this, "Email was sent successfully.", Toast.LENGTH_LONG).show();
                flag=1;
            } else {
                Toast.makeText(this, "Email was not sent.", Toast.LENGTH_LONG).show();
            }
        } catch (Exception e) {
            //Toast.makeText(MailApp.this, "There was a problem sending the email.", Toast.LENGTH_LONG).show();
            Log.e("MailApp", "Could not send email", e);
        }
    }




    @Override
    public void onClick(View v) {

        String chk=ot.getText().toString();
        if (awesomeValidation.validate()) {

           if(chk.equals(otp)) {
                dm.insert(cname.getText().toString(),
                        email.getText().toString(), pass.getText().toString(), phno.getText().toString());
                Toast.makeText(signup.this, "Record has been saved", Toast.LENGTH_SHORT).show();
                cname.setText("");
                email.setText("");
                phno.setText("");
                pass.setText("");
               ot.setText("");
            } else {
                Toast.makeText(signup.this, "Enter the OTP correctly", Toast.LENGTH_SHORT).show();
            }
        }
         else {
            Toast.makeText(signup.this, "Enter all details correctly", Toast.LENGTH_SHORT).show();
        }

        /**
         * Created by Vicky on 18-10-2016.
         */

    }
}
