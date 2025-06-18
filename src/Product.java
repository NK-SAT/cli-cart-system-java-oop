public class Product {
    //productId, product name, description, rating
    private int productId;
    private String productName;
    private String description;
    private float totalRating=0.0f;
    private float totalCountOfRating =0;
    private float avgRating = 0.0f;

    public Product(int productId, String productName, String description) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getTotalRating() {
        return totalRating;
    }

    public float getTotalCountOfRating() {
        return totalCountOfRating;
    }

    public void setTotalCountOfRating(float totalCountOfRating) {
        this.totalCountOfRating = totalCountOfRating;
    }

    public float getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(float avgRating) {
        this.avgRating = avgRating;
    }

    public void setTotalRating(float rating) {
        this.totalRating = rating;
    }
    @Override
    public String toString(){
        return "Product ID: " + productId +
                ", Name: " + productName +
                ", Description: " + description +
                ", Rating: " + avgRating;
    }
}
