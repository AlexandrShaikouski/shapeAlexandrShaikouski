package com.alexshay.shape.task.dao;

import com.alexshay.shape.task.entity.Shape;

public interface ShapeDAO {
    public void saveShape(Shape shape);

    public void removeShape(Shape shape);

    public void changeShape(Shape shape);
}
