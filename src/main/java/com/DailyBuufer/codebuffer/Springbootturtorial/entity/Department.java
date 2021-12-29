package com.DailyBuufer.codebuffer.Springbootturtorial.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
/*@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder */
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deparmentId;
    @NotBlank(message = "message = please add the deparmentname")
    private String deparmentName;
    private String deparmentAddress;
    private String deparmentCode;

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "deparmentId=" + deparmentId +
                ", deparmentName='" + deparmentName + '\'' +
                ", deparmentAddress='" + deparmentAddress + '\'' +
                ", deparmentCode='" + deparmentCode + '\'' +
                '}';
    }

    public Long getDeparmentId() {
        return deparmentId;
    }

    public void setDeparmentId(Long deparmentId) {
        this.deparmentId = deparmentId;
    }

    public String getDeparmentName() {
        return deparmentName;
    }

    public void setDeparmentName(String deparmentName) {
        this.deparmentName = deparmentName;
    }

    public String getDeparmentAddress() {
        return deparmentAddress;
    }

    public void setDeparmentAddress(String deparmentAddress) {
        this.deparmentAddress = deparmentAddress;
    }

    public String getDeparmentCode() {
        return deparmentCode;
    }

    public void setDeparmentCode(String deparmentCode) {
        this.deparmentCode = deparmentCode;
    }

    public Department(Long deparmentId, @NotBlank(message = "message = please add the deparmentname") String deparmentName, String deparmentAddress, String deparmentCode) {
        this.deparmentId = deparmentId;
        this.deparmentName = deparmentName;
        this.deparmentAddress = deparmentAddress;
        this.deparmentCode = deparmentCode;
    }
}
