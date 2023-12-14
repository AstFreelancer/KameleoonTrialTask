package com.example.kameleoontrialtask.service;

import com.example.kameleoontrialtask.model.Quote;
import com.example.kameleoontrialtask.model.Vote;
import com.example.kameleoontrialtask.repository.QuoteRepository;
import com.example.kameleoontrialtask.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class VoteServiceImplementation implements VoteService {
    @Autowired
    private VoteRepository voteRepository;

    @Override
    public void create(Vote v) {
        v.setVoteDate(new Date());
        voteRepository.save(v);
    }

    public List<Vote> get(Integer quoteId) {
        return voteRepository.findByQuoteId(quoteId);
    }
}