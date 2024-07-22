package com.logger.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class MessageController {

	Logger logger = LoggerFactory.getLogger(MessageController.class);
	//Log levels
//	@GetMapping("/message")
	@GetMapping
	public String log() {
		logger.info("[getMessage] info message");
		logger.warn("[getMessage] warn message");
		logger.error("[getMessage] error message");
		logger.trace("[getMessage] trace message");
		logger.debug("[getMessage] debug message");
		return "Go TO Console to check log message";
	}
}
