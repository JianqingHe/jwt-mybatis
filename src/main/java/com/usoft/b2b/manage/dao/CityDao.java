package com.usoft.b2b.manage.dao;

import com.usoft.b2b.manage.domain.City;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 城市 DAO 接口类
 *
 *
 * @author bysocket
 * @date 07/02/2017
 */
@Repository
public interface CityDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(@Param("cityName") String cityName);
}
