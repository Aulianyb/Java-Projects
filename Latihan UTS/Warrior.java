public class Warrior extends NPC{
    private String weapon; 

    public Warrior(){
        super("Warrior"); 
        weapon = "Sword"; 
    }

    public String toString(){
        return "I am a brave warrior and i wield a " + weapon; 
    }
}
