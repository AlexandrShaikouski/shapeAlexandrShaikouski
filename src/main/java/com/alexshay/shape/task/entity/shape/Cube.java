package com.alexshay.shape.task.entity.shape;

import com.alexshay.shape.task.entity.Dot;
import com.alexshay.shape.task.entity.Shape;
import com.alexshay.shape.task.servise.factory.FactoryServise;

import java.util.Objects;

public class Cube extends Shape {
    private double lengthEdge;
    public Cube(double length, double coordinateX,  double coordinateY,  double coordinateZ) {
        super(new Dot(coordinateX,coordinateY,coordinateZ));
        lengthEdge = length;
    }

    public double getLengthEdge() {
        return lengthEdge;
    }

    public void setLengthEdge(double lengthEdge) {
        FactoryServise factoryServise = FactoryServise.getInstance();
        this.lengthEdge = lengthEdge;
        factoryServise.getWareHouseDAO().changeShape(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        Dot dot1 = this.getDot();
        Dot dot2 = cube.getDot();

        return Double.compare(cube.lengthEdge, lengthEdge) == 0 &&
                Double.compare(dot1.getCoordinateX(),dot2.getCoordinateX()) == 0 &&
                Double.compare(dot1.getCoordinateY(),dot2.getCoordinateY()) == 0 &&
                Double.compare(dot1.getCoordinateZ(),dot2.getCoordinateZ()) == 0;

    }

    @Override
    public int hashCode() {

        return Objects.hash(lengthEdge);
    }
}
