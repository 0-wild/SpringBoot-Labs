package cn.iocoder.springcloudalibaba.labx7.consumerdemo.controller;

import cn.iocoder.springcloudalibaba.labx7.api.UserService;
import cn.iocoder.springcloudalibaba.labx7.dto.UserDTO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user04")
public class User04Controller {

    @Reference(version = "1.0.0", protocol = "dubbo")
    private UserService userService;

    @GetMapping("/get")
    public UserDTO get(@RequestParam("id") Integer id) {
        return userService.get(id);
    }

}
