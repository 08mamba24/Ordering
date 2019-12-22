package cn.edu.njust.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String homePage(HttpServletRequest httpServletRequest, Model model){
        model.addAttribute("ReserveSuccess",httpServletRequest.getSession().getAttribute("ReserveSuccess"));
        httpServletRequest.getSession().removeAttribute("ReserveSuccess");

        return "home";
    }
}
