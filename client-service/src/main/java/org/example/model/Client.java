package org.example.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name = "clients")
@Entity
@Getter
@Setter
@Builder
@EqualsAndHashCode(of = "passportNumber")
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @SequenceGenerator(name = "clients_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clients_sequence")
    private Long id;

    private UUID externalId;

    private String passportNumber;

    private String firstName;

    private String lastName;

}
