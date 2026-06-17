package com.arman_nqz.ColoursPrinter;

import com.arman_nqz.ColoursPrinter.services.ColourPrinter;
import com.arman_nqz.ColoursPrinter.services.impl.ColourPrinterImpl;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class ColoursPrinterApplication implements CommandLineRunner {

	private ColourPrinter colourPrinter;

	public ColoursPrinterApplication(ColourPrinter colourPrinter) {
		this.colourPrinter = colourPrinter;
	}

	public static void main(String[] args) {
		SpringApplication.run(ColoursPrinterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(colourPrinter.print());
	}
}
