package com.technoelevate.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.technoelevate.DTO.EmpDTO;

public class RowMapperImplementation implements RowMapper<EmpDTO>{

	public EmpDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		EmpDTO dto=new EmpDTO();
		
		dto.setEmpid(rs.getString(1));
		dto.setEmpname(rs.getString(2));
		dto.setPasskey(rs.getString(3));
		
		return dto;
	}

}
