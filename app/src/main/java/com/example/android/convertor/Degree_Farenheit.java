package com.example.android.convertor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Degree_Farenheit extends ActionBarActivity {
    public Button ShowButtonFh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_degree__farenheit);

        final EditText editText=(EditText)findViewById(R.id.editText1Amf);

        final TextView textView1=(TextView)findViewById(R.id.textView11Amf);
        final TextView textView2=(TextView)findViewById(R.id.textView22Amf);

        ShowButtonFh=(Button) findViewById(R.id.buttonShow1Amf);
        ShowButtonFh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText.getText().toString();
                double num2;
                int num = Integer.parseInt(value);
                double num1=((num - 32) * 0.5555555556);
                textView1.setText(String.valueOf(num1));
                num2=num;
                textView2.setText(String.valueOf(num2));

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_degree__farenheit, menu);
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
