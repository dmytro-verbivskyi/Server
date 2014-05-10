package com.vedroid.server.service;

import com.vedroid.server.model.Shop;
import com.vedroid.server.util.InMemoryDBTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static com.vedroid.server.util.DataUtil.getShop;

public class ShopServiceTest extends InMemoryDBTest {

    @Test
    public void createShop() {
        Shop s1 = shopService.create(getShop());
        Assert.assertNotNull(s1);
        Assert.assertNotNull(s1.getId());
    }

    @Test
    public void testFindAll() throws Exception {
        List<Shop> shops = shopService.findAll();
        Assert.assertNotNull(shops);
        Assert.assertEquals("There are no shops at all.", 0, shops.size());
    }

}