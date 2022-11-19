package com.example.creditmanagement.entities;

import com.example.creditmanagement.model.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CreditId;
    private double montant;
    private double dureeEnMois;
    private Date createdAt;
    private Long ClientId;
    @Transient
    private Client client;
}
