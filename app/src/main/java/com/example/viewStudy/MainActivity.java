package com.example.viewStudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.zhysb.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "test";
    private int[] data =new int[10];
    private ThreeView threeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        threeView =new ThreeView(this);
        setContentView(R.layout.activity_main);
        threeView = findViewById(R.id.test);
        new Thread(new MyGameCanvas()).start();


    }

    class MyGameCanvas implements Runnable {

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                update();
                threeView.postInvalidate();
            }
        }
    }

    /**
     * 更新坐标方法
     */
    private void update() {
        int w = getWindowManager().getDefaultDisplay().getWidth();
        for(int i=0;i<10;i++){
            threeView.data.add(i, (int) (Math.random()*500));
            if (threeView.data.get(i)>= w) {
                threeView.data.add(i,0);
            }
        }

    }
    public void onDestroy(){
        super.onDestroy();
    }


}
/**
 * 参考 https://blog.csdn.net/developer_jiangqq/article/details/7270571
 */



