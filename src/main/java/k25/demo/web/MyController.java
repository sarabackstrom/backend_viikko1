package k25.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class MyController {
    
    @RequestMapping("/index")
    @ResponseBody
    public String returnMessage1(){
        return "This is the main page";
    }

    @RequestMapping("/contact")
    @ResponseBody
    public String returnMessage2(){
        return "This is the contact page";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String returnMessage3(@RequestParam (name="name", defaultValue = "Guest") String etunimi, @RequestParam (name="location", defaultValue = "World") String sijainti){
        return "Welcome to the " + sijainti + " " + etunimi;}

}
