package com.example.knightowl;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telephony.SmsManager;
import android.view.View;

public class HelpActivity extends AppCompatActivity {
    private Bundle b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        b = getIntent().getExtras();

        String p1 = b.getString("p1");
        String p2 = b.getString("p2");
        String p3 = b.getString("p3");

        String message = "Your friend has signaled that their ride is unsafe, please alert local authorities.";

        SmsManager smsManager = SmsManager.getDefault();

        smsManager.sendTextMessage(p1, null, message, null, null);
        smsManager.sendTextMessage(p2, null, message, null, null);
        smsManager.sendTextMessage(p3, null, message, null, null);

    }

}
