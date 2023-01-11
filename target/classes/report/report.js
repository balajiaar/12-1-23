$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/FeatureFiles/TSC1Login.feature");
formatter.feature({
  "name": "Adactin loginfunctionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user should be in login page",
  "keyword": "Given "
});
formatter.step({
  "name": "user sholud be enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should click the login btn",
  "keyword": "And "
});
formatter.step({
  "name": "user should receive the sucess message \"hello navensoo\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Naveenaso",
        "Naveenmech1!"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user should be in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_should_be_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sholud be enter the \"Naveenaso\" and \"Naveenmech1!\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_sholud_be_enter_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the login btn",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_should_click_the_login_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should receive the sucess message \"hello navensoo\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_should_receive_the_sucess_message(String)"
});
formatter.result({
  "status": "passed"
});
});