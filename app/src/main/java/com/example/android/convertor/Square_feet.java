package com.example.android.convertor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Square_feet extends ActionBarActivity {

    public Button ShowButtonSq_feet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_feet);

        final EditText editText=(EditText)findViewById(R.id.editText1Af);

        final TextView textView1=(TextView)findViewById(R.id.textView11Af);
        final TextView textView2=(TextView)findViewById(R.id.textView22Af);
        final TextView textView3=(TextView)findViewById(R.id.textView33Af);
        final TextView textView4=(TextView)findViewById(R.id.textView44Af);
        final TextView textView5=(TextView)findViewById(R.id.textView55Af);
        final TextView textView6=(TextView)findViewById(R.id.textView66Af);
        final TextView textView7=(TextView)findViewById(R.id.textView77Af);
        final TextView textView8=(TextView)findViewById(R.id.textView88Af);


        ShowButtonSq_feet=(Button) findViewById(R.id.buttonShow1Af);
        ShowButtonSq_feet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText.getText().toString();
                double num2,num3,num4,num5;
                int num = Integer.parseInt(value);
                double num1=(num * 929.0304);
                textView1.setText(String.valueOf(num1));
                num2=(num * 0.09290304);
                textView2.setText(String.valueOf(num2));
                num3=(num * 0.000022956806);
                textView3.setText(String.valueOf(num3));
                num4=(num * 1);
                textView4.setText(String.valueOf(num4));
                textView5.setText(String.valueOf(num * 0.000009290304));
                double num6,num7,num8,num9;
                num6=num*144;
                textView6.setText(String.valueOf(num6));
                num7=num*0.00000003587;
                textView7.setText(String.valueOf(num7));
                num8=num*0.11111;
                textView8.setText(String.valueOf(num8));

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_square_feet, menu);
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
