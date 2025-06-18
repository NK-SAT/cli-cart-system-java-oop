public class ShoppingPortal {
    //shoppingPortalId, productId(foreign key), sellerId(foreign key), discount, amount
    private int shoppingPortalId;
    private int productId;
    private int sellerId;
    private int discount;
    private int amount;

    public ShoppingPortal(int shoppingPortalId, int productId, int sellerId, int discount, int amount) {
        this.shoppingPortalId = shoppingPortalId;
        this.productId = productId;
        this.sellerId = sellerId;
        this.discount = discount;
        this.amount = amount;
    }

    public int getShoppingPortalId() {
        return shoppingPortalId;
    }

    public void setShoppingPortalId(int shoppingPortalId) {
        this.shoppingPortalId = shoppingPortalId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    @Override
    public String toString(){
        return "Shopping Portal ID: "+shoppingPortalId+" Shopping Product ID:" + productId+" Shopping Seller ID: "+ sellerId+" Amount: "+ amount+" Discount: "+discount;
    }
}
