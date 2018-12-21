package com.alexshay.shape.task.servise.cube;

import com.alexshay.shape.task.entity.ParametrShape;
import com.alexshay.shape.task.entity.Shape;
import com.alexshay.shape.task.servise.CalculationShape;

public class CalculationCube implements CalculationShape {
    @Override
    public ParametrShape getParametrs(Shape shape) {
        ParametrShape parametrShape = new ParametrShape();
        VoluemCubeServise parametr = new VoluemCubeServise();
        parametr.linkWith(new SquareCubeServise()).linkWith(new PyrimetrCubeServise());
        parametr.parametr(shape,parametrShape);
        return parametrShape;
    }
}
