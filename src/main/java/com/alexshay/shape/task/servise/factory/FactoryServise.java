package com.alexshay.shape.task.servise.factory;

import com.alexshay.shape.task.dao.factory.FactoryDAO;
import com.alexshay.shape.task.dao.warehousedao.WareHouseDAOImpl;
import com.alexshay.shape.task.entity.ParametrShape;
import com.alexshay.shape.task.entity.Shape;
import java.util.List;
import java.util.Map;

public class FactoryServise {
    private static final FactoryServise INSTANCE = new FactoryServise();
    private FactoryDAO dao = FactoryDAO.getInstance();
    private Map<Integer,ParametrShape> parameters = dao.getWareHouseDAO().getParameters();
    private List<Shape> shapes = dao.getWareHouseDAO().getShapes();
    private WareHouseDAOImpl wareHouseDAO = dao.getWareHouseDAO();
    public static FactoryServise getInstance(){
       return INSTANCE;
   }

    private FactoryServise(){}

    public WareHouseDAOImpl getWareHouseDAO() {
        return wareHouseDAO;
    }

    public void setWareHouseDAO(WareHouseDAOImpl wareHouseDAO) {
        this.wareHouseDAO = wareHouseDAO;
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
}
