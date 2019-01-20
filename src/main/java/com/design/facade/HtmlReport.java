package com.design.facade;

public class HtmlReport implements Report {

	@Override
	public ReportDetails generateReport() {
		System.out.println("HTML Report is genearated");
		ReportDetails reportDetails = new ReportDetails();
		reportDetails.setFormat("HTML ");
		reportDetails.setType("Payment Details");
		System.out.println(" Report is genearated with " + reportDetails.getFormat());
		return reportDetails;
	}

}
