package com.bridgeLabz.designPattern.creational.singleton;

public class BillPugh {

    private BillPugh(){}
    
    //private static inner class only on
    private static class SingletonHelper{
        private static final BillPugh INSTANCE = new BillPugh();
    }
    
    public static BillPugh getInstance(){
        return SingletonHelper.INSTANCE;
    }
}