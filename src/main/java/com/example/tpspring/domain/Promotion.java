package com.example.tpspring.domain;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private Date startDate;
    private Date endDate;

    private boolean isActive;

    private float tauxRemise;

    @ManyToOne
    private Book book;

}
