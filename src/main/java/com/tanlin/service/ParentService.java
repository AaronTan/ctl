package com.tanlin.service;

import com.tanlin.domain.Parent;
import com.tanlin.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tanlin on 2018-4-4.
 */
@Service
public class ParentService {

    @Autowired
    private ParentRepository parentRepository;

    public String size(){
        return parentRepository.findAll().size()+"";
    }

    public Parent getOne(Integer id){
        //return parentRepository.findOne(id);              //不能用
        return parentRepository.findById(id).get();       //可以用
        //return parentRepository.getOne(id);               //不推荐，可能有问题
    }

    public List<Parent> getList(){
        return parentRepository.findAll();
    }


}
