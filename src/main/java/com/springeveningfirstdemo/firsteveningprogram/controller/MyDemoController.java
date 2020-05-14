package com.springeveningfirstdemo.firsteveningprogram.controller;

import com.springeveningfirstdemo.firsteveningprogram.impl.MyDemoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyDemoController {

   // @Autowired
    private MyDemoImpl myDemoImpl;

//    public MyDemoController(MyDemoImpl myDemoImpl){
//        System.out.println("Hiiiiiiiiiiiii");
//        this.myDemoImpl=myDemoImpl;
//    }
    @Autowired
    public void setMyDemoImpl(MyDemoImpl myDemoImpl) {
        this.myDemoImpl = myDemoImpl;
    }

    @GetMapping(value="/check")
    public String check(){
        return myDemoImpl.getData();
    }
}
