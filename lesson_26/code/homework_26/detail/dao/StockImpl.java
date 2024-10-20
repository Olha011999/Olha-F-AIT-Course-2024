package homework_26.detail.dao;

import homework_26.detail.model.Detail;


public class StockImpl implements homework_26.detail.dao.Stock {


    @Override
    public boolean addDetail(Detail detail) {
        return false;
    }

    @Override
    public Detail findDetail(long barCode) {
        return null;
    }

    @Override
    public Detail updateDetail(Detail detail) {
        return null;
    }

    @Override
    public Detail removeDetail(long barCode) {
        return null;
    }

    @Override
    public double totalWeightOfAllDetail(double weight) {
        return 0;
    }

    @Override
    public double averageWeightOfAllDetail(double weight) {
        return 0;
    }
}
