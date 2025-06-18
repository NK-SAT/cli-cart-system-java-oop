public class Seller {
    //sellerId, sellerName, sellerAddress
    private int sellerId;
    private String sellerName;
    private String sellerAddress;

    public Seller(int sellerId, String sellerName, String sellerAddress) {
        this.sellerId = sellerId;
        this.sellerName = sellerName;
        this.sellerAddress = sellerAddress;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
    }
    @Override
    public String toString(){
        return "Seller Id: '"+sellerId+"' Seller Name: '"+sellerName+"' Seller Address: '"+sellerAddress+"'";
    }
}
