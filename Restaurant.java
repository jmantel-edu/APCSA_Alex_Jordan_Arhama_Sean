public class Restaurant {
    private String name;
    private String bio;
    private String address;
    private int priceRange;
    private String primaryCategory;
    private String secondaryCategory;

    public Restaurant(String name, String bio, String address, int priceRange, String primaryCategory, String secondaryCategory) {
        this.name = name;
        this.bio = bio;
        this.address = address;
        this.priceRange = priceRange;
        this.primaryCategory = primaryCategory;
        this.secondaryCategory = secondaryCategory;
    }

    public String toString() { // Short view
        return("PLACEHOLDER");
    }

    public String getSummary() { // Individual view
        return("PLACEHOLDER");
    }

    public String getName() {
        return(name);
    }
}