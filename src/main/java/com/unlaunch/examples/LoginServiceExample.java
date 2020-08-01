package com.unlaunch.examples;

import com.unlaunch.client.UnlaunchClient;
import com.unlaunch.client.UnlaunchUser;

public class LoginServiceExample {

    public static void main(String[] args) {

        UnlaunchClient unlaunchClient = new UnlaunchClient("sdk-65a261a2-f7bd-492a-aa2b-4cbeed20d1f2");
        UnlaunchUser user = new UnlaunchUser("userId-12345");

        boolean cutOverToV2 = unlaunchClient.boolEvaluate("login-service-version-2", user);

        if (cutOverToV2) {
            // Switch user to login service v2
            LoginServiceV2 loginServiceV2 = new LoginServiceV2();
            loginServiceV2.doSomething();
        } else {
            LoginServiceV1 loginServiceV1 = new LoginServiceV1();
            loginServiceV1.doSomething();
        }
    }
}

class LoginServiceV1 {
    public void doSomething() {
        System.out.println("Login service v1 doing something");
    }
}

class LoginServiceV2 {
    public void doSomething() {
        System.out.println("Login service v2 doing something");
    }
}