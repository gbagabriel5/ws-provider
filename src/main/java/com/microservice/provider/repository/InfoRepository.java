package com.microservice.provider.repository;

import com.microservice.provider.domain.Provider;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface InfoRepository extends JpaRepository<Provider, Long>{
    Provider findByState(String state);
}
