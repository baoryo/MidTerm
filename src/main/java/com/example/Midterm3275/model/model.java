package com.example.Midterm3275.model;
import com.example.Midterm3275.service.RandomJokes;
import org.springframework.beans.factory.annotation.Autowired;



public class model {
    @Autowired
    private RandomJokes randomJokes;
    private String joke;

    public model(String joke) {
        this.joke = randomJokes.getRandomJokes();
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    @Override
    public String toString() {
        return "model{" +
                "joke='" + joke + '\'' +
                '}';
    }
}
