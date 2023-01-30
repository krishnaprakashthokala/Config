package org.ecommerce.persistence.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
//@NoRepositoryBean


public interface SearchableRepository<T> {

	Page<T> search(String query, Pageable pageable);
}
