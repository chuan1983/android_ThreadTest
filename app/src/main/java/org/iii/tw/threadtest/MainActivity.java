package org.iii.tw.threadtest;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.test_view);
    }
    public void testBu1(View v){
    Thread t1 = new Thread1();
        t1.start();
    }
    public void testBu2(View v){

    }
    private class Thread1 extends Thread{
        @Override
        public void run() {
            for(int i=0; i<10; i++){
                Log.d("bread","i="+i);
                tv.setText("i="+i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    private class UIHandler extends Handler{
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    }
}
