package com.smart.house.controller;

import com.smart.house.api.BaseApi;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Controller("/mono")
@Slf4j
public class BaseController implements BaseApi {


    @Get
    public Mono<String> getValue() {
        return Mono.just("Hello mono endpoint");
    }

}
