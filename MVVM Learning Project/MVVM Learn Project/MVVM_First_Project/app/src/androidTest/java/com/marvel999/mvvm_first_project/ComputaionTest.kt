package com.marvel999.mvvm_first_project

import org.junit.Assert.*
import org.junit.Test

class ComputaionTest{
    @Test
    fun display() {
        val objects=Computaion();
        for(i in 1..9){
            for(j in 1..9){
                var sum=i+j;
                var mul=i*j;
        assertEquals(mul,objects.Multiply(i,j));
        assertEquals(sum,objects.Sum(i,j));
            }
             if(i%2==0)
            assertEquals("Even number",objects.oddEven(i));
        }

//        val actionsenario=ActivityScenario.launch(MainActivity::class.java)
//        onView(withId(R.id.main_textview))

    }
}