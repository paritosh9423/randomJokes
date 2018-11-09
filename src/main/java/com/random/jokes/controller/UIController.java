package com.random.jokes.controller;

import com.random.jokes.service.FetchJoke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UIController {

    private FetchJoke fetchJoke;
    @Autowired
    public UIController(FetchJoke fetchJoke){
        this.fetchJoke  = fetchJoke;

    }
    @RequestMapping({"/",""})
    public String getJoke(Model model){
        model.addAttribute("joke",fetchJoke.getJoke());
        return "jokeUI";
    }


}
