package com.alexshay.shape.task.dao.factory;

import com.alexshay.shape.task.dao.warehousedao.WareHouseDAOImpl;
import com.alexshay.shape.task.warehouse.WareHouse;
public class FactoryDAO {
    private static final FactoryDAO INSTANCE = new FactoryDAO();
    private WareHouseDAOImpl wareHouseDAO = new WareHouseDAOImpl();
    private WareHouse wareHouse = WareHouse.getInstance();


    public static FactoryDAO getInstance(){
        return INSTANCE;
    }

    private FactoryDAO(){}

    public WareHouseDAOImpl getWareHouseDAO() {
        return wareHouseDAO;
    }

    public void setWareHouseDAO(WareHouseDAOImpl wareHouseDAO) {
        this.wareHouseDAO = wareHouseDAO;
    }

}
