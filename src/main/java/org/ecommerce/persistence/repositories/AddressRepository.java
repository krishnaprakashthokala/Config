package org.ecommerce.persistence.repositories;

import org.ecommerce.persistence.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

/**
 * @author sergio
 */



public interface AddressRepository extends JpaRepository<Address, Long> {
}
