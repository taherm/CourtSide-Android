package com.example.vicky.courtside;

import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.google.common.collect.Range;

public class booking extends AppCompatActivity implements View.OnClickListener {
    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS = 0;

    Spinner slot, da, mo, yar;
    DataManager dm;

    EditText name, book;
    EditText phno;
    EditText court;
    EditText pr;
    String crt;
    String sl;
    String dt, dte;
    SimpleDateFormat cdate;
    String mont;
    String yr;
    String bkid;
    String message;
    int bk;
    ImageButton b;
    Date d;
    int cid;
    private AwesomeValidation awesomeValidation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String price = extras.getString("price");
        String crt = extras.getString("court");
        cid=extras.getInt("cid");

        dm = new DataManager(this);
        Spinner dropdown = (Spinner) findViewById(R.id.spinnerslot);
        String[] items = new String[]{"6:00 to 7:00", "7:00 to 8:00", "8:00 to 9:00", "9:00 to 10:00", "16:00 to 17:00", "17:00 to 18:00", "18:00 to 19:00", "19:00 to 20:00", "20:00 to 21:00", "21:00 to 22:00"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        Spinner day = (Spinner) findViewById(R.id.spinnerday);
        String[] items1 = new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items1);
        day.setAdapter(adapter1);

        Spinner month = (Spinner) findViewById(R.id.spinnermon);
        String[] items2 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        month.setAdapter(adapter2);

        Spinner year = (Spinner) findViewById(R.id.spinneryr);
        String[] items3 = new String[]{"2016", "2017", "2018", "2019", "2020"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items3);
        year.setAdapter(adapter3);


        slot = (Spinner) findViewById(R.id.spinnerslot);
        da = (Spinner) findViewById(R.id.spinnerday);
        mo = (Spinner) findViewById(R.id.spinnermon);
        yar = (Spinner) findViewById(R.id.spinneryr);

        name = (EditText) findViewById(R.id.name);
        phno = (EditText) findViewById(R.id.phno);
        court = (EditText) findViewById(R.id.court);
        pr = (EditText) findViewById(R.id.price);

        Random r = new Random();
        bk = r.nextInt(999 - 100) + 100;

        b = (ImageButton) findViewById(R.id.bookbtn);
        b.setOnClickListener(this);

        court.setText(crt);
        pr.setText(price);

        bkid = (Integer.toString(bk));

        book = (EditText) findViewById(R.id.bkid);
        book.setText(bkid);

        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

        awesomeValidation.addValidation(this, R.id.name, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$",R.string.nameerror);
        awesomeValidation.addValidation(this, R.id.phno, "^[2-9]{2}[0-9]{8}$",R.string.mobileerror);


    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onClick(View view) {

        Cursor data;
        Boolean flag = false;
        crt = court.toString();
        sl = slot.getSelectedItem().toString();
        dte = da.getSelectedItem().toString();
        mont = mo.getSelectedItem().toString();
        yr = yar.getSelectedItem().toString();
        String lp = "Lets Play";
        dt = dte + "-" + mont + "-" + yr;

        // String bkid="123";
        message = "Dear " + name.getText().toString() + " your booking has been confirmed .Your Booking Id  " + bkid + " ,cost is " + pr.getText().toString() + " and your slot is " + slot.getSelectedItem().toString() + "";
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
            Toast.makeText(booking.this, "Enter all details correctly", Toast.LENGTH_SHORT).show();
        }




    }

    public void letsplay() {
        Boolean flag;
        flag = dm.lp(sl, dt);

        if (flag == true) {
            Toast.makeText(this, "This slot is already booked try another", Toast.LENGTH_SHORT).show();
        } else {

            dm.insertlp(bkid, court.getText().toString(), name.getText().toString(), phno.getText().toString(), slot.getSelectedItem().toString(), dt, pr.getText().toString());
            Toast.makeText(booking.this, "Booking has been completed", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.",
                    Toast.LENGTH_LONG).show();
            name.setText("");
            pr.setText("");
            phno.setText("");
            book.setText("");
        }
    }

    public void power() {
        Boolean flag1;
        flag1 = dm.pp(sl, dt);

        if (flag1 == true) {
            Toast.makeText(this, "This slot is already booked try another", Toast.LENGTH_SHORT).show();
        } else {

            dm.insertpp(bkid, court.getText().toString(), name.getText().toString(), phno.getText().toString(), slot.getSelectedItem().toString(), dt, pr.getText().toString());
            Toast.makeText(booking.this, "Booking has been completed", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.",
                    Toast.LENGTH_LONG).show();
            name.setText("");
            pr.setText("");
            phno.setText("");
            book.setText("");
        }
    }

    public void matchday() {
        Boolean flag2;
        flag2 = dm.md(sl, dt);

        if (flag2 == true) {
            Toast.makeText(this, "This slot is already booked try another", Toast.LENGTH_SHORT).show();
        } else {

            dm.insertmd(bkid, court.getText().toString(), name.getText().toString(), phno.getText().toString(), slot.getSelectedItem().toString(), dt, pr.getText().toString());
            Toast.makeText(booking.this, "Booking has been completed", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.",
                    Toast.LENGTH_LONG).show();
            name.setText("");
            pr.setText("");
            phno.setText("");
            book.setText("");
        }
    }

    public void xlr8() {
        Boolean flag3;
        flag3 = dm.xl(sl, dt);

        if (flag3 == true) {
            Toast.makeText(this, "This slot is already booked try another", Toast.LENGTH_SHORT).show();
        } else {

            dm.insertxl(bkid, court.getText().toString(), name.getText().toString(), phno.getText().toString(), slot.getSelectedItem().toString(), dt, pr.getText().toString());
            Toast.makeText(booking.this, "Booking has been completed", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.",
                    Toast.LENGTH_LONG).show();
            name.setText("");
            pr.setText("");
            phno.setText("");
            book.setText("");
        }
    }

    public void enlive() {
        Boolean flag3;
        flag3 = dm.en(sl, dt);

        if (flag3 == true) {
            Toast.makeText(this, "This slot is already booked try another", Toast.LENGTH_SHORT).show();
        } else {

            dm.inserten(bkid, court.getText().toString(), name.getText().toString(), phno.getText().toString(), slot.getSelectedItem().toString(), dt, pr.getText().toString());
            Toast.makeText(booking.this, "Booking has been completed", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.",
                    Toast.LENGTH_LONG).show();
            name.setText("");
            pr.setText("");
            phno.setText("");
            book.setText("");
        }
    }

    public void chinna() {
        Boolean flag3;
        flag3 = dm.cn(sl, dt);

        if (flag3 == true) {
            Toast.makeText(this, "This slot is already booked try another", Toast.LENGTH_SHORT).show();
        } else {

            dm.insertcn(bkid, court.getText().toString(), name.getText().toString(), phno.getText().toString(), slot.getSelectedItem().toString(), dt, pr.getText().toString());
            Toast.makeText(booking.this, "Booking has been completed", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.",
                    Toast.LENGTH_LONG).show();
            name.setText("");
            pr.setText("");
            phno.setText("");
            book.setText("");
        }
    }

    public void msg() {
        Boolean flag3;
        flag3 = dm.ms(sl, dt);

        if (flag3 == true) {
            Toast.makeText(this, "This slot is already booked try another", Toast.LENGTH_SHORT).show();
        } else {

            dm.insertms(bkid, court.getText().toString(), name.getText().toString(), phno.getText().toString(), slot.getSelectedItem().toString(), dt, pr.getText().toString());
            Toast.makeText(booking.this, "Booking has been completed", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.",
                    Toast.LENGTH_LONG).show();
            name.setText("");
            pr.setText("");
            phno.setText("");
            book.setText("");
        }
    }

    public void uns() {
        Boolean flag3;
        flag3 = dm.us(sl, dt);

        if (flag3 == true) {
            Toast.makeText(this, "This slot is already booked try another", Toast.LENGTH_SHORT).show();
        } else {

            dm.insertus(bkid, court.getText().toString(), name.getText().toString(), phno.getText().toString(), slot.getSelectedItem().toString(), dt, pr.getText().toString());
            Toast.makeText(booking.this, "Booking has been completed", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.",
                    Toast.LENGTH_LONG).show();
            name.setText("");
            pr.setText("");
            phno.setText("");
            book.setText("");
        }
    }

    public void ar() {
        Boolean flag3;
        flag3 = dm.ar(sl, dt);

        if (flag3 == true) {
            Toast.makeText(this, "This slot is already booked try another", Toast.LENGTH_SHORT).show();
        } else {

            dm.insertar(bkid, court.getText().toString(), name.getText().toString(), phno.getText().toString(), slot.getSelectedItem().toString(), dt, pr.getText().toString());
            Toast.makeText(booking.this, "Booking has been completed", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.",
                    Toast.LENGTH_LONG).show();
            name.setText("");
            pr.setText("");
            phno.setText("");
            book.setText("");
        }
    }

    public void ft() {
        Boolean flag3;
        flag3 = dm.ft(sl, dt);

        if (flag3 == true) {
            Toast.makeText(this, "This slot is already booked try another", Toast.LENGTH_SHORT).show();
        } else {

            dm.insertft(bkid, court.getText().toString(), name.getText().toString(), phno.getText().toString(), slot.getSelectedItem().toString(), dt, pr.getText().toString());
            Toast.makeText(booking.this, "Booking has been completed", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.",
                    Toast.LENGTH_LONG).show();
            name.setText("");
            pr.setText("");
            phno.setText("");
            book.setText("");
        }
    }

    public void jp() {
        Boolean flag3;
        flag3 = dm.jp(sl, dt);

        if (flag3 == true) {
            Toast.makeText(this, "This slot is already booked try another", Toast.LENGTH_SHORT).show();
        } else {

            dm.insertjp(bkid, court.getText().toString(), name.getText().toString(), phno.getText().toString(), slot.getSelectedItem().toString(), dt, pr.getText().toString());
            Toast.makeText(booking.this, "Booking has been completed", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.",
                    Toast.LENGTH_LONG).show();
            name.setText("");
            pr.setText("");
            phno.setText("");
            book.setText("");
        }
    }

    public void pm() {
        Boolean flag3;
        flag3 = dm.pm(sl, dt);

        if (flag3 == true) {
            Toast.makeText(this, "This slot is already booked try another", Toast.LENGTH_SHORT).show();
        } else {

            dm.insertpm(bkid, court.getText().toString(), name.getText().toString(), phno.getText().toString(), slot.getSelectedItem().toString(), dt, pr.getText().toString());
            Toast.makeText(booking.this, "Booking has been completed", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.",
                    Toast.LENGTH_LONG).show();
            name.setText("");
            pr.setText("");
            phno.setText("");
            book.setText("");
        }
    }

    public void bd() {
        Boolean flag3;
        flag3 = dm.bd(sl, dt);

        if (flag3 == true) {
            Toast.makeText(this, "This slot is already booked try another", Toast.LENGTH_SHORT).show();
        } else {

            dm.insertbd(bkid, court.getText().toString(), name.getText().toString(), phno.getText().toString(), slot.getSelectedItem().toString(), dt, pr.getText().toString());
            Toast.makeText(booking.this, "Booking has been completed", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.",
                    Toast.LENGTH_LONG).show();
            name.setText("");
            pr.setText("");
            phno.setText("");
            book.setText("");
        }
    }

    public void ka() {
        Boolean flag3;
        flag3 = dm.ka(sl, dt);

        if (flag3 == true) {
            Toast.makeText(this, "This slot is already booked try another", Toast.LENGTH_SHORT).show();
        } else {

            dm.insertka(bkid, court.getText().toString(), name.getText().toString(), phno.getText().toString(), slot.getSelectedItem().toString(), dt, pr.getText().toString());
            Toast.makeText(booking.this, "Booking has been completed", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.",
                    Toast.LENGTH_LONG).show();
            name.setText("");
            pr.setText("");
            phno.setText("");
            book.setText("");
        }
    }

    public void no() {
        Boolean flag3;
        flag3 = dm.no(sl, dt);

        if (flag3 == true) {
            Toast.makeText(this, "This slot is already booked try another", Toast.LENGTH_SHORT).show();
        } else {

            dm.insertno(bkid, court.getText().toString(), name.getText().toString(), phno.getText().toString(), slot.getSelectedItem().toString(), dt, pr.getText().toString());
            Toast.makeText(booking.this, "Booking has been completed", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.",
                    Toast.LENGTH_LONG).show();
            name.setText("");
            pr.setText("");
            phno.setText("");
            book.setText("");
        }
    }

    public void tp() {
        Boolean flag3;
        flag3 = dm.tp(sl, dt);

        if (flag3 == true) {
            Toast.makeText(this, "This slot is already booked try another", Toast.LENGTH_SHORT).show();
        } else {

            dm.inserttp(bkid, court.getText().toString(), name.getText().toString(), phno.getText().toString(), slot.getSelectedItem().toString(), dt, pr.getText().toString());
            Toast.makeText(booking.this, "Booking has been completed", Toast.LENGTH_SHORT).show();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phno.getText().toString(), null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.",
                    Toast.LENGTH_LONG).show();
            name.setText("");
            pr.setText("");
            phno.setText("");
            book.setText("");
        }
    }

}





   /* public static boolean isValidDate(String dt) throws ParseException, java.text.ParseException {
        Date date = (Date) new SimpleDateFormat("MM/dd/yyyy").parse(dt);
        return new Date().before(date);
    }*/


