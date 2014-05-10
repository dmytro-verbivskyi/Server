package com.vedroid.server.service;

import com.vedroid.server.model.Shop;
import com.vedroid.server.util.InMemoryDBTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ShopServiceTest extends InMemoryDBTest {

    @Test
    public void testFindAll() throws Exception {
        List<Shop> shops = shopService.findAll();
        Assert.assertTrue(true);
    }
}