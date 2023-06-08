package com.example.mt2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;

public class Fragment_menu_button3 extends Fragment {


    private View view;
    private ImageButton imageButton;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        RelativeLayout layout = (RelativeLayout)inflater.inflate(R.layout.fragment_menu_button3, container, false);

        String[] list_menu = {"아스피린","shine"};

        ListView listview = (ListView) layout.findViewById(R.id.list_menu);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                list_menu
        );
        listview.setAdapter(listViewAdapter);

        return layout;


    }



}
