package com.jolanda.dev.mysqldemo;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private String email;

}
