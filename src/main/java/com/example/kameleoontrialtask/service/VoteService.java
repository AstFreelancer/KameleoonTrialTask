package com.example.kameleoontrialtask.service;

import com.example.kameleoontrialtask.model.Quote;
import com.example.kameleoontrialtask.model.Vote;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VoteService {
    /**
     * Add a new vote
     * @param v - vote to be added
     */
    void create(Vote v);

    /**
     * Get all the votes
     * @param quoteId - id of the quote
     * @return - the vote object
     */
    List<Vote> get(Integer quoteId);
}
