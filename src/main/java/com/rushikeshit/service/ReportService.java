package com.rushikeshit.service;

import java.util.List;

import com.rushikeshit.entity.CitizensPlan;
import com.rushikeshit.request.SearchRequest;

public interface ReportService {

	
	public List<String> getPlanName();
	
	public List<String> getPlanStatus();
	
	public List<CitizensPlan> search(SearchRequest request);
	
	public boolean pdfGenerator();
	
	public boolean ExelGenerator();
}
