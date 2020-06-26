package com.sample.pkce;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.RandomStringUtils;
import java.util.Base64;

public class PKCECode {

    private final String CODE_VERFIER_STRING = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-._~";

    public String getCodeVerifier(final int codeVerifierLength) {
        return RandomStringUtils.random(codeVerifierLength, CODE_VERFIER_STRING);
    }

    public String getCodeChallenge(final String codeVerifier) {
        final byte[] hashedCodeVerifier = DigestUtils.sha256(codeVerifier);
        final String base64EncodedCodeVerifier = Base64.getEncoder().encodeToString(hashedCodeVerifier);
        final String base64URLEncodedCodeVerifier = base64EncodedCodeVerifier
                .replaceAll("=","")
                .replaceAll("\\+","-")
                .replaceAll("/","_");
        return base64URLEncodedCodeVerifier;
    }
}
