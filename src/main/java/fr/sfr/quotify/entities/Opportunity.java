package fr.sfr.quotify.entities;

import fr.sfr.quotify.enums.*;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder @ToString
public class Opportunity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String label;
    private LocalDate dateCreation;
    private LocalDate limitDate;
    @Enumerated(EnumType.STRING)
    private OpportunityStatus status;
    private String jiraReference;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Commercial commercial;
    @ManyToOne
    private User uer;
    @OneToMany(mappedBy = "opportunity", cascade = CascadeType.ALL)
    private List<OpportunityLine> opportunityLines;
    @Enumerated(EnumType.STRING)
    private SlaEnum slaEnum;
    @Enumerated(EnumType.STRING)
    private WeeklySlotEnum weeklySlot;
    @Enumerated(EnumType.STRING)
    private TimeSlotEnum timeSlot;
    @Enumerated(EnumType.STRING)
    private InterventionTimeEnum interventionTime;
    @Enumerated(EnumType.STRING)
    private ClientIndexEnum clientIdex;

}

