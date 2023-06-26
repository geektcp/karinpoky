package com.geektcp.karinpoky.controller.rdb;

import com.geektcp.common.spring.model.dto.ResponseDTO;
import com.geektcp.karinpoky.model.analyse.InstructAnalyseResult;
import com.geektcp.karinpoky.model.analyse.InstructAnalyseSet;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author geektcp on 2023/6/26 12:38.
 */

@RestController
@RequestMapping("/rdb/analyse")
@Api(tags = {"relationship storage instruct"})
public class RdbAnalyseController {

    @PatchMapping(value = "/insert")
    @ResponseBody
    @ApiOperation(value = "insert data")
    public ResponseDTO<InstructAnalyseResult> insert(InstructAnalyseSet instructAnalyseSet) {

        return ResponseDTO.success();
    }


    @PatchMapping(value = "/delete")
    @ResponseBody
    @ApiOperation(value = "delete data")
    public ResponseDTO<InstructAnalyseResult> delete(InstructAnalyseSet instructAnalyseSet) {

        return ResponseDTO.success();
    }


    @PatchMapping(value = "/update")
    @ResponseBody
    @ApiOperation(value = "update data")
    public ResponseDTO<InstructAnalyseResult> update(InstructAnalyseSet instructAnalyseSet) {

        return ResponseDTO.success();
    }



    @PatchMapping(value = "/select")
    @ResponseBody
    @ApiOperation(value = "select data")
    public ResponseDTO<InstructAnalyseResult> select(InstructAnalyseSet instructAnalyseSet) {

        return ResponseDTO.success();
    }

}
