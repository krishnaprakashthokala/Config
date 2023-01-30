package org.ecommerce.persistence.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProductCategory.class)
public abstract class ProductCategory_ {

	public static volatile SingularAttribute<ProductCategory, ProductCategory> parent;
	public static volatile SingularAttribute<ProductCategory, String> name;
	public static volatile SingularAttribute<ProductCategory, Long> id;
	public static volatile SetAttribute<ProductCategory, ProductCategory> subcategories;
	public static volatile SingularAttribute<ProductCategory, String> slug;
	public static volatile SetAttribute<ProductCategory, Product> products;

}

