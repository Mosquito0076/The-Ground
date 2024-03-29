package com.ssafy.theground.repository;

import com.ssafy.theground.entity.Schedule;
import com.ssafy.theground.entity.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

    List<Schedule> findTop3ByScheduleSeqIn(List<Long> scheduleSeq);

    Schedule findByScheduleSeq(Long scheduleSeq);
}
