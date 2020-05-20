package com.vytrack.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {



    @Before
    public void setup(){
        System.out.println("Test setup");
    }

    @After
    public void teardown(){
        System.out.println("Test clean up");
    }
}
