public class Indonesian extends Citizenship {
    private IndonesianLocalLanguage localLanguage; 


    public Indonesian(String surname, String givenName, IndonesianLocalLanguage localLanguage){
        super(surname, givenName); 
        this.localLanguage = localLanguage; 
    }

    public IndonesianLocalLanguage getLocalLanguage(){
        return localLanguage; 
    }

    public void speakLocalLanguage(){
        if (IndonesianLocalLanguage.JAVANESE.equals(localLanguage)){
            System.out.println("I am Javanese");
        }
        if (IndonesianLocalLanguage.SUNDANESE == (localLanguage)){
            System.out.print("I am Sundanese");
        }
    }

    @Override
    public void speak(){
        System.out.println("I am Indonesian");
    }
    
}
