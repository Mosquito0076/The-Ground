package com.ssafy.theground.dto.res;

import com.ssafy.theground.entity.User;

import lombok.Data;

@Data
public class UserMypageDto {
	private String logoUrl;
	private String userTeamName;
	private int userExp;
	private int userLevel;
	private int userWin;
	private int userLose;
	private int userDraw;
	private Boolean userInPlayFlag;
	
	public UserMypageDto(User u) {
		this.logoUrl=u.getLogo().getLogoUrl();
		this.userTeamName=u.getUserTeamname();
		this.userExp=u.getUserExp();
		this.userLevel=u.getUserLevel();
		this.userWin=u.getUserWin();
		this.userLose=u.getUserLose();
		this.userDraw=u.getUserDraw();
		this.userInPlayFlag=u.getUserInPlayFlag();
	}
}