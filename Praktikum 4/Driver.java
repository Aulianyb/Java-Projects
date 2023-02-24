public class Driver {
    public static void main(String[] args){
        Bird b = new Bird();
        Cat c = new Cat();
        Fish f = new Fish(); 
        
        Animal[] pets = {b, c, f}; 

        for (Animal x : pets){
            x.move();
        }
    }    
}
