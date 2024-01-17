package com.example.toast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.widget.Toast;



public class AirmodeReciever extends BroadcastReceiver {
    private MainActivity mainActivity;

    public AirmodeReciever(MainActivity activity) {
        mainActivity = activity;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (isAirplaneModeOn(context.getApplicationContext())) {
            Toast.makeText(context, "Purge mode On", Toast.LENGTH_SHORT).show();
            mainActivity.MediaManager(true);
        } else {
            Toast.makeText(context, "Purge mode Off", Toast.LENGTH_SHORT).show();
            mainActivity.MediaManager(false);
        }
    }

    public static boolean isAirplaneModeOn(Context context) {
        return Settings.System.getInt(context.getContentResolver(), Settings.Global.AIRPLANE_MODE_ON, 0) != 0;
    }
}
