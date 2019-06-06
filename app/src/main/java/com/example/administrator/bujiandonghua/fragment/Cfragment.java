package com.example.administrator.bujiandonghua.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.administrator.bujiandonghua.R;
import com.example.administrator.bujiandonghua.fragment.fragment_clickListening.cfragment_click;

import java.util.List;
import java.util.Map;

public class Cfragment extends Fragment {
    private TextView mtv1;
    private RelativeLayout relativeLayout1,relativeLayout2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_c , container, false);
        relativeLayout1 = view.findViewById(R.id.fragmentcRelative1);
        relativeLayout2 = view.findViewById(R.id.fragmentcRelative2);
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),cfragment_click.class);
                startActivity(intent);
            }
        });
        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),cfragment_click.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
