package com.guircai.design.creational.builder;

public abstract class AbstractBuilder {
    Phone phone;

    abstract AbstractBuilder customCpu(String cpu);
    abstract AbstractBuilder customMen(String men);
    abstract AbstractBuilder customDisk(String disk);
    abstract AbstractBuilder customCam(String cam);

    public Phone product() {
        return this.phone;
    }
}
