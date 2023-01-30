package org.ecommerce.persistence.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import org.ecommerce.persistence.models.ProductCategory;

/**
 * @author sergio
 */
//@NoRepositoryBean

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
	ProductCategory findBySlug(String slug);

	List<ProductCategory> findByParentIsNull();
}
