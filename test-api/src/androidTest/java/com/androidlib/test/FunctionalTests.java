package com.androidlib.test;

import android.test.AndroidTestCase;

import org.junit.Test;

public class FunctionalTests extends AndroidTestCase {

    private static final String TAG = FunctionalTests.class.getSimpleName();

    public void setUp() throws Exception {
        super.setUp();
    }
    
    @Test
    public void test() {
        Hello.hello();
    }

}