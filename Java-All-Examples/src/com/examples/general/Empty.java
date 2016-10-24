package com.examples.general;

public class Empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] Bytes = new String[] { "Bytes", "Bps", "dlcnd", "dvndlnv" };
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < Bytes.length; i++) { // 3
			

			/*if (i > 0 && (i < Bytes.length - 1)) {*/
			if (i > 0 ) {
				sb.append(",\n");
				System.out.println(i);
			}
			sb.append(Bytes[i]);

		}

		System.out.println(sb);

	}
}
