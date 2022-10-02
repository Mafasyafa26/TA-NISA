Feature: Edit Testimonial
	Background: Background login
		When Admin login dan membuka halaman testimonials
		And Admin klik tombol edit testimonial pertama
		        
 Scenario: Mengedit nama peserta di data pertama
  When Admin mengedit nama peserta 
  And Admin menekan tombol simpan edit nama peserta
  Then Admin berhasil edit nama peserta
  
 Scenario: Mengedit isi testimonial 
  When Admin mengedit isi testimonial 
  And Admin menekan tombol simpan edit isi testimonial
  Then Admin berhasil edit isi testimonial
  
 
  