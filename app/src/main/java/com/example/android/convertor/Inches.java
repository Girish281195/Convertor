package com.example.android.convertor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Inches extends ActionBarActivity {

    Button showButtonInch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inches);

        final EditText editTextInch=(EditText)findViewById(R.id.editTextI);

        final TextView textView11i=(TextView)findViewById(R.id.textView11i);
        final TextView textView22i=(TextView)findViewById(R.id.textView22i);
        final TextView textView33i=(TextView)findViewById(R.id.textView33i);
        final TextView textView44i=(TextView)findViewById(R.id.textView44i);
        final TextView textView55i=(TextView)findViewById(R.id.textView55i);
        final TextView textView66i=(TextView)findViewById(R.id.textView66i);
        final TextView textView77i=(TextView)findViewById(R.id.textView77i);
        final TextView textView88i=(TextView)findViewById(R.id.textView88i);
        final TextView textView99i=(TextView)findViewById(R.id.textView99i);

        showButtonInch=(Button) findViewById(R.id.buttonShowI);
        showButtonInch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editTextInch.getText().toString();
                double num2,num3,num4,num5;
                int num = Integer.parseInt(value);
                double num1=(num * 25.4);
                textView11i.setText(String.valueOf(num1));
                num2=(num * 2.54);
                textView22i.setText(String.valueOf(num2));
                num3=(num * 0.0254);
                textView33i.setText(String.valueOf(num3));
                num4=(num * 0.0000254);
                textView44i.setText(String.valueOf(num4));
                textView55i.setText(String.valueOf(num * 0.083333));
                double num6,num7,num8,num9;
                num6=num*1;
                textView66i.setText(String.valueOf(num6));
                num7=num*1.5783e-5;
                textView77i.setText(String.valueOf(num7));
                num8=num*1.3715e-5;
                textView88i.setText(String.valueOf(num8));
                num9=num*0.027778;
                textView99i.setText(String.valueOf(num9));


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_inches, menu);
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
