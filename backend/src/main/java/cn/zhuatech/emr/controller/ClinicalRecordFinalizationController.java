/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.emr.controller;

import cn.zhuatech.emr.common.ApiResponse;
import cn.zhuatech.emr.service.ClinicalRecordFinalizationService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController
@RequestMapping("/api/enterprise/emr")
public class ClinicalRecordFinalizationController {
    private final ClinicalRecordFinalizationService service;
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public ClinicalRecordFinalizationController(ClinicalRecordFinalizationService service) { this.service = service; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @PostMapping("/clinical-record-finalization")
    public ApiResponse<ClinicalRecordFinalizationService.Assessment> assess(
            @Valid @RequestBody ClinicalRecordFinalizationService.Request request) {
        return ApiResponse.ok(service.assess(request));
    }
}
