package com.sumati.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Sumati world";
    }
    @GetMapping("/login")
    public String login(@RequestParam String userName,@RequestParam String password){
        if(userName.equalsIgnoreCase("naushad") &&
            password.equalsIgnoreCase("sumati")){
            return "success";
        }
        return "login failed";
    }
    @GetMapping("/getEmployee/{id}")
    public String getEmployeeName(@PathVariable("id") Integer empId){
        return "Sumati -->" + empId;
    }

}
