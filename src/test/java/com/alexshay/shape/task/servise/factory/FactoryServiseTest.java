package com.alexshay.shape.task.servise.factory;

import com.alexshay.shape.task.dao.warehousedao.WareHouseDAOImpl;
import com.alexshay.shape.task.entity.ParametrShape;
import com.alexshay.shape.task.entity.Shape;
import com.alexshay.shape.task.entity.shape.Cube;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class FactoryServiseTest {
    FactoryServise factoryServise;
    WareHouseDAOImpl wareHouseDAO;
    Map<Integer,ParametrShape> parametrs;
    List<Shape> shapes;
    Cube cube;


    @Before
    public void addValue(){
        factoryServise = FactoryServise.getInstance();
        wareHouseDAO = factoryServise.getWareHouseDAO();
        parametrs = wareHouseDAO.getParameters();
        shapes = wareHouseDAO.getShapes();
        cube = new Cube(2,2,2,2);
    }
    @Test
    public void saveRemoveShapes(){
        wareHouseDAO.saveShape(new Cube(0,1,1,1));
        wareHouseDAO.saveShape(cube);
        wareHouseDAO.saveShape(new Cube(1,1,1,1));
        wareHouseDAO.saveShape(new Cube(-4,1,1,1));
        assertEquals(2,shapes.size());
        wareHouseDAO.removeShape(cube);
        assertEquals(1,shapes.size());
    }
    @Test
    public void changeShapes(){
        wareHouseDAO.saveShape(cube);
        ParametrShape parametrShapeActual = parametrs.get(shapes.indexOf(cube));
        ParametrShape parametrShapeExpected = new ParametrShape(24,8,24);
        assertEquals(parametrShapeExpected,parametrShapeActual);
        cube.setLengthEdge(3);
        parametrShapeActual = parametrs.get(shapes.indexOf(cube));
        parametrShapeExpected = new ParametrShape(54,27,36);
        assertEquals(parametrShapeExpected,parametrShapeActual);
    }

}