package com.hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) {
        List<String> arrMerchantRequest = new ArrayList<>();
        String merchantId = "203104001507599";
        String invoicenumber = "PKK1234";
        String productdescription = "Goods";
        String amount = "000000002000";
        String currencycode = "104";
        String categoryCode = "";
        String userdefined1 = "";
        String userdefined2 = "";
        String userdefined3 = "";
        String frontendurl = "https://test.octoverse.com.mm/api/contractors/mpu/frontcallback";
        String backendurl = "https://test.octoverse.com.mm/api/contractors/mpu/callback";
        String secretKey = "SZYVWBXFZQECOIBF371HA7ZEW6UAH5V2";

        arrMerchantRequest.add(merchantId);
        arrMerchantRequest.add(invoicenumber);
        arrMerchantRequest.add(productdescription);
        arrMerchantRequest.add(amount);
        arrMerchantRequest.add(currencycode);
        arrMerchantRequest.add(categoryCode);
        arrMerchantRequest.add(userdefined1);
        arrMerchantRequest.add(userdefined2);
        arrMerchantRequest.add(userdefined3);
        arrMerchantRequest.add(frontendurl);
        arrMerchantRequest.add(backendurl);

        Collections.sort(arrMerchantRequest);

        String signatureString = arrMerchantRequest.stream().collect(Collectors.joining());

        try {
            String hmacSignature = getHMAC(signatureString, secretKey);
            System.out.println("HMAC Signature: " + hmacSignature);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getHMAC(String signatureString, String secretKey) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac hmacSHA1 = Mac.getInstance("HmacSHA1");
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(StandardCharsets.UTF_8), "HmacSHA1");
        hmacSHA1.init(secretKeySpec);
        byte[] hmacBytes = hmacSHA1.doFinal(signatureString.getBytes(StandardCharsets.UTF_8));
        return ByteArrayToHexString(hmacBytes);
    }

    private static String ByteArrayToHexString(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        String hexAlphabet = "0123456789ABCDEF";
        for (byte b : bytes) {
            result.append(hexAlphabet.charAt((b >> 4) & 0xF));
            result.append(hexAlphabet.charAt(b & 0xF));
        }
        return result.toString();
    }
}
