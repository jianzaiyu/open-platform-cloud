package cn.ce.gateway.open.config;

import cn.ce.gateway.open.filter.ThirdClientAccessFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author: ggs
 * @date: 2019-04-28 15:43
 **/
@Configuration
public class CustomZuulConfig {


//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    @Bean
//    public CustomRouteLocator routeLocator() {
//        CustomRouteLocator routeLocator = new CustomRouteLocator(dispatcherServletPath.getPrefix(), this.zuulProperties);
//        routeLocator.setJdbcTemplate(jdbcTemplate);
//        return routeLocator;
//    }
//
//    @Bean
//    public ThirdClientAccessFilter thirdClientFilter(CustomRouteLocator customRouteLocator) {
//        return new ThirdClientAccessFilter(customRouteLocator);
//    }

}
