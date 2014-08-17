package com.vedroid.server.util;

import com.vedroid.server.dao.ShopDAO;
import com.vedroid.server.init.BeansConfig;
import com.vedroid.server.repository.IShopRepository;
import com.vedroid.server.service.IShopService;
import org.junit.After;
import org.junit.Before;
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
    protected IShopService shopService;

    @Autowired
    protected IShopRepository shopRepository;

    @Autowired
    protected ShopDAO shopDAO;

    @Before
    public void setUp() throws Exception {
//        MockitoAnnotations.initMocks(this);
//        Advised advised;
//        Object target;
//
//        advised = (Advised) environmentService;
//        target = advised.getTargetSource().getTarget();
//        EnvironmentServiceImpl environmentServiceImpl = (EnvironmentServiceImpl) target;
//        environmentServiceImpl.setSbmService(mockSbmService);
//
//        doReturn(getUserContext()).when(mockSecurityService).getUserContext();
//        doReturn(getAuthToken()).when(mockSecurityService).getAuthToken();
    }

    @After
    public void tearDown() throws Exception {
        shopDAO.deleteAllFromTable();
    }
}
