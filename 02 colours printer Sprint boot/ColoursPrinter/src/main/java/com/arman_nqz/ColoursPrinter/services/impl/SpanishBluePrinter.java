package com.arman_nqz.ColoursPrinter.services.impl;

import com.arman_nqz.ColoursPrinter.services.BluePrinter;
import org.springframework.stereotype.Service;

@Service
public class SpanishBluePrinter implements BluePrinter {

    @Override
    public String print() {
        return "azul";
    }
}
