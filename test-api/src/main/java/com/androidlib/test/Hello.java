package com.androidlib.test;

import android.support.annotation.NonNull;
/**
 * Created by kovacsi on 24/06/16.
 */
public class Hello {
    public static void hello() {
        System.out.println("Hello World!");
    }
    public static void hello(@NonNull String param) {
        System.out.println(param);
    }
}
