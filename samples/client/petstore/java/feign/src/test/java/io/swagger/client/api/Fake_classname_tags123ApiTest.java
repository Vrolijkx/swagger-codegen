package io.swagger.client.api;

import org.junit.Before;
import org.junit.Test;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Client;

/**
 * API tests for Fake_classname_tags123Api
 */
public class Fake_classname_tags123ApiTest {

    private Fake_classname_tags123Api api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(Fake_classname_tags123Api.class);
    }

    
    /**
     * To test class name in snake case
     *
     * 
     */
    @Test
    public void testClassnameTest() {
        Client body = null;
        // Client response = api.testClassname(body);

        // TODO: test validations
    }
    
}