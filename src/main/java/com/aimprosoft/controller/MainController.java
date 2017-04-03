package com.aimprosoft.controller;

import com.aimprosoft.model.Department;
import com.aimprosoft.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;
import java.util.List;

@Controller
public class MainController  {

    @Autowired
    private DepartmentService departmentService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
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
    }



/*    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String depWelcome(ModelMap model) {
        try {
            List<Department> departments = departmentService.showDepartments();
            model.addAttribute("departments", departments);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "hello";

    }

    @RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
    public ModelAndView hello(@PathVariable("name") List<Department> dep) {

        ModelAndView model = new ModelAndView();
        model.setViewName("depList");
        model.addObject("departments", dep);

        return model;
    }*/

}
