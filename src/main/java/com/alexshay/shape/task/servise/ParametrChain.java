package com.alexshay.shape.task.servise;

import com.alexshay.shape.task.entity.ParametrShape;
import com.alexshay.shape.task.entity.Shape;
import com.alexshay.shape.task.servise.exception.ParametrException;

public interface ParametrChain {
    void parametr(Shape shape, ParametrShape parametrShape) throws ParametrException;
    BaseParametr linkWith(BaseParametr baseParametr);
}
