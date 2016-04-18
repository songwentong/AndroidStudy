package com.example.songwentong.rpcaculator;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载布局
        setContentView(R.layout.activity_result);

        //2.获取mainactivity传来的数据
        Intent intent = getIntent();
        Uri data = intent.getData();
//        System.out.print("data:"+data);
        Log.i("aaa","data:"+intent.getStringExtra("name"));

        TextView tv_name = (TextView)findViewById(R.id.tv_name);
        TextView tv_sex = (TextView)findViewById(R.id.tv_sex);
        TextView tv_result = (TextView)findViewById(R.id.tv_score);
        String name = intent.getStringExtra("name");
        int sex = intent.getIntExtra("sex",0);
        //4.根据name和sex显示数据
        tv_name.setText(intent.getStringExtra("name"));
        byte[] bytes;
        //显示性别
        try {
            switch(sex){
                case 1:
                    tv_sex.setText("男");
                    bytes = name.getBytes("gbk");
                    break;
                case 2:
                    tv_sex.setText("女");
                    bytes = name.getBytes("utf-8");
                    break;
                case 3:
                    tv_sex.setText("其他");
                    bytes = name.getBytes("iso-8859-1");
                    break;
            }
        }catch (Exception e){

        }


        //6.计算人品的结果,市面上大多数应用采取随机数的办法
//        byte[] bytes = name.getBytes();
        int total = 0;
        for (byte b :bytes){
            int number = b&0xff;

            total += number;
        }
        int score = Math.abs(total)%100;
        if(score>90){
            tv_result.setText("得分:"+score+" 您的人品非常好,您家的祖坟都冒青烟了");
        }else if (score>80){
            tv_result.setText("得分:"+score+" 您的人品还可以");
        }else if (score>80){
            tv_result.setText("得分:"+score+" 您的人品刚及格");
        }else{
            tv_result.setText("得分:"+score+" 您的人品太次了,需要努力了");
        }
    }


}




















