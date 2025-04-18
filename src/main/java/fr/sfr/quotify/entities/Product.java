package fr.sfr.quotify.entities;

import fr.sfr.quotify.enums.ProductCategoryEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder @ToString
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String reference;
    private String designation;
    private Double pricePublicEuro;
    private Double pricePublicDollar;
    private Double priceReinsurance;
    private String bTechnologique;
    private String productType;
    private String preferredSupplier;
    private LocalDate endOfSell;
    private LocalDate endOfSupport;
    private LocalDate endOfLife;
    @Enumerated(EnumType.STRING)
    private ProductCategoryEnum category;

}