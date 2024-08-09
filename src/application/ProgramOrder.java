package application;

import entities.Order;
import entitiesEnum.OrderStatus;

import java.util.Date;

public class ProgramOrder {
    public static void main(String[] args) {
        Order order = new Order(1050, new Date(), OrderStatus.ENVIADO);
        System.out.println(order);

        OrderStatus status = OrderStatus.ENVIADO;
        OrderStatus status1 = OrderStatus.valueOf("PEDIDO");
        System.out.println(status1);
        System.out.println(status);
    }
}
