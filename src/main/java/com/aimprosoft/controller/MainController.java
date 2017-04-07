package com.aimprosoft.controller;

import com.aimprosoft.model.Department;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@Controller
@RequestMapping(value = "/")
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userJSP", new Department());
        modelAndView.setViewName("index");
        return modelAndView;
    }
/*    public String showRoles (ModelMap model) {

        model.addAttribute("msg", "Hello SpringMVC");

        return "index";
    }*/

}
