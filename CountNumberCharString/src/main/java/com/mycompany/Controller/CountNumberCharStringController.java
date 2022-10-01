package com.mycompany.Controller;

import com.mycompany.model.Sentence;
import com.mycompany.service.CountNumberCharStringService;

import java.util.HashMap;

public class CountNumberCharStringController {
    public HashMap<String, Integer> countNumberCharString(Sentence sentence){
        return (new CountNumberCharStringService().countNumberCharString(sentence));
    }
}
