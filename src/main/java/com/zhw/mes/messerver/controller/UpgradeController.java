package com.zhw.mes.messerver.controller;

import com.zhw.mes.messerver.common.exception.BusinessException;
import com.zhw.mes.messerver.common.response.MultipleResponse;
import com.zhw.mes.messerver.domain.Version;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/upgrade")
public class UpgradeController {


    @GetMapping("/{major}/{minor}/{build}")
    @ResponseBody
    public MultipleResponse getVersionInfo( @PathVariable Integer major ,@PathVariable Integer minor, @PathVariable Integer build){
        List<Version> versions = new ArrayList<>();
        Version version = new Version();
        version.setMajor(1);
        version.setMinor(1);
        version.setBuild(0);
        versions.add(version);

        return MultipleResponse.from(versions,1,1,1);
    }
}
