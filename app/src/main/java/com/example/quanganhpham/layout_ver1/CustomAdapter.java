package com.example.quanganhpham.layout_ver1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by QuangAnhPham on 3/3/2017.
 */

public class CustomAdapter extends BaseAdapter {
    ArrayList<Contact> listData;
    LayoutInflater inflater;
    public CustomAdapter(ArrayList<Contact> listData, LayoutInflater inflater) {
        this.listData = listData;
        this.inflater = inflater;
    }




    @Override
    public int getCount() {
        return this.listData.size();
    }

    @Override
    public Object getItem(int i) {
        return this.listData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView text_firsname,text_name,text_note;
        if (view == null){
            view = this.inflater.inflate(R.layout.row_item_contact,null);
        }
        Contact item = (Contact) getItem(i);


        text_firsname =(TextView) view.findViewById(R.id.text_firstname);
        text_name =(TextView) view.findViewById(R.id.text_name);
        text_note =(TextView) view.findViewById(R.id.text_note);
        text_firsname.setText(item.getmFirstname());
        text_name.setText(item.getmName());
        text_note.setText(item.getmNote());
        return view;
    }
}
