/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.emr.service;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
class ClinicalRecordFinalizationServiceTest {
    private final ClinicalRecordFinalizationService service = new ClinicalRecordFinalizationService();
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @Test void finalizesCompleteRecord() {
        var result = service.assess(new ClinicalRecordFinalizationService.Request("R1", true, true, true,
                true, true, true, true, true, true, true, 0));
        assertThat(result.decision()).isEqualTo(ClinicalRecordFinalizationService.Decision.FINALIZE);
    }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @Test void queriesCodingAndAuditGaps() {
        var result = service.assess(new ClinicalRecordFinalizationService.Request("R2", true, true, false,
                false, true, false, true, true, true, false, 0));
        assertThat(result.actions()).hasSize(2);
    }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @Test void blocksUnsafeRecord() {
        var result = service.assess(new ClinicalRecordFinalizationService.Request("R3", false, false, true,
                false, false, true, false, false, false, true, 2));
        assertThat(result.blockers()).hasSize(8);
    }
}
