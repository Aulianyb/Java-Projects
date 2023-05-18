

public class Factory {
    
    class objOne extends Factory{
        private int x; 
        public objOne(){
            x = 10;   
        }
        public int getX(){
            return x; 
        }
    }

    class objTwo extends Factory{
        private int x; 
        public objTwo(){
            x = 20;   
        }
        public int getX(){
            return x; 
        }
    }

    public Factory(){

    }

    public Factory createObject(int x){
        if(x == 1){
            return new objOne(); 
        }else{
            return new objTwo(); 
        }
    }

}
