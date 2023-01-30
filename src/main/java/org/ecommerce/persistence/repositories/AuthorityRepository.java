package org.ecommerce.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import org.ecommerce.persistence.models.Authority;
import org.ecommerce.persistence.models.AuthorityEnum;

/**
 *
 * @author sergio
 */



public interface AuthorityRepository extends JpaRepository<Authority, Long> {
	Authority findByType(AuthorityEnum type);
}
