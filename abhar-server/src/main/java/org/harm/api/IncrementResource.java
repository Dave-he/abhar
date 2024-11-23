//package org.harm.api;
//
//import java.util.List;
//
//import org.harm.entity.Increment;
//import org.harm.service.IncrementService;
//
//import io.smallrye.mutiny.Uni;
//import jakarta.inject.Inject;
//import jakarta.ws.rs.DELETE;
//import jakarta.ws.rs.DefaultValue;
//import jakarta.ws.rs.GET;
//import jakarta.ws.rs.POST;
//import jakarta.ws.rs.PUT;
//import jakarta.ws.rs.Path;
//import jakarta.ws.rs.QueryParam;
//
//@Path("/increments")
//public class IncrementResource {
//
//    @Inject
//    IncrementService service;
//
//    @GET
//    public Uni<List<String>> keys() {
//        return service.keys();
//    }
//
//    @POST
//    public Increment create(Increment increment) {
//        service.set(increment.key, increment.value);
//        return increment;
//    }
//
//    @GET
//    @Path("/{key}")
//    public Increment get(String key) {
//        return new Increment(key, service.get(key));
//    }
//
//    @PUT
//    @Path("/{key}")
//    public void increment(String key, @QueryParam(value = "v") @DefaultValue("1") int value) {
//        service.increment(key, value);
//    }
//
//    @DELETE
//    @Path("/{key}")
//    public Uni<Void> delete(String key) {
//        return service.del(key);
//    }
//}
