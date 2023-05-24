package com.rushikeshit.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.rushikeshit.entity.CitizensPlan;
import com.rushikeshit.repository.CitizensPlanRepository;
import com.rushikeshit.request.SearchRequest;

@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	CitizensPlanRepository citizensPlanRepo;

	@Override
	public List<String> getPlanName() {
		return citizensPlanRepo.getPlanName();
	}

	@Override
	public List<String> getPlanStatus() {
		return citizensPlanRepo.getPlanStatus();
	}

	@Override
	public List<CitizensPlan> search(SearchRequest request) {

		CitizensPlan entity = new CitizensPlan();

		if (null != request.getPlanName() && !"".equals(request.getPlanName())) {
			entity.setPlanName(request.getPlanName());
		}
		if (null != request.getPlanStatus() && !"".equals(request.getPlanStatus())) {
			entity.setPlanStatus(request.getPlanStatus());
		}
		if (null != request.getGender() && !"".equals(request.getGender())) {
			entity.setGender(request.getGender());
		}

		if (null != request.getStartDate() && !"".equals(request.getStartDate())) {
			String startDate = request.getStartDate();

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

			LocalDate localdate = LocalDate.parse(startDate, formatter);

			entity.setStartDate(localdate);
		}
		if (null != request.getEndDate() && !"".equals(request.getEndDate())) {

			String endDate = request.getEndDate();

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

			LocalDate localdate = LocalDate.parse(endDate, formatter);
			entity.setEndDate(localdate);
		}
		return citizensPlanRepo.findAll(Example.of(entity));
	}

	@Override
	public boolean pdfGenerator() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ExelGenerator() {
		// TODO Auto-generated method stub
		return false;
	}

}
