package org.iii.tw.threadtest;

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

    }
    public void testBu2(View v){

    }
    private class Thread1 extends Thread{
        @Override
        public void run() {
            for(int i=0; i<10; i++){
                Log.d("bread","i="+i);
            }
        }
    }
}
