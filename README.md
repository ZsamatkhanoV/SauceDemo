CHECKLIST SauceDemo

1.Log in Page
1.1 Попытка входа без ввода данных.
1.2 Попытка входа с вводом неправильных данных.
1.3 Попытка входа с заполнением только поля Password.
1.4 Попытка входа с заполнением только поля Username.

2.Cart Page
2.1 Добавление продукта в Cart Page и проверка его соответствия.

3.Checkout Page
3.1 Заполнение всех полей и переход к оплате.
3.2 Попытка входа без заполнения всех полей.

MVN

[INFO] --- versions-maven-plugin:2.8.1:display-dependency-updates (default-cli) @ SauceDemo ---
[INFO] artifact org.testng:testng: checking for updates from central
[INFO] artifact io.github.bonigarcia:webdrivermanager: checking for updates from central
[INFO] artifact org.seleniumhq.selenium:selenium-java: checking for updates from central
[INFO] The following dependencies in Dependencies have newer versions:
[INFO]   org.seleniumhq.selenium:selenium-java .............. 3.141.59 -> 4.0.0 

MVN CLEAN TEST

[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 18.862 s - in TestSuite
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  20.931 s
[INFO] Finished at: 2021-11-10T22:32:29+03:00
[INFO] ------------------------------------------------------------------------
