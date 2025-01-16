package com.pkk;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class HMACSHA1Hash {
	public static void main(String[] args) {

		// Sample input values
		String channel = "MPSS";
		String appName = "saisaipay";
		String merchantUserId = "UABMM202230210230371795341";
		String squenceNo = "PPPPPPPPPPKKKKKKKKKK1234567890987654331";
		String amount = "1000";
		String qrString = "739812783274102";

		String saisaiPayPhone = "09882551255";

		String ReferIntegrationID = "DEF11DB87433EB9F33394AE98E3E1111";
		String IPAddress = "192.168.100.185";
		String latitute = "16.8091076";
		String longitude = "96.1215038";

		String expiredSecond = "600";
		String callbackUrl = "https://mpssuat.glitch.me/callback/uab";
		String invoiceNumber = "2024MPSSINV01";
		String remarkString = "Remark From PKK";

		String secretKey = "E509C659ED4C";

		String locationString = channel + merchantUserId + appName + squenceNo + IPAddress + latitute + longitude;
		String teString = channel + appName + merchantUserId + squenceNo + saisaiPayPhone;
		String message = channel + appName + merchantUserId + squenceNo + amount + qrString;
		String messageForCheckingPhoneNumber = channel + merchantUserId + appName + saisaiPayPhone;
		String messageForSaiSaiPayment = channel + appName + merchantUserId + saisaiPayPhone + amount + remarkString
				+ invoiceNumber + squenceNo + callbackUrl + expiredSecond;
		String ResponsePaymentAPI = merchantUserId + channel + appName + amount + ReferIntegrationID + invoiceNumber + "000" + "030220220058988";

		try {
			String hashValue = hmacSha1(locationString, secretKey);
			String upperCaseHashValue = hashValue.toUpperCase();

			System.out.println("HMAC-SHA1 Hash Value: " + upperCaseHashValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String hmacSha1(String value, String key) throws NoSuchAlgorithmException, InvalidKeyException {
		SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "HmacSHA1");
		Mac mac = Mac.getInstance("HmacSHA1");
		mac.init(keySpec);

		byte[] result = mac.doFinal(value.getBytes());

		// Convert byte array to hex string
		StringBuilder sb = new StringBuilder();
		for (byte b : result) {
			sb.append(String.format("%02x", b));
		}

		return sb.toString();
	}
}
