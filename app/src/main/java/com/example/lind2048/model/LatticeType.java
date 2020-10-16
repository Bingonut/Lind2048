package com.example.lind2048.model;

public enum LatticeType {
    LATTICE_NULL(0),
    LATTICE_2(2),
    LATTICE_4(4),
    LATTICE_8(8),
    LATTICE_16(16),
    LATTICE_32(32),
    LATTICE_64(64),
    LATTICE_128(128),
    LATTICE_256(256),
    LATTICE_512(512),
    LATTICE_1024(1024),
    LATTICE_2048(2048),
    LATTICE_BOOM(100);

    private int value;

    private LatticeType(int value)
    {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
