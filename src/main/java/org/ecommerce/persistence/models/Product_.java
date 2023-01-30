package org.ecommerce.persistence.models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Product.class)
public abstract class Product_ {

	public static volatile SingularAttribute<Product, String> completeDesc;
	public static volatile SingularAttribute<Product, String> description;
	public static volatile SingularAttribute<Product, String> shortDescription;
	public static volatile SingularAttribute<Product, Date> availableFrom;
	public static volatile SingularAttribute<Product, Date> availableTo;
	public static volatile SingularAttribute<Product, Date> createAt;
	public static volatile SingularAttribute<Product, ConsumerTypeEnum> consumerType;
	public static volatile SetAttribute<Product, Review> reviews;
	public static volatile SingularAttribute<Product, Double> price;
	public static volatile SingularAttribute<Product, String> name;
	public static volatile ListAttribute<Product, ProductLine> productLines;
	public static volatile SingularAttribute<Product, Long> id;
	public static volatile SingularAttribute<Product, ProductCategory> category;
	public static volatile SingularAttribute<Product, ProductStatusEnum> status;

}

