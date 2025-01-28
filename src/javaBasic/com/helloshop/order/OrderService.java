package javaBasic.com.helloshop.order;

import javaBasic.com.helloshop.product.Product;
import javaBasic.com.helloshop.user.User;

public class OrderService {

    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
