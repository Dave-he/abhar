package org.harm.dao;

import org.harm.entity.Product;
import org.harm.entity.Useritem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hyx
 */
@Repository
public interface UserItemRepository
        extends CrudRepository<Useritem, Long>, ListPagingAndSortingRepository<Useritem, Long> {

}
