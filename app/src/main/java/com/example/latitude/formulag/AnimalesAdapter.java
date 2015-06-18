package com.example.latitude.formulag;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by LATITUDE on 5/29/2015.
 */
public class AnimalesAdapter extends ArrayAdapter {
    private Context context;
    private ArrayList<formulas> datos;

    public AnimalesAdapter(Context context, ArrayList<formulas> datos) {
        super(context, R.layout.listview_item, datos);

        this.context = context;
        this.datos = datos;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View item = inflater.inflate(R.layout.listview_item, null);

        // A partir de la vista, recogeremos los controles que contiene para
        // poder manipularlos.
        // Recogemos el ImageView y le asignamos una foto.
        ImageView imagen = (ImageView) item.findViewById(R.id.imgAnimal);
        imagen.setImageResource(datos.get(position).getDrawableImageID());





        // Devolvemos la vista para que se muestre en el ListView.
        return item;
    }
}
