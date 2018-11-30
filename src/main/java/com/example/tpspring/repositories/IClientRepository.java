package com.example.tpspring.repositories;

import com.example.tpspring.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientRepository extends  JpaRepository<Client,Long> {
}
