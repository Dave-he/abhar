//package org.harm.service;
//
//import java.util.List;
//
//import io.quarkus.redis.datasource.ReactiveRedisDataSource;
//import io.quarkus.redis.datasource.RedisDataSource;
//import io.quarkus.redis.datasource.keys.ReactiveKeyCommands;
//import io.quarkus.redis.datasource.string.StringCommands;
//import io.smallrye.mutiny.Uni;
//import jakarta.inject.Singleton;
//
//@Singleton
//public class IncrementService {
//
//    private ReactiveKeyCommands<String> keys;
//    private StringCommands<String, String> counter;
//
//    public IncrementService(RedisDataSource dataSource, ReactiveRedisDataSource reactiveRedisDataSource) {
//        keys = reactiveRedisDataSource.key();
//        counter = dataSource.(String.class);
//    }
//
//
//    public Uni<Void> del(String key) {
//        return keys.del(key)
//                .replaceWithVoid();
//
//    }
//
//    public Integer get(String key) {
//        return  counter.get(key);
//    }
//
//    public void set(String key, int value) {
//        counter.set(key, value);
//    }
//
//    public void increment(String key, int incrementBy) {
//        counter.incrby(key, incrementBy);
//    }
//
//    public Uni<List<String>> keys() {
//        return keys
//                .keys("*");
//    }
//}
//
