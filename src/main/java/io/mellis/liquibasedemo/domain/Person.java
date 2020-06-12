package io.mellis.liquibasedemo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Person
{
    @Id
    private Integer id;
    private String firstname;
    private String middlename;
    private String lastname;
    private String state;

    public Person()
    {
    }
}
