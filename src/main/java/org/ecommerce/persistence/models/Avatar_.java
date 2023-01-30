package org.ecommerce.persistence.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Avatar.class)
public abstract class Avatar_ {

	public static volatile SingularAttribute<Avatar, Long> size;
	public static volatile SingularAttribute<Avatar, String> name;
	public static volatile SingularAttribute<Avatar, Long> id;
	public static volatile SingularAttribute<Avatar, String> contentType;
	public static volatile SingularAttribute<Avatar, User> user;
	public static volatile SingularAttribute<Avatar, byte[]> content;

}

