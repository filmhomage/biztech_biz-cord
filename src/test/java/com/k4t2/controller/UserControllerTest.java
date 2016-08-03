package com.k4t2.controller;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.web.context.WebApplicationContext;

import com.k4t2.BizCordApplication;

/**
 * UserControllerのテストクラスです。
 *
 * @author YuichiroTakeda
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringApplicationConfiguration(classes = BizCordApplication.class)
public class UserControllerTest {

	@Autowired
	protected WebApplicationContext wac;
	protected MockMvc mvc;

	@Before
	public void before() throws Exception {
		mvc = webAppContextSetup(wac).build();
	}

	@Test
	public void list() throws Exception {

		// テストの準備を行う（フォーム入力価をrequest.paramで追加）
		String requestPath = "/user";
		MockHttpServletRequestBuilder request = get(requestPath);
		request.content("sms21sms");

		// テストを実行する
		ResultActions accountListResult = mvc.perform(request);

		// 結果を検証する
		accountListResult.andExpect(status().isOk()); // HTTPStatus 200が帰ってきている
		accountListResult.andExpect(content().string(containsString("テスト"))); // "テスト"という文字列が含まれているか
		accountListResult.andDo(print()); // HTMLを標準出力に
	}

}
