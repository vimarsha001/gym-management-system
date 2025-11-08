package edu.icet.model.dto;

import lombok.*;
import org.springframework.cglib.core.internal.LoadingCache;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Payment {
    private String paymentID;
    private double amount;
    private LocalDate payDate;
}
