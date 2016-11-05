package com.example.android.convertor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Tonne extends ActionBarActivity {

    public Button showButtonTonne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tonne);

        final EditText editText=(EditText)findViewById(R.id.editText1T);

        final TextView textView1=(TextView)findViewById(R.id.textView11T);
        final TextView textView2=(TextView)findViewById(R.id.textView22T);
        final TextView textView3=(TextView)findViewById(R.id.textView33T);
        final TextView textView4=(TextView)findViewById(R.id.textView44T);
        final TextView textView5=(TextView)findViewById(R.id.textView55T);
        final TextView textView6=(TextView)findViewById(R.id.textView66T);
        final TextView textView7=(TextView)findViewById(R.id.textView77T);
        final TextView textView8=(TextView)findViewById(R.id.textView88T);


        showButtonTonne=(Button) findViewById(R.id.buttonShow1T);
        showButtonTonne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText.getText().toString();
                double num2,num3,num4,num5;
                int num = Integer.parseInt(value);
                double num1=(num * 1000000000);
                textView1.setText(String.valueOf(num1));
                num2=(num * 1000000);
                textView2.setText(String.valueOf(num2));
                num3=(num * 1000);
                textView3.setText(String.valueOf(num3));
                num4=(num * 1);
                textView4.setText(String.valueOf(num4));
                textView5.setText(String.valueOf(num * 15.432358));
                double num6,num7,num8,num9;
                num6=num*0.035273966;
                textView6.setText(String.valueOf(num6));
                num7=num*0.0022004623;
                textView7.setText(String.valueOf(num7));
                num8=num*0.000157473;
                textView8.setText(String.valueOf(num8));

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tonne, menu);
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
