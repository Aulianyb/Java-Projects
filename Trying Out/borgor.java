public class borgor {
    private String sauce; 
    private String patty; 

    public borgor(){

    }

    public borgor addSauce(String input){
        sauce = input; 
        return this; 
    }

    public borgor addPatty(String input){
        patty = input; 
        return this; 
    }

    public String toString(){
        return "patty = " + patty + ", sauce = " + sauce; 
    }
}
