package ipps.slr.controllers;

//import com.google.gson.Gson;

import ipps.slr.models.LicenseEntity;
import ipps.slr.repository.LicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/Home")
public class MainController {




    @RequestMapping("/Index")
    public ModelAndView index() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "Vlad");
        modelAndView.setViewName("index");
        return modelAndView;
    }



}
