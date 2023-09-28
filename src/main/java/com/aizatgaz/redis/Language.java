package com.aizatgaz.redis;

import com.aizatgaz.domain.Continent;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Data
public class Language {

    private String language;

    private Boolean isOfficial;

    private BigDecimal percentage;


}
