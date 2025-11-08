package edu.icet.model.dto;

import lombok.*;
import org.apache.naming.factory.SendMailFactory;
import org.springframework.context.annotation.EnableMBeanExport;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Trainer {
    private String id;
    private String name;
    private String address;
    private double salary;
    private String phoneNumber;
    private String email;
    private LocalDate dob;
    private int experience;




}
