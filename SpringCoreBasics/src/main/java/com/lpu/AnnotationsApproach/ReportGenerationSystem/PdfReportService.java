package com.lpu.AnnotationsApproach.ReportGenerationSystem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class PdfReportService implements ReportService {
    public void using(){
        System.out.println("Using Pdf Report Service");
    }
}
