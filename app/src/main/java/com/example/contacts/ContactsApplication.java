package com.example.contacts;

import android.app.Application;

import com.backendless.Backendless;

public class ContactsApplication extends Application
{
    @Override
    public void onCreate() {
        super.onCreate();


        Backendless.initApp(this,
                "1BDCE6D9-486F-70CB-FFDA-4A743BE67400",
                "443AC7D0-6417-50F9-FF8A-087922B73300");
    }
}
