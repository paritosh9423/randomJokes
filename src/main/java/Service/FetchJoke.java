package Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class FetchJoke {
String joke="";
    public  String getJoke(){
        joke=new ChuckNorrisQuotes().getRandomQuote();
       // System.out.println("FAROM SERVICE"+joke);

        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

}
