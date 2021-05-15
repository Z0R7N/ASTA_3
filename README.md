# ASTA_3
auto test for portfolio
 
auto test, java maven selenium webdriver

Test case: 005

Task selection, hover cursor over link, enter data in text fields, then choose the picture, then click button to apply

1. Open page - https://buggy-testingcup.pgs-soft.com/
2. Click link - Zadanie 3
3. Hover over link - Menu
4. Hover over link - Formularz
5. Click lint - Przejdź do trybu edycji
6. Enter Name in text field - Imię
7. Enter Family in text field - Nazwisko
8. Enter text in text field - Notatka
9. Enter phone number in text field - Telefon
10. Click button - Wybierz plik
11. Choose picture
12. Click button - Zapisz

Expected result: message about successful saving appear

Actual result: message about successful saving NOT appear

#Bag report

Severity: Minor

Author: Dmitriy Andreev

Environment: Windows 10 x64, version 20H2, Google Chrome, version 90.0.4430.212

Steps to reproduce:

1. Open page - https://buggy-testingcup.pgs-soft.com/
2. Click link - Zadanie 3
3. Hover over link - Menu
4. Hover over link - Formularz
5. Click lint - Przejdź do trybu edycji
6. Enter Name in text field - Imię
7. Enter Family in text field - Nazwisko
8. Enter text in text field - Notatka
9. Enter phone number in text field - Telefon
10. Click button - Wybierz plik
11. Choose picture
12. Click button - Zapisz

Actual result: test is passed, but message about successful saving NOT appear

Expected result: message about successful saving appear