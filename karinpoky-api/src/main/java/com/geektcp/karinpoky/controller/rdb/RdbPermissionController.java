package com.geektcp.karinpoky.controller.rdb;

import com.geektcp.common.spring.model.dto.ResponseDTO;
import com.geektcp.karinpoky.model.permission.InstructPermissionResult;
import com.geektcp.karinpoky.model.permission.InstructPermissionSet;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * @author geektcp on 2023/6/26 12:38.
 */

@RestController
@RequestMapping("/rdb/permission")
@Api(tags = {"relationship storage instruct"})
public class RdbPermissionController {

    @PostMapping(value = "/insert")
    @ResponseBody
    @ApiOperation(value = "insert data")
    public ResponseDTO<InstructPermissionResult> insert(InstructPermissionSet instructPermissionSet) {

        return ResponseDTO.success();
    }


    @PostMapping(value = "/delete")
    @ResponseBody
    @ApiOperation(value = "delete data")
    public ResponseDTO<InstructPermissionResult> delete(InstructPermissionSet instructPermissionSet) {

        return ResponseDTO.success();
    }



    @PostMapping(value = "/update")
    @ResponseBody
    @ApiOperation(value = "update data")
    public ResponseDTO<InstructPermissionResult> update(InstructPermissionSet instructPermissionSet) {

        return ResponseDTO.success();
    }



    @PostMapping(value = "/select")
    @ResponseBody
    @ApiOperation(value = "select data")
    public ResponseDTO<InstructPermissionResult> select(InstructPermissionSet instructPermissionSet) {

        return ResponseDTO.success();
    }


}
