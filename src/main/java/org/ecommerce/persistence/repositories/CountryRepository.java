package org.ecommerce.persistence.repositories;

import org.ecommerce.persistence.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

/**
 * @author sergio
 */
//@Repository("countryRepov")

public interface CountryRepository extends JpaRepository<Country, Long> {
	Country findByCode(String code);
}
