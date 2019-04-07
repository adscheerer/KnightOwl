package com.example.knightowl;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;

public class FirstSentActivity extends AppCompatActivity {
    private Bundle b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_sent);
        b = getIntent().getExtras();

        String p1 = b.getString("p1");
        String p2 = b.getString("p2");
        String p3 = b.getString("p3");
        String start = b.getString("start");
        String end = b.getString("dest");
        String name = b.getString("name");
        String license = b.getString("license");
        String message = "Your friend is traveling from " + start + " to " + end + " with " + name + " whose license plate is " + license;

        SmsManager smsManager = SmsManager.getDefault();

        smsManager.sendTextMessage(p1, null, message, null, null);
        smsManager.sendTextMessage(p2, null, message, null, null);
        smsManager.sendTextMessage(p3, null, message, null, null);

    }

    public void help(View view)
    {
        Intent intent = new Intent(this, HelpActivity.class); // to be changed
        intent.putExtras(b);
        startActivity(intent);
    }

    public void isBack(View view)
    {
        Intent intent = new Intent(this, ArrivedActivity.class); // to be changed
        intent.putExtras(b);
        startActivity(intent);
    }


}
