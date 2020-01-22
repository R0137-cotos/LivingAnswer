package jp.co.ricoh.cotos.living.test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class TestLiving {

	@LocalServerPort
	private int port;

	@Test
	@Ignore //LivingAnswerを利用する各ドメイン側でテスト実装とする
	public void livingにアクセスできる() {
		ResponseEntity<String> value = new RestTemplate().getForEntity("http://localhost:" + port + "/api/living", String.class);
		Assert.assertEquals(200, value.getStatusCodeValue());
		Assert.assertEquals("living", value.getBody());
	}
}
