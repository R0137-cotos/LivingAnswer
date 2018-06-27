package jp.co.ricoh.cotos.living;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jp.co.ricoh.cotos.commonlib.util.DBUtil;

@Configuration
public class LivingConfig {
	@Bean
	@ConditionalOnMissingBean(LivingAnswerController.class)
	public LivingAnswerController loadLivingController(ConfigurableApplicationContext context) {
		DBUtil dbUtil = context.getBean(DBUtil.class);
		return new LivingAnswerController(dbUtil);
	}
}
