package com.bridgeLabz.designPattern.creational.singleton;;

public class StaticBlock {

    private static StaticBlock instance;
    
    private StaticBlock(){}
    
    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlock();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static StaticBlock getInstance(){
        return instance;
    }
}