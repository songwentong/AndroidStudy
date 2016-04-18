package com.example.songwentong.smscollection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/*
*
* 短信大全
*
*
* */
public class MainActivity extends AppCompatActivity {

    String objects[] = {"1","2","3","4"};
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


    }
}
