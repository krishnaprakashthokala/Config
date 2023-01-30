package org.ecommerce.persistence.models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.ecommerce.persistence.models.TasteBoolPreference.TastePreferencesId;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TasteBoolPreference.class)
public abstract class TasteBoolPreference_ {

	public static volatile SingularAttribute<TasteBoolPreference, ProductLine> item;
	public static volatile SingularAttribute<TasteBoolPreference, TastePreferencesId> tastePreferencesId;
	public static volatile SingularAttribute<TasteBoolPreference, User> user;
	public static volatile SingularAttribute<TasteBoolPreference, Date> timestamp;

}

