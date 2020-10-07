package com.michin.ai.world.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorldReplyMessage {
	
	private String message_type;
	private String recipient;
	private String text;
	
}
