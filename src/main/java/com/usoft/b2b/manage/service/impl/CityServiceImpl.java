package com.usoft.b2b.manage.service.impl;

import com.usoft.b2b.manage.dao.CityDao;
import com.usoft.b2b.manage.domain.City;
import com.usoft.b2b.manage.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 城市业务逻辑实现类
 *
 *
 * @author bysocket
 * @date 07/02/2017
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

}
