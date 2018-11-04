package com.app.luan.DesignPattern.Singleton;

public class Singleton_enum {
    
    // 内部枚举类
    private enum EnmuSingleton{
        Singleton;
        private Singleton8 singleton;
        
        //枚举类的构造方法在类加载是被实例化 
        private EnmuSingleton(){
            singleton = new Singleton8();
        }
        public Singleton8 getInstance(){
            return singleton;
        }
    }
    public static Singleton8 getInstance() {
        return EnmuSingleton.Singleton.getInstance();
    }
}

class Singleton8{
    public Singleton8(){}
}