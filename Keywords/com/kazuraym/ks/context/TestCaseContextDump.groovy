package com.kazuraym.ks.context

public class TestCaseContextDump {

	private final String testCaseId;
	private final String status;

	public TestCaseContextDump(String testCaseId, String status) {
		if (testCaseId == null) throw new IllegalArgumentException("null testCaseId");
		if (status == null) throw new IllegalArgumentException("null status");
		this.testCaseId = testCaseId;
		this.status = status;
	}

	public String getTestCaseId() {
		return testCaseId;
	}

	public String getStatus() {
		return status;
	}

	public String toJson() {
		return """{\"testCaseId\":\"${testCaseId}\",\"status\":\"${status}\"}"""
	}

	public String toString() {
		return this.toJson();
	}
}
