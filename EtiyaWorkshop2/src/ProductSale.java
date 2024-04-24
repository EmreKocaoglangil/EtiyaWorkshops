public class ProductSale {
    public static void main(String[] args) {
        String [] products = {"Bilgisayar","Televizyon","Tablet"};
        double[] prices = {20000,15000,5000};
        double [] quantity = {2,1,1};
        for(int i = 0; i < products.length; i++){
            System.out.println(products[i]+ "  ürününü "+ prices[i]+ "  fiyatından  "+
                    quantity[i] + "  adet satın aldınız.");
        }
    }
}
