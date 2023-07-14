Feature: Facebook

  Scenario Outline: Dang nhap sai
    Given mo trang facebook
    When dien thong tin dang nhap voi "<email>" va "<matkhau>"
    And dang nhap
    And kiem tra "<thongbao>"
    Examples:
      | email                 | matkhau   | thongbao                                                                                                    |
      | cucumberdat@gmail.com | 654321    | The password that you've entered is incorrect. Forgotten password?                                          |
      | cucumbercdcsgmail.com | 654321@Aa | The email address or mobile number you entered isn't connected to an account. Find your account and log in. |
      |                       | 654321@Aa | The email address or mobile number you entered isn't connected to an account. Find your account and log in. |
      | cucumberdat@gmail.com |           | The password that you've entered is incorrect. Forgotten password?                                          |

  Scenario Outline: Dang nhap dung
    Given mo trang fbook
    When dien thong tin voi "<email>" va "<matkhau>"
    And dangnhap
    And kiem tra
    Examples:
      | email                 | matkhau   |
      | cucumberdat@gmail.com | 654321@Aa |

  Scenario Outline: Dang ky sai
    Given mo trang dang ky facebook
    When dienthong tin voi "<Mobile number or email address>" va "<New password>" va "<email2>"
    And dang ky
    And kiemtra voi "<Loi>"
    Examples:
      | Mobile number or email address | email2                 | New password    | Loi                                                                                           |
      | testcucumbercdcsgmail.com      |                        | 5ubAXvSW-yQnT7h | Please enter a valid mobile number or email address.                                          |
      | testcucumbercdcs@gmail.com     | testcucumber@gmail.com | 5ubAXvSW        | Your emails do not match. Please try again.                                                   |
      |                                |                        | 5ubAXvSW-yQnT7h | You'll use this when you log in and if you ever need to reset your password.                  |
      | cucumber@gmail.com             | cucumber@gmail.com     |                 | Enter a combination of at least six numbers, letters and punctuation marks (such as ! and &). |

  Scenario Outline: Dang ky email trung
    Given motrangdang ky facebook
    When dienthongtinvoi "<Mobile number or email address>" va "<New password>" va "<email2>"
    And dang ky2
    And kiemtra2 voi "<Loi>"
    Examples:
      | Mobile number or email address | email2                     | New password | Loi                                                                                 |
      | testcucumbercdcs@gmail.com     | testcucumbercdcs@gmail.com | 5ubAXvSW     | Please check your emails for a message with your code. Your code is 6 numbers long. |