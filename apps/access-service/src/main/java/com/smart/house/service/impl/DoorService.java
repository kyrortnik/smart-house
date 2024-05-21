package com.smart.house.service.impl;

import com.smart.house.entity.Enterable;
import com.smart.house.service.EntranceService;
import jakarta.inject.Singleton;

@Singleton
public class DoorService implements EntranceService {

    @Override
    public boolean enter(Enterable enterable) {
        return true;
    }
}
