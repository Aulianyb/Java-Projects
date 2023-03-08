public class Alchemist extends NPC {
    public String chem; 

    public Alchemist(String chem){
        super("Alchemist"); 
        this.chem = chem; 
    }

    public String toString(){
        return "I am a smart Alchemist and i like " + chem; 
    }
}
