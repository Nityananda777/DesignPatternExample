package com.design.facade;

public class PdfReport implements Report {

	@Override
	public ReportDetails generateReport() {

		ReportDetails reportDetails = new ReportDetails();
		reportDetails.setFormat("PDF ");
		reportDetails.setType("Payment Details");
		System.out.println(" Report is genearated with " + reportDetails.getFormat());
		return reportDetails;
	}

}
