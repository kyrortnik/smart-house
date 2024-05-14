package com.smart.house.api;

import reactor.core.publisher.Mono;

public interface BaseApi {

     default Mono<String> getValue() {
         return Mono.just("Not implemented");
     };
}
