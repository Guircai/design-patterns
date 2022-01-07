package com.guircai.design.creational.builder;

public class XiaoMiBuilder extends AbstractBuilder{

    public XiaoMiBuilder() {
        // phone = new Phone();
        phone = Phone.builder().build();
    }

    @Override
    AbstractBuilder customCam(String cam) {
        phone.cam = cam;
        return this;
    }

    @Override
    AbstractBuilder customCpu(String cpu) {
        phone.cpu = cpu;
        return this;
    }

    @Override
    AbstractBuilder customDisk(String disk) {
        phone.disk = disk;
        return this;
    }

    @Override
    AbstractBuilder customMen(String men) {
        phone.men = men;
        return this;
    }
}
