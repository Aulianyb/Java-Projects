package Mediator;
import java.util.*; 
public class ConcreteMediator {
    List<Mediator> mList = new ArrayList<Mediator>(); 
    
    public ConcreteMediator(){

    }
    
    public void execute(Mediator m){
        if (mList.size() >= 2){
            System.out.println(mList.get(0).getX() + " dikeluarkan!"); 
            mList.remove(0); 
            mList.add(m);
        }else{
            mList.add(m);
        }
        System.out.printf("["); 
        for (Mediator item : mList){
            System.out.printf(item.getX() + " "); 
        }
        System.out.printf("]\n"); 
    }
}
