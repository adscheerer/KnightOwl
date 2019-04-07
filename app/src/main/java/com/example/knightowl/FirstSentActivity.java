package com.example.knightowl;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class FirstSentActivity extends AppCompatActivity {
    private Bundle b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_sent);
        b = getIntent().getExtras();
    }

    public void help(View view)
    {
        Intent intent = new Intent(this, FirstSentActivity.class); // to be changed
        intent.putExtras(b);
        startActivity(intent);
    }

    public void isBack(View view)
    {
        Intent intent = new Intent(this, FirstSentActivity.class); // to be changed
        intent.putExtras(b);
        startActivity(intent);
    }


}
