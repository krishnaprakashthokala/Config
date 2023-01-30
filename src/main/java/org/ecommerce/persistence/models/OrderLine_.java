package org.ecommerce.persistence.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OrderLine.class)
public abstract class OrderLine_ {

	public static volatile SingularAttribute<OrderLine, ProductLine> productLine;
	public static volatile SingularAttribute<OrderLine, Integer> quantity;
	public static volatile SingularAttribute<OrderLine, Double> totalPrice;
	public static volatile SingularAttribute<OrderLine, Integer> discount;
	public static volatile SingularAttribute<OrderLine, OrderLineId> orderLineId;
	public static volatile SingularAttribute<OrderLine, Order> order;

}

