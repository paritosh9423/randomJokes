package Controller;

import Service.FetchJoke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

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
