Feature: Test DigiLocker Application

  Scenario Outline: Test Register Page Functionality
    Given user on Register Page
    When user enter "<FullName>" and "<Date>" and "<Month>" and "<Year>" and "<Gender>" and "<MobileNo>" and "<Email>" and "<Pin>"

    Examples: 
      | FullName        | Date | Month     | Year | Gender | MobileNo   | Email            | Pin    |
      | Manish Shirsath |   17 | September | 1995 | M      | 9876543210 | manish@email.com | 431001 |
      | ABC             |   21 | June      | 1998 | F      | 7777777777 | ABC@email.com    | 431002 |
      | PQR             |    5 | September | 1971 | M      | 1111111111 | PQR@email.com    | 431003 |
      | XYZ             |   12 | December  | 1978 | F      | 2222222222 | XYZ@email.com    | 431004 |
