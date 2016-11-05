package com.example.android.convertor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Feet extends ActionBarActivity {

    Button showButtonFeet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feet);

        final EditText editTextFeet=(EditText)findViewById(R.id.editTextF);

        final TextView textView11f=(TextView)findViewById(R.id.textView11f);
        final TextView textView22f=(TextView)findViewById(R.id.textView22f);
        final TextView textView33f=(TextView)findViewById(R.id.textView33f);
        final TextView textView44f=(TextView)findViewById(R.id.textView44f);
        final TextView textView55f=(TextView)findViewById(R.id.textView55f);
        final TextView textView66f=(TextView)findViewById(R.id.textView66f);
        final TextView textView77f=(TextView)findViewById(R.id.textView77f);
        final TextView textView88f=(TextView)findViewById(R.id.textView88f);
        final TextView textView99f=(TextView)findViewById(R.id.textView99f);

        showButtonFeet=(Button) findViewById(R.id.buttonShowF);
        showButtonFeet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editTextFeet.getText().toString();
                double num2,num3,num4,num5;
                int num = Integer.parseInt(value);
                double num1=(num * 304.8);
                textView11f.setText(String.valueOf(num1));
                num2=(num * 30.48);
                textView22f.setText(String.valueOf(num2));
                num3=(num * 0.3048);
                textView33f.setText(String.valueOf(num3));
                num4=(num * 0.000305);
                textView44f.setText(String.valueOf(num4));
                textView55f.setText(String.valueOf(num * 1));
                double num6,num7,num8,num9;
                num6=num*12;
                textView66f.setText(String.valueOf(num6));
                num7=num*0.000189;
                textView77f.setText(String.valueOf(num7));
                num8=num*0.000165;
                textView88f.setText(String.valueOf(num8));
                num9=num*0.33333;
                textView99f.setText(String.valueOf(num9));


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_feet, menu);
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
