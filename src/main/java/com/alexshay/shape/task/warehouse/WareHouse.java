package com.alexshay.shape.task.warehouse;

import com.alexshay.shape.task.entity.ParametrShape;
import com.alexshay.shape.task.entity.Shape;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WareHouse {
    private static final WareHouse INSTANCE = new WareHouse();
    private Map<Integer,ParametrShape> parameters = new HashMap<Integer, ParametrShape>();
    private List<Shape> shapes = new ArrayList<>();

    public Map<Integer, ParametrShape> getParameters() {
        return parameters;
    }

    public void setParameters(Map<Integer, ParametrShape> parameters) {
        this.parameters = parameters;
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public static WareHouse getInstance() {
        return INSTANCE;
    }

    private WareHouse() {
    }
}
