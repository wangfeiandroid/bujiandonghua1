package com.example.administrator.bujiandonghua.fragment;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.bujiandonghua.R;

public class MyGridViewAdapter extends BaseAdapter {
    private Context mcontext;
    private LayoutInflater mlayoutInflater;

    public MyGridViewAdapter(FragmentActivity context){
        this.mcontext = context;
        mlayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 12;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder{
        public ImageView imageView1,imageView2;
        public TextView textView1,textView2;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView==null)
        {
            convertView = mlayoutInflater.inflate(R.layout.gridview,null);
            holder =new ViewHolder();
            holder.imageView1= convertView.findViewById(R.id.im1);
            holder.textView1 = convertView.findViewById(R.id.tv1);
            holder.imageView2= convertView.findViewById(R.id.im2);
            holder.textView2 = convertView.findViewById(R.id.tv2);
            convertView.setTag(holder);
        }else
        {
            holder= (ViewHolder) convertView.getTag();
        }
        holder.textView1.setText("玉镯    ￥99");
        Glide.with(mcontext).load("https://img.alicdn.com/tfscom/i2/256691439/TB2wjP9bXgkyKJjSspfXXcj1XXa_!!256691439.jpg_180x180xzq90.jpg_.webp").into(holder.imageView1);

        holder.textView2.setText("女装    ￥499");
        Glide.with(mcontext).load("https://img.alicdn.com/imgextra/i1/120112939/O1CN014MvHgL1Xa6ZSfRyvd_!!0-saturn_solar.jpg_220x220.jpg_.webp").into(holder.imageView2);
        return convertView;
    }
}
