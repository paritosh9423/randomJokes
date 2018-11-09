package com.random.jokes.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class FetchJoke {
String joke="";
ChuckNorrisQuotes chuckNorrisQuotes;

    public FetchJoke(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public  String getJoke(){

joke = this.chuckNorrisQuotes.getRandomQuote();
        return joke;

    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

}
