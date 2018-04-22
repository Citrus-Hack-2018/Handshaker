package com.github.citrus_hack_2018.handshaker;

public class Pip {
    private int x;
    private int y;

    public Pip(int x, int y) {
        setX(x).setY(y);
    }

    public Pip() {
        this(0, 0);
    }


    //-- Accessors and Mutators --\\
    public Pip setX(int x) {
        this.x = x;
        return this;
    }

    public int getX() {
        return x;
    }

    public Pip setY(int y) {
        this.y = y;
        return this;
    }

    public int getY() {
        return y;
    }


    //-- Miscellaneous --\\


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof Pip) {
            Pip pObj = (Pip)obj;
            return pObj.getX() == x && pObj.getY() == y;
        }

        return false;

    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
