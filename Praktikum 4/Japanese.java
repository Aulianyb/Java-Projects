public class Japanese extends Citizenship{
    private String favorite_anime; 

    public Japanese(String surname, String givenName, String favorite_anime){
        super(surname, givenName);
        this.favorite_anime = favorite_anime; 
    }

    public String getFavAnime(){
        return favorite_anime; 
    }

    @Override
    public void speak(){
        System.out.println("I am Japanese"); 
    }
}