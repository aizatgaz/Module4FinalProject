package com.aizatgaz.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.math.BigDecimal;

@Entity
@Table(name = "country_language", schema = "world")
@Data
public class CountryLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "country_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Country country;

    @Column(nullable = false)
    private String language;

    @Column(name = "is_official", columnDefinition = "bit", nullable = false)
    private Boolean isOfficial;

    @Column(nullable = false)
    private BigDecimal percentage;

}
