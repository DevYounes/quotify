package fr.sfr.quotify.entities;

import fr.sfr.quotify.enums.ClientTypeEnum;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder @ToString
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private ClientTypeEnum clientType;
    private String serialNumber;
}
