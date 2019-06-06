package com.example.administrator.bujiandonghua.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.bujiandonghua.MainActivity;
import com.example.administrator.bujiandonghua.R;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

public class Afragment extends Fragment {
    private Banner mbanner;
    private MyGridView gridView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a,container,false);

        //实现网格列表，用NestedScrollView视图和自定义的网格（重写）GridView
        gridView = view.findViewById(R.id.GV1);
        gridView.setAdapter(new MyGridViewAdapter(getActivity()));
        //轮播图实现
        mbanner = (Banner)view.findViewById(R.id.bannerone);
        int [] imageResourseId = new int[]{R.drawable.lbt1,R.drawable.lbt2,R.drawable.lbt3};
        List<Integer> imageList = new ArrayList<>();
        for(int i = 0; i<imageResourseId.length;i++)
        {
            imageList.add(imageResourseId[i]);

        }
        mbanner.setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                Glide.with(Afragment.this).load(path).into(imageView);
            }
        });
        mbanner.setDelayTime(1000);
        mbanner.setImages(imageList);
        mbanner.start();
        return view;
    }

}
