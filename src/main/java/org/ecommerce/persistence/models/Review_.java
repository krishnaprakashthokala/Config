package org.ecommerce.persistence.models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Review.class)
public abstract class Review_ {

	public static volatile SingularAttribute<Review, Product> product;
	public static volatile SingularAttribute<Review, Float> rating;
	public static volatile SingularAttribute<Review, Long> id;
	public static volatile SingularAttribute<Review, String> body;
	public static volatile SingularAttribute<Review, User> user;
	public static volatile SingularAttribute<Review, Date> createAt;
	public static volatile SingularAttribute<Review, ReviewStatusEnum> status;

}

