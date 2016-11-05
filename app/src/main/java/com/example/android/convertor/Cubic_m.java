package com.example.android.convertor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Cubic_m extends ActionBarActivity {

    public Button showButtonVol123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubic_m);

        final EditText editText=(EditText)findViewById(R.id.editText1V);

        final TextView textView1=(TextView)findViewById(R.id.textView11v);
        final TextView textView2=(TextView)findViewById(R.id.textView22v);
        final TextView textView3=(TextView)findViewById(R.id.textView33v);
        final TextView textView4=(TextView)findViewById(R.id.textView44v);
        final TextView textView5=(TextView)findViewById(R.id.textView55v);
        final TextView textView6=(TextView)findViewById(R.id.textView66v);
        final TextView textView7=(TextView)findViewById(R.id.textView77v);

        showButtonVol123=(Button) findViewById(R.id.buttonShow1V);
        showButtonVol123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText.getText().toString();
                double num2, num3, num4, num5;
                int num = Integer.parseInt(value);
                double num1 = (num * 1000000);
                textView1.setText(String.valueOf(num1));
                num2 = (num * 1);
                textView2.setText(String.valueOf(num2));
                num3 = (num * 35.32);
                textView3.setText(String.valueOf(num3));
                num4 = (num * 220);
                textView4.setText(String.valueOf(num4));
                textView5.setText(String.valueOf(num * 61024));
                double num6, num7, num8, num9;
                num6 = num * 1000;
                textView6.setText(String.valueOf(num6));
                num7 = num * 1.308;
                textView7.setText(String.valueOf(num7));


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cubic_m, menu);
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
