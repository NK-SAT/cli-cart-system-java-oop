import java.util.*;

public class cartSystem {
    private static Scanner in = new Scanner(System.in);
    private static ArrayList<Product> products = new ArrayList<>();
    static int productId = 1;

    private static ArrayList<Seller> sellers = new ArrayList<>();
    static int sellerId = 1;

    private static ArrayList<ShoppingPortal> shoppingPortals= new ArrayList<>();
    static int shoppingPortalId = 1;
    private static ArrayList<Cart> carts = new ArrayList<>();
    static int cartId =1;

    public static void main(String[] args) {
        boolean exit = false;
        while(!exit) {
            System.out.println();
            System.out.println("\nPress 1 to add product \nPress 2 to add seller \nPress 3 to add price \nPress 4 to add the product in the cart \nPress 5 to enter rating \nPress 6 to exit");
            int chosen = in.nextInt();
            switch(chosen){
                case 1:
                    addProduct();
                    break;
                case 2:
                    addSeller();
                    break;
                case 3:
                    addPrice();
                    break;
                case 4:
                    addProductInCart();
                    break;
                case 5:
                    addRating();
                    break;
                case 6:
                    System.out.println("exiting...");
                    exit = true;
                    break;
                default:
                    System.out.println("Enter a valid number:");
            }
        }
    }

    public static void addProduct(){
        System.out.println("Enter the product name");
        in.nextLine();
        String productName = in.nextLine();
        System.out.println("Enter the product description");
        String productDesc = in.nextLine();
        Product product = new Product(productId++, productName,productDesc);
        products.add(product);
        System.out.println(product);
        System.out.println("\nSummary of all products:");
        for(int i=0;i<products.size();i++){
            System.out.println(products.get(i));
        }
        System.out.println();
    }

    public static void addSeller(){
        System.out.println("Enter the Seller name");
        in.nextLine();
        String sellerName = in.nextLine();
        System.out.println("Enter the Address");
        String sellerAddresss = in.nextLine();
        Seller seller = new Seller(sellerId++, sellerName,sellerAddresss);
        sellers.add(seller);
        System.out.println(seller);
        System.out.println("\nSummary of all sellers:");
        for(int i=0;i<sellers.size();i++){
            System.out.println(sellers.get(i));
        }
        System.out.println();
    }
    public static void addPrice(){
        System.out.println("Enter the product Id to which price should be added:");
        in.nextLine();
        int currProductId = in.nextInt();
        System.out.println("Enter the seller Id who giving this particular price for the product:");
        int currSellerId = in.nextInt();
        boolean present = false;
        for(int i=0;i<products.size();i++){
            Product product = products.get(i);
            if(currProductId ==  product.getProductId()){
                present = true;
                System.out.println("Enter the price of the product:");
                int price = in.nextInt();
                System.out.println("Enter the discount for the product by the seller:");
                int discount = in.nextInt();
                ShoppingPortal shoppingPortal = new ShoppingPortal(shoppingPortalId++, currProductId, currSellerId, discount, price);
                shoppingPortals.add(shoppingPortal);
                System.out.println(shoppingPortal);
//                for(int j =0;j<shoppingPortals.size();j++){
//                    shoppingPortal =  shoppingPortals.get(j);
//                    System.out.println(shoppingPortal);
//                }
            }
        }
        if(!present){
            System.out.println("Enter a valid product Id");
        }
        Product presentProduct = null;
        Seller presentSeller = null;
        for(int i=0;i<products.size();i++){
            Product product = products.get(i);
            if(product.getProductId() ==  currProductId){
                presentProduct = product;
            }
        }
        for(int i =0;i<sellers.size();i++){
            Seller seller = sellers.get(i);
            if(seller.getSellerId() ==  currSellerId){
                presentSeller = seller;
            }
        }
        System.out.println(presentProduct);
        System.out.println(presentSeller);
    }

    public static void addProductInCart(){
        System.out.println("Enter the Product you want to add in the cart:");
        ShoppingPortal resultShopping = shoppingPortals.get(0);
        Product resultProduct = products.get(0);
        Seller resultSeller = sellers.get(0);
        in.nextLine();
        String currProductName = in.nextLine();
        System.out.println("Enter your name: ");
        String userName = in.nextLine();
        for(int i=0;i<products.size();i++){
            Product product =  products.get(i);
            if(currProductName == product.getProductName()){
                resultProduct = product;
            }
        }
        int userProductId =  resultProduct.getProductId();
        for(int i=0;i<shoppingPortals.size();i++){
            ShoppingPortal currShoppingPortal = shoppingPortals.get(i);
            if(userProductId == currShoppingPortal.getProductId()){
                if(currShoppingPortal.getAmount()<resultShopping.getAmount()){
                    resultShopping = currShoppingPortal;
                }
            }
        }
        int resultSellerId = resultShopping.getSellerId();
        for(int i=0;i<sellers.size();i++){
            Seller seller = sellers.get(i);
            if(resultSellerId == seller.getSellerId()){
                resultSeller = seller;
            }
        }
        Cart cart = new Cart(cartId++, userName, resultProduct.getProductName(), resultSeller.getSellerName(), resultShopping.getAmount(), resultShopping.getDiscount());
        carts.add(cart);
        System.out.println(cart);
    }
    public static void addRating(){
        System.out.println("Enter the product which you want to add rating:");
        in.nextLine();
        String ratingProductName = in.nextLine();
        Product currProduct = null;
        for(int i=0;i<products.size();i++){
            Product product = products.get(i);
            if(ratingProductName.equals(product.getProductName())){
                System.out.println("Enter the rating:");
                float currRating = in.nextFloat();
                product.setTotalRating((product.getTotalRating() + currRating));
                product.setTotalCountOfRating(product.getTotalCountOfRating() + 1);

                float avgRating = product.getTotalRating() / product.getTotalCountOfRating();
                product.setAvgRating(avgRating);
                currProduct = product;
            }
        }
        System.out.println(currProduct);
    }
}