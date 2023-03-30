public class function {
    public static <Thing> void display_arr(Thing[] wawa){
        for (Thing i : wawa){
            System.out.printf(i + " "); 
        }
        System.out.println(); 
    }

    public static <Thing> Thing getOne(Thing[] arr){
        return arr[0]; 
    }
}
