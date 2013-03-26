package com.example.push;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gcm.GCMRegistrar;

public class MainActivity extends Activity {
    private static final String TAG = MainActivity.class.getName();

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        GCMRegistrar.checkDevice(this);
        GCMRegistrar.checkManifest(this);
        final String regId = GCMRegistrar.getRegistrationId(this);
//        if (regId.equals("")) {
        GCMRegistrar.register(this, "459817483929");
//        } else {
//            Log.v(TAG, "Already registered");
//        }
    }
}
