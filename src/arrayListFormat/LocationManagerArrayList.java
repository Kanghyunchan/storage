package arrayListFormat;

import java.util.ArrayList;

public class LocationManagerArrayList {
	private ArrayList<Location> locationArrayList = new ArrayList<Location>();

	public LocationManagerArrayList(ArrayList<Location> locationArrayList) {
		this.locationArrayList = locationArrayList;
	}

	public String getLocationData(String keyCity) {
		Location tempLoc = null;
		for (int i = 0; i < locationArrayList.size(); i++) {
			if (locationArrayList.get(i).getCity().equals(keyCity)) {
				tempLoc = locationArrayList.get(i);
				return tempLoc.getCity() + " " + tempLoc.getLatitude() + " " + tempLoc.getLongitude();
			} else {
				continue;
			}
		}
		return null;
	}
}
