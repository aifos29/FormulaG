package com.example.latitude.formulag;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class CodeFigura extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_figura);
        Bundle bundle = getIntent().getExtras();
        RelativeLayout fondo =(RelativeLayout)findViewById(R.id.pantalla);

     ;
        if (bundle.get("Figura")==0 && bundle.get("Tipo")==0){
            fondo.setBackgroundResource(R.drawable.cubo);
        }
        if (bundle.get("Figura")==1&& bundle.get("Tipo")==0){
            fondo.setBackgroundResource(R.drawable.prisma);

        }
        if (bundle.get("Figura")==2&& bundle.get("Tipo")==0) {
            fondo.setBackgroundResource(R.drawable.esfera);

        }
        if (bundle.get("Figura")==3&& bundle.get("Tipo")==0){
            fondo.setBackgroundResource(R.drawable.cono);

        }
        if (bundle.get("Figura")==4&& bundle.get("Tipo")==0) {
            fondo.setBackgroundResource(R.drawable.cilindro);

        }
        if (bundle.get("Figura")==0 && bundle.get("Tipo")==1){
            fondo.setBackgroundResource(R.drawable.cuadrado);
        }
        if (bundle.get("Figura")==1&& bundle.get("Tipo")==1){
            fondo.setBackgroundResource(R.drawable.rectangulo);

        }
        if (bundle.get("Figura")==2&& bundle.get("Tipo")==1) {
            fondo.setBackgroundResource(R.drawable.rombo);

        }
        if (bundle.get("Figura")==3&& bundle.get("Tipo")==1) {
            fondo.setBackgroundResource(R.drawable.circulo);

        }



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_code_figura, menu);
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
            Intent i = new Intent(this,terminologia.class );
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}
