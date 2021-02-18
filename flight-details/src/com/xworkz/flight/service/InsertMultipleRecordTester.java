package com.xworkz.flight.service;

import java.util.ArrayList;

import com.xworkz.flight.dao.FlightDAOImpl;
import com.xworkz.flight.dto.FlightDTO;

public class InsertMultipleRecordTester {

	public static void main(String[] args) {
	
		FlightDAOImpl daoImpl=new FlightDAOImpl();
		
		FlightDTO dto =new FlightDTO(13, "Indigo", 100, 10.00, "pune", "mumbai");
		
		FlightDTO dto1 =new FlightDTO(12, "Quatar", 300, 2.00, "hyderabad", "mumbai");
		
		ArrayList<FlightDTO> flightDTOs=new ArrayList<FlightDTO>();
		
		flightDTOs.add(dto);
		flightDTOs.add(dto1);
		
		daoImpl.insertMultipleRecords(flightDTOs);
	}

	}


