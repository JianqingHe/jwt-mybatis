package com.usoft.b2b.manage.controller;

import com.usoft.b2b.manage.domain.City;
import com.usoft.b2b.manage.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bysocket
 * @date 07/02/2017
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @GetMapping(value = "/api/city")
    public City findOneCity(@RequestParam(value = "cityName") String cityName) {
        return cityService.findCityByName(cityName);
    }

}
