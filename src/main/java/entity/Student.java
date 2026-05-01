package entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Student {
    private long id;
    private String name;
    private String address;
    private double salary;


}
