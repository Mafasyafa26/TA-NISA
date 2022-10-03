Feature: Search Edit Testimonial
	Background: Background login search edit
		When Admin login dan membuka halaman testimonials search edit
		
		Scenario: Mencari dan edit gambar
  When TE040P Admin mengetikkan nama peserta search edit
  And TE040P Admin menekan enter pada keyboard search edit
  And TE040P Data ditemukan dan admin klik data search edit
  And TE040P Admin mengedit ulang gambar peserta search edit
  And TE040P Admin menekan tombol simpan gambar search edit
  Then TE040P Admin berhasil edit gambar search edit
  
  	Scenario: Mencari dan edit nama
  When TE041P Admin mengetikkan nama peserta search edit nama
  And TE041P Admin menekan enter pada keyboard search edit nama
  And TE041P Data ditemukan dan admin klik data search edit nama
  And TE041P Admin mengedit ulang nama peserta search edit nama
  And TE041P Admin menekan tombol simpan nama search edit nama
  Then TE041P Admin berhasil edit nama search edit nama
  
  	Scenario: Mencari dan edit isi
  When TE042P Admin mengetikkan nama peserta search edit isi
  And TE042P Admin menekan enter pada keyboard search edit isi
  And TE042P Data ditemukan dan admin klik data search edit isi
  And TE042P Admin mengedit ulang isi testimonial search edit isi
  And TE042P Admin menekan tombol simpan search edit isi
  Then TE042P Admin berhasil edit isi search edit isi