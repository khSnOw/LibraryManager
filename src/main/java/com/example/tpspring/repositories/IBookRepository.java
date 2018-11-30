package com.example.tpspring.repositories;

import com.example.tpspring.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book,Long> {
}
