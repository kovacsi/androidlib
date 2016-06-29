package com.androidlib.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

@RunWith(AndroidJUnit4.class)
public class NullabilityTest {

    private static final String TAG = NullabilityTest.class.getSimpleName();

    @BeforeClass
    public static void beforeClass() {
        Log.d(TAG, "beforeClass");
    }

    @Test
    public void t1() {
        Hello.hello();
    }

    @Test
    public void t2() {
        //Assert.fail();
    }

    @Test
    public void t3() {
        Log.d(TAG, "NullabilityTest 3 log");
    }

}