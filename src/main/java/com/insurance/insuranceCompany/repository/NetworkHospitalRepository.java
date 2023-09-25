package com.insurance.insuranceCompany.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.insurance.insuranceCompany.Dao.NetworkHospitalDao;
import com.insurance.insuranceCompany.model.NetworkHospitals;

@Repository
public class NetworkHospitalRepository {
	
	@Autowired
	private NetworkHospitalDao nhdao;
	
	public ArrayList<NetworkHospitals> getAllHospitals(){
		return nhdao.getAllHopitals();
	}

	public int deleteHospital(int hid) {
		return nhdao.deleteHospital(hid);
		
		
	}

	public int addHospital(NetworkHospitals netHsp) {
		return nhdao.addHospital(netHsp);
	}
	
	public int getHospitalsCount() {
		return nhdao.getHospCount();
	}
}
