package com.example.mt2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mt2.databinding.FragmentResultBinding;

public class Fragment_result extends Fragment {

    private FragmentResultBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentResultBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        //전달받은 약 데이터 표시
        // Access and manipulate views using the binding object
        binding.profile.setImageResource(Item.imageId);
        binding.medicine.setText("Medicine Name");
        binding.medicinemessage.setText("Medicine Message");
        binding.imformation.setText("Information");
        binding.ways.setText("Ways");

        return view;
    }


}