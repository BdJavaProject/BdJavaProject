package com.capacity.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TransferInfo implements Serializable {

	private Integer id;
	private Integer transformerId;// int(22) NOT NULL COMMENT '变压器编号',
	private String userName;// varchar(50) NOT NULL COMMENT '用户名称',
	private String transformerCode;// varchar(50) NOT NULL COMMENT '变压器编码(备用)',
	private String userAddress;// varchar(100) NOT NULL COMMENT '用户地址',
	private String testUser;// varchar(50) NOT NULL COMMENT '测试人员',
	private Integer capacityTransformerType;// int(22) NOT NULL COMMENT
											// '容量变压器类型',
	private Integer transformerType;// int(22) NOT NULL COMMENT '变压器类型',
	private Integer currentTemperature;// int(22) NOT NULL COMMENT '当前温度',
	private Integer ratedCapacity;// int(22) NOT NULL COMMENT '额定容量',
	private Integer connectionGroup;// int(22) NOT NULL COMMENT '联结组别',
	private Integer tapGear;// int(22) NOT NULL COMMENT '分接档位',
	private Float firstVoltage;// float(11,0) NOT NULL COMMENT '一次电压',
	private Float secondVoltage;// float(11,0) NOT NULL COMMENT '二次电压',
	private Float impedanceVoltage;// float(11,0) NOT NULL COMMENT '阻抗电压',
	private Float correctionCoefficient;// float(11,0) NOT NULL COMMENT '校正系数',
	private Float ratedLowVoltage;// float(11,0) NOT NULL COMMENT '额定低电压',
	private Float ratedHighVoltage;// float(11,0) NOT NULL COMMENT '额定高电压',
	private Integer noloadTransformerType;// int(22) NOT NULL COMMENT '空载变压器类型',
	private Integer testMethod;// int(22) NOT NULL COMMENT '测试方法',
	private String createTime;// varchar(255) NOT NULL COMMENT '创建时间',
	private String updateTime;// datetime DEFAULT NULL COMMENT '更新时间',

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTransformerId() {
		return transformerId;
	}

	public void setTransformerId(Integer transformerId) {
		this.transformerId = transformerId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTransformerCode() {
		return transformerCode;
	}

	public void setTransformerCode(String transformerCode) {
		this.transformerCode = transformerCode;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getTestUser() {
		return testUser;
	}

	public void setTestUser(String testUser) {
		this.testUser = testUser;
	}

	public Integer getCapacityTransformerType() {
		return capacityTransformerType;
	}

	public void setCapacityTransformerType(Integer capacityTransformerType) {
		this.capacityTransformerType = capacityTransformerType;
	}

	public Integer getTransformerType() {
		return transformerType;
	}

	public void setTransformerType(Integer transformerType) {
		this.transformerType = transformerType;
	}

	public Integer getCurrentTemperature() {
		return currentTemperature;
	}

	public void setCurrentTemperature(Integer currentTemperature) {
		this.currentTemperature = currentTemperature;
	}

	public Integer getRatedCapacity() {
		return ratedCapacity;
	}

	public void setRatedCapacity(Integer ratedCapacity) {
		this.ratedCapacity = ratedCapacity;
	}

	public Integer getConnectionGroup() {
		return connectionGroup;
	}

	public void setConnectionGroup(Integer connectionGroup) {
		this.connectionGroup = connectionGroup;
	}

	public Integer getTapGear() {
		return tapGear;
	}

	public void setTapGear(Integer tapGear) {
		this.tapGear = tapGear;
	}

	public Float getFirstVoltage() {
		return firstVoltage;
	}

	public void setFirstVoltage(Float firstVoltage) {
		this.firstVoltage = firstVoltage;
	}

	public Float getSecondVoltage() {
		return secondVoltage;
	}

	public void setSecondVoltage(Float secondVoltage) {
		this.secondVoltage = secondVoltage;
	}

	public Float getImpedanceVoltage() {
		return impedanceVoltage;
	}

	public void setImpedanceVoltage(Float impedanceVoltage) {
		this.impedanceVoltage = impedanceVoltage;
	}

	public Float getCorrectionCoefficient() {
		return correctionCoefficient;
	}

	public void setCorrectionCoefficient(Float correctionCoefficient) {
		this.correctionCoefficient = correctionCoefficient;
	}

	public Float getRatedLowVoltage() {
		return ratedLowVoltage;
	}

	public void setRatedLowVoltage(Float ratedLowVoltage) {
		this.ratedLowVoltage = ratedLowVoltage;
	}

	public Float getRatedHighVoltage() {
		return ratedHighVoltage;
	}

	public void setRatedHighVoltage(Float ratedHighVoltage) {
		this.ratedHighVoltage = ratedHighVoltage;
	}

	public Integer getNoloadTransformerType() {
		return noloadTransformerType;
	}

	public void setNoloadTransformerType(Integer noloadTransformerType) {
		this.noloadTransformerType = noloadTransformerType;
	}

	public Integer getTestMethod() {
		return testMethod;
	}

	public void setTestMethod(Integer testMethod) {
		this.testMethod = testMethod;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "TransferInfo [id=" + id + ", transformerId=" + transformerId
				+ ", userName=" + userName + ", transformerCode="
				+ transformerCode + ", userAddress=" + userAddress
				+ ", testUser=" + testUser + ", capacityTransformerType="
				+ capacityTransformerType + ", transformerType="
				+ transformerType + ", currentTemperature="
				+ currentTemperature + ", ratedCapacity=" + ratedCapacity
				+ ", connectionGroup=" + connectionGroup + ", tapGear="
				+ tapGear + ", firstVoltage=" + firstVoltage
				+ ", secondVoltage=" + secondVoltage + ", impedanceVoltage="
				+ impedanceVoltage + ", correctionCoefficient="
				+ correctionCoefficient + ", ratedLowVoltage="
				+ ratedLowVoltage + ", ratedHighVoltage=" + ratedHighVoltage
				+ ", noloadTransformerType=" + noloadTransformerType
				+ ", testMethod=" + testMethod + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}

}
