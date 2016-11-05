package com.example.android.convertor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Yards extends ActionBarActivity {

    Button showButtonYard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yards);

        final EditText editTextY=(EditText)findViewById(R.id.editTextY);

        final TextView textView11y=(TextView)findViewById(R.id.textView11y);
        final TextView textView22y=(TextView)findViewById(R.id.textView22y);
        final TextView textView33y=(TextView)findViewById(R.id.textView33y);
        final TextView textView44y=(TextView)findViewById(R.id.textView44y);
        final TextView textView55y=(TextView)findViewById(R.id.textView55y);
        final TextView textView66y=(TextView)findViewById(R.id.textView66y);
        final TextView textView77y=(TextView)findViewById(R.id.textView77y);
        final TextView textView88y=(TextView)findViewById(R.id.textView88y);
        final TextView textView99y=(TextView)findViewById(R.id.textView99y);

        showButtonYard=(Button) findViewById(R.id.buttonShowY);
        showButtonYard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editTextY.getText().toString();
                double num2,num3,num4,num5;
                int num = Integer.parseInt(value);
                double num1=(num * 914.4);
                textView11y.setText(String.valueOf(num1));
                num2=(num * 91.44);
                textView22y.setText(String.valueOf(num2));
                num3=(num * 0.9144);
                textView33y.setText(String.valueOf(num3));
                num4=(num * 0.000914);
                textView44y.setText(String.valueOf(num4));
                textView55y.setText(String.valueOf(num * 3));
                double num6,num7,num8,num9;
                num6=num*36;
                textView66y.setText(String.valueOf(num6));
                num7=num*0.000568;
                textView77y.setText(String.valueOf(num7));
                num8=num*0.000494;
                textView88y.setText(String.valueOf(num8));
                num9=num*1;
                textView99y.setText(String.valueOf(num9));


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_yards, menu);
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
