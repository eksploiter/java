package javaBasic.com.helloshop.order;

import javaBasic.com.helloshop.product.Product;
import javaBasic.com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
