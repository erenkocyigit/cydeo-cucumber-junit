package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    //import from io.cucumber.java
    @Before(order = 1)
    public void setupScenario(){
        System.out.println("====Setting up browser using cucumber @Before");
    }
    @Before (value = "@login", order = 2)
    public void setupScenarioForLogins(){
        System.out.println("====this will only apply to scenarios with @login tag @Before(@login)");
    }
    @Before (value = "@db",order = 0)
    public void setupForDatabaseScenarios(){
        System.out.println("====this will only apply to scenarios with tag @db");
    }

    @After
    public void tearDown(){
        System.out.println("====Closing browser using cucumber @After");
        System.out.println("====Scenario ended/ Take screenshot if failed!");
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("----------->applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("-----------> applying tearDown using @AfterStep");
    }

}
