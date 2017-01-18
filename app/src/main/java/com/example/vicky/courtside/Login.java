package com.example.vicky.courtside;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.database.Cursor;
import android.widget.Toast;

public class Login extends AppCompatActivity  {

    private EditText value1;
    private EditText value;
    public final static String EXTRA_MESSAGE="com.example.vicky.courtside";
    private Button send;
    private Button sup;
    Button btn;
    DataManager dm;
    private EditText email;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn = (Button) findViewById(R.id.si);
        dm = new DataManager(this);

    }


    public void o(View v) { //this method should generate automatically
        boolean flag;
        email=(EditText)findViewById(R.id.usn);
        pass=(EditText)findViewById(R.id.pass);

        Intent intent=new Intent(this,user.class);
        flag=dm.valid(email.getText().toString(),pass.getText().toString());
        if(flag==true) {
            startActivity(intent);

            String msg=email.getText().toString();
            intent.putExtra(EXTRA_MESSAGE,msg);
            Toast.makeText(Login.this, "Loging in", Toast.LENGTH_SHORT).show();
            email.setText("");
            pass.setText("");
        }
        else
        {
            Toast.makeText(Login.this,"Invalid username or password",Toast.LENGTH_SHORT ).show();
            email.setText("");
            pass.setText("");
        }

    }


    public void s(View v) { //this method should generate automatically

        Intent intent=new Intent(this,signup.class);

        startActivity(intent);

    }


}
