package com.carparking.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @Column(name = "vehicle_number", nullable = false, length = 50)
    private String vehicleNumber;

    @Column(name = "phone_num", length = 20)
    private String phoneNum;

    @Column(name = "user_name", length = 50)
    private String userName;

    @Column(name = "no_of_vehicles", columnDefinition = "int default 1")
    private Integer noOfVehicles = 1;

    @Column(name = "vehicle_type", length = 20)
    private String vehicleType;

    @Column(name = "booking_date", length = 20)
    private String bookingDate;

    @Column(name = "user_email_id", length = 50)
    private String userEmailId;

    @Column(name = "paid_status", columnDefinition = "tinyint(1) default 0")
    private Boolean paidStatus = false;

    @Column(name = "paid_amount", precision = 10, scale = 0, columnDefinition = "decimal(10,0) default 0")
    private BigDecimal paidAmount = BigDecimal.ZERO;

    @Column(name = "allocated_slot_number", length = 50)
    private String allocatedSlotNumber;

    @Column(name = "parked_property_name", length = 50)
    private String parkedPropertyName;

    @Column(name = "duration_of_allocation", length = 20)
    private String durationOfAllocation;

    @Column(name = "payment_date", length = 20)
    private String paymentDate;

    @Column(name = "admin_mail_id", length = 50)
    private String adminMailId;

    @Column(name = "vehicle_model", length = 50)
    private String vehicleModel;

    @Column(name = "total_amount", precision = 10, scale = 0, columnDefinition = "decimal(10,0) default 0")
    private BigDecimal totalAmount = BigDecimal.ZERO;

    @Column(name = "booking_time", length = 20)
    private String bookingTime;

    @Column(name = "is_banned", columnDefinition = "tinyint(1) default 0")
    private Boolean isBanned = false;

    @Column(name = "fine_amount", columnDefinition = "int default 0")
    private Integer fineAmount = 0;

    @Column(name = "booking_source", length = 10)
    private String bookingSource;

    @Column(name = "role_name", length = 10)
    private String roleName;

    @Column(name = "vehicle_brand", length = 20)
    private String vehicleBrand;

    @Column(name = "fuel_type", length = 20)
    private String fuelType;

    @Column(name = "vehicle_clr", length = 20)
    private String vehicleClr;

    @Column(name = "vehicle_gene", length = 20)
    private String vehicleGene;

    @Column(name = "endtime", length = 20)
    private String endtime;

    @Column(name = "remainingtime", length = 20)
    private String remainingtime;

    // Getters and Setters

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getNoOfVehicles() {
        return noOfVehicles;
    }

    public void setNoOfVehicles(Integer noOfVehicles) {
        this.noOfVehicles = noOfVehicles;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getUserEmailId() {
        return userEmailId;
    }

    public void setUserEmailId(String userEmailId) {
        this.userEmailId = userEmailId;
    }

    public Boolean getPaidStatus() {
        return paidStatus;
    }

    public void setPaidStatus(Boolean paidStatus) {
        this.paidStatus = paidStatus;
    }

    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getAllocatedSlotNumber() {
        return allocatedSlotNumber;
    }

    public void setAllocatedSlotNumber(String allocatedSlotNumber) {
        this.allocatedSlotNumber = allocatedSlotNumber;
    }

    public String getParkedPropertyName() {
        return parkedPropertyName;
    }

    public void setParkedPropertyName(String parkedPropertyName) {
        this.parkedPropertyName = parkedPropertyName;
    }

    public String getDurationOfAllocation() {
        return durationOfAllocation;
    }

    public void setDurationOfAllocation(String durationOfAllocation) {
        this.durationOfAllocation = durationOfAllocation;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getAdminMailId() {
        return adminMailId;
    }

    public void setAdminMailId(String adminMailId) {
        this.adminMailId = adminMailId;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    public Boolean getIsBanned() {
        return isBanned;
    }

    public void setIsBanned(Boolean isBanned) {
        this.isBanned = isBanned;
    }

    public Integer getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(Integer fineAmount) {
        this.fineAmount = fineAmount;
    }

    public String getBookingSource() {
        return bookingSource;
    }

    public void setBookingSource(String bookingSource) {
        this.bookingSource = bookingSource;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getVehicleClr() {
        return vehicleClr;
    }

    public void setVehicleClr(String vehicleClr) {
        this.vehicleClr = vehicleClr;
    }

    public String getVehicleGene() {
        return vehicleGene;
    }

    public void setVehicleGene(String vehicleGene) {
        this.vehicleGene = vehicleGene;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getRemainingtime() {
        return remainingtime;
    }

    public void setRemainingtime(String remainingtime) {
        this.remainingtime = remainingtime;
    }
}
