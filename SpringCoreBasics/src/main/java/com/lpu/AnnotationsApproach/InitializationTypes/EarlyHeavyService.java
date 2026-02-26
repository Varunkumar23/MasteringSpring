package com.lpu.AnnotationsApproach.InitializationTypes;

import org.springframework.stereotype.Component;

@Component
public class EarlyHeavyService {
    public EarlyHeavyService() {
        System.out.println("🔥 Early HeavyService bean created");
    }

    public void work() {
        System.out.println("HeavyService is working...");
    }
}
