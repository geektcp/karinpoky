package com.geektcp.karinpoky.controller.policy;

import com.geektcp.common.spring.model.dto.ResponseDTO;
import com.geektcp.karinpoky.model.policy.InstructPolicyResult;
import com.geektcp.karinpoky.model.policy.InstructPolicySet;
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
@RequestMapping("/policy")
@Api(tags = {"relationship storage instruct"})
public class PolicyController {

    @GetMapping(value = "/add")
    @ResponseBody
    @ApiOperation(value = "add policy")
    public ResponseDTO<InstructPolicyResult> insert(InstructPolicySet instructPolicySet) {

        return ResponseDTO.success();
    }


    @GetMapping(value = "/del")
    @ResponseBody
    @ApiOperation(value = "del policy")
    public ResponseDTO<InstructPolicyResult> delete() {

        return ResponseDTO.success();
    }



    @GetMapping(value = "/update")
    @ResponseBody
    @ApiOperation(value = "update policy")
    public ResponseDTO<InstructPolicyResult> update() {

        return ResponseDTO.success();
    }



    @GetMapping(value = "/select")
    @ResponseBody
    @ApiOperation(value = "select policy")
    public ResponseDTO<InstructPolicyResult> select() {

        return ResponseDTO.success();
    }


    @GetMapping(value = "/match")
    @ResponseBody
    @ApiOperation(value = "match policy")
    public ResponseDTO<InstructPolicyResult> match() {

        return ResponseDTO.success();
    }

}
