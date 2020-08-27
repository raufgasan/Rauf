$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/NoParametersTest.feature");
formatter.feature({
  "name": "Verify Get Request",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Get Without Parameters",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I set  GET request",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I not providing any parameters",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify status code \"200\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Content type \"application/json; charset\u003dutf-8\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify that name, surname, gender, region fields have value",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});