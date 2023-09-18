package th.mfu;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import th.mfu.domain.Concert;

@Controller
public class ConcertController {
    // TODO: define repository for concert and @Autowired

    
    //TODO: add constructor with repository as a parameter


    //TODO: add initBinder for date format
  

    @GetMapping("/concerts")
    public String listConcerts(Model model) {
        // TODO: list all concerts
        // TODO: return a template to list concerts
        return "";
    }

    @GetMapping("/add-concert")
    public String addAConcertForm(Model model) {
        // TODO: pass blank concert to a form
        // TODO: return a template for concert form
        return "";
    }

    @GetMapping("/concerts/{id}")
    public String getConcert(Model model, @PathVariable Long id) {
        //TODO: find concert by id
        // TODO: add concert to model
        // TODO: return a template for concert form
        return "";
    }


    @PostMapping("/concerts")
    public String saveConcert(@ModelAttribute Concert concert) {
        // TODO: add concert to DB
        // TODO: redirect to list concerts
        return "";
    }

    @GetMapping("/delete-concert/{id}")
    public String deleteConcert(@PathVariable long id) {
        // TODO: delete concert from DB
        // TODO: redirect to list concerts
        return "";
    }

    
    @GetMapping("/delete-concert")
    public String removeAllConcerts() {
        // delete all employees 
        return "";
    }

}
