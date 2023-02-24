import java.util.List;
import java.util.ArrayList;


public class CitizenshipPrinter {
    private List <Citizenship> citizenshipList = new ArrayList<Citizenship>();
    
    public List<Citizenship> getCitizenshipList(){
        return citizenshipList; 
    }

    public void addCitizen(Citizenship citizen){
        citizenshipList.add(citizen); 
    }

    public void PrintCitizenshipList(){
        for (Citizenship citizen : this.citizenshipList){
            if (citizen instanceof American){
                citizen.speak(); 
                American american = (American) citizen; 
                System.out.println(american.getState());
            }
            else if (citizen instanceof Indonesian){
                citizen.speak(); 
                Indonesian indonesian = (Indonesian) citizen;
                indonesian.speakLocalLanguage();
            }
            else if (citizen instanceof Japanese){
                citizen.speak();
                Japanese japanese = (Japanese) citizen;
                System.out.println(japanese.getFavAnime()); 
            }
            else{
                System.out.println("Not Possible");
            }
        }
    }
}
