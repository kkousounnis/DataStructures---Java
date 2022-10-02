package com.mycompany.Controller;

import com.mycompany.model.Sentence;
import com.mycompany.service.DuplicateCharactersService;

public class DuplicateCharactersController {

    public void DuplicateCharacters(Sentence sentence) {
        new DuplicateCharactersService().duplicateCharacters(sentence);
    }
}
