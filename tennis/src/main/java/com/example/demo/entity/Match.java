package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate startDate;

    private Integer duration;

    private Integer winnerId;

    @ManyToOne
    @JoinColumn(unique = true)
    private Player player1;

    @ManyToOne
    @JoinColumn(unique = true)
    private Player player2;

    @ManyToOne
    @JoinColumn
    private Round round;


}
