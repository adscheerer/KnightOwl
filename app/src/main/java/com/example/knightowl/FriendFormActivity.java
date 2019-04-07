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

public class FriendFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_form);

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage("3102561148", null, "hi", null, null);

        smsManager.sendTextMessage("2137096889", null, "hi", null, null);




    }
    public void next(View view)
    {
        Intent intent = new Intent(this, TransportFormActivity.class);

        Bundle extras = new Bundle();
        EditText p1 = findViewById(R.id.phone1);
        EditText p2 = findViewById(R.id.phone2);
        EditText p3 = findViewById(R.id.phone3);
        String value1 = p1.getText().toString();
        String value2 = p2.getText().toString();
        String value3 = p3.getText().toString();
        extras.putString("p1", value1);
        extras.putString("p2", value2);
        extras.putString("p3", value3);
        intent.putExtras(extras);
        startActivity(intent);
    }
}
