package fr.sfr.quotify.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity(name = "Utilisateur")
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder @ToString
public class User {
    @Id
    private String username;
    private String password;
    private String role;
}