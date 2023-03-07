package com.example.demo.Model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;

    @OneToOne(mappedBy = "item",cascade = CascadeType.ALL)
    private Cart cart;


    // Constructors, getters, and setters
}


