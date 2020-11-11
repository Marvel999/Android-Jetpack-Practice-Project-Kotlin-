package com.marvel999.mvvm_first_project


import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Test
import java.util.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.marvel999.mvvm_first_project", appContext.packageName)
    }



    @Test
    fun display() {
        val objects=Computaion();

        assertEquals(4,objects.Multiply(2,2));
        assertEquals(2,objects.Sum(2,2));
//        val actionsenario=ActivityScenario.launch(MainActivity::class.java)
//        onView(withId(R.id.main_textview))

    }
}