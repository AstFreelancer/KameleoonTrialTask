package com.example.kameleoontrialtask.controller;

import com.example.kameleoontrialtask.model.MyUser;
import com.example.kameleoontrialtask.model.Quote;
import com.example.kameleoontrialtask.model.Vote;
import com.example.kameleoontrialtask.service.UserService;
import com.example.kameleoontrialtask.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VoteController {
    @Autowired
    private final VoteService voteService;

    @Autowired
    public VoteController(VoteService voteService) {
        this.voteService = voteService;
    }

    @PostMapping(value = "/votes")
    public void create(@RequestBody Vote v) {
        voteService.create(v);
    }

    @GetMapping(value = "/votes/{quoteId}")
    public List<Vote> get(@PathVariable(name = "quoteId") int quoteId) {
        return voteService.get(quoteId);
    }
}