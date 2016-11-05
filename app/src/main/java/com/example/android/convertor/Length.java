package com.example.android.convertor;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

public class Length extends ActionBarActivity{

    public Button showButton;
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        final EditText editText=(EditText)findViewById(R.id.editText);

        final TextView textView1=(TextView)findViewById(R.id.textView1);
        final TextView textView2=(TextView)findViewById(R.id.textView2);
        final TextView textView3=(TextView)findViewById(R.id.textView3);
        final TextView textView4=(TextView)findViewById(R.id.textView4);
        final TextView textView5=(TextView)findViewById(R.id.textView5);
        final TextView textView6=(TextView)findViewById(R.id.textView6);
        final TextView textView7=(TextView)findViewById(R.id.textView7);
        final TextView textView8=(TextView)findViewById(R.id.textView8);
        final TextView textView9=(TextView)findViewById(R.id.textView9);

        showButton=(Button) findViewById(R.id.buttonShow);
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText.getText().toString();
                double num2,num3,num4,num5;
                int num = Integer.parseInt(value);
                double num1=(num * 1);
                textView1.setText(String.valueOf(num1));
                num2=(num * 0.1);
                textView2.setText(String.valueOf(num2));
                num3=(num * 0.001);
                textView3.setText(String.valueOf(num3));
                num4=(num * 0.000001);
                textView4.setText(String.valueOf(num4));
                textView5.setText(String.valueOf(num/(12*25.4)));
                double num6,num7,num8,num9;
                num6=num*0.0393701;
                textView6.setText(String.valueOf(num6));
                num7=num*6.2137e-7;
                textView7.setText(String.valueOf(num7));
                num8=num*5.3996e-7;
                textView8.setText(String.valueOf(num8));
                num9=num*0.00109361;
                textView9.setText(String.valueOf(num9));


            }
        });

        spinner=(Spinner)findViewById(R.id.spinner);
        adapter=ArrayAdapter.createFromResource(this, R.array.len, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onItemSelected(AdapterView<?> arg0, View view,
                                       int position, long row_id) {
                final Intent intent,intentMeter,intentKilo,intentFeet,intentInch,intentMile,intentNMile,intentYard;
                //intent = new Intent(Length.this,Length.class);
                switch(position){
                    case 1:
                        intent = new Intent(Length.this, mm.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intentMeter = new Intent(Length.this, Meters.class);
                        startActivity(intentMeter);
                        break;
                    case 3:
                        intentKilo = new Intent(Length.this, KiloMeter.class);
                        startActivity(intentKilo);
                        break;
                    case 4:
                        intentFeet = new Intent(Length.this, Feet.class);
                        startActivity(intentFeet);
                        break;
                    case 5:
                        intentInch = new Intent(Length.this, Inches.class);
                        startActivity(intentInch);
                        break;
                    case 6:
                        intentMile = new Intent(Length.this, Miles.class);
                        startActivity(intentMile);
                        break;
                    case 7:
                        intentNMile = new Intent(Length.this, Nautical_Mile.class);
                        startActivity(intentNMile);
                        break;
                    case 8:
                        intentYard = new Intent(Length.this, Yards.class);
                        startActivity(intentYard);
                        break;

// and so on
// .....

                }
                //startActivity(intent);

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_length, menu);
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

    //@Override
    /*public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView myText=(TextView)view;
        //textView1.setText(String.valueOf(number));
        TextView textView1=(TextView)findViewById(R.id.textView1);
        textView1.setText(myText.toString());
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }                           */
}







