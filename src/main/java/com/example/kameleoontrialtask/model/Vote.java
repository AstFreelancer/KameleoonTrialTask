package com.example.kameleoontrialtask.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "VOTE")
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private Integer userId;
    @Column
    private Integer quoteId;
    @Column
    private Date voteDate;
    @Column
    @JsonProperty
    private boolean isUp;

    public Vote(Integer id, Integer userId, Integer quoteId, Date voteDate, boolean isUp) {
        this.id = id;
        this.userId = userId;
        this.quoteId = quoteId;
        this.voteDate = voteDate;
        this.isUp = isUp;
    }

    public Vote() {

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(Integer quoteId) {
        this.quoteId = quoteId;
    }

    public Date getVoteDate() {
        return voteDate;
    }

    public void setVoteDate(Date voteDate) {
        this.voteDate = voteDate;
    }

    public boolean isUp() {
        return isUp;
    }

    public void setUp(boolean up) {
        isUp = up;
    }
}