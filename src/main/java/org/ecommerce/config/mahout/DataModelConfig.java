package org.ecommerce.config.mahout;

import org.ecommerce.config.qualifiers.BooleanPrefDataModel;
import org.ecommerce.config.qualifiers.RatingDataModel;
import javax.sql.DataSource;
import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.model.jdbc.MySQLJDBCDataModel;
import org.apache.mahout.cf.taste.impl.model.jdbc.SQL92BooleanPrefJDBCDataModel;
import org.apache.mahout.cf.taste.impl.model.jdbc.MySQLBooleanPrefJDBCDataModel;
import org.apache.mahout.cf.taste.impl.model.jdbc.ReloadFromJDBCDataModel;
import org.apache.mahout.cf.taste.impl.model.jdbc.SQL92JDBCDataModel;
import org.apache.mahout.cf.taste.model.DataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.ecommerce.persistence.models.TasteBoolPreference;

/**
 * @author sergio
 */
@Configuration
public class DataModelConfig {

	@Autowired
	private DataSource datasource;

	@Profile("development")
	@Bean(name = "SQL92JDBCDataModel")
	@RatingDataModel
	public DataModel provideSQL92JDBCDataModel() throws TasteException {
		return new ReloadFromJDBCDataModel(new SQL92JDBCDataModel(datasource));
	}

	@Profile("development")
	@Bean(name = "AbstractBooleanPrefJDBCDataModel")
	@BooleanPrefDataModel
	public DataModel provideSQL92BooleanPrefJDBCDataModel() throws TasteException {
		return new ReloadFromJDBCDataModel(new SQL92BooleanPrefJDBCDataModel(datasource, TasteBoolPreference.TABLE_NAME,
				TasteBoolPreference.COLUMN_USER_ID, TasteBoolPreference.COLUMN_ITEM_ID,
				TasteBoolPreference.COLUMN_TIMESTAMP));
	}

	@Profile("production")
	@Bean(name = "JDBCDataModel")
	@RatingDataModel
	public DataModel provideMySQLJDBCDataModel() throws TasteException {
		return new ReloadFromJDBCDataModel(new MySQLJDBCDataModel(datasource));
	}

	@Profile("production")
	@Bean(name = "AbstractBooleanPrefJDBCDataModel")
	@BooleanPrefDataModel
	public DataModel provideMySQLBooleanPrefJDBCDataModel() throws TasteException {
		return new ReloadFromJDBCDataModel(new MySQLBooleanPrefJDBCDataModel(datasource, TasteBoolPreference.TABLE_NAME,
				TasteBoolPreference.COLUMN_USER_ID, TasteBoolPreference.COLUMN_ITEM_ID,
				TasteBoolPreference.COLUMN_TIMESTAMP));
	}
}
