package com.reactnativewithnativemodules;

import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class MyCustomModule extends ReactContextBaseJavaModule {

//    private static ReactApplicationContext reactApplicationContext;
    MyCustomModule(ReactApplicationContext reactContext){
        super(reactContext);
//        reactApplicationContext = reactContext;
    }


    @NonNull
    @Override
    public String getName() {
        return "CustomModuleBySami";
    }

    @ReactMethod
    public void showToast(String message) {
        Toast.makeText(getReactApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
