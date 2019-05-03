package com.eemf.sirgoingfar.broadcastreceivertutorial;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MultipurposeBroadcastReceiver extends BroadcastReceiver {
    public static String ACTION_NORMAL = "normal";
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction() != null
                && intent.getAction().equalsIgnoreCase(ACTION_NORMAL)){
            Toast.makeText(context, "Broadcast Received!", Toast.LENGTH_SHORT).show();
        }
    }
}
