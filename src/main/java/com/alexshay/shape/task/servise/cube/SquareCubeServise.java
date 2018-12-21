package com.alexshay.shape.task.servise.cube;

import com.alexshay.shape.task.entity.ParametrShape;
import com.alexshay.shape.task.entity.shape.Cube;
import com.alexshay.shape.task.entity.Shape;
import com.alexshay.shape.task.servise.BaseParametr;
import com.alexshay.shape.task.servise.exception.ParametrException;

public class SquareCubeServise extends BaseParametr {
    @Override
    public void parametr(Shape shape, ParametrShape parametrShape) {
        try {
            Cube cube = (Cube) shape;
            parametrShape.setSquare(6*cube.getLengthEdge()*cube.getLengthEdge());
            nextParametr(shape,parametrShape);
        } catch (ParametrException e) {
            log.info("Parameter is uncorrect");
        }
    }
}
