package TemplateMethod;

public abstract class BaseLoading {
    public void load(){
        load1();
        load2(); 
    }

    public abstract void load1(); 
    public abstract void load2(); 

}
