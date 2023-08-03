package location;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test client

		Location loc1 = new Location("FAU", 26.37283, -80.1051732);
		Location loc2 = new Location("Raymond_james ", 27.9758691, -82.505904);
		double distance = loc1.distanceTo(loc2);
		System.out.printf("%6.3f miles from %s to %s.", distance, loc1, loc2);
		// System.out.println(loc1 + " to " + loc2);

	}

}
