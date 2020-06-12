package io.mellis.liquibasedemo.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class Food
{
    Integer id;
    String name;
    Integer kcal;
    boolean eatable;
}
