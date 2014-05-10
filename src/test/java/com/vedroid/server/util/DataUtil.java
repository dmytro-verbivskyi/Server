package com.vedroid.server.util;

import com.vedroid.server.model.Shop;

public class DataUtil {

    public static Shop getShop() {
        Shop shop = new Shop();
        shop.setName("shopName");
        shop.setEmplNumber(12);
        return shop;
    }
}
