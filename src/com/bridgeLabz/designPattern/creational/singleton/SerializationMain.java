package com.bridgeLabz.designPattern.creational.singleton;

import java.io.Serializable;

public class SerializationMain implements Serializable{

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializationMain(){}
    
    public static class SingletonHelper{
        public static final SerializationMain instance = new SerializationMain();
    }
    
    public static SerializationMain getInstance(){
        return SingletonHelper.instance;
    }
    
}