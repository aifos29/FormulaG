package com.example.latitude.formulag;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class terminologia extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminologia);
        ListView list;
         String[] terminos = {"a", "h", "PB", "AB", "r","g","Perímetro","Diagonal","d","D"};
        list = (ListView)findViewById(R.id.listView);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, terminos);
        list.setAdapter(adaptador);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    llenar("Arista","En una figura plana es conocida como lado. En cuerpos sólidos,es el segmento de recta donde" +
                            "se encuentran dos caras");

                }
                if (position==1){
                    llenar("Altura","Es el segmento perpendicular a la base");
                }
                if (position==2){
                    llenar("Perímetro de la base","Es el perímetro de la base de la figura");
                }
                if (position==3){
                    llenar("Área de la base","Es el área de la base de una figura");
                }
                if (position==4){
                    llenar("Radio","Segmento que une cualquier punto de la circunferencia con su centro");
                }
                if (position==5){
                    llenar("Generatriz","Es el lado del rectángulo opuesto al eje de giro");
                }
                if (position==6){
                    llenar("Perímetro","Suma de los lados de una figura");
                }
                if (position==7){
                    llenar("Diagonal","Es todo segmento que une dos vértices diagonalmente no consecutivos de un polígono");
                }
                if(position==8){
                    llenar("Diagonal Menor","Diagonal de menor tamaño de un rombo");
                }
                if(position==9){
                    llenar("Diagonal Mayor","Diagonal de mayor tamaño de un rombo");
                }





            }


        });
    }
    public void llenar(String c,String d){
        TextView concepto= (TextView)findViewById(R.id.Concepto);
        TextView definicion=(TextView)findViewById(R.id.definicion);
        concepto.setText(c);
        definicion.setText(d);
    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_terminologia, menu);
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
}
