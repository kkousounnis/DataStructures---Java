package com.mycompany.Controller;

import com.mycompany.model.Sentence;
import com.mycompany.service.CountNumberCharStringService;

import java.util.HashMap;

public class CountNumberCharStringController {
    public void countNumberCharString(Sentence sentence){
        new CountNumberCharStringService().countNumberCharString(sentence);
    }
}
