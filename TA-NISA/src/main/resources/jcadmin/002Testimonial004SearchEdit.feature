Feature: Search Edit Testimonial
	Background: Background login search edit
		When Admin login dan membuka halaman testimonials search edit
		
		Scenario: Mencari dan edit nama peserta
  When TE041P Admin mengetikkan nama peserta 
  And TE041P Admin menekan enter pada keyboard
  And TE041P Data ditemukan dan admin klik data
  And TE041P Admin mengedit ulang gambar peserta 
  And TE041P Admin menekan tombol simpan gambar
  Then TE041P Admin berhasil edit gambar