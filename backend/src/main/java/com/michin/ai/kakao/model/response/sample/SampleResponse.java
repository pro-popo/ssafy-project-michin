package com.michin.ai.kakao.model.response.sample;

import com.michin.ai.common.util.BaseProperties;
import com.michin.ai.kakao.model.response.SkillResponse;
import com.michin.ai.kakao.model.response.SkillTemplate;
import com.michin.ai.kakao.model.response.common.Button;
import com.michin.ai.kakao.model.response.common.ButtonAction;
import com.michin.ai.kakao.model.response.common.Thumbnail;
import com.michin.ai.kakao.model.response.output.BasicCard;
import com.michin.ai.kakao.model.response.output.Output;

public class SampleResponse {

	public SkillResponse toResponse(Output output) {
		SkillTemplate template = new SkillTemplate().addOutputs(output);

		return new SkillResponse(template);
	}

	public SkillResponse fallBackCarousel() {
		return this.toResponse(
				new BasicCard("잘못된 입력입니다", "모라는지 하나두 모르겟쪙 ☹", new Thumbnail("https://i.ibb.co/TqRY1jm/image.png")));
	}

	public Button connectButton(String userBotKey) {
		return ButtonAction.WEBLINK.create("연동하기", BaseProperties.BASE_URL + "/connection?userBotKey=" + userBotKey);
	}

	public SkillResponse connectBlock(String userBotKey) {
		return this.toResponse(
				new BasicCard("카카오톡 연동하기", "미친AI에 이메일을 연결해주세요!", null, null, connectButton(userBotKey)));
	}

	public SkillResponse connectErrorBlock(String userBotKey) {
		return this.toResponse(new BasicCard("카카오톡 연동하기", "등록되지 않은 사용자입니다.\n 미친AI에 이메일을 연결해주세요!",
				new Thumbnail("https://i.ibb.co/SB9Y1Yw/Kakao-Talk-20200919-194442791.png"), null,
				connectButton(userBotKey)));
	}

	public SkillResponse alreadyConnectBlock() {
		return this.toResponse(new BasicCard("이미 연동이 완료된 사용자입니다.", "그걸 까먹었다구?!",
				new Thumbnail("https://i.ibb.co/5KDT33y/image.png")));
	}
}
