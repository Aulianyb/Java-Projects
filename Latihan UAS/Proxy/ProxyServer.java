package Proxy;
import java.util.ArrayList;


public class ProxyServer implements Internet{
    private BigInternet internet; 
    private ArrayList<Integer> cache;

    public ProxyServer(BigInternet internet){
        this.internet = internet; 
        cache = new ArrayList<Integer>();  
    }
    
    public void request(Integer x){
        if (!cache.contains(x)){
            if (cache.size() == 5){
                cache.remove(0);
            }
            cache.add(x);
            internet.request(x);
            System.out.println(cache); 
        }
    }
}
