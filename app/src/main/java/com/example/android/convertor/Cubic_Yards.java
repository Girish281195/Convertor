package com.example.android.convertor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Cubic_Yards extends ActionBarActivity {

    public Button showButtonVol1Cuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubic__yards);

        final EditText editText=(EditText)findViewById(R.id.editText1Cuy);

        final TextView textView1=(TextView)findViewById(R.id.textView11Cuy);
        final TextView textView2=(TextView)findViewById(R.id.textView22Cuy);
        final TextView textView3=(TextView)findViewById(R.id.textView33Cuy);
        final TextView textView4=(TextView)findViewById(R.id.textView44Cuy);
        final TextView textView5=(TextView)findViewById(R.id.textView55Cuy);
        final TextView textView6=(TextView)findViewById(R.id.textView66Cuy);
        final TextView textView7=(TextView)findViewById(R.id.textView77Cuy);

        showButtonVol1Cuy=(Button) findViewById(R.id.buttonShow1Cuy);
        showButtonVol1Cuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText.getText().toString();
                double num2, num3, num4, num5;
                int num = Integer.parseInt(value);
                double num1 = (num * 764555);
                textView1.setText(String.valueOf(num1));
                num2 = (num * 0.764555);
                textView2.setText(String.valueOf(num2));
                num3 = (num * 27);
                textView3.setText(String.valueOf(num3));
                num4 = (num * 168.178557);
                textView4.setText(String.valueOf(num4));
                textView5.setText(String.valueOf(num * 46656));
                double num6, num7, num8, num9;
                num6 = num * 764.555;
                textView6.setText(String.valueOf(num6));
                num7 = num * 1;
                textView7.setText(String.valueOf(num7));


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cubic__yards, menu);
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
