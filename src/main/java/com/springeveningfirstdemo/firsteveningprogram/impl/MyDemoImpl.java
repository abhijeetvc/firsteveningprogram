package com.springeveningfirstdemo.firsteveningprogram.impl;

import com.springeveningfirstdemo.firsteveningprogram.repository.MyDemoInterface;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MyDemoImpl implements MyDemoInterface {

    @Override
    public String getData() {
        return "Checking DI and IoC";
    }
}
