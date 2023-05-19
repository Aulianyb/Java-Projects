package Proxy;

public class Client {
    public static void main(String[] args){
        BigInternet realInternet = new BigInternet(); 
        Internet proxy = new ProxyServer(realInternet); 
        proxy.request(1);
        proxy.request(1);
        proxy.request(1);
        proxy.request(2);

    }
}
