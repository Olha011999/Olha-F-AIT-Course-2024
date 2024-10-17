package homework_26.detail.dao;

import homework_26.detail.model.Detail;

public interface Stock {

    boolean addDetail(Detail detail);

    Detail findDetail(long barCode);

    Detail updateDetail(Detail detail);

    Detail removeDetail(long barCode);

    double totalWeightOfAllDetail (double weight);

    double averageWeightOfAllDetail (double weight);

}
