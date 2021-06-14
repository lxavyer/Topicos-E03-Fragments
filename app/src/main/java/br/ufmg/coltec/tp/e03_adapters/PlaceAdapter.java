package br.ufmg.coltec.tp.e03_adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class PlaceAdapter extends BaseAdapter {

    private Place[] lugares;
    private Context context;

    public PlaceAdapter(Context context, Place[] lugares) {
        this.lugares = lugares;
        this.context = context;
    }

    @Override
    public int getCount() {
        return this.lugares.length;
    }

    @Override
    public Object getItem(int position) {
        return this.lugares[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Place lugar = this.lugares[position];

        TextView txtNome = new TextView(this.context);
        txtNome.setText(lugar.getName());

        return txtNome;
    }
}
