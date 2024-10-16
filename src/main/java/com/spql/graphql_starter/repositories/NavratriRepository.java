package com.spql.graphql_starter.repositories;

import com.spql.graphql_starter.models.NavratriDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NavratriRepository extends JpaRepository<NavratriDay, String> {
}
