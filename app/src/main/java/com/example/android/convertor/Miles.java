package com.example.android.convertor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Miles extends ActionBarActivity {

    Button showButtonMile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miles);

        final EditText editTextMile=(EditText)findViewById(R.id.editTextMile);

        final TextView textView11mile=(TextView)findViewById(R.id.textView11mile);
        final TextView textView22mile=(TextView)findViewById(R.id.textView22mile);
        final TextView textView33mile=(TextView)findViewById(R.id.textView33mile);
        final TextView textView44mile=(TextView)findViewById(R.id.textView44mile);
        final TextView textView55mile=(TextView)findViewById(R.id.textView55mile);
        final TextView textView66mile=(TextView)findViewById(R.id.textView66mile);
        final TextView textView77mile=(TextView)findViewById(R.id.textView77mile);
        final TextView textView88mile=(TextView)findViewById(R.id.textView88mile);
        final TextView textView99mile=(TextView)findViewById(R.id.textView99mile);

        showButtonMile=(Button) findViewById(R.id.buttonShowMile);
        showButtonMile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editTextMile.getText().toString();
                double num2,num3,num4,num5;
                int num = Integer.parseInt(value);
                double num1=(num * 1609344);
                textView11mile.setText(String.valueOf(num1));
                num2=(num * 160934.4);
                textView22mile.setText(String.valueOf(num2));
                num3=(num * 1609.344);
                textView33mile.setText(String.valueOf(num3));
                num4=(num * 1.609344);
                textView44mile.setText(String.valueOf(num4));
                textView55mile.setText(String.valueOf(num * 5280));
                double num6,num7,num8,num9;
                num6=num*63360;
                textView66mile.setText(String.valueOf(num6));
                num7=num*1;
                textView77mile.setText(String.valueOf(num7));
                num8=num*0.868961;
                textView88mile.setText(String.valueOf(num8));
                num9=num*1760;
                textView99mile.setText(String.valueOf(num9));


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_miles, menu);
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
