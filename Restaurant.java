public class Restaurant {
    private final String name;
    private final String bio;
    private final String address;
    private final int priceRange;
    private final String primaryCategory;
    private final String secondaryCategory;

    private String priceRangeStr; // Automatically defined based on priceRange in the constructor

    public Restaurant(String name, String bio, String address, int priceRange, String primaryCategory, String secondaryCategory) {
        this.name = name;
        this.bio = bio;
        this.address = address;
        this.priceRange = priceRange;
        this.primaryCategory = primaryCategory;
        this.secondaryCategory = secondaryCategory;

        // Define price range as String
        if (this.priceRange == 0) {
            this.priceRangeStr = "Cheap";
        } else if (this.priceRange == 1) {
            this.priceRangeStr = "Moderate";
        } else if (this.priceRange >= 2) {
            this.priceRangeStr = "Expensive";
        }
    }

    @Override
    public String toString() { // Short view
        return(this.name + ": " + this.secondaryCategory + " - " + this.priceRangeStr + " - " + this.address);
    }

    public String getSummary() { // Individual view
        return("[ " + this.name + " ]\n"
            + this.secondaryCategory + ", " + this.priceRangeStr + "\n"
            + this.bio + "\n" 
            + this.address

        );
    }

    public String getName() {
        return(name);
    }

    public String getPrimary() {
        return(primaryCategory);
    }

    public String getSecondary() {
        return(secondaryCategory);
    }

    public String getAddress() {
        return(address);
    }

    public String getBio() {
        return(bio);
    }

    public String getPriceRangeString() {
        return(priceRangeStr);
    }

    public int getPriceRangeInt() {
        return(priceRange);
    }
}