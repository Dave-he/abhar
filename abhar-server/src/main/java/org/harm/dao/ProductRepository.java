package org.harm.dao;

import org.harm.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hyx
 */
@Repository
public interface ProductRepository
        extends CrudRepository<Product, Long>, ListPagingAndSortingRepository<Product, Long> {

}
