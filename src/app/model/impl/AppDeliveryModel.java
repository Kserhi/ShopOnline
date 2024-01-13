package app.model.impl;

import app.entity.Purchase;
import app.model.AppModel;

public class AppDeliveryModel implements AppModel {
    @Override
    public double calcPayment(Purchase purchase){

        return purchase.getPrice()* purchase.getQuota() * 1.2;
    }
}
