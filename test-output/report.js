$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginstep.feature");
formatter.feature({
  "line": 1,
  "name": "new tours login page",
  "description": "",
  "id": "new-tours-login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "new tours Create a new deal scenario",
  "description": "",
  "id": "new-tours-login-page;new-tours-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of login page is Mercury Tours",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#Then user enters \"qaq\" and \"qaq\""
    }
  ],
  "line": 13,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user is on Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginstepdefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 5748875600,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefinition.tile_mercurytours()"
});
formatter.result({
  "duration": 23699500,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefinition.username_password()"
});
formatter.result({
  "duration": 313490200,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefinition.login_button()"
});
formatter.result({
  "duration": 6063661100,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdefinition.Home_page()"
});
formatter.result({
  "duration": 100543900,
  "status": "passed"
});
});