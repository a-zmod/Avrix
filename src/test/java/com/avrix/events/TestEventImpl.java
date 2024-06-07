package com.avrix.events;

/**
 * Implementing a test event
 */
public class TestEventImpl extends TestEvent {
    /**
     * Called Event Handling Method
     *
     * @param testString  Test argument
     * @param testInteger Test argument
     */
    @Override
    public void handleEvent(String testString, Integer testInteger) {
        System.out.printf("[#] Test event! String: %s, Integer: %s%n", testString, testInteger);
    }

    /**
     * Called Event Handling Method
     */
    @Override
    public void handleEvent() {
        System.out.println("[#] Test event!");
    }
}
