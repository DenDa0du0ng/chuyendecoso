Feature: Web
  Scenario Outline: dang ky sai
    Given mo trang web
    When dang ky
    And dien thong tin voi "<email1>" va "<email2>" va "<pass>"
    Then kiem tra voi "<Loi>"
    Examples:
      | email1                     | email2                     | pass      | Loi                                                           |
      | testcucumbercdcsgmail.com  | testcucumbercdcsgmail.com  | 123456@Aa | Email invalidate. Please try again.                           |
      | testcucumber@gmail.com     | testcucumbergmail.com      | 123456@Aa | Your email do not match the re-enter email. Please try again. |
      |                            |                            | 123456@Aa | Full information required!                                    |
      | testcucumbercdcs@gmail.com | testcucumbercdcs@gmail.com |           | Full information required!                                    |
      | testcucumber@gmail.com     | testcucumber@gmail.com     | 12345     | Password length must be 6 characters or more.                 |
      | testcucumbercdcs@gmail.com | testcucumbercdcs@gmail.com | 123456@Aa | Email already exists. Please try again.                       |


  Scenario Outline: dang nhap sai
    Given motrang
    When dien thongtin voi "<email>" va "<pass>"
    Then Kiem tra "<Loi>"
    Examples:
      | email                      | pass      | Loi                                 |
      | testcucumbercdcs@gmail.com | 123456    | Wrong account or password.          |
      | testcucumbercdcsgmail.com  | 123456@Aa | Email invalidate. Please try again. |
      | testcucumbercdcs@gmail.com |           | Full information required!          |
      |                            | 123456@Aa | Full information required!          |

  Scenario Outline: dang nhap dung
    Given motrangweb
    When dienthongtin voi "<email>" va "<pass>"
    Then Kiem tra
    Examples:
      | email                      | pass      |
      | testcucumbercdcs@gmail.com | 123456@Aa |


  Scenario Outline: SQLi
    Given motrang web
    When dienthongtin voi "<email>" voi "<pass>"
    Then Kiemtra
    Examples:
      | email                                    | pass          |
      | testcucumbercdcs@gmail.com' or 1 = 1 --' | qưerty1234567 |

  Scenario Outline: XSS
    Given mot rang web
    When dien thongtin voi "<email>" voi "<pass>"
    Then Kiemtraalert voi "<alert>"
    Examples:
      | email                                                   | pass          | alert |
      | testcucumbercdcs@gmail.com<script>alert('XSS')</script> | qưerty1234567 | XSS   |