package com.example.administrator.bujiandonghua.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.bujiandonghua.R;
import com.example.administrator.bujiandonghua.fragment.fragment_clickListening.cfragment_click;

public class Dfragment extends Fragment {
    private Button button1,button2,button3,button4,button5;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_d,container,false);
        button1 = view.findViewById(R.id.dfragmentbutton1);
        button2 = view.findViewById(R.id.dfragmentbutton2);
        button3 = view.findViewById(R.id.dfragmentbutton3);
        button4 = view.findViewById(R.id.dfragmentbutton4);
        button5 = view.findViewById(R.id.dfragmentbutton5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),cfragment_click.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),cfragment_click.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),cfragment_click.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),cfragment_click.class);
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),cfragment_click.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
