package org.ecommerce.persistence.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import org.ecommerce.persistence.models.RememberMeToken;

/**
 * @author sergio
 */
//@NoRepositoryBean


public interface RememberMeTokenRepository extends JpaRepository<RememberMeToken, Long> {
	RememberMeToken findBySeries(String series);

	List<RememberMeToken> findByUsername(String username);
}
