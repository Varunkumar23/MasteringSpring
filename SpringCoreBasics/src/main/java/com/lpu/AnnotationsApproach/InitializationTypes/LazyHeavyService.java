package com.lpu.AnnotationsApproach.InitializationTypes;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
//@Component
public class LazyHeavyService {
    public LazyHeavyService() {
        System.out.println("🔥 Lazy HeavyService bean created");
    }

    public void work() {
        System.out.println("HeavyService is working...");
    }
}
