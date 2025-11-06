package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class HookInitialisation {

    @Before
    public void testBefore() {
        System.out.println("Before method");
    }

    @After
    public void testAfter() {
        System.out.println("After method");
    }

    @BeforeStep
    public void testBeforeStep() {
        System.out.println("BeforeStep method");
    }

    @AfterStep
    public void testAfterStep() {
        System.out.println("AfterStep method");
    }

}
