/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.emr.controller;
import cn.zhuatech.emr.common.ApiResponse; import cn.zhuatech.emr.service.MedicationSafetyService; import jakarta.validation.Valid; import org.springframework.web.bind.annotation.*;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController @RequestMapping("/api/emr/insights/medication-safety") public class MedicationSafetyController {private final MedicationSafetyService service; /**
                                                                                                                                                                * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                */
public MedicationSafetyController(MedicationSafetyService service){this.service=service;} /**
                                                                                                                                                                                                                                                          * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                                                                          */
@PostMapping ApiResponse<MedicationSafetyService.Result> evaluate(@Valid @RequestBody MedicationSafetyService.Request request){return ApiResponse.ok(service.evaluate(request));}}
