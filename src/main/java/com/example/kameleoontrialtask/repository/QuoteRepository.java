package com.example.kameleoontrialtask.repository;

import com.example.kameleoontrialtask.model.Quote;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuoteRepository extends CrudRepository<Quote, Integer>{
    List<Quote> findFirst10ByOrderByScore();
    List<Quote> findLast10ByOrderByScore();
    @Query("select count(*) from Quote")
    Integer getCount();
}
