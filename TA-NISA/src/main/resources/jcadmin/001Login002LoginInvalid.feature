Feature: Login Invalid

Background: BG login
		When Admin membuka browser JCAdmin
      
   Scenario: Admin invalid login simpan
    When Admin klik button simpan2
    Then Admin gagal login simpan2
  
  Scenario: Admin invalid login klik submit
    When Admin klik username dan password2
    And Admin klik button simpan klik2
    Then Admin gagal login klik submit2
      
  Scenario: Admin invalid login input username
    When Admin input username2
    And Admin klik button simpan input uname2
    Then Admin gagal login input uname2
    
  Scenario: Admin invalid login input password
    When Admin input password2
    And Admin klik button simpan input pass2
    Then Admin gagal login input pass2

  Scenario: Admin invalid login input password uppercase
    When Admin input username dan password upper2
    And Admin klik button simpan input pass upper2
    Then Admin gagal login input pass upper2
    
  Scenario: Admin invalid login upper
    When Admin input upper username dan password2 
    And Admin klik button simpan upper2
    Then Admin gagal login upper2
    
  Scenario: Admin invalid login input spasi
    When Admin input username dan password spasi2
    And Admin klik button simpan spasi2
    Then Admin gagal login input spasi2
    
   Scenario: Admin invalid login user tanpa format email
    When Admin input username dan password tanpa format2 
    And Admin klik button simpan tanpa format2
    Then Admin gagal login tanpa format2
      