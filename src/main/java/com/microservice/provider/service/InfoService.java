package com.microservice.provider.service;

import com.microservice.provider.domain.Provider;

public interface InfoService {
    Provider getInfoByState(String state);
}
