package com.lloydsbanking.consumerlending;

import com.lloydsbanking.consumerlending.model.AccountData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cl")
public class ValidationController {

    @GetMapping("/validate")
    public Boolean validateData(@RequestBody AccountData accountData) {

        return true;
    }
}
