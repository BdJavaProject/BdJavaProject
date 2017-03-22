package com.capacity.entity;

public class NoLoadInfo {
	private Float noloadTestId;// int(22) NOT NULL COMMENT '空载测试编号',
	private Float transformerId;// int(22) NOT NULL COMMENT '变压器编号',
	private Float noloadCurrent;// float(11,0) NOT NULL COMMENT '空载电流',
	private Float trueLoadLoss;// float(11,0) NOT NULL COMMENT '实测空载损耗',
	private Float correctionNoloadLoss;// float(11,0) NOT NULL COMMENT '校正空载损耗',
	private Float detemineTransformerType;// int(22) NOT NULL COMMENT '判断变压器类型',
	private Float testMethod;// int(22) NOT NULL COMMENT '测试方法',
	private Float Ua;// float(11,0) NOT NULL COMMENT 'A项电压',
	private Float Ub;// float(11,0) NOT NULL COMMENT 'B项电压',
	private Float Uc;// float(11,0) NOT NULL COMMENT 'C项电压',
	private Float Ia;// float(11,0) NOT NULL COMMENT 'A项电流',
	private Float Ib;// float(11,0) NOT NULL COMMENT 'B项电流',
	private Float Ic;// float(11,0) NOT NULL COMMENT 'C项电流',
	private Float Pa;// float(11,0) NOT NULL COMMENT 'A项功率',
	private Float Pb;// float(11,0) NOT NULL COMMENT 'B项功率',
	private Float Pc;// float(11,0) NOT NULL COMMENT 'C项功率',

	public Float getNoloadTestId() {
		return noloadTestId;
	}

	public void setNoloadTestId(Float noloadTestId) {
		this.noloadTestId = noloadTestId;
	}

	public Float getTransformerId() {
		return transformerId;
	}

	public void setTransformerId(Float transformerId) {
		this.transformerId = transformerId;
	}

	public Float getNoloadCurrent() {
		return noloadCurrent;
	}

	public void setNoloadCurrent(Float noloadCurrent) {
		this.noloadCurrent = noloadCurrent;
	}

	public Float getTrueLoadLoss() {
		return trueLoadLoss;
	}

	public void setTrueLoadLoss(Float trueLoadLoss) {
		this.trueLoadLoss = trueLoadLoss;
	}

	public Float getCorrectionNoloadLoss() {
		return correctionNoloadLoss;
	}

	public void setCorrectionNoloadLoss(Float correctionNoloadLoss) {
		this.correctionNoloadLoss = correctionNoloadLoss;
	}

	public Float getDetemineTransformerType() {
		return detemineTransformerType;
	}

	public void setDetemineTransformerType(Float detemineTransformerType) {
		this.detemineTransformerType = detemineTransformerType;
	}

	public Float getTestMethod() {
		return testMethod;
	}

	public void setTestMethod(Float testMethod) {
		this.testMethod = testMethod;
	}

	public Float getUa() {
		return Ua;
	}

	public void setUa(Float ua) {
		Ua = ua;
	}

	public Float getUb() {
		return Ub;
	}

	public void setUb(Float ub) {
		Ub = ub;
	}

	public Float getUc() {
		return Uc;
	}

	public void setUc(Float uc) {
		Uc = uc;
	}

	public Float getIa() {
		return Ia;
	}

	public void setIa(Float ia) {
		Ia = ia;
	}

	public Float getIb() {
		return Ib;
	}

	public void setIb(Float ib) {
		Ib = ib;
	}

	public Float getIc() {
		return Ic;
	}

	public void setIc(Float ic) {
		Ic = ic;
	}

	public Float getPa() {
		return Pa;
	}

	public void setPa(Float pa) {
		Pa = pa;
	}

	public Float getPb() {
		return Pb;
	}

	public void setPb(Float pb) {
		Pb = pb;
	}

	public Float getPc() {
		return Pc;
	}

	public void setPc(Float pc) {
		Pc = pc;
	}

}
