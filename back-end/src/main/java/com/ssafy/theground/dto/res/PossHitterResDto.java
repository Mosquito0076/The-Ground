package com.ssafy.theground.dto.res;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PossHitterResDto {
    private Long hitterSeq;

    private String hitterName;

    private String batArm;

    private double avg;
}
