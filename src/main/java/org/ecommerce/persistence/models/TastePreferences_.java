package org.ecommerce.persistence.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.ecommerce.persistence.models.TastePreferences.TastePreferencesId;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TastePreferences.class)
public abstract class TastePreferences_ {

	public static volatile SingularAttribute<TastePreferences, ProductLine> item;
	public static volatile SingularAttribute<TastePreferences, TastePreferencesId> tastePreferencesId;
	public static volatile SingularAttribute<TastePreferences, Float> preference;
	public static volatile SingularAttribute<TastePreferences, User> user;

}

