package com.marvel999.mvvm_first_project

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.hamcrest.Condition.matched
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{
@Test
    fun activityTest(){
       val activityScenario= ActivityScenario.launch(MainActivity::class.java);
      onView(withId(R.id.main_textview)).check(matches(isDisplayed()))

    }
@Test
    fun butonclickTest(){
        val activityScenario= ActivityScenario.launch(MainActivity::class.java);
        onView(withId(R.id.main_textview)).check(matches(isDisplayed()))
//        onView(withId(R.id.main_textview)).check(matches(withText(R.string.first_activity)))

//        val activityScenario=ActivityScenario.launch(MainActivity::class.java);
//        onView(withId(R.id.next_activity_btn)).perform(click());
//        onView(withId(R.id.next_activity_btn)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
    }
}