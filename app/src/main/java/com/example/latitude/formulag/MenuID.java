package com.example.latitude.formulag;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MenuID extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_id);
        Button derivadas=(Button)findViewById(R.id.derivada);
        Button ingrales_d=(Button)findViewById(R.id.integral_d);
        Button integrales_i=(Button)findViewById(R.id.integral_i);
        Button sumas=(Button)findViewById(R.id.suma);

        derivadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzar(0);

            }
        });

        integrales_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzar(3);
            }
        });
        ingrales_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzar(2);
            }
        });
        sumas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzar(1);
            }
        });
    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu__principal, menu);
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
    */
    public void lanzar(int u){
        Intent i = new Intent(this, der_inte.class);
        i.putExtra("eleccion",u);
        startActivity(i);
    }
}
