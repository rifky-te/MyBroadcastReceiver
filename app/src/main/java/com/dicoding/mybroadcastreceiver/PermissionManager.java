package com.dicoding.mybroadcastreceiver;

import android.app.Activity;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;

public class PermissionManager {
    public static void check(Activity activity, String permission, int requestCode){
        if(ActivityCompat.checkSelfPermission(activity, permission) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(activity, new String[]{permission}, requestCode);
        }
    }
}
