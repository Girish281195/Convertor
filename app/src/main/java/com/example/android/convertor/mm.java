package com.example.android.convertor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class mm extends ActionBarActivity {

    Button showButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mm);

        final EditText editText11=(EditText)findViewById(R.id.editText1);

        final TextView textView11=(TextView)findViewById(R.id.textView11);
        final TextView textView22=(TextView)findViewById(R.id.textView22);
        final TextView textView33=(TextView)findViewById(R.id.textView33);
        final TextView textView44=(TextView)findViewById(R.id.textView44);
        final TextView textView55=(TextView)findViewById(R.id.textView55);
        final TextView textView66=(TextView)findViewById(R.id.textView66);
        final TextView textView77=(TextView)findViewById(R.id.textView77);
        final TextView textView88=(TextView)findViewById(R.id.textView88);
        final TextView textView99=(TextView)findViewById(R.id.textView99);

        showButton1=(Button) findViewById(R.id.buttonShow1);
        showButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText11.getText().toString();
                double num2,num3,num4,num5;
                int num = Integer.parseInt(value);
                double num1=(num * 10);
                textView11.setText(String.valueOf(num1));
                num2=(num * 1);
                textView22.setText(String.valueOf(num2));
                num3=(num * 0.01);
                textView33.setText(String.valueOf(num3));
                num4=(num * 0.00001);
                textView44.setText(String.valueOf(num4));
                textView55.setText(String.valueOf(num * 0.032808399));
                double num6,num7,num8,num9;
                num6=num*0.0393707;
                textView66.setText(String.valueOf(num6));
                num7=num*6.2137e-6;
                textView77.setText(String.valueOf(num7));
                num8=num*5.3996e-6;
                textView88.setText(String.valueOf(num8));
                num9=num*0.0109361;
                textView99.setText(String.valueOf(num9));


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mm, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
