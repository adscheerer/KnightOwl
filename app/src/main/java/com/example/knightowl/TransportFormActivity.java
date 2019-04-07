package com.example.knightowl;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class TransportFormActivity extends AppCompatActivity {
    private String phone1;
    private String phone2;
    private String phone3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport_form);
        Bundle extras = getIntent().getExtras();
        phone1 = extras.getString("p1");
        phone2 = extras.getString("p2");
        phone2 = extras.getString("p3");
    }

}
