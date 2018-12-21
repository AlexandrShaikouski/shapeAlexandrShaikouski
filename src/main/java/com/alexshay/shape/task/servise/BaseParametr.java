package com.alexshay.shape.task.servise;

import com.alexshay.shape.task.entity.ParametrShape;
import com.alexshay.shape.task.entity.Shape;
import com.alexshay.shape.task.servise.exception.ParametrException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class BaseParametr implements ParametrChain {
    protected Logger log = LogManager.getLogger(BaseParametr.class);
    protected BaseParametr nextParametr;
    public BaseParametr linkWith(BaseParametr baseParametr) {
        this.nextParametr = baseParametr;
        return baseParametr;
    }
    protected void nextParametr(Shape shape, ParametrShape parametrShape) throws ParametrException {
        if(nextParametr != null){
            nextParametr.parametr(shape,parametrShape);
        }
    }
}
