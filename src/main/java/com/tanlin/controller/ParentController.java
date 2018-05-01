package com.tanlin.controller;

import com.tanlin.domain.Parent;
import com.tanlin.domain.Result;
import com.tanlin.repository.ParentRepository;
import com.tanlin.service.ParentService;
import com.tanlin.util.ResultUtil;
import org.hibernate.annotations.Parameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by tanlin on 2018-4-4.
 */
@RestController
@RequestMapping(value="/parent")
public class ParentController {

    Logger logger = LoggerFactory.getLogger(ParentController.class);

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

//    @GetMapping("/all")
    @RequestMapping("/all")
    //@CrossOrigin
    public List<Parent> getList(){
        logger.info("xxxxxxxxxxxxxxxxxxxxx");
        return parentService.getList();
    }

    @PostMapping("/add")
//    @CrossOrigin
    public Parent add(Parent parent){
        return parentService.save(parent);
    }

    @DeleteMapping("/{id}")
//    @CrossOrigin
    public void del(@PathVariable(value="id") Integer id) throws Exception{
        parentService.delOne(id);
    }
}
