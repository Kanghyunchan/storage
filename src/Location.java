public class Location {
    private String city;
    private float latitude, longitude;

    public Location(String city, float latitude, float longitude){
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public String getCity(){return city;}
    public float getLatitude(){return latitude;}
    public float getLongitude(){return longitude;}
    public void setCity(String city){this.city = city;}
    public void setLatitude(float latitude){this.latitude = latitude;}
    public void setLongitude(float longitude){this.longitude = longitude;}
}
