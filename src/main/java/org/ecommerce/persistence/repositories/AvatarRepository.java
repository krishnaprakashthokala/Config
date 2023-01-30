package org.ecommerce.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import org.ecommerce.persistence.models.Avatar;

/**
 * @author sergio
 */


public interface AvatarRepository extends JpaRepository<Avatar, Long> {
}
