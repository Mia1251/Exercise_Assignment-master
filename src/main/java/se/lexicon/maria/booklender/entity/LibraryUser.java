package se.lexicon.maria.booklender.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class LibraryUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private LocalDate regDate;
    private String name;
    @Column(unique = true)
    private String email;


}
