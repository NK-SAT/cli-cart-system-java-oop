public class Cart {
    private int cartId;
    private String userName;
    private String productName;
    private String sellerName;
    private int amount;
    private int discount;

    public Cart(int cartId, String userName, String productName, String sellerName, int amount, int discount) {
        this.cartId = cartId;
        this.userName =  userName;
        this.productName = productName;
        this.sellerName = sellerName;
        this.amount = amount;
        this.discount = discount;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName =  userName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    @Override
    public String toString(){
        return "Cart ID: '"+ cartId+"' User Name: '" + userName+"' Product Name: '" +productName+"' Seller Name: '"+ sellerName+"' Amount: '"+amount+"' Discount: '"+discount+"'";
    }
}
