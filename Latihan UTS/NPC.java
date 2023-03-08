public class NPC implements Human_Plus {
    private String role;
    
    public NPC(String role){
        this.role = role; 
    }

    public String getRole(){
        return role; 
    }

    public void talk(){
        System.out.println("I am an NPC"); 
    }

    public int getUmur(){
        return default_umur; 
    }

    public String getPeran(){
        return role; 
    }

    public boolean isTheSame(Human placeholder){
        return (this.getRole().equals(placeholder.getPeran())); 
    }

    public void walk(){
        System.out.println("Wop wop wop");
    }

    public static void samesies(NPC npc1, NPC npc2){
        Human npc_old = (Human) npc1; 
        Human npc_young = (Human) npc2; 
        if (npc_old.isTheSame(npc_young)){
            System.out.println("WOAH ITS SAMESIES");
        }
        else{
            System.out.println("OH NOOOO :(");
        }
    }

    public String toString(){
        return "I am just a Humble NPC and I work as a " + role; 
    }
}
