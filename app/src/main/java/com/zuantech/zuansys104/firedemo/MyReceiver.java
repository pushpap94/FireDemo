package com.zuantech.zuansys104.firedemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by zuansys104 on 2/6/2017.
 */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent service1 = new Intent(context, MyAlarmService.class);
        context.startService(service1);

    }
}
