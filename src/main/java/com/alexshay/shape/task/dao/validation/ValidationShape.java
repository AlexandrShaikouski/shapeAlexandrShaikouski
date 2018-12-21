package com.alexshay.shape.task.dao.validation;

import com.alexshay.shape.task.entity.Shape;
import com.alexshay.shape.task.entity.shape.Cube;

public class ValidationShape {
    public boolean isShape(Shape shape){
        if(shape instanceof Cube){
            Cube cube = (Cube) shape;
            return isShape(cube);
        }
        return false;
    }
    public boolean isShape(Cube cube){
        return cube.getLengthEdge() > 0?true:false;
    }
}
