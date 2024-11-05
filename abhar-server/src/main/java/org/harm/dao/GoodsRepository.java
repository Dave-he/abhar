package org.harm.dao;

import org.harm.entity.Goods;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hyx
 */
@Repository
public interface GoodsRepository extends CrudRepository<Goods, Long>, ListPagingAndSortingRepository<Goods, Long> {

}
