package com.spql.graphql_starter.services.impl;


import com.spql.graphql_starter.models.NavratriDay;
import com.spql.graphql_starter.repositories.NavratriRepository;
import com.spql.graphql_starter.services.NavratriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NavratriServiceImpl implements NavratriService {


    @Autowired
    private NavratriRepository navratriRepository;

    @Override
    public NavratriDay save(NavratriDay navratriDay) {
        return navratriRepository.save(navratriDay);
    }

    @Override
    public NavratriDay delete(String id) {
        if(navratriRepository.findById(id).isPresent()){
            NavratriDay navratriDay = navratriRepository.findById(id).get();
            navratriRepository.deleteById(id);
            return navratriDay;
        }
        return null;
    }

    @Override
    public NavratriDay getById(String id) {
        if(navratriRepository.findById(id).isPresent()){
            return navratriRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public List<NavratriDay> getDaysList() {
        List<NavratriDay> allDays = navratriRepository.findAll();
        allDays.sort((o1, o2) -> Integer.compare(o1.getDay(), o2.getDay()));
        return allDays;
    }
}
