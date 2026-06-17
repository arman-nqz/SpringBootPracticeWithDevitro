package com.arman_nqz.ColoursPrinter.services.impl;

import com.arman_nqz.ColoursPrinter.services.GreenPrinter;
import org.springframework.stereotype.Service;

@Service
public class SpanishGreenPrinter implements GreenPrinter {
    @Override
    public String print() {
        return "verde";
    }
}
