package com.example.toshiba.uas_mobile;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.text.Html;

import com.example.toshiba.uas_mobile.app.AppController;
import com.example.toshiba.uas_mobile.data_profil.Data;

import java.util.List;

/**
 * Created by Toshiba on 10/01/2018.
 */

public class adapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Data> items;

    public adapter(Activity activity, List<Data> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int location) {
        return items.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null)
            convertView = inflater.inflate(R.layout.list_profil, null);

        TextView sejarah = (TextView) convertView.findViewById(R.id.sejarah);
        TextView visi = (TextView) convertView.findViewById(R.id.visi);
        TextView misi = (TextView) convertView.findViewById(R.id.misi);
        TextView solusi = (TextView) convertView.findViewById(R.id.solusi);
        Data data = items.get(position);

        sejarah.setText(data.getSejarah());
        visi.setText(data.getVisi());
        misi.setText(data.getMisi());
        solusi.setText(data.getSolusi());

        return convertView;
    }
}
