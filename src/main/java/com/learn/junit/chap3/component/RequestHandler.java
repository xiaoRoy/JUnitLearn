package com.learn.junit.chap3.component;

public interface RequestHandler {
    Response process(Request request) throws Exception;
}
