package com.lpu.AnnotationsApproach.ReportGenerationSystem;

import org.springframework.stereotype.Component;

@Component
public class ExcelReportService implements ReportService{
    public void using(){
        System.out.println("Using Excel Report Service");
    }
}
