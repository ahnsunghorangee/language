package lecture05_pack.com.helloshop.order;

import lecture05_pack.com.helloshop.product.Product;
import lecture05_pack.com.helloshop.user.User;

public class Order {

    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
