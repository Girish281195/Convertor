package com.example.android.convertor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class KiloMeter extends ActionBarActivity {

    Button showButtonKm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kilo_meter);

        final EditText editTextKm1=(EditText)findViewById(R.id.editTextKm);

        final TextView textView11km=(TextView)findViewById(R.id.textView11km);
        final TextView textView22km=(TextView)findViewById(R.id.textView22km);
        final TextView textView33km=(TextView)findViewById(R.id.textView33km);
        final TextView textView44km=(TextView)findViewById(R.id.textView44km);
        final TextView textView55km=(TextView)findViewById(R.id.textView55km);
        final TextView textView66km=(TextView)findViewById(R.id.textView66km);
        final TextView textView77km=(TextView)findViewById(R.id.textView77km);
        final TextView textView88km=(TextView)findViewById(R.id.textView88km);
        final TextView textView99km=(TextView)findViewById(R.id.textView99km);

        showButtonKm=(Button) findViewById(R.id.buttonShowKm);
        showButtonKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editTextKm1.getText().toString();
                double num2,num3,num4,num5;
                int num = Integer.parseInt(value);
                double num1=(num * 1000000);
                textView11km.setText(String.valueOf(num1));
                num2=(num * 100000);
                textView22km.setText(String.valueOf(num2));
                num3=(num * 1000);
                textView33km.setText(String.valueOf(num3));
                num4=(num * 1);
                textView44km.setText(String.valueOf(num4));
                textView55km.setText(String.valueOf(num * 3280.8399));
                double num6,num7,num8,num9;
                num6=num*39370.7;
                textView66km.setText(String.valueOf(num6));
                num7=num*0.621371;
                textView77km.setText(String.valueOf(num7));
                num8=num*0.539957;
                textView88km.setText(String.valueOf(num8));
                num9=num*1093.61;
                textView99km.setText(String.valueOf(num9));


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kilo_meter, menu);
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
