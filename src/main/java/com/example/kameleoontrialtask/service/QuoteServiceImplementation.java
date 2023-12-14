package com.example.kameleoontrialtask.service;

import com.example.kameleoontrialtask.model.Quote;
import com.example.kameleoontrialtask.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class QuoteServiceImplementation implements QuoteService {
    @Autowired
    private QuoteRepository quoteRepository;
    @Override
    public void create(Quote q) {
        q.setScore(0);
        q.setUpd(new Date());
        quoteRepository.save(q);
    }

    public Quote get(Integer id) {
        return quoteRepository.findById(id).get();
    }

    private List<Quote> getAll() {
        List<Quote> quotes = new ArrayList<Quote>();
        quoteRepository.findAll().forEach(q -> quotes.add(q));
        return quotes;
    }
    public Quote getRandom() {
        List<Quote> quotes = getAll();
        return quotes.get(new Random().nextInt(quotes.size()));
    }

   public void edit(Quote q) {
       quoteRepository.save(q);
   }
   public void delete(Integer id) {
       quoteRepository.deleteById(id);
   }
    public List<Quote> getTop10() {
        return (List<Quote>)quoteRepository.findFirst10ByOrderByScore();
    }
    public List<Quote> getBottom10() {
        return (List<Quote>)quoteRepository.findLast10ByOrderByScore();
    }
}
