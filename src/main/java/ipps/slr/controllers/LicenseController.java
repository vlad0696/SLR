package ipps.slr.controllers;

import ipps.slr.models.LicenseEntity;
import ipps.slr.repository.LicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Gramovich_V on 19.03.2018.
 */
@Controller
@RequestMapping("/License")
public class LicenseController {

    @Autowired
    LicenseRepository licenseRepository;

    @RequestMapping("/findbyid")
    public ModelAndView testApp(@RequestParam("id") long id) {
        ModelAndView modelAndView = new ModelAndView();
        LicenseEntity name= licenseRepository.findOne(id);

        modelAndView.addObject("name", name);
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
