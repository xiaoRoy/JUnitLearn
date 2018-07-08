package com.learn.junit.chap3.component.test;

import com.learn.junit.chap3.component.Request;
import com.learn.junit.chap3.component.RequestHandler;
import com.learn.junit.chap3.component.Response;
import com.learn.junit.chap3.component.implement.DefaultController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DefaultControllerTest {

    private DefaultController defaultController;

    @Before
    public void instantiate() throws Exception{
        this.defaultController = new DefaultController();
    }

    @Test
    public void testMethod(){
        throw new RuntimeException("implement me");
    }

    @Test
    public void testAddHandler(){
        Request request = new SampleRequest();
        RequestHandler requestHandler = new SampleHandler();
        this.defaultController.addHandler(request, requestHandler);
        RequestHandler requestHandlerFromController = this.defaultController.getHandler(request);
        Assert.assertSame("Handler we set in controller should be the same handler we get",
                requestHandler, requestHandlerFromController);
    }


    private static class SampleRequest implements Request{
        @Override
        public String getName() {
            return "Test";
        }
    }

    private static class SampleHandler implements RequestHandler{
        @Override
        public Response process(Request request) throws Exception {
            return new SampleResponse();
        }
    }

    private static class SampleResponse implements Response{

    }
}
