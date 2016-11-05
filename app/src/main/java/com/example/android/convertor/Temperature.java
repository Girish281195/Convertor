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


public class Temperature extends ActionBarActivity {

    public Button showButtonTemp;
    Spinner spinnerL1;
    ArrayAdapter<CharSequence> adapterT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        final EditText editText=(EditText)findViewById(R.id.editTextT);

        final TextView textView1=(TextView)findViewById(R.id.textView1T);
        final TextView textView2=(TextView)findViewById(R.id.textView2T);

        showButtonTemp=(Button) findViewById(R.id.buttonShowT);
        showButtonTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText.getText().toString();
                double num2,num3,num4,num5;
                int num = Integer.parseInt(value);
                double num1=num;
                textView1.setText(String.valueOf(num1));
                num2=(num * (9/5) + 32);
                textView2.setText(String.valueOf(num2));


            }
        });

        spinnerL1=(Spinner)findViewById(R.id.spinnerL);
        adapterT= ArrayAdapter.createFromResource(this, R.array.temperature, android.R.layout.simple_spinner_item);
        spinnerL1.setAdapter(adapterT);

        spinnerL1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onItemSelected(AdapterView<?> arg0, View view,
                                       int position, long row_id) {
                final Intent intent;
                switch (position) {
                    case 1:
                        intent = new Intent(Temperature.this, Degree_Farenheit.class);
                        startActivity(intent);
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
        getMenuInflater().inflate(R.menu.menu_temperature, menu);
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
