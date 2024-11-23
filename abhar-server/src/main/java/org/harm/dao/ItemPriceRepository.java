package org.harm.dao;

import org.harm.entity.Item;
import org.harm.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hyx
 */
@Repository
public interface ItemPriceRepository
        extends CrudRepository<Item, Long>, ListPagingAndSortingRepository<Item, Long> {

}
