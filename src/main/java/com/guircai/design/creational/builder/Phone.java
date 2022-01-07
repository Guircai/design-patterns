package com.guircai.design.creational.builder;

import lombok.Builder;

@Builder
public class Phone {
    protected String cpu;
    protected String men;
    protected String disk;
    protected String cam;

    @Override
    public String toString() {
        return "Phone [cam=" + cam + ", cpu=" + cpu + ", disk=" + disk + ", men=" + men + "]";
    }

    public String getCpu() {
        return cpu;
    }

    public String getMen() {
        return men;
    }

    public String getDisk() {
        return disk;
    }

    public String getCam() {
        return cam;
    }
}
