package com.microservice.provider.service.impl;

import com.microservice.provider.domain.Provider;
import com.microservice.provider.repository.InfoRepository;
import com.microservice.provider.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoServiceImpl implements InfoService {

    @Autowired
    private InfoRepository repository;

    @Override
    public Provider getInfoByState(String state) {
        return repository.findByState(state);
    }
}
