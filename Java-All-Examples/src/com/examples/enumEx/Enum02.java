package com.examples.enumEx;

/*
 1 | ES
 2 | LS
 3 | KIBANA
 4 | NGINX

 */

public class Enum02 {
	private static SMS_VENDOR sms_vendor = null;
	private static SUM_TYPE sumType = null;

	public enum SMS_VENDOR {
		TANLA("TANLA"), SSD("SSD"), NONE("NONE");

		private String name;

		private SMS_VENDOR(String strName) {
			name = strName;
		}

		public String getVendorName() {
			return name;
		}
	}

	public enum SUM_TYPE {
		AVAILABILITY_MONITORING("AVAILABILITY_MONITORING"), RESPONSE_MONITORING("RESPONSE_MONITORING");

		private String name;

		private SUM_TYPE(String strName) {
			name = strName;
		}

		public String getVendorName() {
			return name;
		}
	}

	public static void main(String[] args) {

		sms_vendor = SMS_VENDOR.NONE;
		System.out.println(sms_vendor);
		sms_vendor = SMS_VENDOR.valueOf("SSD");

		System.out.println(sms_vendor);

		System.out.println(SMS_VENDOR.TANLA);
		System.out.println(SMS_VENDOR.SSD);
		System.out.println(SMS_VENDOR.NONE);

		if (sms_vendor == SMS_VENDOR.TANLA) {
			System.out.println("hello");
		}

		sumType = SUM_TYPE.AVAILABILITY_MONITORING;

		System.out.println(sumType == SUM_TYPE.AVAILABILITY_MONITORING);
		System.out.println(SUM_TYPE.AVAILABILITY_MONITORING.toString());
		System.out.println(sumType.toString());

		System.out.println(" equals with sum ");

		System.out.println("AVAILABILITY_MONITORING" == SUM_TYPE.AVAILABILITY_MONITORING.toString());
		System.out.println("RESPONSE_MONITORING" == SUM_TYPE.RESPONSE_MONITORING.toString());

	}
}