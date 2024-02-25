package day2;

public class Quiz {

    public static void main(String[] args) {

        ProductOrder[] productOrders = new ProductOrder[3];
        productOrders[0] = createOrder("두부", 1000, 3);
        productOrders[1] = createOrder("김치", 3000, 9);
        productOrders[2] = createOrder("콜라", 2000, 7);
        int totalAomount = getTotalAomount(productOrders);
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명 : "+ productOrder.productName+ ",가격 : "+ productOrder.price + ",수량 : "+productOrder.quantity );
        }
        System.out.println(totalAomount);
    }
    static ProductOrder createOrder(String name , int price, int quentity){
        ProductOrder order = new ProductOrder();
        order.price = price;
        order.quantity = quentity;
        order.productName = name;
        return order;
    }

    static int getTotalAomount(ProductOrder[] productOrders){
        int amount = 0;
        for (ProductOrder productOrder : productOrders) {
            amount += productOrder.quantity * productOrder.price;
        }

        return amount;
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

}