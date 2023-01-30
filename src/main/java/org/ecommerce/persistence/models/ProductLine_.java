package org.ecommerce.persistence.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProductLine.class)
public abstract class ProductLine_ {

	public static volatile SingularAttribute<ProductLine, String> image;
	public static volatile SingularAttribute<ProductLine, Product> product;
	public static volatile SetAttribute<ProductLine, OrderLine> orderLines;
	public static volatile SetAttribute<ProductLine, TasteBoolPreference> tasteBoolPreferences;
	public static volatile SetAttribute<ProductLine, TastePreferences> tastePreferences;
	public static volatile SingularAttribute<ProductLine, String> description;
	public static volatile SingularAttribute<ProductLine, Long> id;
	public static volatile SingularAttribute<ProductLine, Integer> stock;

}

