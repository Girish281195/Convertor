package com.example.android.convertor;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    public Button button1,button2,button3,button4,button5;
    public void init(){
        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent length=new Intent(MainActivity.this,Length.class);
                startActivity(length);
            }
        });
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent weight=new Intent(MainActivity.this,Weight.class);
                startActivity(weight);
            }
        });

        button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent volume=new Intent(MainActivity.this,Volume.class);
                startActivity(volume);
            }
        });

        button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent area=new Intent(MainActivity.this,Area.class);
                startActivity(area);
            }
        });

        button5=(Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent temperature=new Intent(MainActivity.this,Temperature.class);
                startActivity(temperature);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
