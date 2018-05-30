package jp.co.ricoh.cotos.living;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.ricoh.cotos.commonlib.db.DBUtil;

@RestController
@RequestMapping("/api/living")
public class LivingAnswerController {
	private DBUtil dbUtil;

	public LivingAnswerController(DBUtil dbUtil) {
		this.dbUtil = dbUtil;
	}

	@GetMapping
	public String sayLiving() {
		dbUtil.loadCountFromSQLFile("sql/select1FromDual.sql");
		return "living";
	}
}
