package com.smart.house.controller;

import com.smart.house.api.AccessApi;
import com.smart.house.entity.DoorEntity;
import com.smart.house.service.impl.DoorService;
import io.micronaut.http.annotation.Controller;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Controller()
@Slf4j
public class AccessController implements AccessApi {

    public AccessController(DoorService doorService) {
        this.entranceService = doorService;
    }

    private final DoorService entranceService;


    @Override
    public Mono<String> getValue() {
        return Mono.just("Hello mono endpoint");
    }
    @Override
    public Mono<String> enter() {
        return Mono.just(String.valueOf(entranceService.enter(new DoorEntity())));
    }
}
