package com.alexshay.shape.task.dao.warehousedao;

import com.alexshay.shape.task.dao.ShapeDAO;
import com.alexshay.shape.task.dao.validation.ValidationShape;
import com.alexshay.shape.task.entity.ParametrShape;
import com.alexshay.shape.task.entity.Shape;
import com.alexshay.shape.task.entity.shape.Cube;
import com.alexshay.shape.task.servise.BaseParametr;
import com.alexshay.shape.task.servise.CalculationShape;
import com.alexshay.shape.task.servise.cube.CalculationCube;
import com.alexshay.shape.task.servise.cube.SquareCubeServise;
import com.alexshay.shape.task.warehouse.WareHouse;

import java.util.Currency;
import java.util.List;
import java.util.Map;


public class WareHouseDAOImpl implements ShapeDAO {
    private WareHouse wareHouse = WareHouse.getInstance();
    private Map<Integer,ParametrShape> parameters = wareHouse.getParameters();
    private List<Shape> shapes = wareHouse.getShapes();
    private CalculationShape calculation = new CalculationCube();
    private ValidationShape validationShape = new ValidationShape();

    public void saveShape(Shape shape) {
        if(validationShape.isShape(shape)) {
            shapes.add(shape);
            parameters.put(shapes.indexOf(shape), calculation.getParametrs(shape));
        }
    }

    public void removeShape(Shape shape) {
        parameters.remove(shapes.indexOf(shape));
        shapes.remove(shape);
    }

    public void changeShape(Shape shape) {
        if(validationShape.isShape(shape)) {
            parameters.replace(shapes.indexOf(shape), calculation.getParametrs(shape));
        }
    }


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
    public WareHouse getWareHouse() {
        return wareHouse;
    }

    public void setWareHouse(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }
}
