package com.stackroute.music.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Track {
    @Id
    private int id;
    private String lang;
    private String genre;
    private String singer;

    public Track() {
    }

    public Track(int id, String lang, String genre, String singer) {
        this.id = id;
        this.lang = lang;
        this.genre = genre;
        this.singer = singer;
    }

    public int getId() {
        return id;
    }

    public String getLang() {
        return lang;
    }

    public String getGenre() {
        return genre;
    }

    public String getSinger() {
        return singer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
