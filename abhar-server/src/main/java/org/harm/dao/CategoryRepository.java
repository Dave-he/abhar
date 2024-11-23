package org.harm.dao;

import org.harm.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hyx
 */
@Repository
public interface CategoryRepository
        extends CrudRepository<Category, Long>, ListPagingAndSortingRepository<Category, Long> {

}
