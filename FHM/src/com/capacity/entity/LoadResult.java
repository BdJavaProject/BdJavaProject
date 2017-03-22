package com.capacity.entity;

public class LoadResult {
	private Integer loadTestId;// int(22) NOT NULL COMMENT '负载测试编号',
	private Integer transformerId;// int(22) NOT NULL COMMENT '变压器编号',
	private Float trueLoadLoss;// Float(11,0) NOT NULL COMMENT '实测负载损耗',
	private Float shortCircuitImpedance;// Float(11,0) NOT NULL COMMENT '短路阻抗',
	private Float correctLoadLoss;// Float(11,0) NOT NULL COMMENT '校正负载损耗',
	private Float Ua;// Float(11,0) NOT NULL COMMENT 'A项电压',
	private Float Ub;// Float(11,0) NOT NULL COMMENT 'B项电压',
	private Float Uc;// Float(11,0) NOT NULL COMMENT 'C项电压',
	private Float Ia;// Float(11,0) NOT NULL COMMENT 'A项电流',
	private Float Ib;// Float(11,0) NOT NULL COMMENT 'B项电流',
	private Float Ic;// Float(11,0) NOT NULL COMMENT 'C项电流',
	private Float Pa;// Float(11,0) NOT NULL COMMENT 'A项功率',
	private Float Pb;// Float(11,0) NOT NULL COMMENT 'B项功率',
	private Float Pc;// Float(11,0) NOT NULL COMMENT 'C项功率',

	public Integer getLoadTestId() {
		return loadTestId;
	}

	public void setLoadTestId(Integer loadTestId) {
		this.loadTestId = loadTestId;
	}

	public Integer getTransformerId() {
		return transformerId;
	}

	public void setTransformerId(Integer transformerId) {
		this.transformerId = transformerId;
	}

	public Float getTrueLoadLoss() {
		return trueLoadLoss;
	}

	public void setTrueLoadLoss(Float trueLoadLoss) {
		this.trueLoadLoss = trueLoadLoss;
	}

	public Float getShortCircuitImpedance() {
		return shortCircuitImpedance;
	}

	public void setShortCircuitImpedance(Float shortCircuitImpedance) {
		this.shortCircuitImpedance = shortCircuitImpedance;
	}

	public Float getCorrectLoadLoss() {
		return correctLoadLoss;
	}

	public void setCorrectLoadLoss(Float correctLoadLoss) {
		this.correctLoadLoss = correctLoadLoss;
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
