Feature: Search Edit Testimonial
	Background: Background login search edit
		When Admin login dan membuka halaman testimonials search edit
		
		Scenario: Mencari dan edit gambar
  When TE051P Admin mengetikkan nama peserta search edit
  And TE051P Admin menekan enter pada keyboard search edit
  And TE051P Data ditemukan dan admin klik data search edit
  And TE051P Admin mengedit ulang gambar peserta search edit
  And TE051P Admin menekan tombol simpan gambar search edit
  Then TE051P Admin berhasil edit gambar search edit
  
  	Scenario: Mencari dan edit nama
  When TE052P Admin mengetikkan nama peserta search edit nama
  And TE052P Admin menekan enter pada keyboard search edit nama
  And TE052P Data ditemukan dan admin klik data search edit nama
  And TE052P Admin mengedit ulang nama peserta search edit nama
  And TE052P Admin menekan tombol simpan nama search edit nama
  Then TE052P Admin berhasil edit nama search edit nama
  
  	Scenario: Mencari dan edit isi
  When TE053P Admin mengetikkan nama peserta search edit isi
  And TE053P Admin menekan enter pada keyboard search edit isi
  And TE053P Data ditemukan dan admin klik data search edit isi
  And TE053P Admin mengedit ulang isi testimonial search edit isi
  And TE053P Admin menekan tombol simpan search edit isi
  Then TE053P Admin berhasil edit isi search edit isi