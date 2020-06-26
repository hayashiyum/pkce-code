package com.sample.pkce;

import org.junit.Assert;
import org.junit.Test;

public class PKCECodeTest {

    @Test
    public void getCodeChallengeTest() {
        final String codeVerifier = "dBjftJeZ4CVP-mB92K27uhbUJU1p1r_wW1gFWFOEjXk";
        final PKCECode pkceCode = new PKCECode();
        Assert.assertEquals("E9Melhoa2OwvFrEMTJguCHaoeK1t8URWbuGJSstw-cM", pkceCode.getCodeChallenge(codeVerifier));
    }
}
