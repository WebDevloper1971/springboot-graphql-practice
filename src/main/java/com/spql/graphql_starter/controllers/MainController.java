package com.spql.graphql_starter.controllers;


import com.spql.graphql_starter.models.NavratriDay;
import com.spql.graphql_starter.services.NavratriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private NavratriService navratriService;


    @QueryMapping
    public List<NavratriDay> getNavratriDaysList(){
       return navratriService.getDaysList();
    }

}
