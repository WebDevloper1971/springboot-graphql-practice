package com.spql.graphql_starter.services;

import com.spql.graphql_starter.models.NavratriDay;

import java.util.List;


public interface NavratriService {
    NavratriDay save(NavratriDay navratriDay);
    NavratriDay delete(String id);
    NavratriDay getById(String id);
    List<NavratriDay> getDaysList();
}
