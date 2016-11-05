package com.example.android.convertor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Nautical_Mile extends ActionBarActivity {

    Button showButtonNMile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nautical__mile);


        final EditText editTextNMile=(EditText)findViewById(R.id.editTextNMile);

        final TextView textView111mile=(TextView)findViewById(R.id.textView11nmile);
        final TextView textView222mile=(TextView)findViewById(R.id.textView22nmile);
        final TextView textView333mile=(TextView)findViewById(R.id.textView33nmile);
        final TextView textView444mile=(TextView)findViewById(R.id.textView44nmile);
        final TextView textView555mile=(TextView)findViewById(R.id.textView55nmile);
        final TextView textView666mile=(TextView)findViewById(R.id.textView66nmile);
        final TextView textView777mile=(TextView)findViewById(R.id.textView77nmile);
        final TextView textView888mile=(TextView)findViewById(R.id.textView88nmile);
        final TextView textView999mile=(TextView)findViewById(R.id.textView99nmile);

        showButtonNMile=(Button) findViewById(R.id.buttonShowNMile);
        showButtonNMile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editTextNMile.getText().toString();
                double num2,num3,num4,num5;
                int num = Integer.parseInt(value);
                double num1=(num * 1852000);
                textView111mile.setText(String.valueOf(num1));
                num2=(num * 185200);
                textView222mile.setText(String.valueOf(num2));
                num3=(num * 1852);
                textView333mile.setText(String.valueOf(num3));
                num4=(num * 1.852);
                textView444mile.setText(String.valueOf(num4));
                textView555mile.setText(String.valueOf(num * 6076.115495));
                double num6,num7,num8,num9;
                num6=num*72913.386308;
                textView666mile.setText(String.valueOf(num6));
                num7=num*1.1508;
                textView777mile.setText(String.valueOf(num7));
                num8=num*1;
                textView888mile.setText(String.valueOf(num8));
                num9=num*2025.371832;
                textView999mile.setText(String.valueOf(num9));


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_nautical__mile, menu);
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
