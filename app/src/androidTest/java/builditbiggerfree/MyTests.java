package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

/**
 * Created by kareem on 5/10/2017.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MyTests {

    @Test
    public void validateAsyncReturn() {
        String returnedJoke = "";
        try {
            returnedJoke = new MainActivity.EndpointsAsyncTask().execute(InstrumentationRegistry.getTargetContext()).get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        Assert.assertNotNull(returnedJoke);
        Assert.assertNotSame(returnedJoke, "");
    }
}
