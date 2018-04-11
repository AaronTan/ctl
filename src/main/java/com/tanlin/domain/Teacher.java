package com.tanlin.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by tanlin on 2018-4-10.
 */
@Data
@Entity
public class Teacher {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
}
