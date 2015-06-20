package com.example.wychi.buildtesting;

import android.annotation.TargetApi;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
public class MyService extends NotificationListenerService {


    public void onNotificationPosted(StatusBarNotification sbn) {
        // optional
    }

    public void onNotificationRemoved(StatusBarNotification sbn) {

    }

}
