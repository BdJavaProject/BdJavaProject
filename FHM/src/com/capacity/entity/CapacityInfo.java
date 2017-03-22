package com.capacity.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CapacityInfo implements Serializable {

	private Integer capacityTestId;// '容量测试编号',
	private Integer transformerId;// '变压器编号',
	private Float loadLoss;// '负载损耗',
	private Float correctedLoss;// '校正损耗',
	private Float impedanceVoltage;// '阻抗电压',
	private Integer detemineCapacity;// '判定容量',
	private Float trueCapacity;// '实测容量',
	private Float correctionImpendace;// '校正阻抗',
	private Float nationalLoss;// '国际损耗',
	private Float errorLoss;// 'errorLoss',
	private Integer referenceType;// '参考类型',
	private Float ua;// 'A项电压',
	private Float ub;// 'B项电压',
	private Float uc;// 'C项电压',
	private Float ia;// 'A项电流',
	private Float ib;// 'B项电流',
	private Float ic;// 'C项电流',
	private Float pa;// 'A项功率',
	private Float pb;// 'B项功率',
	private Float pc;// 'C项功率',

	public Integer getCapacityTestId() {
		return capacityTestId;
	}

	public void setCapacityTestId(Integer capacityTestId) {
		this.capacityTestId = capacityTestId;
	}

	public Integer getTransformerId() {
		return transformerId;
	}

	public void setTransformerId(Integer transformerId) {
		this.transformerId = transformerId;
	}

	public Float getLoadLoss() {
		return loadLoss;
	}

	public void setLoadLoss(Float loadLoss) {
		this.loadLoss = loadLoss;
	}

	public Float getCorrectedLoss() {
		return correctedLoss;
	}

	public void setCorrectedLoss(Float correctedLoss) {
		this.correctedLoss = correctedLoss;
	}

	public Float getImpedanceVoltage() {
		return impedanceVoltage;
	}

	public void setImpedanceVoltage(Float impedanceVoltage) {
		this.impedanceVoltage = impedanceVoltage;
	}

	public Integer getDetemineCapacity() {
		return detemineCapacity;
	}

	public void setDetemineCapacity(Integer detemineCapacity) {
		this.detemineCapacity = detemineCapacity;
	}

	public Float getTrueCapacity() {
		return trueCapacity;
	}

	public void setTrueCapacity(Float trueCapacity) {
		this.trueCapacity = trueCapacity;
	}

	public Float getCorrectionImpendace() {
		return correctionImpendace;
	}

	public void setCorrectionImpendace(Float correctionImpendace) {
		this.correctionImpendace = correctionImpendace;
	}

	public Float getNationalLoss() {
		return nationalLoss;
	}

	public void setNationalLoss(Float nationalLoss) {
		this.nationalLoss = nationalLoss;
	}

	public Float getErrorLoss() {
		return errorLoss;
	}

	public void setErrorLoss(Float errorLoss) {
		this.errorLoss = errorLoss;
	}

	public Integer getReferenceType() {
		return referenceType;
	}

	public void setReferenceType(Integer referenceType) {
		this.referenceType = referenceType;
	}

	public Float getUa() {
		return ua;
	}

	public void setUa(Float ua) {
		this.ua = ua;
	}

	public Float getUb() {
		return ub;
	}

	public void setUb(Float ub) {
		this.ub = ub;
	}

	public Float getUc() {
		return uc;
	}

	public void setUc(Float uc) {
		this.uc = uc;
	}

	public Float getIa() {
		return ia;
	}

	public void setIa(Float ia) {
		this.ia = ia;
	}

	public Float getIb() {
		return ib;
	}

	public void setIb(Float ib) {
		this.ib = ib;
	}

	public Float getIc() {
		return ic;
	}

	public void setIc(Float ic) {
		this.ic = ic;
	}

	public Float getPa() {
		return pa;
	}

	public void setPa(Float pa) {
		this.pa = pa;
	}

	public Float getPb() {
		return pb;
	}

	public void setPb(Float pb) {
		this.pb = pb;
	}

	public Float getPc() {
		return pc;
	}

	public void setPc(Float pc) {
		this.pc = pc;
	}

}
