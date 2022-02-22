package com.example.sjcet.option;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menumain,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
         switch (item.getItemId()){
             case  R.id.m1:
                 Toast.makeText(this,
                         "emergency clicked", Toast.LENGTH_LONG).show();
                 return true;
             case R.id.m2:
                 Toast.makeText(this,
                         "profile clicked", Toast.LENGTH_LONG).show();
                 return true;
             case R.id.m3:
                 Toast.makeText(this,
                         "about clicked", Toast.LENGTH_LONG).show();
                 return true;
             case R.id.m4:
                 Toast.makeText(this,
                         "signout clicked", Toast.LENGTH_LONG).show();
                 return true;
             default:
                 return super.onOptionsItemSelected(item);
         }

    }
}
