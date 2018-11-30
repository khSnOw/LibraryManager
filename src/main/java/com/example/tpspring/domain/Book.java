package com.example.tpspring.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    private String bookName;
    private float bookPrice;


    @OneToMany(mappedBy = "book")
    private List<Command> commands;

    @OneToMany(mappedBy = "book")
    private List<Promotion> promotions;
}
