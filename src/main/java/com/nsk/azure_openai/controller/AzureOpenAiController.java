//package com.nsk.azure_openai.controller;
//
//import java.util.List;
//
//import org.springframework.ai.azure.openai.AzureOpenAiChatModel;
//import org.springframework.ai.chat.model.ChatResponse;
//import org.springframework.ai.chat.model.Generation;
//import org.springframework.ai.chat.prompt.Prompt;
//import org.springframework.ai.chat.prompt.PromptTemplate;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/openai")
//public class AzureOpenAiController {
//	private AzureOpenAiChatModel azureOpenAiChatModel;
//
//	public AzureOpenAiController(AzureOpenAiChatModel azureOpenAiChatModel) {
//		super();
//		this.azureOpenAiChatModel = azureOpenAiChatModel;
//	}
//	
//	@GetMapping
//	public List<Generation> chat(){
//		Prompt prompt = new Prompt("What model are you and expain yourself !");
//		ChatResponse res = azureOpenAiChatModel.call(prompt);
//		return res.getResults();
//	}
//	
//	@PostMapping("/chat/{msg}")
//	public List<Generation> trending(@PathVariable String msg){
//		PromptTemplate promptTemplate = new PromptTemplate(msg);
//		Prompt prompt = promptTemplate.create();
//		ChatResponse chatResponse = azureOpenAiChatModel.call(prompt);
//		return chatResponse.getResults();
//	}

//}
