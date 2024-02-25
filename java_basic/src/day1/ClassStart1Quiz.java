package day1;

public class ClassStart1Quiz {

    public static void main(String[] args) {
        System.out.println("Movie Review Main");
        MovieReview[] movieReviews = {new MovieReview("not bad" , "soso") , new MovieReview("bad" , "no jam") , new MovieReview("fun" , "ill watch aging")};
        for (MovieReview movieReview : movieReviews) {
            System.out.println("title :" + movieReview.title +" review " +movieReview.review);
        }

        System.out.println("Product Order MAin");
        ProductOrder[] productOrder = {new ProductOrder("product 1" , 10000 , 2) ,new ProductOrder("product 2" , 15000 , 1),new ProductOrder("product 3" , 3000 , 3) };
        int totalPrice = 0;
        for (ProductOrder order : productOrder) {
            totalPrice += order.price*order.quantity;
            System.out.println("상품명 : "+ order.productName+ ",가격 : "+ order.price + ",수량 : "+order.quantity );
        }
        System.out.println("총 결제 금액 : "+totalPrice );

    }

}

class MovieReview{
    String title ;
    String review ;

    public MovieReview(String title, String review) {

        this.title = title;
        this.review = review;
    }
}

class ProductOrder{
    String productName;
    int price;
    int quantity;

    public ProductOrder(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
}


