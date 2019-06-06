package com.example.administrator.bujiandonghua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.administrator.bujiandonghua.fragment.Afragment;
import com.example.administrator.bujiandonghua.fragment.Bfragment;
import com.example.administrator.bujiandonghua.fragment.Cfragment;
import com.example.administrator.bujiandonghua.fragment.Dfragment;

public class shouyeActivity extends AppCompatActivity {
    private Afragment afragment;
    private Bfragment bfragment;
    private Cfragment cfragment;
    private Dfragment dfragment;
    private ImageButton shouyebutton, paimaibutton,xinxibutton,wodebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shouye);

        shouyebutton = findViewById(R.id.shouye);
        paimaibutton = findViewById(R.id.paimai);
        xinxibutton = findViewById(R.id.xinxi);
        wodebutton = findViewById(R.id.wode);

        shouyebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(afragment == null){
                    afragment = new Afragment();
                }
                //把Bfragment添加到containerActivity中,记得调用commit
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container,afragment).commitAllowingStateLoss();
            }
        });
        paimaibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bfragment == null){
                    bfragment = new Bfragment();
                }
                //把Bfragment添加到containerActivity中,记得调用commit
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container,bfragment).commitAllowingStateLoss();
            }
        });

        xinxibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cfragment == null){
                    cfragment = new Cfragment();
                }
                //把Cfragment添加到containerActivity中,记得调用commit
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container,cfragment).commitAllowingStateLoss();
            }
        });
        wodebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dfragment == null){
                    dfragment = new Dfragment();
                }
                //把Bfragment添加到containerActivity中,记得调用commit
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container,dfragment).commitAllowingStateLoss();
            }
        });

        afragment = new Afragment();

        getSupportFragmentManager().beginTransaction().add(R.id.fl_container,afragment).commitAllowingStateLoss();
    }
}
