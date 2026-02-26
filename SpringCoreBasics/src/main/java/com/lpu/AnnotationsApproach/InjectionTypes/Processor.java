package com.lpu.AnnotationsApproach.InjectionTypes;

import org.springframework.stereotype.Component;

@Component
public class Processor {
    public String getDetails() {
        return "Intel i7 Processor";
    }
}
