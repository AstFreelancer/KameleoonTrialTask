package com.example.kameleoontrialtask.controller;

import com.example.kameleoontrialtask.model.Quote;
import com.example.kameleoontrialtask.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuoteController {
    @Autowired
    private final QuoteService quoteService;

    @Autowired
    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @PostMapping(value = "/quotes")
    public void create(@RequestBody Quote q) {
        quoteService.create(q);
    }

    @GetMapping(value = "/quotes/{id}")
    public Quote get(@PathVariable(name = "id") int id) {
        return quoteService.get(id);
    }

    @GetMapping(value = "/quotes/random")
    public Quote getRandom() {
        return quoteService.getRandom();
    }
    @GetMapping(value = "/quotes/top10")
    public List<Quote> getTop10() {
        return quoteService.getTop10();
    }
    @GetMapping(value = "/quotes/bottom10")
    public List<Quote> getBottom10() {
        return quoteService.getBottom10();
    }

    @PutMapping(value = "/quotes/{id}")
    public Quote edit(@PathVariable(name = "id") int id, @RequestBody Quote q) {
        quoteService.edit(q);
        return q;
    }

    @DeleteMapping(value = "/quotes/{id}")
    public void delete(@PathVariable(name = "id") int id) {
        quoteService.delete(id);
    }
}
