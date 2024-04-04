package com.jash.ecommerce.service.order;

import com.jash.ecommerce.entity.Address;
import com.jash.ecommerce.entity.Order;
import com.jash.ecommerce.entity.User;
import com.jash.ecommerce.exception.OrderException;
import com.jash.ecommerce.repository.CartRepository;
import com.jash.ecommerce.service.cart.CartService;
import com.jash.ecommerce.service.product.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    private CartRepository cartRepository;
    private CartService cartItemService;
    private ProductService productService;

    OrderServiceImpl(CartRepository cartRepository, CartService cartItemService, ProductService productService){
        this.cartRepository=cartRepository;
        this.productService=productService;
        this.cartItemService=cartItemService;
    }
    @Override
    @Transactional
    public Order createOrder(User user, Address shippingAddress) {
        return null;
    }

    @Override
    public Order findOrderById(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public List<Order> usersOrderHistory(Long userId) {
        return null;
    }

    @Override
    public Order placedOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public Order confirmedOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public Order shippedOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public Order deliveredOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public Order cancledOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public List<Order> getAllOrders() {
        return null;
    }

    @Override
    @Transactional
    public void deleteOrder(Long orderId) throws OrderException {

    }
}
