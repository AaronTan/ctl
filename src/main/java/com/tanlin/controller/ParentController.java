package com.tanlin.controller;

import com.tanlin.domain.Parent;
import com.tanlin.repository.ParentRepository;
import com.tanlin.service.ParentService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tanlin on 2018-4-4.
 */
@RestController
@RequestMapping(value="/parent")
public class ParentController {

    @Autowired
    private ParentService parentService;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello Parent";
    }

    @RequestMapping("/size")
    public String size(){
        return parentService.size();
    }

    @RequestMapping("/one/{id}")
    public Parent getOne(@PathVariable(value="id") Integer id){
        return parentService.getOne(id);

    }

    @RequestMapping("/all")
    @CrossOrigin
    public List<Parent> getList(){
        return parentService.getList();
    }
}
