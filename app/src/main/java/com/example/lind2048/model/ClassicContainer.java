package com.example.lind2048.model;

import java.util.Random;

public class ClassicContainer extends ContainerBase{

    public ClassicContainer()
    {
        random = new Random();
        container = new LatticeType[4][4];
        containerSize = 16;
        cleanContainer();
        produceNewValue();
    }

    @Override
    protected int cleanContainer() {
        int x;
        int y;
        for (x = 0; x < 4; x++) {
            for (y = 0; y < 4; y++) {
                container[x][y] = LatticeType.LATTICE_NULL;
            }
        }

        return super.cleanContainer();
    }

    @Override
    protected int produceNewValue() {
        int randValue = random.nextInt(containerSize - 1);
        int x = randValue / 4;
        int y = randValue % 4;
        container[x][y].setValue(2);
        return super.produceNewValue();
    }

    @Override
    protected int bumpUp() {
        int x;
        int y;
        int z;
        for (x = 0; x < 4; x++) {
            for (y = 0; y < 3; y++) {
                if (container[x][y] == LatticeType.LATTICE_NULL) {
                    for (z = y + 1; z < 4; z++){
                        if(container[x][z] != LatticeType.LATTICE_NULL){
                            swapLattice(container[x][y], container[x][z]);
                        }
                    }
                }
                if (container[x][y + 1] == LatticeType.LATTICE_NULL) {
                    for (z = y + 2; z < 4; z++) {
                        if (container[x][z] != LatticeType.LATTICE_NULL) {
                            swapLattice(container[x][y + 1], container[x][z]);
                        }
                    }
                }
                if (container[x][y] == container[x][y + 1])
                {
                    container[x][y].setValue(container[x][y].getValue() * 2);
                    container[x][y + 1].setValue(0);
                }
            }
        }
        return super.bumpUp();
    }

    @Override
    protected int bumpDown() {
        int x;
        int y;
        int z;
        for (x = 0; x < 4; x++) {
            for (y = 3; y > 0; y--) {
                if (container[x][y] == LatticeType.LATTICE_NULL) {
                    for (z = y - 1; z >= 0; z--){
                        if(container[x][z] != LatticeType.LATTICE_NULL){
                            swapLattice(container[x][y], container[x][z]);
                        }
                    }
                }
                if (container[x][y - 1] == LatticeType.LATTICE_NULL) {
                    for (z = y - 2; z >= 0; z--) {
                        if (container[x][z] != LatticeType.LATTICE_NULL) {
                            swapLattice(container[x][y - 1], container[x][z]);
                        }
                    }
                }
                if (container[x][y] == container[x][y - 1])
                {
                    container[x][y].setValue(container[x][y].getValue() * 2);
                    container[x][y - 1].setValue(0);
                }
            }
        }
        return super.bumpDown();
    }

    private void swapLattice(LatticeType lattice1, LatticeType lattice2)
    {
        lattice1.setValue(lattice2.getValue());
        lattice2.setValue(0);
    }
}
