package com.mycompany.Controller;

import com.mycompany.model.Word;
import com.mycompany.service.CountNumberCharStringService;

public class CountNumberCharStringController {
    public void countNumberCharString(Word word){
        new CountNumberCharStringService().countNumberCharString(word);
    }
}
