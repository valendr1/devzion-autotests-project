# Автоматизированное тестирование сайта компании ZION Development
## <a target="_blank" href="https://devzion.com">Главная страница ZION Development</a>

## :floppy_disk: Содержание:

- <a href="#computer-технологии-и-инструменты">Технологии и инструменты</a>
- <a href="#notebook_with_decorative_cover-реализованные-проверки">Реализованные проверки</a>
- <a href="#electric_plug-сборка-в-Jenkins">Сборка в Jenkins</a>
- <a href="#arrow_forward-запуск-из-терминала">Запуск из терминала</a>
- <a href="#open_book-allure-отчет">Allure отчет</a>
- <a href="#hammer-allure-testops-отчет">Allure TestOps отчет</a>
- <a href="#wrench-интеграция-с-jira">Интеграция с Jira</a>
- <a href="#robot-отчет-в-telegram">Отчет в Telegram</a>
- <a href="#film_projector-видеопример-прохождения-тестов">Видеопример прохождения тестов</a>

## :computer: Технологии и инструменты
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="Images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="Images/logo/Java.svg">
<img width="6%" title="Selenide" src="Images/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="Images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="Images/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="Images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="Images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="Images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="Images/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="Images/logo/Telegram.svg">
<img width="6%" title="Telegram" src="Images/logo/Allure_TO.svg">
<img width="6%" title="Telegram" src="Images/logo/jira_logo.png">
</p>

## :notebook_with_decorative_cover: Реализованные проверки
- Проверка наличия текста на главной странице
- Проверка наличия QA во вкладке Career

Параметризованные тесты:
- Проверка предложений от компании ZION во вкладке Team

В данном проекте автотесты написаны на <code>Java</code> с использованием <code>Selenide</code> для UI-тестов.

> В качестве библиотеки для модульного тестирования используется <code>JUnit 5</code>.
> 
> Для автоматизированной сборки проекта используется <code>Gradle</code>.
> 
> <code>Selenoid</code> выполняет запуск браузеров в контейнерах <code>Docker</code>.
>
> <code>Allure Report</code> формирует отчет о запуске тестов.
>
> <code>Jenkins</code> выполняет запуск тестов.
> 
> После завершения прогона отправляются уведомления с помощью бота в <code>Telegram</code>.


## :electric_plug: Сборка в Jenkins
## <img width="4%" title="Jenkins" src="Images/logo/Jenkins.svg"> Главная страница сборки [Jenkins](https://jenkins.autotests.cloud/job/012-bublikxoxo-devzion-autotests/)
<p align="center">
<img title="Jenkins Dashboard" src="Images/screens/jenkins.png">
</p>  


## :arrow_forward: Запуск из терминала
Локальный запуск:
```
gradle clean test
```

Удаленный запуск:
```
clean
test
"-DchooseBrowser=${BROWSER}"
"-DsetBrowserSize=${BROWSER_SIZE}"
```
## :open_book: Allure отчет
## <img width="4%" title="Allure Report" src="Images/logo/Allure_Report.svg"> Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/012-bublikxoxo-devzion-autotests/allure/)
- ### Главный экран отчета
<p align="center">
<img title="Allure Overview Dashboard" src="Images/screens/allure_overview.png">
</p>

- ### Страница с проведенными тестами
<p align="center">
<img title="Allure Test Page" src="Images/screens/allure_behaviors.png">
</p>

## :hammer: Allure TestOps отчет
## <img width="4%" title="Allure TestOPS" src="Images/logo/Allure_TO.svg"> Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/1389/dashboards)
<p align="center">
<img title="Allure Test Ops Launch" src="Images/screens/allure_testops.png">
</p>
<p align="center">
<img title="Allure Test Ops Launch" src="Images/screens/allure_testops1.png">
</p>
<p align="center">
<img title="Allure Test Ops Launch" src="Images/screens/allure_testops2.png">
</p>

## :wrench: Интеграция с Jira
<p align="center">
<img title="Jira Issue Dashboard" src="Images/screens/jira.png">
</p>

## :robot: Отчет в Telegram
## <img width="4%" title="Telegram" src="Images/logo/Telegram.svg"> Уведомления в Telegram с использованием бота
<p align="center">
<img title="Telegram notification message" src="Images/screens/tg1.png">
</p>

## :film_projector: Видеопример прохождения тестов
## <img width="4%" title="Selenoid" src="Images/logo/Selenoid.svg"> Пример запуска теста в Selenoid
> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="Images/gif/attach_video.gif">
</p>
