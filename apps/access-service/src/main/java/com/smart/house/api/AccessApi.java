package com.smart.house.api;

import io.micronaut.http.annotation.Get;
import reactor.core.publisher.Mono;

//todo add Swagger annotations
public interface AccessApi {

    @Get("/mono")
     default Mono<String> getValue() {
         return Mono.just("Not implemented");
     }


    @Get("/enter")
     default Mono<String> enter() {
         throw new UnsupportedOperationException("No implementation");
     }

}
