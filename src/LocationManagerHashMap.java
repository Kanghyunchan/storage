import java.util.HashMap;

public class LocationManagerHashMap {
	private HashMap<String, Location> locationHashMap = new HashMap<String, Location>();

	public LocationManagerHashMap(HashMap<String, Location> locationHashMap) {
		this.locationHashMap = locationHashMap;
	}

	public String getLocationData(String keyCity) {
		try {
			Location tempLoc = locationHashMap.get(keyCity);
			return tempLoc.getCity() + " " + tempLoc.getLatitude() + " " + tempLoc.getLongitude();
		} catch (NullPointerException e) {
			return "null";
		}
	}
}
