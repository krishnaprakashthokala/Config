package org.ecommerce.persistence.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Country.class)
public abstract class Country_ {

	public static volatile SetAttribute<Country, Address> addresses;
	public static volatile SingularAttribute<Country, String> code;
	public static volatile SingularAttribute<Country, String> name;
	public static volatile SingularAttribute<Country, Long> id;

}

