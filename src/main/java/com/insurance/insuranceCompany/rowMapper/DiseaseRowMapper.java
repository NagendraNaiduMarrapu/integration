package com.insurance.insuranceCompany.rowMapper;

import org.springframework.jdbc.core.RowMapper;

import com.insurance.insuranceCompany.model.Disease;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DiseaseRowMapper implements RowMapper<Disease> {
    @Override
    public Disease mapRow(ResultSet rs, int rowNum) throws SQLException {
        Disease disease = new Disease();
        disease.setDiscId(rs.getLong("disc_id"));
        disease.setDiscName(rs.getString("disc_name"));
        disease.setDiscIcdCode(rs.getString("disc_icdcode"));
        disease.setDiscDesc(rs.getString("disc_desc"));
        disease.setDiscStatus(rs.getString("disc_status"));
        return disease;
    }
}
