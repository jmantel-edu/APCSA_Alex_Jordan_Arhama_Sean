import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantRunner {
    private String username;
    private String preferredPrimary;
    private String preferredSecondary;
    private String lastCommand;
    public ArrayList<Restaurant> restaurants = new ArrayList<>();
    public Scanner sc = new Scanner(System.in);

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

    public void pickPriceRange() {
        System.out.println("""
                What's your price range?
                0 ~ Cheap; under $20 per person
                1 ~ Moderate; between $20 and $30 per person
                2 ~ Expensive; over $30 per person

                x ~ Quit program
                """);
    }

    public void pickPrimary() {
        System.out.println("""
                What food are you thinking today?
                1 ~ East Asian (Chinese, Japanese, Korean, Vietnamese)
                2 ~ South Asian (Indian/Pakistani, African, Turkish/Greek, Middle Eastern)
                3 ~ American (Mexican, American, Brazilian, Central American)
                4 ~ European (Italian, French, Spanish, British/Irish)
                
                b ~ Back to price range select
                x ~ Quit program
                """);
    }

    
    public void pickSecondaryEA() {

    }

    public void pickSecondarySA() {

    }

    public void pickSecondaryAM() {

    }

    public void pickSecondaryEU() {

    }

    public void quitProgram() {
        sc.close();
        System.out.println("Thanks for using this program! Bon appetit!");
        System.exit(0);

    }

    public void initializeRestaurants() {
    // ==================== EAST ASIAN ====================
    // Chinese
    restaurants.add(new Restaurant("Taipei 101", "121 E Chatham St, Cary, NC 27511", "Chinese spot specializing in cooking from the Sichuan & Taiwanese regions, plus a dim sum menu.", 1, "East Asian", "Chinese"));
    restaurants.add(new Restaurant("Orient Garden", "202 W North Carolina 54 #401, Durham, NC 27713", "Shopping-center Chinese restaurant with Asian decor & a menu of classics for eat-in or takeout.", 0, "East Asian", "Chinese"));
    restaurants.add(new Restaurant("Fang's Kitchen", "677 Mills Park Dr, Cary, NC 27519", "Chinese restaurant that offers various takeout classics without breaking the bank.", 0, "East Asian", "Chinese"));
    restaurants.add(new Restaurant("Szechuan Mansion Hotpot", "746 9th St, Durham, NC 27705", "Hot pot restaurant with a wide selection of broths, ingredients, and options for meat and vegetables.", 1, "East Asian", "Chinese"));

    // Korean
    restaurants.add(new Restaurant("Ajumma", "2055 Renaissance Park Pl, Cary, NC 27513", "Easygoing Korean place serving bulgogi, bibimbap, and other beloved Korean classics.", 1, "East Asian", "Korean"));
    restaurants.add(new Restaurant("KPOT Korean BBQ & Hot Pot", "5426B New Hope Commons Dr, Durham, NC 27707", "All-you-can-eat Korean restaurant serving Korean BBQ and hot pot.", 2, "East Asian", "Korean"));
    restaurants.add(new Restaurant("Bonchon Capital Hill", "205 E Franklin St, Chapel Hill, NC 27514", "Casual chain serving cooked-to-order Korean fried chicken, plus other traditional eats.", 0, "East Asian", "Korean"));

    // Japanese
    restaurants.add(new Restaurant("Miso Ramen Bar", "970 High House Rd #128, Cary, NC 27513", "Easygoing choice whipping up rice bowls, ramen & other simple Japanese bites, plus outdoor seating.", 0, "East Asian", "Japanese"));
    restaurants.add(new Restaurant("Sushi Mon", "3800 Glenwood Ave #100, Raleigh, NC 27612", "Extended counter seating in a modern setting with a menu of elevated takes on sushi & Japanese fare.", 2, "East Asian", "Japanese"));
    restaurants.add(new Restaurant("Shinmai Shokudo", "1904 NW Maynard Rd #102-2, Cary, NC 27513", "Japanese restaurant with ramen, udon, and various other small dishes.", 2, "East Asian", "Japanese"));
    restaurants.add(new Restaurant("Kinya Ramen Sushi", "202 W North Carolina 54 Ste 506, Durham, NC 27713", "Japanese restaurant serving ramen and fresh sushi, as well as other Japanese staples.", 1, "East Asian", "Japanese"));

    // Vietnamese
    restaurants.add(new Restaurant("ItsAWrap Vietnamese Eatery", "10970 Chapel Hill Rd #120, Morrisville, NC 27560", "Informal restaurant offering noodle soup, build-your-own sandwiches & other Vietnamese staples.", 0, "East Asian", "Vietnamese"));
    restaurants.add(new Restaurant("Phở Kitchen", "1024 Market Center Drive, Morrisville, NC 27560", "Vietnamese restaurant offering pho, banh mi, and various other Vietnamese offerings.", 1, "East Asian", "Vietnamese"));
    restaurants.add(new Restaurant("Pho 919 Viet-Thai and Tea", "3504 Davis Dr, Morrisville, NC 27560", "Low-key restaurant in a strip mall serving Vietnamese noodle soups, spring rolls & fried rice.", 0, "East Asian", "Vietnamese"));

    // ==================== SOUTH ASIAN ====================
    // Indian / Pakistani
    restaurants.add(new Restaurant("Salt and Pepper Indian Cuisine", "3793 Samet Dr Unit 180, High Point, NC 27265", "Restaurant serving Indian and Pakistani cuisine with generous portions.", 1, "South Asian", "Indian / Pakistani"));
    restaurants.add(new Restaurant("Kababish Cafe", "201 W Chatham St #103, Cary, NC 27511", "Comfortable eatery featuring traditional Indian & Pakistani food such as chana masala & lamb kebabs.", 1, "South Asian", "Indian / Pakistani"));
    restaurants.add(new Restaurant("Tadka - Biryani& Tandoor", "9825 Chapel Hill Rd Ste f, Morrisville, NC 27560", "A hidden gem Indian restaurant serving chicken biryani and other Indian staples.", 0, "South Asian", "Indian / Pakistani"));
    restaurants.add(new Restaurant("Biryani Maxx", "590 E Chatham St Ste 102, Cary, NC 27511", "Informal eatery offering a typical range of Indian appetizers, meat & veggie entrees & rice dishes.", 1, "South Asian", "Indian / Pakistani"));

    // African
    restaurants.add(new Restaurant("Hady's Restaurant | International Cuisine", "717 E Martin St Ste 199, Raleigh, NC 27601", "Relaxed locale whipping up African & international offerings in simple surrounds, plus delivery.", 1, "South Asian", "African"));
    restaurants.add(new Restaurant("Nafkot Ethiopian Restaurant & Bar", "2109 Avent Ferry Rd #146, Raleigh, NC 27606", "Colorful venue offering wots & tibs, plus veggie options, in a relaxed atmosphere.", 0, "South Asian", "African"));

    // Turkish / Greek
    restaurants.add(new Restaurant("Bosphorus Restaurant", "329 N Harrison Ave Ste A, Cary, NC 27513", "Turkish & Mediterranean kebabs, meze & more in an unassuming strip-mall location.", 0, "South Asian", "Turkish / Greek"));
    restaurants.add(new Restaurant("Istanbul Restaurant", "914 Kildaire Farm Rd, Cary, NC 27511", "Turkish restaurant with authentic food, fresh bread, and many options for vegetarians.", 0, "South Asian", "Turkish / Greek"));
    restaurants.add(new Restaurant("Greek Fiesta Raleigh", "8521 Brier Creek Pkwy #109, Raleigh, NC 27617", "Relaxed counter-serve chain offering Greek fare, including grilled pita sandwiches & kebabs.", 0, "South Asian", "Turkish / Greek"));

    // Middle Eastern
    restaurants.add(new Restaurant("Baba Ghannouj Mediterranean Bistro", "2468 Walnut St, Cary, NC 27518", "Mediterranean place that offers kebab, kufta, shawarma, and baba ghannouj.", 0, "South Asian", "Middle Eastern"));
    restaurants.add(new Restaurant("Sassool", "1347 Kildaire Farm Rd, Cary, NC 27511", "Mediterranean restaurant offering dishes like shawarma and hummus in generous portions.", 0, "South Asian", "Middle Eastern"));
    restaurants.add(new Restaurant("Shawarma Stop", "10966 Chapel Hill Rd, Morrisville, NC 27560", "Clean Mediterranean restaurant that serves shawarma, falafel, and more with fresh ingredients.", 0, "South Asian", "Middle Eastern"));
    restaurants.add(new Restaurant("Jasmin and Olivz Mediterranean - Weston", "9934 Chapel Hill Rd, Morrisville, NC 27560", "Casual counter-serve joint featuring familiar Mediterranean & Lebanese dishes in a simple interior.", 0, "South Asian", "Middle Eastern"));

    // ==================== AMERICAN ====================
    // Mexican
    restaurants.add(new Restaurant("Taqueria la Esquina", "10500 Chapel Hill Rd, Morrisville, NC 27560", "Informal, kid-friendly eatery for tacos, burritos, quesadillas and other Mexican fare.", 0, "American", "Mexican"));
    restaurants.add(new Restaurant("Dos Taquitos", "6101 Glenwood Ave, Raleigh, NC 27612", "Family-owned local institution since 1991, known for authentic Mexican recipes, eclectic folk art decor, and craft margaritas.", 1, "American", "Mexican"));
    restaurants.add(new Restaurant("Centro", "106 S Wilmington St, Raleigh, NC 27601", "Vibrant downtown spot serving upscale, scratch-made Mexican & Latin American dishes sourced from local farms.", 1, "American", "Mexican"));
    restaurants.add(new Restaurant("El Dorado", "2818 Creedmoor Rd, Raleigh, NC 27612", "Family-run Triangle staple established in 1987, serving traditional sizzled fajitas, burritos, and classic Mexican plates.", 0, "American", "Mexican"));
    restaurants.add(new Restaurant("Gringo A Go Go", "100 N Person St, Raleigh, NC 27601", "Laid-back downtown taqueria popular for authentic tacos, house salsa, and extensive vegan Mexican menu items.", 0, "American", "Mexican"));

    // American
    restaurants.add(new Restaurant("Poole's Diner", "428 S McDowell St, Raleigh, NC 27601", "Iconic local diner serving elevated Comfort food and classic Southern-American fare in a historic retro setting.", 1, "American", "American"));
    restaurants.add(new Restaurant("Char-Grill", "618 Hillsborough St, Raleigh, NC 27603", "Long-standing local fast-food spot famous for flame-grilled burgers, fries, and milkshakes since 1959.", 0, "American", "American"));
    restaurants.add(new Restaurant("Irregardless Cafe", "901 W Morgan St, Raleigh, NC 27603", "A Raleigh staple since 1975, offering farm-to-table American cuisine with robust vegetarian and vegan options.", 1, "American", "American"));
    restaurants.add(new Restaurant("Crawford and Son", "618 N Person St, Raleigh, NC 27604", "Neighborhood bistro serving honest, detail-driven American dishes created by acclaimed chef Scott Crawford.", 2, "American", "American"));
    restaurants.add(new Restaurant("MoJoe's Burger Joint", "620 Glenwood Ave, Raleigh, NC 27603", "Casual neighborhood hangout known for big, customizable hand-pattied burgers and craft beers.", 0, "American", "American"));

    // Brazilian
    restaurants.add(new Restaurant("Estampa Gaúcha", "3931 Macaw St, Suite A, Raleigh, NC 27617", "Locally operating churrascaria near RDU offering traditional fire-roasted prime meats carved tableside by gaucho chefs.", 2, "American", "Brazilian"));
    restaurants.add(new Restaurant("Boteco do Brasil", "160 Cannonball Ln, Chapel Hill, NC 27517", "Authentic Brazilian neighborhood spot offering traditional boteco appetizers, feijoada, and street food.", 0, "American", "Brazilian"));
    restaurants.add(new Restaurant("Padaria Brasil Bakery", "240 St Andrews Dr, Oxford, NC 27565", "Independent bakery and cafe serving traditional Brazilian pastries, coxinha, pao de queijo, and espresso.", 0, "American", "Brazilian"));
    restaurants.add(new Restaurant("Terra Gaúcha Brazilian Steakhouse", "4031 Westchase Blvd, Raleigh, NC 27607", "Authentic churrasco experience featuring gourmet hot/cold salad tables and continuous table-side meat service.", 2, "American", "Brazilian"));
    restaurants.add(new Restaurant("Sabor Brasil (Food Truck / Catering)", "Raleigh-Durham Area, NC 27601", "Locally operated mobile kitchen bringing traditional home-style Brazilian plates, pastéis, and grilled meats across the Triangle.", 0, "American", "Brazilian"));

    // Central America
    restaurants.add(new Restaurant("El Cuscatleco", "5023 Wake Forest Hwy, Durham, NC 27703", "Locally owned Salvadoran and Guatemalan spot famous for handmade pupusas, tamales, and plantain dishes.", 0, "American", "Central America"));
    restaurants.add(new Restaurant("Guasaca", "4025 Lake Boone Trail, Raleigh, NC 27607", "Triangle-founded quick-casual spot specializing in customizable Venezuelan arepas, bowls, and fresh salsas.", 0, "American", "Central America"));
    restaurants.add(new Restaurant("Pupuseria y Taqueria La Unica", "3600 Hillsborough Rd, Durham, NC 27705", "Unpretentious eatery specializing in thick Salvadoran pupusas stuffed with cheese, pork, and loroco.", 0, "American", "Central America"));
    restaurants.add(new Restaurant("Restaurante El Carbon", "2121 University Dr, Durham, NC 27707", "Neighborhood Central American restaurant serving Honduran and Salvadoran specialties like baleadas and charcoal-grilled meats.", 0, "American", "Central America"));
    restaurants.add(new Restaurant("Doña Beti Restaurant", "550 S Lake Park Blvd, Raleigh, NC 27610", "Local spot specializing in authentic Honduran baleadas, Salvadoran pupusas, and regional Latin breakfast plates.", 0, "American", "Central America"));

    // ==================== EUROPEAN ====================
    // Italian
    restaurants.add(new Restaurant("Cafe Babymoon", "100 Jerusalem Dr #106, Morrisville, NC 27560", "Italian fare & wines from a smart-casual spot with outdoor patio & delivery service to area hotels.", 1, "European", "Italian"));
    restaurants.add(new Restaurant("Bongiorno & Son Italian Specialties", "2400 W. Terminal Blvd, Morrisville, NC 27560", "Italian deli with sandwiches, coffee, and various Italian and Italian-American items.", 0, "European", "Italian"));
    restaurants.add(new Restaurant("Bambino's Pizza", "4129 Davis Dr, Morrisville, NC 27560", "New York-style pizza place with a variety of other offerings from salads to hero subs.", 0, "European", "Italian"));
    restaurants.add(new Restaurant("La Grassa Pastifico", "908 NE Maynard Rd, Cary, NC 27513", "Authentic style Italian cuisine with many different types of pasta dishes.", 2, "European", "Italian"));
    restaurants.add(new Restaurant("Tazza Kitchen Stone Creek Village", "600 Ledgestone Way, Cary, NC 27519", "Outlet offering wood-fired pies, regional wines & local brews in a warm setting with a bar.", 1, "European", "Italian"));

    // British / Irish
    restaurants.add(new Restaurant("Trali Irish Pub & Restaurant", "10370 Moncreiffe Rd #109, Raleigh, NC 27617", "An Irish pub with bar staples & daily specials from a carving table, plus a patio & WiFi.", 1, "European", "British / Irish"));
    restaurants.add(new Restaurant("Bru's Public House", "5433 Wade Park Blvd #100, Raleigh, NC 27607", "An Irish pub with a large selection of pub food, burgers, and craft beers.", 1, "European", "British / Irish"));
    restaurants.add(new Restaurant("Doherty's Irish Pub & Restaurant", "1979 High House Rd, Cary, NC 27519", "Comfortable bar with elevated Irish food, multiple beers on tap, large televisions & live music.", 1, "European", "British / Irish"));

    // French
    restaurants.add(new Restaurant("Bluebird", "601 Meadowmont Village Cir, Chapel Hill, NC 27517", "French restaurant with a wide selection of items, recommended for special occasions. (Reservation required)", 2, "European", "French"));
    restaurants.add(new Restaurant("Vin Rouge", "2010 Hillsborough Rd, Durham, NC 27705", "Classic French cuisine backed by an extensive wine list in an intimate, upscale atmosphere. (Reservation required)", 2, "European", "French"));
    restaurants.add(new Restaurant("Rue Cler", "401 E Chapel Hill St, Durham, NC 27701", "Comfy Parisian bistro with rotating menus & an extensive wine list that includes rare bottles. (Reservation required)", 2, "European", "French"));

    // Spanish
    restaurants.add(new Restaurant("Proximo", "173 E Franklin St, Chapel Hill, NC 27514", "Authentic Spanish restaurant with tapas, paella, and many other Spanish foods.", 2, "European", "Spanish"));
    restaurants.add(new Restaurant("Mateo Bar de Tapas", "109 W Chapel Hill St, Durham, NC 27701", "Southern-style tapas & an extensive wine list in a casually chic, contemporary setting.", 2, "European", "Spanish"));
    restaurants.add(new Restaurant("Taberna Tapas", "325 W Main St, Durham, NC 27701", "Spanish restaurant serving small & large plates, including paella, along with cocktails & wine.", 2, "European", "Spanish"));
}


    public static void main(String[] args) {
        RestaurantRunner r = new RestaurantRunner();
        r.initializeRestaurants();
        r.greet();
        
    }
}