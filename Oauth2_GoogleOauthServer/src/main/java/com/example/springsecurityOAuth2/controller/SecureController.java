package com.example.springsecurityOAuth2.controller;
//import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/c")
public class SecureController {

    @GetMapping("/hello")
    //Accessing with localhost:8080 redirects to the github login page.
    //After entering correct details it accepts the token from the server.
    
    public String main(OAuth2AuthenticationToken token) {
      //Used to retrive the user info from the token.
        System.out.println("token"+token.getPrincipal());
        return "secure.html";
    }
    @GetMapping("/welcome")
    @ResponseBody
    public String welcome(){  
      return "hello";
    } 
    
    
}
