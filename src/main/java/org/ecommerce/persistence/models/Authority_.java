package org.ecommerce.persistence.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Authority.class)
public abstract class Authority_ {

	public static volatile SingularAttribute<Authority, String> description;
	public static volatile SingularAttribute<Authority, Long> id;
	public static volatile SingularAttribute<Authority, AuthorityEnum> type;
	public static volatile SetAttribute<Authority, User> users;

}

