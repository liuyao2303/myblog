package com.blog.api;

import com.blog.configurations.RedisDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private RedisDao redisDao;

    private static Logger LOG = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("index")
    public String index() {
        boolean k = redisDao.hello();
        LOG.debug("result :: {}", k);
        return "index";
    }
}
