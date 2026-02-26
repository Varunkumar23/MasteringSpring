package com.lpu.AnnotationsApproach.ReportGenerationSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ReportController {
    private final ReportService reportService;

    @Autowired
    public ReportController(@Qualifier("excelReportService") ReportService reportService){
        this.reportService=reportService;
    }

    public void useService(){
        System.out.println("Hello, Please wait while we set up your Report Generation Service");
        reportService.using();
    }
}
