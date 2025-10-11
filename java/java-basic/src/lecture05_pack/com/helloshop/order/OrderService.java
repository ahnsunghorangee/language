package lecture05_pack.com.helloshop.order;

import lecture05_pack.com.helloshop.product.Product;
import lecture05_pack.com.helloshop.user.User;

public class OrderService {

    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
