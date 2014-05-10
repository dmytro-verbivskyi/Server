package com.vedroid.server.util;

import com.vedroid.server.init.BeansConfig;
import com.vedroid.server.service.ShopService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = BeansConfig.class)
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class InMemoryDBTest {

    @Autowired
    protected ShopService shopService;

}
