package org.ecommerce.persistence.models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Order.class)
public abstract class Order_ {

	public static volatile SetAttribute<Order, OrderLine> orderLines;
	public static volatile SingularAttribute<Order, Address> billTo;
	public static volatile SingularAttribute<Order, Long> id;
	public static volatile SingularAttribute<Order, Date> purchasedOn;
	public static volatile SingularAttribute<Order, Double> purchasedPrice;
	public static volatile SingularAttribute<Order, User> customer;
	public static volatile SingularAttribute<Order, Double> basePrice;
	public static volatile SingularAttribute<Order, OrderStatusEnum> status;
	public static volatile SingularAttribute<Order, Address> shipTo;

}

