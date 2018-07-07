package com.learn.junit.chap3.component;

public interface Controller {

    Response processRequest(Request request);

    void addHandler(Request request, RequestHandler requestHandler);
}
