package fr.sfr.quotify.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder @ToString
public class OpportunityLine {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Opportunity opportunity;
    @ManyToOne
    private Product product;
    private int quantity;
    private double totalAmount;
}
