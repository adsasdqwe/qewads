package com.dto;

public class seoulCityAirDTO {

	String MSRDT; //측정 일시
	String MSRRGN_CD; //권역 코드
	String MSRRGN_NM; // 권역명
    String MSRADM; //측정소 코드
	String MSRSTE_NM; //측정소명
    int PM10;  //미세먼지 1시간
    int PM24; //미세먼지 24시간
    int PM25; //초미세먼지
    double O3; //오존
    double NO2; //이산화질소농도
    double CO; //일산화탄소농도
    double SO2;  //아황산가스농도
	public String getMSRDT() {
		return MSRDT;
	}
	public void setMSRDT(String mSRDT) {
		MSRDT = mSRDT;
	}
	public String getMSRRGN_CD() {
		return MSRRGN_CD;
	}
	public void setMSRRGN_CD(String mSRRGN_CD) {
		MSRRGN_CD = mSRRGN_CD;
	}
	public String getMSRRGN_NM() {
		return MSRRGN_NM;
	}
	public void setMSRRGN_NM(String mSRRGN_NM) {
		MSRRGN_NM = mSRRGN_NM;
	}
	public String getMSRADM() {
		return MSRADM;
	}
	public void setMSRADM(String mSRADM) {
		MSRADM = mSRADM;
	}
	public String getMSRSTE_NM() {
		return MSRSTE_NM;
	}
	public void setMSRSTE_NM(String mSRSTE_NM) {
		MSRSTE_NM = mSRSTE_NM;
	}
	public int getPM10() {
		return PM10;
	}
	public void setPM10(int pM10) {
		PM10 = pM10;
	}
	public int getPM24() {
		return PM24;
	}
	public void setPM24(int pM24) {
		PM24 = pM24;
	}
	public int getPM25() {
		return PM25;
	}
	public void setPM25(int pM25) {
		PM25 = pM25;
	}
	public double getO3() {
		return O3;
	}
	public void setO3(double o3) {
		O3 = o3;
	}
	public double getNO2() {
		return NO2;
	}
	public void setNO2(double nO2) {
		NO2 = nO2;
	}
	public double getCO() {
		return CO;
	}
	public void setCO(double cO) {
		CO = cO;
	}
	public double getSO2() {
		return SO2;
	}
	public void setSO2(double sO2) {
		SO2 = sO2;
	}
	@Override
	public String toString() {
		return "seoulCityAirDTO [MSRDT=" + MSRDT + ", MSRRGN_CD=" + MSRRGN_CD + ", MSRRGN_NM=" + MSRRGN_NM + ", MSRADM="
				+ MSRADM + ", MSRSTE_NM=" + MSRSTE_NM + ", PM10=" + PM10 + ", PM24=" + PM24 + ", PM25=" + PM25 + ", O3="
				+ O3 + ", NO2=" + NO2 + ", CO=" + CO + ", SO2=" + SO2 + "]";
	}
	public seoulCityAirDTO() {
		
	}
	
	public seoulCityAirDTO(String mSRDT, String mSRRGN_CD, String mSRRGN_NM, String mSRADM, String mSRSTE_NM, int pM10,
			int pM24, int pM25, double o3, double nO2, double cO, double sO2) {
		super();
		MSRDT = mSRDT;
		MSRRGN_CD = mSRRGN_CD;
		MSRRGN_NM = mSRRGN_NM;
		MSRADM = mSRADM;
		MSRSTE_NM = mSRSTE_NM;
		PM10 = pM10;
		PM24 = pM24;
		PM25 = pM25;
		O3 = o3;
		NO2 = nO2;
		CO = cO;
		SO2 = sO2;
	}
	
	
}
