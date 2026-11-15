package com.ai.chat.bot;

import org.junit.jupiter.api.Test;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

@SpringBootTest
class ChatbotServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired 
	private ChatClient chatClient;

	@Test
	@EnabledIfSystemProperty(named = "runModelIntegrationTests", matches = "true")
	public void testChat() {
		String content = chatClient.prompt().user("how can you help me").call().content();
		System.out.println(content);
	}

}
