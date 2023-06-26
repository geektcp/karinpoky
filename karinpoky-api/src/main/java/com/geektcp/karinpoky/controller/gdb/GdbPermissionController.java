package com.geektcp.karinpoky.controller.gdb;

import com.geektcp.common.spring.model.dto.ResponseDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author geektcp on 2023/6/26 12:38.
 */
@RestController
@RequestMapping("/gdb/permission")
@Api(tags = {"relationship storage instruct"})
public class GdbPermissionController {

    @GetMapping(value = "/insert")
    @ResponseBody
    @ApiOperation(value = "insert data")
    public ResponseDTO<Object> insert() {

        return ResponseDTO.success();
    }


    @GetMapping(value = "/delete")
    @ResponseBody
    @ApiOperation(value = "delete data")
    public ResponseDTO<Object> delete() {

        return ResponseDTO.success();
    }


    @GetMapping(value = "/update")
    @ResponseBody
    @ApiOperation(value = "update data")
    public ResponseDTO<Object> update() {

        return ResponseDTO.success();
    }


    @GetMapping(value = "/select")
    @ResponseBody
    @ApiOperation(value = "select data")
    public ResponseDTO<Object> select() {

        return ResponseDTO.success();
    }


    @GetMapping(value = "/path/shortest")
    @ResponseBody
    @ApiOperation(value = "select data")
    public ResponseDTO<Object> shortestPath() {

        return ResponseDTO.success();
    }


    @GetMapping(value = "/path/full")
    @ResponseBody
    @ApiOperation(value = "select data")
    public ResponseDTO<Object> fullPath() {

        return ResponseDTO.success();
    }


    @GetMapping(value = "/vertex/extend")
    @ResponseBody
    @ApiOperation(value = "select data")
    public ResponseDTO<Object> vertexExtend() {

        return ResponseDTO.success();
    }


}
