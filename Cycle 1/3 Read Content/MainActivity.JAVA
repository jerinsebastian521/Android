package com.example.sjcet.readprint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view) {
        EditText edit = (EditText)findViewById(R.id.t1);
        TextView tview = (TextView)findViewById(R.id.txt1);
        String result = edit.getText().toString();
        tview.setText(result);
    }
}
