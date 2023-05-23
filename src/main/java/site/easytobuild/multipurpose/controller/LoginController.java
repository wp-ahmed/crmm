package site.easytobuild.multipurpose.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import site.easytobuild.multipurpose.service.CustomerService;

@Controller
public class LoginController {

    @Autowired
    CustomerService customerService;

    public LoginController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping("/login")
    public String loginPage(Model model) {
        return "login";
    }
}
