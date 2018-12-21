package com.alexshay.shape.task.entity;

import java.util.Objects;

public class ParametrShape {
    private double square;
    private double voluem;
    private double pyrimetr;

    public ParametrShape() {
    }

    public ParametrShape(double square, double voluem, double pyrimetr) {
        this.square = square;
        this.voluem = voluem;
        this.pyrimetr = pyrimetr;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getVoluem() {
        return voluem;
    }

    public void setVoluem(double voluem) {
        this.voluem = voluem;
    }

    public double getPyrimetr() {
        return pyrimetr;
    }

    public void setPyrimetr(double pyrimetr) {
        this.pyrimetr = pyrimetr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParametrShape that = (ParametrShape) o;
        return Double.compare(that.square, square) == 0 &&
                Double.compare(that.voluem, voluem) == 0 &&
                Double.compare(that.pyrimetr, pyrimetr) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(square, voluem, pyrimetr);
    }
}
