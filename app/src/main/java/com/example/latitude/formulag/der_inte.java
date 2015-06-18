package com.example.latitude.formulag;

import android.app.Activity;
import android.content.ClipData;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class der_inte extends Activity  {
    private ArrayList<formulas> animales = new ArrayList<formulas>();
    ListView lvAnimales ;
    private int usar=0;
    ImageView mostrar ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_der_inte);
        RelativeLayout f=(RelativeLayout)findViewById(R.id.fondo);
        mostrar = (ImageView) findViewById(R.id.respuesta);
        Bundle bundle = getIntent().getExtras();
        usar=bundle.getInt("eleccion");
        if(usar==0){
            llenar_derivadas();
            f.setBackgroundResource(R.drawable.derivadas);
        }
        if(usar==1){
            f.setBackgroundResource(R.drawable.sumas);
            llenar_sumas();
        }
        if(usar==2){
            f.setBackgroundResource(R.drawable.ii);
            llenar_id();
        }
        if(usar==3){
            f.setBackgroundResource(R.drawable.id);
            llenar_ii();
        }

        lvAnimales = (ListView) findViewById(R.id.lvItems);
        AnimalesAdapter adapter;
// Inicializamos el adapter.
        adapter = new AnimalesAdapter(this, animales);
// Asignamos el Adapter al ListView, en este punto hacemos que el
// ListView muestre los datos que queremos.

        lvAnimales.setAdapter(adapter);
        ;
        lvAnimales.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (usar == 0) {
                    derivadas(position);
                }
                if (usar == 1) {
                    sumas(position);
                }
                if (usar == 2) {
                    inte_def(position);
                }
                if (usar == 3) {
                    int_ind(position);
                }
            }
        });

    }


    public void llenar_derivadas() {
        animales.clear();
        animales.add(new formulas((R.drawable.f1)));
        animales.add(new formulas((R.drawable.f2)));
        animales.add(new formulas((R.drawable.f3)));
        animales.add(new formulas((R.drawable.f4)));
        animales.add(new formulas((R.drawable.f5)));
        animales.add(new formulas((R.drawable.f6)));
        animales.add(new formulas((R.drawable.f7)));
        animales.add(new formulas((R.drawable.f8)));
        animales.add(new formulas((R.drawable.f9)));
        animales.add(new formulas((R.drawable.f10)));
        animales.add(new formulas((R.drawable.f11)));
        animales.add(new formulas((R.drawable.f12)));
        animales.add(new formulas((R.drawable.f13)));
        animales.add(new formulas((R.drawable.f14)));
        animales.add(new formulas((R.drawable.f15)));
        animales.add(new formulas((R.drawable.f16)));
        animales.add(new formulas((R.drawable.f17)));
        animales.add(new formulas((R.drawable.f18)));
        animales.add(new formulas((R.drawable.f19)));
        animales.add(new formulas((R.drawable.f20)));
        animales.add(new formulas((R.drawable.f21)));
    }
    public void llenar_sumas(){
        animales.clear();
        animales.add(new formulas(R.drawable.s1));
        animales.add(new formulas(R.drawable.s2));
        animales.add(new formulas(R.drawable.s3));
        animales.add(new formulas(R.drawable.s4));
        animales.add(new formulas(R.drawable.s5));

    }
    public void  llenar_id(){
        animales.clear();
        animales.add(new formulas(R.drawable.id1));
        animales.add(new formulas(R.drawable.id2));
        animales.add(new formulas(R.drawable.id3));
        animales.add(new formulas(R.drawable.id4));
        animales.add(new formulas(R.drawable.id5));
        animales.add(new formulas(R.drawable.id6));

    }
    public void llenar_ii(){
        animales.clear();
        animales.add(new formulas(R.drawable.ii1));
        animales.add(new formulas(R.drawable.ii2));
        animales.add(new formulas(R.drawable.ii3));
        animales.add(new formulas(R.drawable.ii4));
        animales.add(new formulas(R.drawable.ii5));
        animales.add(new formulas(R.drawable.ii6));
        animales.add(new formulas(R.drawable.ii7));
        animales.add(new formulas(R.drawable.ii8));
        animales.add(new formulas(R.drawable.ii9));
        animales.add(new formulas(R.drawable.ii10));
        animales.add(new formulas(R.drawable.ii11));
        animales.add(new formulas(R.drawable.ii12));
        animales.add(new formulas(R.drawable.ii13));
        animales.add(new formulas(R.drawable.ii14));
        animales.add(new formulas(R.drawable.ii15));
        animales.add(new formulas(R.drawable.ii16));
        animales.add(new formulas(R.drawable.ii17));
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


    public void derivadas(int position) {
       // lvAnimales.setOnItemClickListener(this);


        if (position == 0) {
            mostrar.setImageResource(R.drawable.d1);
        }
        if (position == 1) {
            mostrar.setImageResource(R.drawable.d2);
        }
        if (position == 2) {
            mostrar.setImageResource(R.drawable.d3);
        }
        if (position == 3) {
            mostrar.setImageResource(R.drawable.d4);
        }
        if (position == 4) {
            mostrar.setImageResource(R.drawable.d5);
        }
        if (position == 5) {
            mostrar.setImageResource(R.drawable.d6);
        }
        if (position == 6) {
            mostrar.setImageResource(R.drawable.d7);
        }
        if (position == 7) {
            mostrar.setImageResource(R.drawable.d8);
        }
        if (position == 8) {
            mostrar.setImageResource(R.drawable.d9);
        }
        if (position == 9) {
            mostrar.setImageResource(R.drawable.d10);
        }
        if (position == 10) {
            mostrar.setImageResource(R.drawable.d11);
        }
        if (position == 11) {
            mostrar.setImageResource(R.drawable.d12);
        }
        if (position == 12) {
            mostrar.setImageResource(R.drawable.d13);
        }
        if (position == 13) {
            mostrar.setImageResource(R.drawable.d14);
        }
        if (position == 14) {
            mostrar.setImageResource(R.drawable.d15);
        }
        if (position == 15) {
            mostrar.setImageResource(R.drawable.d16);
        }
        if (position == 16) {
            mostrar.setImageResource(R.drawable.d17);
        }
        if (position == 17) {
            mostrar.setImageResource(R.drawable.d18);
        }
        if (position == 18) {
            mostrar.setImageResource(R.drawable.d19);
        }if (position == 19) {
            mostrar.setImageResource(R.drawable.d20);
        }
        if (position == 20) {
            mostrar.setImageResource(R.drawable.d21);
        }

    }
    public void sumas(int position){
        if (position==0){
            mostrar.setImageResource(R.drawable.sr1);
        }
        if (position==1){
            mostrar.setImageResource(R.drawable.sr2);
        }
        if (position==2){
            mostrar.setImageResource(R.drawable.sr3);
        }
        if (position==3){
            mostrar.setImageResource(R.drawable.sr4);
        }
        if (position==4){
            mostrar.setImageResource(R.drawable.sr5);
        }
    }
    public void inte_def(int position){
        if (position==0){
            mostrar.setImageResource(R.drawable.idr1);
        }
        if (position==1){
            mostrar.setImageResource(R.drawable.idr2);
        }
        if (position==2){
            mostrar.setImageResource(R.drawable.idr3);
        }
        if (position==3){
            mostrar.setImageResource(R.drawable.idr4);
        }
        if (position==4){
            mostrar.setImageResource(R.drawable.idr5);
        }
        if (position==5){
            mostrar.setImageResource(R.drawable.idr6);
        }
    }
    public void int_ind(int position){
        if (position==0){
            mostrar.setImageResource(R.drawable.iir1);
        }
        if (position==1){
            mostrar.setImageResource(R.drawable.iir2);
        }
        if (position==2){
            mostrar.setImageResource(R.drawable.iir3);
        }
        if (position==3){
            mostrar.setImageResource(R.drawable.iir4);
        }
        if (position==4){
            mostrar.setImageResource(R.drawable.iir5);
        }
        if (position==5){
            mostrar.setImageResource(R.drawable.iir6);
        }
        if (position==6){
            mostrar.setImageResource(R.drawable.iir7);
        }if (position==7){
            mostrar.setImageResource(R.drawable.iir8);
        }
        if (position==8){
            mostrar.setImageResource(R.drawable.iir9);
        }
        if (position==9){
            mostrar.setImageResource(R.drawable.iir10);
        }
        if (position==10){
            mostrar.setImageResource(R.drawable.iir11);
        }if (position==11){
            mostrar.setImageResource(R.drawable.iir12);
        }if (position==12){
            mostrar.setImageResource(R.drawable.iir13);
        }if (position==13){
            mostrar.setImageResource(R.drawable.iir14);
        }
        if (position==14){
            mostrar.setImageResource(R.drawable.iir15);
        }
        if (position==15){
            mostrar.setImageResource(R.drawable.iir16);
        }if (position==16){
            mostrar.setImageResource(R.drawable.iir17);
        }






    }
}