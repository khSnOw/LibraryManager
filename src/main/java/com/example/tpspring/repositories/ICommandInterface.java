package com.example.tpspring.repositories;

import com.example.tpspring.domain.Command;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommandInterface extends JpaRepository<Command,Long> {
}
