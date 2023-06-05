package com.example.mt2;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {


    public ItemAdapter( Context context, ArrayList<Item> itemArrayList ) {
        super(context,R.layout.fragment_main_search_design,itemArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Item item = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_main_search_design,parent,false);
        }

        //리스트뷰 항목
        ImageView imageView = convertView.findViewById(R.id.profile);
        TextView medicine = convertView.findViewById(R.id.medicine);
        TextView medicinemsg = convertView.findViewById(R.id.medicinemessage);

        imageView.setImageResource(item.imageId); //이미지
        medicine.setText(item.name);  //약이름
        medicinemsg.setText(item.medicineMessage);  //약성분


        return convertView;
    }
}
