package com.ideatest.demotest;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class helloIDEA {
    public static void main(String[] args){

        System.out.println("hello IDEA!");
        helloIDEA helloObj = new helloIDEA();
        helloObj.mapDemoTest();
    }

    public void mapDemoTest(){
        Map<String , Object> map = new HashMap<String, Object>();
        JSONObject jsobj = new JSONObject();
        String jsonStringObj = "";
        jsobj.put("name","IDEA");
        jsobj.put("colour","white");
        String jsobjString = jsobj.toString();
        System.out.println(jsobjString);
    }
}
