package com.mycompany.App;

import com.mycompany.Controller.CountNumberCharStringController;
import com.mycompany.model.Word;
import com.mycompany.service.CountNumberCharStringService;

public class CountNumberCharString {

    public static void main(String[] args) {
        new CountNumberCharStringController().countNumberCharString(new Word(""));
    }
}
