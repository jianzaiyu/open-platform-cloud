package cn.ce.services.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author ggs
 * @date 2019/3/4 0:31
 */
@RestController
public class Oauth2ServerController {

    @GetMapping("current")
    public Principal getPrincipal(Principal principal){
        return principal;
    }
}