package com.example.kameleoontrialtask.model;
import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "QUOTE")
public class Quote {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String text;
    @Column
    private Date upd;
    @Column
    private Integer userId;
    @Column
    private Integer score;

    public Quote(Integer id, String text, Date upd, Integer userId, Integer score) {
        this.id = id;
        this.text = text;
        this.upd = upd;
        this.userId = userId;
        this.score = score;
    }

    public Quote() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getUpd() {
        return upd;
    }

    public void setUpd(Date date) {
        this.upd = date;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer idUser) {
        this.userId = idUser;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
