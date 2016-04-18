package com.example.songwentong.smscollection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/*
*
* 短信大全
*
*
* */
public class MainActivity extends AppCompatActivity {

    String objects[] = {"1111111","22222222","33333333","44444444"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1.找到lv
        ListView lv = (ListView)findViewById(R.id.lv);
        //2.先有数据
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.layout,objects);
        //3.设置数据适配器
        lv.setAdapter(adapter);
        //4.给list
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            //点击调用
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });



    }
}
