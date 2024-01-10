package com.turkmuhendisi.depi;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("PDF")
public class PdfFileReader implements Reader {
    @Override
    public String readFile() {
        return "PDF File";
    }
}
