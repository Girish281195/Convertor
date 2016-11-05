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


public class Area extends ActionBarActivity {

    public Button showButtonArea;
    Spinner spinnerArea;
    ArrayAdapter<CharSequence> adapterArea;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        final EditText editText=(EditText)findViewById(R.id.editTextArea);

        final TextView textView1=(TextView)findViewById(R.id.textView1Area);
        final TextView textView2=(TextView)findViewById(R.id.textView2Area);
        final TextView textView3=(TextView)findViewById(R.id.textView3Area);
        final TextView textView4=(TextView)findViewById(R.id.textView4Area);
        final TextView textView5=(TextView)findViewById(R.id.textView5Area);
        final TextView textView6=(TextView)findViewById(R.id.textView6Area);
        final TextView textView7=(TextView)findViewById(R.id.textView7Area);
        final TextView textView8=(TextView)findViewById(R.id.textView8Area);

        showButtonArea=(Button) findViewById(R.id.buttonShowArea);
        showButtonArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText.getText().toString();
                double num2,num3,num4,num5;
                int num = Integer.parseInt(value);
                double num1=(num * 1);
                textView1.setText(String.valueOf(num1));
                num2=(num * 0.0001);
                textView2.setText(String.valueOf(num2));
                num3=(num * 0.000000024711);
                textView3.setText(String.valueOf(num3));
                num4=(num * 0.0010764);
                textView4.setText(String.valueOf(num4));
                textView5.setText(String.valueOf(num * 0.00000001));
                double num6,num7,num8,num9;
                num6=num*0.155;
                textView6.setText(String.valueOf(num6));
                num7=num*0.000000000039;
                textView7.setText(String.valueOf(num7));
                num8=num*0.0001196;
                textView8.setText(String.valueOf(num8));

            }
        });

        spinnerArea=(Spinner)findViewById(R.id.spinner2);
        adapterArea= ArrayAdapter.createFromResource(this, R.array.area, android.R.layout.simple_spinner_item);
        spinnerArea.setAdapter(adapterArea);

        spinnerArea.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onItemSelected(AdapterView<?> arg0, View view,
                                       int position, long row_id) {
                final Intent intentM, intentAc, intentFeet, intentHec, intentSq_inch, intentSq_Mil, intentSq_ya,intentS;
                //intent = new Intent(Length.this,Length.class);
                switch (position) {
                    case 1:
                        intentM = new Intent(Area.this, Square_m.class);
                        startActivity(intentM);
                        break;
                    case 2:
                        intentAc = new Intent(Area.this, Acres.class);
                        startActivity(intentAc);
                        break;
                    case 3:
                        intentFeet = new Intent(Area.this, Square_feet.class);
                        startActivity(intentFeet);
                        break;
                    case 4:
                        intentHec = new Intent(Area.this, Hectares.class);
                        startActivity(intentHec);
                        break;
                    case 5:
                        intentSq_inch = new Intent(Area.this, Square_Inches.class);
                        startActivity(intentSq_inch);
                        break;
                    case 6:
                        intentSq_Mil = new Intent(Area.this, Square_Miles.class);
                        startActivity(intentSq_Mil);
                        break;
                    case 7:
                        intentSq_ya = new Intent(Area.this, Yards_square.class);
                        startActivity(intentSq_ya);
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
        getMenuInflater().inflate(R.menu.menu_area, menu);
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
