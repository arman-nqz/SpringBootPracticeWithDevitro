package com.arman_nqz.ColoursPrinter.services.impl;

import com.arman_nqz.ColoursPrinter.services.GreenPrinter;
import org.springframework.stereotype.Component;


public class EnglishGreenPrinter implements GreenPrinter {
    @Override
    public String print() {return "green";}
}
