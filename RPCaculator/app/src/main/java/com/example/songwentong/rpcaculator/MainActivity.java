package com.example.songwentong.rpcaculator;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

/**

 人品计算器
 功能:给出姓名,得出人品
 输入:姓名,性别
 输出:点击计算,跳转到另外一个页面.在新页面给出一个人品得分,给出一个评价



 */
public class MainActivity extends AppCompatActivity {
    //姓名输入框
    EditText et_name;
    //选择框
    RadioGroup rp_group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_name = (EditText) findViewById(R.id.et_name);
        rp_group = (RadioGroup)findViewById(R.id.radioGroup1);
    }
    public void click(View v){
        String name = et_name.getText().toString().trim();
        if (TextUtils.isEmpty(name)){
            Toast.makeText(getApplicationContext(),"请输入姓名",1).show();
            return;
        }
        int radioButtonId = rp_group.getCheckedRadioButtonId();
        int sex = 0;

        switch (radioButtonId){
            case R.id.rb_male:
                sex = 1;
                break;
            case R.id.rb_female:
                sex = 2;
                break;
            case R.id.rb_other:
                sex = 3;
                break;
        }
        if (sex == 0){
            Toast.makeText(getApplicationContext(),"请选择性别",1).show();
            return;
        }


        //4.跳转到结果页
        Intent intent = new Intent(this,ResultActivity.class);
        //传入需要的参数
        intent.putExtra("name",name);
        intent.putExtra("sex",sex);
        //执行intent,跳转到对应的activity
        startActivity(intent);
    }
}
