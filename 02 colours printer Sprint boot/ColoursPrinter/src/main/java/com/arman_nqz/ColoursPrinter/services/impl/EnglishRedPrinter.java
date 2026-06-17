package com.arman_nqz.ColoursPrinter.services.impl;

import com.arman_nqz.ColoursPrinter.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter {
    @Override
    public String print() {
        return "red";
    }
}
