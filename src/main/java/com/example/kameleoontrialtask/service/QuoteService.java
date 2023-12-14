package com.example.kameleoontrialtask.service;

import com.example.kameleoontrialtask.model.Quote;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuoteService {
    /**
     * Add a new quote
     * @param q - quote to be added
     */
    void create(Quote q);

    /**
     * Get the quote for some id
     * @param id - id of the quote to get
     * @return - the quote object
     */
    Quote get(Integer id);

    /**
     * Get random quote
     * @return - the quote object
     */
    Quote getRandom();

    /**
     * Get top 10 quotes
     *
     * @return List of 10 quotes with the max scores
     */
    List<Quote> getTop10();

    /**
     * Get bottom 10 quotes
     *
     * @return List of 10 quotes with the min scores
     */
    List<Quote> getBottom10();

    /**
     * Edit a quote
     *
     * @param q - new quote to copy all parameters from
     * @return
     */
    void edit(Quote q);

    /**
     * Delete a quote (real deletion from the database, not just via an archive flag)
     *
     * @return true if success and false otherwise
     */
    void delete(Integer id);
}
