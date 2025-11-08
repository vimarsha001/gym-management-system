package edu.icet.model.entity;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class ScheduleEntity {
    private String scheduleDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private String duration;
}
