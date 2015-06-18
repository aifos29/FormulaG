package com.example.latitude.formulag;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Menu_Principal extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__principal);
        ImageButton AV= (ImageButton)findViewById(R.id.AVb);
        ImageButton ID=(ImageButton) findViewById(R.id.DIb);

        AV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallas(0);


            }
        });
        ID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantallas(1);
            }
        });
    }

    public void pantallas(int p){
        if (p==0){
            Intent i = new Intent(this,MenuG.class );
            startActivity(i);
        }
        if (p==1){
            Intent i = new Intent(this,MenuID.class );

            startActivity(i);
        }

    }

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
}
