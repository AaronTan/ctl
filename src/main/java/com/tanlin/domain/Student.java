package com.tanlin.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by tanlin on 2018-4-10.
 */
@Data
@Entity
public class Student {
    @Id
    @GeneratedValue
    private int id;
    private String name;

}
