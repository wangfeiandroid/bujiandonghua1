package com.example.administrator.bujiandonghua.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.administrator.bujiandonghua.MainActivity;
import com.example.administrator.bujiandonghua.R;
import com.example.administrator.bujiandonghua.fragment.fragment_clickListening.cfragment_click;
import com.example.administrator.bujiandonghua.shouyeActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bfragment extends Fragment {
    private ListView listView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_b , container, false);

        listView = (ListView)view.findViewById(R.id.listview_bfragment);
        List<Map<String, Object>> list=getData();
        listView.setAdapter(new Bfragment_adapter(getActivity(), list));
        return view;
    }


    public List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < 10; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            //这里有个小问题，为什么安卓里让变量自加不变呢？
            if (i == 0 || i == 3 || i == 9) {
                map.put("image", R.drawable.lanyuelang);
                map.put("t1", "蓝月亮洗衣液");
                map.put("t2", "价格 ：￥79   参与人数：30");
                map.put("t3", "截止时间：2019.09.09");
                list.add(map);
            }
            if (i == 1 || i == 5) {
                map.put("image", R.drawable.lanyuelaing3);
                map.put("t1", "蓝月亮洗手液");
                map.put("t2", "价格 ：￥23   参与人数：89");
                map.put("t3", "截止时间：2019.10.03");
                list.add(map);
            }
            if (i == 2 || i == 7) {
                map.put("image", R.drawable.lanyuelaing3);
                map.put("t1", "蓝月亮洗衣液");
                map.put("t2", "价格 ：￥45   参与人数：54");
                map.put("t3", "截止时间：2019.07.25");
                list.add(map);
            }
            if (i == 4 || i == 6 || i == 8) {
                map.put("image", R.drawable.nanzi);
                map.put("t1", "男子短袖");
                map.put("t2", "价格 ：￥99.9   参与人数：40");
                map.put("t3", "截止时间：数量有限抢完为止");
                list.add(map);
            }
                map.put("image", R.drawable.lanyuelang);
                map.put("t1", "蓝月亮洗衣液");
                map.put("t2", "价格 ：￥79   参与人数：90");
                map.put("t3", "截止时间：2019.09.09");
            list.add(map);
            }
            return list;
        }
    }

