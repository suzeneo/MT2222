package com.example.mt2;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class MainMenuSearch extends Fragment {

    private EditText editText;
    private Button searchbtn;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_search, container, false);

        editText = view.findViewById(R.id.editText);
        searchbtn = view.findViewById(R.id.searchbtn);

        searchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle(); //무언가 담을 준비를 할 수 있는 보따리
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                String text = editText.getText().toString();

                if (text.equals("화면1")) {
                    fragment_main_search1_1 search1_1 = new fragment_main_search1_1();
                    search1_1.setArguments(bundle);
                    transaction.replace(R.id.menu_frame_layout,search1_1);
                    transaction.commit(); //저장
                } else if (text.equals("화면2")) {
                    fragment_main_search2 search1_2 = new fragment_main_search2();
                    search1_2.setArguments(bundle);
                    transaction.replace(R.id.menu_frame_layout,search1_2);
                    transaction.commit(); //저장
                } else {
                    // 입력된 값이 "화면1" 또는 "화면2"가 아닌 경우 처리할 로직 추가
                }
            }
        });

        return view;
    }
}