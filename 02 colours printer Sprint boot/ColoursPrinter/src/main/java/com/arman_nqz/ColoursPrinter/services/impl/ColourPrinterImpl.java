package com.arman_nqz.ColoursPrinter.services.impl;

import com.arman_nqz.ColoursPrinter.services.BluePrinter;
import com.arman_nqz.ColoursPrinter.services.ColourPrinter;
import com.arman_nqz.ColoursPrinter.services.GreenPrinter;
import com.arman_nqz.ColoursPrinter.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColourPrinterImpl implements ColourPrinter {

    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColourPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }


    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}
