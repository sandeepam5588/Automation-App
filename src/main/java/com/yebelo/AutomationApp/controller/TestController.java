package com.yebelo.AutomationApp.controller;

import com.yebelo.AutomationApp.model.UserVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
    @PostMapping("/wish/{userName}")
    public ResponseEntity<String> wish(@PathVariable(name = "userName") String userName){
        String message = "Hi "+userName+", Have a Good Day..!";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @PostMapping("/wish2")
    public ResponseEntity<String> wish2(@RequestBody UserVO userVO){
        String message = "Hi "+userVO.getUserName()+", "+ userVO.getMessage() +"...!";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
