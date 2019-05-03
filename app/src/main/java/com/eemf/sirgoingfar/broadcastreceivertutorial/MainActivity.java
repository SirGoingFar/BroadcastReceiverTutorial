package com.eemf.sirgoingfar.broadcastreceivertutorial;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    BroadcastReceiver mReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mReceiver = new MultipurposeBroadcastReceiver();
    }

   /* @Override
    protected void onResume() {
        super.onResume();
        IntentFilter filter = new IntentFilter();
        filter.addAction("normal");
        registerReceiver(mReceiver, filter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(mReceiver);
    }*/

    public void onButtonClick(View view){
        Intent intent = new Intent();
        intent.setAction(MultipurposeBroadcastReceiver.ACTION_NORMAL);
//        intent.addCategory(Intent.CATEGORY_DEFAULT);
        sendBroadcast(intent);
    }
}
