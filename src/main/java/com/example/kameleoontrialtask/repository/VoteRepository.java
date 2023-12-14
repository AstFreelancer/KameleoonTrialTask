package com.example.kameleoontrialtask.repository;

import com.example.kameleoontrialtask.model.Quote;
import com.example.kameleoontrialtask.model.Vote;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoteRepository extends CrudRepository<Vote, Integer> {
    List<Vote> findByQuoteId(Integer quoteId);
}