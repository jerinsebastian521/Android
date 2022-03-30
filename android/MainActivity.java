package com.example.sjcet.shared;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     Button B1;


    }

    public void click(View.OnClickListener view) {
        EditText e1;
        EditText e2;
        EditText e3;
        EditText e4;
        EditText e5;
        EditText e6;

       SharedPreferences getpreferences=new getpreferences();

        e1=getpreferences((findViewById(R.id.editText7).toString()));
        e2=getpreferences((findViewById(R.id.editText8).toString()));
        e3=getpreferences((findViewById(R.id.editText9).toString()));
        e4=getpreferences((findViewById(R.id.editText10).toString()));
        e5=getpreferences((findViewById(R.id.editText11).toString()));
        e6=getpreferences((findViewById(R.id.editText12).toString()));


        isEmpty(e1);
        {
            e1.setError("enter fullname");
        }
        isEmpty(e2);
        {
            e2.setError("enter email");
        }
        isEmpty(e3);
        {
            e3.setError("enter mobile");
        }
        isEmpty(e4);
        {
            e4.setError("enter username");
        }
        isEmpty(e5);
        {
            e5.setError("enter password");
        }
        isEmpty(e6);
        {
            e6.setError("enter dob");
        }
    }
    private void isEmpty(EditText e1) {
    }


    private EditText getpreferences(String s) {
        Intent intent =new Intent(getApplicationContext(),Main2Activity.class);
        return null;
    }
}
