package com.aimprosoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@Controller
public class MainController implements InternalController{


    @RequestMapping({"/","/home"})
    @Override
    public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException, SQLException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "Hello SpringMVC");
        modelAndView.setViewName("index");
        return modelAndView;
    }

/*    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        List<Department> departments = null;
        try {
            departments = departmentService.showDepartments();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("departments", departments);
        modelAndView.setViewName("depList");
        return modelAndView;
    }*/

}
