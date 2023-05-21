package com.omniimpact.javaexperiments;

import static org.junit.Assert.assertEquals;

import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class InstrumentedTestExample {

    @Test
    public void checkAppContext(){
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.omniimpact.javaexperiments", appContext.getPackageName());
    }

}
