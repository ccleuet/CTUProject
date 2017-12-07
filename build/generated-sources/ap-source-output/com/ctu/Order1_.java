package com.ctu;

import com.ctu.Customer;
import com.ctu.Pizza;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-07T09:58:56")
@StaticMetamodel(Order1.class)
public class Order1_ { 

    public static volatile SingularAttribute<Order1, Integer> orderId;
    public static volatile SingularAttribute<Order1, Pizza> pizzaId;
    public static volatile SingularAttribute<Order1, Customer> customerId;

}