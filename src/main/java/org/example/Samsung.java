package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung implements Phone{

    @Autowired
    MobileProcessor cpu;

    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }

    public void printConfigurations(){

        System.out.println("Phone Information -> Brand: Samsung, Memory: 128 Gb");
        cpu.process();

    }
}
