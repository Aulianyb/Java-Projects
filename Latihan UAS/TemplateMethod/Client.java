package TemplateMethod;

public class Client {
    public static void main(String[] args){
        AlternateLoading alt = new AlternateLoading(); 
        GoofyLoading goof = new GoofyLoading(); 

        alt.load();
        goof.load();
    }
}
