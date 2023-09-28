package com.aizatgaz.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name = "city", schema = "world")
@Data
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @JoinColumn(name = "country_id", nullable = false)
    @ManyToOne
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Country country;

    @Column(nullable = false)
    private String district;

    @Column(nullable = false)
    private Integer population;

}
