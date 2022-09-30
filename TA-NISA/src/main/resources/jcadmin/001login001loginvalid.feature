Feature: Login Valid

Background: BG login
		When Admin membuka browser JC
      
   Scenario: User valid login Outlinee
    When Admin input valid username dan password
    And Admin klik button simpan
    Then Admin berhasil login
  
  Scenario: User valid login uppercase Outlinee
    When Admin input <username> dan <password> upper
    And Admin klik button simpan upper
    Then Admin berhasil login upper

#1 data
    Examples: 
      | username | password  |
      | UCEN1315@GMAIL.COM | a |
      
  Scenario: User valid login upperlower case Outlinee
    When Admin input <username> dan <password> uplow
    And Admin klik button simpan uplow
    Then Admin berhasil login uplow

#1 data
    Examples: 
      | username | password  |
      | Ucen1315@Gmail.com | a |
      
      