package TemplateMethod;

public class AlternateLoading extends BaseLoading{
    
    @Override
    public void load1(){
        System.out.println("Ini load1 di alternateloading");
    }

    @Override
    public void load2(){
        System.out.println("Ini load2 di alternateloading");
    }
}
