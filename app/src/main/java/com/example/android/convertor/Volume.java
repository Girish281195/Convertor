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


public class Volume extends ActionBarActivity {

    public Button showButtonVol;
    Spinner spinner3;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);

        final EditText editText=(EditText)findViewById(R.id.editTextV);

        final TextView textView1=(TextView)findViewById(R.id.textView1v);
        final TextView textView2=(TextView)findViewById(R.id.textView2v);
        final TextView textView3=(TextView)findViewById(R.id.textView3v);
        final TextView textView4=(TextView)findViewById(R.id.textView4v);
        final TextView textView5=(TextView)findViewById(R.id.textView5v);
        final TextView textView6=(TextView)findViewById(R.id.textView6v);
        final TextView textView7=(TextView)findViewById(R.id.textView7v);

        showButtonVol=(Button) findViewById(R.id.buttonShowV);
        showButtonVol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText.getText().toString();
                double num2,num3,num4,num5;
                int num = Integer.parseInt(value);
                double num1=(num * 1);
                textView1.setText(String.valueOf(num1));
                num2=(num * 0.000001);
                textView2.setText(String.valueOf(num2));
                num3=(num * 0.00003532);
                textView3.setText(String.valueOf(num3));
                num4=(num * 0.00022);
                textView4.setText(String.valueOf(num4));
                textView5.setText(String.valueOf(num * 0.061024));
                double num6,num7,num8,num9;
                num6=num*0.001;
                textView6.setText(String.valueOf(num6));
                num7=num*0.000001308;
                textView7.setText(String.valueOf(num7));


            }
        });

        spinner3=(Spinner)findViewById(R.id.spinner3);
        adapter=ArrayAdapter.createFromResource(this, R.array.Volume, android.R.layout.simple_spinner_item);
        spinner3.setAdapter(adapter);

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onItemSelected(AdapterView<?> arg0, View view,
                                       int position, long row_id) {
                final Intent intentCm,intentM,intentCfeet,intentGal,intentCinch,intentVlitre,intentCyard,intentYard;
                //intent = new Intent(Length.this,Length.class);
                switch(position){
                   // case 1:
                    //    intentCm = new Intent(Volume.this, Cubic_cm.class);
                     //   startActivity(intentCm);
                     //   break;
                    case 1:
                        intentM = new Intent(Volume.this, Cubic_m.class);
                        startActivity(intentM);
                        break;
                    case 2:
                        intentCfeet = new Intent(Volume.this, Cubic_feet.class);
                        startActivity(intentCfeet);
                        break;
                    case 3:
                        intentGal = new Intent(Volume.this, Gallons.class);
                        startActivity(intentGal);
                        break;
                    case 4:
                        intentCinch = new Intent(Volume.this, Cubic_Inch.class);
                        startActivity(intentCinch);
                        break;
                    case 5:
                        intentVlitre = new Intent(Volume.this, Litres.class);
                        startActivity(intentVlitre);
                        break;
                    case 6:
                        intentCyard = new Intent(Volume.this, Cubic_Yards.class);
                        startActivity(intentCyard);
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
        getMenuInflater().inflate(R.menu.menu_volume, menu);
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
