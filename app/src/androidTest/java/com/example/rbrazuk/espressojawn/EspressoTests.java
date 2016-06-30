package com.example.rbrazuk.espressojawn;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.action.ViewActions.*;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class EspressoTests {

    public static final String APP_TITLE = "Espresso Jawn";

    @Rule
    public ActivityTestRule<MainActivity> mTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void assertTitle() {
        onView(withId(R.id.tv_title)).check(matches(withText(APP_TITLE)));
    }

    @Test
    public void fillFields() {
        onView(withId(R.id.et_email)).perform(typeText("rbrazuk@tonicdesign.com"));

        onView(withId(R.id.et_password)).perform(typeText("password"));

        onView(withId(R.id.bt_submit)).perform(click());

        onView(withId(R.id.tv_list_title)).check(matches(withText("wrestlers")));


    }
}
