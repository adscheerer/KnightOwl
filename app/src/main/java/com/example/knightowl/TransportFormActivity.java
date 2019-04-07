package com.example.knightowl;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;

import com.example.knightowl.R;

public class TransportFormActivity extends AppCompatActivity {
    private Bundle b;
//    SmsManager smsManager = SmsManager.getDefualt();
//    smsManager.sendTextMessage("6262465503", null, "hi", null, null);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport_form);
        b = getIntent().getExtras();
    }

    public void submit(View view)
    {
        Intent intent = new Intent(this, FirstSentActivity.class);
        EditText start = findViewById(R.id.start);
        EditText dest = findViewById(R.id.dest);
        EditText name = findViewById(R.id.driver_name);
        EditText license = findViewById(R.id.license_plate);
        String value1 = start.getText().toString();
        String value2 = dest.getText().toString();
        String value3 = name.getText().toString();
        String value4 = license.getText().toString();
        b.putString("start", value1);
        b.putString("dest", value2);
        b.putString("name", value3);
        b.putString("license", value4);
        intent.putExtras(b);
        startActivity(intent);
    }

}
