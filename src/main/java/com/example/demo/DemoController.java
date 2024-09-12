package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

// import jakarta.servlet.http.HttpSession;
// import jakarta.servlet.http.HttpServletRequest;

@Controller
public class DemoController {
    
   
   @RequestMapping("index")
     ModelAndView index(User Us){
  
      // HttpSession session = request.getSession();
      // String s = request.getParameter("name");
      // session.setAttribute("Roll", Us);
      // session.setAttribute("password", pass);
      ModelAndView mav = new ModelAndView();
      mav.addObject("Userdetails", Us);
      System.out.println("roll"+Us.getRoll());
      System.out.println("name"+Us.getName());
     
      mav.setViewName("index");
     // session.setAttribute("username",dinesh);
           return mav;
     }}