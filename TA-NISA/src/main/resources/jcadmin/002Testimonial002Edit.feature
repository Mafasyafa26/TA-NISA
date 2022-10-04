Feature: Edit Testimonial
	Background: Background login
		When Admin login dan membuka halaman testimonials
		And Admin klik tombol edit testimonial pertama
		
 Scenario: Mengedit gambar di data pertama
  When TE039P Admin mengedit gambar peserta 
  And TE039P Admin menekan tombol simpan edit gambar peserta
  Then TE039P Admin berhasil edit gambar peserta
		        
	Scenario Outline: Mengedit dropdown rating nol
    When  TE040P Admin mengedit rating nol dropdown
    And TE040P Admin klik tombol simpan dropdown rating nol
    Then TE040P Admin berhasil edit dropdown rating nol

	Scenario Outline: Mengedit dropdown menu rating satu
    When  TE041P Admin mengedit rating satu dropdown menu
    And TE041P Admin klik tombol simpan dropdown menu rating satu
    Then TE041P Admin berhasil edit dropdown menu rating satu
    
  Scenario Outline: Mengedit menu dropdown rating dua
    When  TE042P Admin mengedit rating dua menu dropdown
    And TE042P Admin klik tombol simpan menu dropdown rating dua
    Then TE042P Admin berhasil edit menu dropdown rating dua

	Scenario Outline: Mengedit rating tiga dropdown
    When  TE043P Admin mengedit rating tiga dropdown
    And TE043P Admin klik tombol simpan rating tiga dropdown 
    Then TE043P Admin berhasil edit rating tiga dropdown
    
  Scenario Outline: Mengedit rating empat menu dropdown
    When  TE044P Admin mengedit rating empat menu dropdown
    And TE044P Admin klik button simpan rating empat menu dropdown 
    Then TE044P Admin berhasil edit rating menu empat dropdown
    
  Scenario Outline: Mengedit rating lima dropdown menu
    When  TE045P Admin mengedit rating lima dropdown menu
    And TE045P Admin klik tombol simpan rating lima dropdown menu 
    Then TE045P Admin berhasil edit rating lima dropdown menu

 Scenario: Mengedit nama peserta di data pertama
  When TE046P Admin mengedit nama peserta 
  And TE046P Admin menekan tombol simpan edit nama peserta
  Then TE046P Admin berhasil edit nama peserta
  
 Scenario: Mengedit isi testimonial 
  When TE047P Admin mengedit isi testimonial 
  And TE047P Admin menekan tombol simpan edit isi testimonial
  Then TE047P Admin berhasil edit isi testimonial
  
 Scenario: Mengedit active no active
  When TE048P Admin mengedit dropdown menu active no active
  And TE048P Admin menekan tombol simpan edit dropdown active no active
  Then TE048P Admin berhasil edit dropdown active no active
  
 Scenario: Mengedit no active active
  When TE049P Admin mengedit dropdown no active active
  And TE049P Admin menekan tombol simpan edit dropdown menu no active active
  Then TE049P Admin berhasil edit dropdown active no active