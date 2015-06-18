package com.example.latitude.formulag;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MenuG extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_g);
        final Button button = (Button) findViewById(R.id.solidos);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                solidos();
            }
        });
        final Button button1 = (Button) findViewById(R.id.Plano);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                plano();
            }
        });
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu_g, menu);
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
    public void plano(){
        Intent i = new Intent(this,planos.class );

        startActivity(i);
    }
    public void solidos(){
        Intent i = new Intent(this,MainActivity.class );

        startActivity(i);
    }

}
