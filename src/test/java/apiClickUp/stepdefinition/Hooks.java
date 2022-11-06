package apiClickUp.stepdefinition;

import apiClickUp.helpers.TestCaseContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
 @Before
    public void beforeHook(){
     TestCaseContext.init();
        System.out.println("The scenario is startet");
    }
 @After
    public void afterHook(){
        System.out.println("The scenario has ended");
    }
}
