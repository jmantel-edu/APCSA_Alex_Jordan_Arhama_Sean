import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantRunner {
    private String username;
    private String preferredPrimary;
    private String preferredSecondary;
    public ArrayList<Restaurant> restaurants = new ArrayList<>();

    // Begin initializing restaurants
    // Restaurant(String name, String bio, String address, int priceRange, String primaryCategory, String secondaryCategory)
    
    // End initializing restaurants

/*     
    public Restaurant pickRandomRestaurant() {
        return("PLACEHOLDER");
    } 

    public ArrayList<Restaurant> pickRestaurants(String primary, String secondary, int priceRange) {
        return("PLACEHOLDER")
    }
        
*/

    public void greet() {
        LocalTime midnight = LocalTime.MIDNIGHT;
        LocalTime now = LocalTime.now(ZoneId.of("America/New_York"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome! Can I have your name?");
        this.username = sc.nextLine();
        System.out.println(ChronoUnit.HOURS.between(midnight, now) + " hours since midnight");
        if (ChronoUnit.HOURS.between(midnight, now) <= 11) { // Midnight~11AM
            System.out.println("Hi, " + username + "! Good Morning!");
        } else if (ChronoUnit.HOURS.between(midnight, now) <= 16) { // 12PM~4PM
            System.out.println("Hi, " + username + "! Good Afternoon!");
        } else { // 5PM and later
            System.out.println("Hi, " + username + "! Good Evening!");
        }
        
    }

    public void initializeRestaurants() {
        // Chinese
        restaurants.add(new Restaurant("Taipei 101", "121 E Chatham St, Cary, NC 27511", "Chinese spot specializing in cooking from the Sichuan & Taiwanese regions, plus a dim sum menu.", 1, "East Asian", "Chinese"));
        restaurants.add(new Restaurant("Orient Garden", "Shopping center Chinese restaurant with Asian decor & a menu of classics for eat-in or takeout.", "202 W North Carolina 54 #401, Durham, NC 27713", 0, "East Asian", "Chinese"));
        restaurants.add(new Restaurant("Fang's Kitchen", "Chinese restaurant that offers various takeout classics without breaking the bank.", "677 Mills Park Dr, Cary, NC 27519", 0, "East Asian", "Chinese"));
        restaurants.add(new Restaurant("Szechuan Mansion Hotpot", "Hot pot restaurant with a wide selection of broths, ingredients, and options for meat and vegetables.", "746 9th St, Durham, NC 27705", 1, "East Asian", "Chinese"));

        // Korean
        restaurants.add(new Restaurant("Ajumma", "Easygoing Korean place serving bulgogi, bibimbap, and other beloved Korean classics.", "2055 Renaissance Park Pl, Cary, NC 27513", 1, "East Asian", "Korean"));
        restaurants.add(new Restaurant("KPOT Korean BBQ & Hot Pot", "All-you-can-eat Korean restaurant serving Korean BBQ and hot pot.", "5426B New Hope Commons Dr, Durham, NC 27707", 2, "East Asian", "Korean"));
        restaurants.add(new Restaurant("Bonchon Capital Hill", "Casual chain serving cooked-to-order Korean fried chicken, plus other traditional eats.", "205 E Franklin St, Chapel Hill, NC", 0, "East Asian", "Korean"));
        
        // Japanese
        restaurants.add(new Restaurant("Miso Ramen Bar", "Easygoing choice whipping up rice bowls, ramen & other simple Japanese bites, plus outdoor seating.", "970 High House Rd #128, Cary, NC 27513", 0, "East Asian", "Japanese"));
        restaurants.add(new Restaurant("Sushi Mon", "Extended counter seating in a modern setting with a menu of elevated takes on sushi & Japanese fare.", "3800 Glenwood Ave #100, Raleigh, NC 27612", 2, "East Asian", "Japanese"));
        restaurants.add(new Restaurant("Shinmai Shokudo", "Japanese restaurant with ramen, udon, and various other small dishes.", "1904 NW Maynard Rd #102-2, Cary, NC 27513", 2, "East Asian", "Japanese"));
        restaurants.add(new Restaurant("Kinya Ramen Sushi", "Japanese restaurant serving ramen and fresh sushi, as well as other Japanese staples.", "202 W North Carolina 54 Ste 506, Durham, NC 27713", 1, "East Asian", "Japanese"));

        // Vietnamese
        restaurants.add(new Restaurant("ItsAWrap Vietnamese Eatery", "Informal restaurant offering noodle soup, build-your-own sandwiches and other Vietnamese staples.", "10970 Chapel Hill Rd #120, Morrisville NC 27560", 0, "East Asian", "Vietnamese"));
        restaurants.add(new Restaurant("Pho Kitchen", "Vietnamese restaurant offering pho, banh mi, and various other Vietnamese foods.", "1024 Market Center Drive, Morrisville, NC", 1, "East Asian", "Vietnamese"));
        restaurants.add(new Restaurant("Pho 919 Viet-Thai and Tea", "Low-key restaurant in a strpi mall serving Vietnamese noodle soups, spring rolls, and fried rice.", "3504 Davis Dr, Morrisville, NC 27560", 0, "East Asian", "Vietnamese"));
    }


    public static void main(String[] args) {
        RestaurantRunner r = new RestaurantRunner();
        r.initializeRestaurants();
        r.greet();
    }
}