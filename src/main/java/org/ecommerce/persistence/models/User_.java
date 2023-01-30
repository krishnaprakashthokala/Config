package org.ecommerce.persistence.models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SingularAttribute<User, Date> birthday;
	public static volatile SingularAttribute<User, Country> country;
	public static volatile SetAttribute<User, Address> addresses;
	public static volatile SingularAttribute<User, Gender> gender;
	public static volatile SetAttribute<User, TasteBoolPreference> tasteBoolPreferences;
	public static volatile SingularAttribute<User, Date> lastLoginAccess;
	public static volatile SingularAttribute<User, String> fullName;
	public static volatile SingularAttribute<User, Avatar> avatar;
	public static volatile SingularAttribute<User, Boolean> enabled;
	public static volatile SetAttribute<User, Authority> authorities;
	public static volatile SingularAttribute<User, String> password;
	public static volatile SetAttribute<User, Review> reviews;
	public static volatile SetAttribute<User, TastePreferences> tastePreferences;
	public static volatile SetAttribute<User, Order> orders;
	public static volatile SingularAttribute<User, Long> id;
	public static volatile SingularAttribute<User, String> email;
	public static volatile SingularAttribute<User, String> username;

}

