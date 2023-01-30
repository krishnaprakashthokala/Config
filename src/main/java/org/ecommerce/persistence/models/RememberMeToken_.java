package org.ecommerce.persistence.models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RememberMeToken.class)
public abstract class RememberMeToken_ {

	public static volatile SingularAttribute<RememberMeToken, Date> date;
	public static volatile SingularAttribute<RememberMeToken, String> series;
	public static volatile SingularAttribute<RememberMeToken, String> tokenValue;
	public static volatile SingularAttribute<RememberMeToken, String> username;

}

