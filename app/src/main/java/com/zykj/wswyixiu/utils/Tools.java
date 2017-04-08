package com.zykj.wswyixiu.utils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by zykj on 2017/4/8.
 */

public class Tools {
    public  static Context context;
    public static  void i(String str){
        Log.i("", "i: "+str);
    }
    public  static  void t(String str){
        Toast.makeText(context, ""+str, Toast.LENGTH_SHORT).show();
    }

}
