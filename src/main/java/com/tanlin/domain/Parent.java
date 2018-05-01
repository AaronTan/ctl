package com.tanlin.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by tanlin on 2018-4-4.
 */
@Data
@Entity
public class Parent {
    @Id
    @GeneratedValue
    private int id;
//    @Column
    private String name;
    private String relation;

}
