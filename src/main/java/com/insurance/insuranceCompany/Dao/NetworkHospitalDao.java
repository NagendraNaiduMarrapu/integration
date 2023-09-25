package com.insurance.insuranceCompany.Dao;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


import com.insurance.insuranceCompany.model.NetworkHospitals;
import com.insurance.insuranceCompany.rowMapper.NetworkHospitalRowMapper;
@Component
public class NetworkHospitalDao {
	@Autowired
	JdbcTemplate jdbcTemplate ;
	
	public ArrayList<NetworkHospitals> getAllHopitals(){
		String sql="SELECT * FROM NetworkHospitals";
		
		return (ArrayList<NetworkHospitals>) jdbcTemplate.query(sql, new NetworkHospitalRowMapper());
		
	}

	public int deleteHospital(int hid) {
	String sql="delete from NetworkHospitals where hosp_id="+hid;
	
	return jdbcTemplate.update(sql);
	
	
		
	}

	public int addHospital(NetworkHospitals hsp) {
		String sql="insert into NetworkHospitals(hosp_title,hosp_location,hosp_address,hosp_contact_number,hosp_pincode,hosp_luudate)  values(?,?,?,?,?,?)";
		LocalDate currentDate = LocalDate.now();

		// Convert it to a java.sql.Date
		Date currentDateSql = Date.valueOf(currentDate);
		return jdbcTemplate.update(sql,hsp.getHospTitle(),hsp.getHospLocation(),hsp.getHospAddress(),hsp.getHospContactNumber(),hsp.getHospPincode(),currentDateSql);
	}

	public int getHospCount() {
		String sql="SELECT COUNT(*) FROM NetworkHospitals";
		Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}
	
}
