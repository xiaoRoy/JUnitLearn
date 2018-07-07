package com.learn.junit.chap3.component.implement;

import com.learn.junit.chap3.component.Controller;
import com.learn.junit.chap3.component.Request;
import com.learn.junit.chap3.component.RequestHandler;
import com.learn.junit.chap3.component.Response;

import java.util.HashMap;
import java.util.Map;

public class DefaultController implements Controller {

    private Map<String, RequestHandler> requestHandlerMap = new HashMap<>();

    @Override
    public Response processRequest(Request request) {
        Response response;
        try {
            response = getHandler(request).process(request);
        }catch (Exception exception){
            response = new ErrorResponse(request, exception);
        }
        return response;
    }

    @Override
    public void addHandler(Request request, RequestHandler requestHandler) {
        if(this.requestHandlerMap.containsKey(request.getName())){
            throw new RuntimeException("A request handler has " +
                    "already been registered for request name " + "[" + request.getName() + "]");
        }
        this.requestHandlerMap.put(request.getName(), requestHandler);
    }

    public RequestHandler getHandler(Request request) {
        if (!this.requestHandlerMap.containsKey(request.getName())) {
            String message = "Cannot find handler for the request name"
                    + "[" + request.getName() + "]";
            throw new RuntimeException(message);
        }
        return this.requestHandlerMap.get(request.getName());
    }
}
