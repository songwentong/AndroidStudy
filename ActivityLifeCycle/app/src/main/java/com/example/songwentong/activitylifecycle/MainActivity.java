package com.example.songwentong.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/*
启动
create -> start -> resume
离开
pause -> stop
恢复
start -> resume
//关闭
pause -> stop ->destory
*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("1","onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    protected  void onRestart(){
        Log.i("1","onRestart");
        super.onRestart();
    }
    protected void onDestroy() {
        Log.i("1","onDestroy");
        super.onDestroy();
    }
    protected void onStart(){
        Log.i("1","onStart");
        super.onStart();

    }
    protected void onStop(){
        Log.i("1","onStop");
        super.onStop();

    }
    protected  void onResume(){
        Log.i("1","onResume");
        super.onResume();


    }
    protected void onPause(){
        Log.i("1","onPause");
        super.onPause();


    }

}
