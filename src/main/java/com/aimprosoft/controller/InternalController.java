package com.aimprosoft.controller;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


public interface InternalController {

    ModelAndView execute (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException, SQLException;

}