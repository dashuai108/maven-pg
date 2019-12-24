package com.dashuai.pg.mavenpg.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/maven")
@Slf4j
public class MavenPgController {

    @ApiOperation(value = "查询所有员工", notes = "查询所有员工列表", tags = {"员工模块接口"})
    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello World";
    }
}
