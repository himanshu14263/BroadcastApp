package com.example.mrgreen.recievebroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ReceiveBroadcast extends BroadcastReceiver {
    public ReceiveBroadcast() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
       Toast.makeText(context,"Broadcast File Received",Toast.LENGTH_LONG).show();
    }
}
