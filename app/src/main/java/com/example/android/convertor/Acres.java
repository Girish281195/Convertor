package com.example.android.convertor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Acres extends ActionBarActivity {

    public Button ShowButtonAcre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acres);

        final EditText editText=(EditText)findViewById(R.id.editText1Aa);

        final TextView textView1=(TextView)findViewById(R.id.textView11Aa);
        final TextView textView2=(TextView)findViewById(R.id.textView22Aa);
        final TextView textView3=(TextView)findViewById(R.id.textView33Aa);
        final TextView textView4=(TextView)findViewById(R.id.textView44Aa);
        final TextView textView5=(TextView)findViewById(R.id.textView55Aa);
        final TextView textView6=(TextView)findViewById(R.id.textView66Aa);
        final TextView textView7=(TextView)findViewById(R.id.textView77Aa);
        final TextView textView8=(TextView)findViewById(R.id.textView88Aa);


        ShowButtonAcre=(Button) findViewById(R.id.buttonShow1Aa);
        ShowButtonAcre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText.getText().toString();
                double num2,num3,num4,num5;
                int num = Integer.parseInt(value);
                double num1=(num * 40468730);
                textView1.setText(String.valueOf(num1));
                num2=(num * 4046.873);
                textView2.setText(String.valueOf(num2));
                num3=(num * 1);
                textView3.setText(String.valueOf(num3));
                num4=(num * 43560);
                textView4.setText(String.valueOf(num4));
                textView5.setText(String.valueOf(num * 0.4046873));
                double num6,num7,num8,num9;
                num6=num*6272640;
                textView6.setText(String.valueOf(num6));
                num7=num*0.0015625;
                textView7.setText(String.valueOf(num7));
                num8=num*4840;
                textView8.setText(String.valueOf(num8));

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_acres, menu);
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
