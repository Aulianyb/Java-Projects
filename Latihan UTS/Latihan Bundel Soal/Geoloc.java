//OOPS SALAH NAMA TAPI GAPAPA YA...?
public class Geoloc{
    private float lat;
    private float lon; 
    private int alt;

    public Geoloc(float lat, float lon, int alt){
        this.lat = lat; 
        this.lon = lon; 
        this.alt = alt; 
    }

    public void setLoc(float lat, float lon, int alt){
        this.lat = lat;
        this.lon = lon;
        this.alt = alt; 
    }

    public float getLat(){
        return lat; 
    }

    public float getLon(){
        return lon; 
    }

    public int getAlt(){
        return alt;
    }
}