package com.example.knightowl;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class TransportFormActivity extends AppCompatActivity {
    private Bundle b;

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
