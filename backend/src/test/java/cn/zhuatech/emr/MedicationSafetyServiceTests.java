/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.emr;
import cn.zhuatech.emr.service.MedicationSafetyService; import org.junit.jupiter.api.Test; import static org.junit.jupiter.api.Assertions.*;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
class MedicationSafetyServiceTests {private final MedicationSafetyService service=new MedicationSafetyService();
 /**
  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
  */
 @Test void blocksKnownAllergy(){var r=service.evaluate(new MedicationSafetyService.Request("RX-1",true,"NONE",false,false,true,true));assertEquals("BLOCK",r.status());}
 /**
  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
  */
 @Test void clearsReconciledPrescription(){var r=service.evaluate(new MedicationSafetyService.Request("RX-2",false,"NONE",false,false,true,true));assertEquals("CLEAR",r.status());assertEquals(0,r.riskScore());}}
