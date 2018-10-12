package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.*;
import com.ijse.wearit.dto.OrdersDTO;
import com.ijse.wearit.model.*;
import com.ijse.wearit.service.custom.OrdersService;
import com.ijse.wearit.util.ModelConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersDao ordersDao;

    @Autowired
    private ModelConverter modelConverter;

    @Autowired
    private ShoppingCartDetailsDao shoppingCartDetailsDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private ShoppingCartDao shoppingCartDao;

    @Autowired
    private PaymentMethodDao paymentMethodDao;

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public boolean addOrderss(String userName) throws Exception {
        boolean result = false;
        User user = userDao.getUserByUserName(userName);
        ShoppingCart shoppingCart = user.getShoppingCart();

        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.setPaymentMethod("Credit Card");
        paymentMethodDao.save(paymentMethod);

        Payment payment = new Payment();
        payment.setPaymentMethod(paymentMethod);
        payment.setPaymentResponseMessage("Paid");
        payment.setUserIdOrSessionId("2");
        paymentDao.save(payment);

        Orders orders =  new Orders();
        orders.setUser(user);
        orders.setPayment(payment);
        orders.setOrderDate(shoppingCart.getAddedDate());
        orders.setOrderAmount(shoppingCart.getTotal());
        orders.setDiscount(2000.00);

        ordersDao.save(orders);

        List<ShoppingCartDetails> cartDetailsList = shoppingCartDetailsDao.getDetailsByCart(shoppingCart);
        for(ShoppingCartDetails shoppingCartDetails : cartDetailsList){
            shoppingCartDetailsDao.delete(shoppingCartDetails);
        }

        shoppingCart.setTotal(0);
        ShoppingCart updated= shoppingCartDao.save(shoppingCart);
        if(updated!=null){
            result = true;
        }else {
            result = false;
        }
        return result;
    }

    @Override
    public OrdersDTO add(OrdersDTO ordersDTO) throws Exception {
        OrdersDTO savedDTO = (OrdersDTO) modelConverter.convertToDTO(
                ordersDao.save((Orders) modelConverter.convertToModel(ordersDTO,Orders.class)),OrdersDTO.class);
        return savedDTO;
    }

    @Override
    public boolean update(OrdersDTO ordersDTO) throws Exception {
        OrdersDTO updatedDTO = (OrdersDTO) modelConverter.convertToDTO(
                ordersDao.save((Orders) modelConverter.convertToModel(ordersDTO,Orders.class)),OrdersDTO.class);
        if(updatedDTO!=null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean delete(OrdersDTO ordersDTO) throws Exception {
        ordersDao.delete((Orders) modelConverter.convertToModel(ordersDTO,Orders.class));
        return true;
    }

    @Override
    public OrdersDTO findById(Integer id) throws Exception {
        Optional<Orders> byId = ordersDao.findById(id);
        boolean present = byId.isPresent();
        if (present){
            OrdersDTO ordersDTO = (OrdersDTO) modelConverter.convertToDTO(byId.get(),Orders.class);
            return ordersDTO;
        }else {
            return null;
        }
    }

    @Override
    public Iterable<OrdersDTO> getAll() throws Exception {
        Iterable<OrdersDTO> ordersDTOS = (Iterable<OrdersDTO>)
                modelConverter.convertToDTOList(paymentDao.findAll(),OrdersDTO.class);
        return ordersDTOS;
    }
}
