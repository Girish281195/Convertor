package com.example.android.convertor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Meters extends ActionBarActivity {

    Button showButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meters);

        final EditText editText111=(EditText)findViewById(R.id.editTextM);

        final TextView textView11m=(TextView)findViewById(R.id.textView11m);
        final TextView textView22m=(TextView)findViewById(R.id.textView22m);
        final TextView textView33m=(TextView)findViewById(R.id.textView33m);
        final TextView textView44m=(TextView)findViewById(R.id.textView44m);
        final TextView textView55m=(TextView)findViewById(R.id.textView55m);
        final TextView textView66m=(TextView)findViewById(R.id.textView66m);
        final TextView textView77m=(TextView)findViewById(R.id.textView77m);
        final TextView textView88m=(TextView)findViewById(R.id.textView88m);
        final TextView textView99m=(TextView)findViewById(R.id.textView99m);

        showButton2=(Button) findViewById(R.id.buttonShowM);
        showButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText111.getText().toString();
                double num2,num3,num4,num5;
                int num = Integer.parseInt(value);
                double num1=(num * 1000);
                textView11m.setText(String.valueOf(num1));
                num2=(num * 100);
                textView22m.setText(String.valueOf(num2));
                num3=(num * 1);
                textView33m.setText(String.valueOf(num3));
                num4=(num * 0.001);
                textView44m.setText(String.valueOf(num4));
                textView55m.setText(String.valueOf(num * 3.2808399));
                double num6,num7,num8,num9;
                num6=num*39.3701;
                textView66m.setText(String.valueOf(num6));
                num7=num*0.000621371;
                textView77m.setText(String.valueOf(num7));
                num8=num*0.000539957;
                textView88m.setText(String.valueOf(num8));
                num9=num*1.09361;
                textView99m.setText(String.valueOf(num9));


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_meters, menu);
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
