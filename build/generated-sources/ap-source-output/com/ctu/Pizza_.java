package com.ctu;

import com.ctu.Order1;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-07T09:58:56")
@StaticMetamodel(Pizza.class)
public class Pizza_ { 

    public static volatile CollectionAttribute<Pizza, Order1> order1Collection;
    public static volatile SingularAttribute<Pizza, Integer> pizzaId;
    public static volatile SingularAttribute<Pizza, Integer> price;
    public static volatile SingularAttribute<Pizza, String> name;

}