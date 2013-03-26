package com.example.push;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gcm.GCMBaseIntentService;


public class GCMIntentService extends GCMBaseIntentService {

    private static String TAG = GCMIntentService.class.getName();

    public GCMIntentService() {
        super("459817483929");
    }

    @Override
    protected void onMessage(Context context, Intent intent) {
        Log.i(TAG, "Received message");
        Log.i(TAG, intent.toString());
    }

    @Override
    protected void onError(Context context, String s) {
        Log.e(TAG, s);
    }

    @Override
    protected void onRegistered(Context context, String s) {
        Log.i(TAG, "Registered!");
        Log.i(TAG, s);
    }

    @Override
    protected void onUnregistered(Context context, String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
