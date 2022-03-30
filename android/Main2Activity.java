package com.example.sjcet.shared;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.text.BreakIterator;

public class Main2Activity extends AppCompatActivity {

    private BreakIterator getPreferences;
    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        public void click(View.OnClickListener view)
        {
            TextView t1, t2, t3, t4, t5, t6;
            t1 = getPreferences.setText(findViewById(R.id.t1));
            t2 = getPreferences.setText(findViewById(R.id.t2));
            t3 = getPreferences.setText(findViewById(R.id.t3));
            t4 = getPreferences.setText(findViewById(R.id.t4));
            t5 = getPreferences.setText(findViewById(R.id.t5));
            t6 = getPreferences.setText(findViewById(R.id.t6));
        }
    }

}
