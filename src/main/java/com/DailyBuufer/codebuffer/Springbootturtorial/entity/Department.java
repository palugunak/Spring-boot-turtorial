package com.DailyBuufer.codebuffer.Springbootturtorial.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deparmentId;
    private String deparmentName;
    private String deparmentAddress;
    private String deparmentCode;

    public Department(Long deparmentId, String deparmentName, String deparmentAddress, String deparmentCode) {
        this.deparmentId = deparmentId;
        this.deparmentName = deparmentName;
        this.deparmentAddress = deparmentAddress;
        this.deparmentCode = deparmentCode;
    }

    @Override
    public String toString() {
        return "Deparment{" +
                "deparmentId=" + deparmentId +
                ", deparmentName='" + deparmentName + '\'' +
                ", deparmentAddress='" + deparmentAddress + '\'' +
                ", deparmentCode='" + deparmentCode + '\'' +
                '}';
    }

    public Department(){

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
}
