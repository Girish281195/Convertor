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


public class Weight extends ActionBarActivity {

    public Button showButtonWeight;
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        final EditText editText=(EditText)findViewById(R.id.editTextW);

        final TextView textView1=(TextView)findViewById(R.id.textView1);
        final TextView textView2=(TextView)findViewById(R.id.textView2);
        final TextView textView3=(TextView)findViewById(R.id.textView3);
        final TextView textView4=(TextView)findViewById(R.id.textView4);
        final TextView textView5=(TextView)findViewById(R.id.textView5);
        final TextView textView6=(TextView)findViewById(R.id.textView6);
        final TextView textView7=(TextView)findViewById(R.id.textView7);
        final TextView textView8=(TextView)findViewById(R.id.textView8);
        final TextView textView9=(TextView)findViewById(R.id.textView9);

        showButtonWeight=(Button) findViewById(R.id.buttonShowW);
        showButtonWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText.getText().toString();
                double num2,num3,num4,num5;
                int num = Integer.parseInt(value);
                double num1=(num * 6.35e+6);
                textView1.setText(String.valueOf(num1));
                num2=(num * 6350.29);
                textView2.setText(String.valueOf(num2));
                num3=(num * 6.35029);
                textView3.setText(String.valueOf(num3));
                num4=(num * 0.00635029);
                textView4.setText(String.valueOf(num4));
                textView5.setText(String.valueOf(num * 98000));
                double num6,num7,num8,num9;
                num6=num*224;
                textView6.setText(String.valueOf(num6));
                num7=num*14;
                textView7.setText(String.valueOf(num7));
                num8=num*1;
                textView8.setText(String.valueOf(num8));

            }
        });

        spinner=(Spinner)findViewById(R.id.spinner2);
        adapter=ArrayAdapter.createFromResource(this, R.array.weight, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onItemSelected(AdapterView<?> arg0, View view,
                                       int position, long row_id) {
                final Intent intentMg, intentG, intentKg, intentTon, intentGr, intentO, intentP,intentS;
                //intent = new Intent(Length.this,Length.class);
                switch (position) {
                    case 1:
                        intentMg = new Intent(Weight.this, Milligram.class);
                        startActivity(intentMg);
                        break;
                    case 2:
                        intentG = new Intent(Weight.this, Gram.class);
                        startActivity(intentG);
                        break;
                    case 3:
                        intentKg = new Intent(Weight.this, KiloGram.class);
                        startActivity(intentKg);
                        break;
                    case 4:
                        intentTon = new Intent(Weight.this, Tonne.class);
                        startActivity(intentTon);
                        break;
                    case 5:
                        intentGr = new Intent(Weight.this, Grains.class);
                        startActivity(intentGr);
                        break;
                    case 6:
                        intentO = new Intent(Weight.this, Ounce.class);
                        startActivity(intentO);
                        break;
                    case 7:
                        intentP = new Intent(Weight.this, Pounds.class);
                        startActivity(intentP);
                        break;
                    case 8:
                        intentS = new Intent(Weight.this, Stones.class);
                        startActivity(intentS);
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
        getMenuInflater().inflate(R.menu.menu_weight, menu);
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
