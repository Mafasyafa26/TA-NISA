Feature: Edit Testimonial
	Background: Background login
		When Admin login dan membuka halaman testimonials
		And Admin klik tombol edit testimonial pertama
		        
 Scenario: Mengedit nama peserta di data pertama
  When Admin mengedit nama peserta dengan <nama peserta>
  And Admin menekan tombol simpan edit nama peserta
  Then Admin mengedit nama peserta
  Examples:
  |nama peserta|
  |edit nama peserta cucumber|
  