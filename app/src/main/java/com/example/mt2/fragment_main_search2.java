package com.example.mt2;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import com.example.mt2.databinding.ActivityMainBinding;
import com.example.mt2.databinding.FragmentMainSearch2Binding;
import com.example.mt2.databinding.FragmentResultBinding;

import java.util.ArrayList;
import java.util.List;


public class fragment_main_search2 extends Fragment {

    FragmentMainSearch2Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentMainSearch2Binding.inflate(inflater, container, false);

        int[] imageId = {R.drawable.린아스, R.drawable.뉴스피린,};
        String[] name = {"아스피린", "뉴스피린", "린아스"};
        String[] medicineMessage = {"Asprin 100mg", "Aspring 25mg", "Aspring 50mg"};
        String[] imformation = {
                "아스피린은 최초로 합성된 해열 진통제이다.",
                "고위험군자에서 심혈관계 위험성 감소",
                "혈전생성 억제"};
        String[] ways = {"성인 하루 0.5~1.5g씩 2~3회", "성인 하루 0.5~1.5g씩 2~3회", "성인 하루 0.5~1.5g씩 2~3회"};

        ArrayList<Item> itemArrayList = new ArrayList<>();

        for (int i = 0; i < imageId.length; i++) {

            Item item = new Item(name[i], medicineMessage[i], imformation[i], ways[i], imageId[i]);
            itemArrayList.add(item);
        }

        ItemAdapter itemAdapter = new ItemAdapter(fragment_main_search2.this,itemArrayList);

        binding.listView.setAdapter(itemAdapter);
        binding.listView.setClickable(true);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //클릭된 액티비티로 화면전환
                Intent i = new Intent(SearchActivity.this, result.class);
                i.putExtra("name", name[position]);
                i.putExtra("medicineMessage", medicineMessage[position]);
                i.putExtra("imformation", imformation[position]);
                i.putExtra("ways", ways[position]);
                i.putExtra("imageid", imageId[position]);
                startActivity(i);
            }
        }

    }
}