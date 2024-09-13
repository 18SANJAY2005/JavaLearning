public class reservation{
	public static void main(String[] args) {
		String guestCount = args[0];
        String restaurantCapacity = args[1];
        String isRestaurantOpen = args[2];
        

        int a = Integer.valueOf(guestCount);
        int b = Integer.valueOf(restaurantCapacity);
        boolean c = Boolean.valueOf(isRestaurantOpen);
        

        if (b > a && c){
        	System.out.println("Reservation is Confirmed");
        	
        } else {
        	System.out.println("Reservation is Denied");	
        }
	}
}