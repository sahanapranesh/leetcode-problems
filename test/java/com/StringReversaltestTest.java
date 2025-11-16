package com;

import junit.framework.TestCase;

public class StringReversaltestTest extends TestCase {
    private StringReversaltest reversaltest;
    public void setUp() throws Exception {
        super.setUp();
        reversaltest = new StringReversaltest();
    }

    public void testReverse() {
        assertEquals("Test that the result is correct",
                reversaltest.reverse("Sahana"),"anahaS");
        assertEquals("Test that the result is correct",
                reversaltest.reverse("My name is Sahana"),"anahaS si eman yM");
        assertEquals("Test that the result is correct",
                reversaltest.reverse(null),"");
    }

    public void testException() {
        try{
            reversaltest.reverse(null);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }



}