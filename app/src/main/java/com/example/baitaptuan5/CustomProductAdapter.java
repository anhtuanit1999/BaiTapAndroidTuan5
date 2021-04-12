package com.example.baitaptuan5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomProductAdapter extends BaseAdapter {
    private Context ctx;
    private int layoutitem;
    private ArrayList<Product> arrayList;

    public CustomProductAdapter(Context ctx, int layoutitem, ArrayList<Product> arrayList) {
        this.ctx = ctx;
        this.layoutitem = layoutitem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(ctx).inflate(layoutitem, parent, false);

        TextView tvAbove = convertView.findViewById(R.id.tvAbove);
        TextView tvBottom = convertView.findViewById(R.id.tvBottom);
        ImageView imgV_Ava = convertView.findViewById(R.id.imgV_Ava);

        tvAbove.setText(arrayList.get(position).getNameProduct());
        tvBottom.setText(arrayList.get(position).getNameShop());
        imgV_Ava.setImageResource(arrayList.get(position).getImgProduct());
        return convertView;
    }
}
