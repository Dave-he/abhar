package org.harm.api;

import org.harm.dao.GoodsRepository;
import org.harm.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * @author hyx
 * @date 2024/11/5
 */
@Path("/goods")
@Produces(MediaType.APPLICATION_JSON)
public class GoodsApi {

    @Autowired
    GoodsRepository goodsRepository;

    @GET
    public Iterable<Goods> list() {
        return goodsRepository.findAll();
    }

    @POST
    public Goods save(Goods goods) {
        return goodsRepository.save(goods);
    }

    @DELETE
    public void delete(Long id) {
        goodsRepository.deleteById(id);
    }

}
