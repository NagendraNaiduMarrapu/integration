package com.insurance.insuranceCompany.rowMapper;



import com.insurance.insuranceCompany.model.InsurancePackages;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PackagesRowMapper implements RowMapper<InsurancePackages> {

    @Override
    public InsurancePackages mapRow(ResultSet resultSet, int rowNum) throws SQLException {
    	InsurancePackages inspection = new InsurancePackages();

        inspection.setInspId(resultSet.getLong("insp_id"));
        inspection.setInspTitle(resultSet.getString("insp_title"));
        inspection.setInspDesc(resultSet.getString("insp_desc"));
        inspection.setInspStatus(resultSet.getString("insp_status"));
        inspection.setInspRangeStart(resultSet.getDouble("insp_range_start"));
        inspection.setInspRangeEnd(resultSet.getDouble("insp_range_end"));
        inspection.setInspAgeLimitStart(resultSet.getInt("insp_agelimit_start"));
        inspection.setInspAgeLimitEnd(resultSet.getInt("insp_agelimit_end"));

        return inspection;
    }
}
