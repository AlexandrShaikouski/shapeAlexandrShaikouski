package com.alexshay.shape.task.entity;

import com.alexshay.shape.task.entity.Dot;

import java.io.Serializable;

public abstract class Shape implements Serializable {
    private Dot point;

    public Shape(Dot point) {
        this.point = point;
    }

    public Dot getDot() {
        return point;
    }

    public void setPoint(Dot point) {
        this.point = point;
    }

}
