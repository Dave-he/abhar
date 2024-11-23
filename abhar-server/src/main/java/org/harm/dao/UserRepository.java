package org.harm.dao;

import org.harm.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hyx
 */
@Repository
public interface UserRepository
        extends CrudRepository<User, Long>, ListPagingAndSortingRepository<User, Long> {

}
