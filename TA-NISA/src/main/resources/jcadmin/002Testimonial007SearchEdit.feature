Feature: Search Edit Testimonial
	Background: Background login search edit
		When Admin login dan membuka halaman testimonials search edit
		
		Scenario: Mencari dan edit gambar
  When TE053P Admin mengetikkan nama peserta search edit
  And TE053P Admin menekan enter pada keyboard search edit
  And TE053P Data ditemukan dan admin klik data search edit
  And TE053P Admin mengedit ulang gambar peserta search edit
  And TE053P Admin menekan tombol simpan gambar search edit
  Then TE053P Admin berhasil edit gambar search edit
  
  	Scenario: Mencari dan edit nama
  When TE054P Admin mengetikkan nama peserta search edit nama
  And TE054P Admin menekan enter pada keyboard search edit nama
  And TE054P Data ditemukan dan admin klik data search edit nama
  And TE054P Admin mengedit ulang nama peserta search edit nama
  And TE054P Admin menekan tombol simpan nama search edit nama
  Then TE054P Admin berhasil edit nama search edit nama
  
  	Scenario: Mencari dan edit isi
  When TE055P Admin mengetikkan nama peserta search edit isi
  And TE055P Admin menekan enter pada keyboard search edit isi
  And TE055P Data ditemukan dan admin klik data search edit isi
  And TE055P Admin mengedit ulang isi testimonial search edit isi
  And TE055P Admin menekan tombol simpan search edit isi
  Then TE055P Admin berhasil edit isi search edit isi
  
  Scenario: Mencari dan edit publish active 
  When TE056P Admin mengetikkan nama peserta search edit publish active
  And TE056P Admin menekan enter pada keyboard search edit publish active
  And TE056P Data ditemukan dan admin klik data search edit publish active
  And TE056P Admin mengedit ulang publish active search edit menjadi no active
  And TE056P Admin menekan tombol simpan search edit publish active
  Then TE056P Admin berhasil edit publish active search edit menjadi no active
  
  Scenario: Mencari dan edit publish no active 
  When TE057P Admin mengetikkan nama peserta search edit publish no active
  And TE057P Admin menekan enter pada keyboard search edit publish no active
  And TE057P Data ditemukan dan admin klik data search edit publish no active
  And TE057P Admin mengedit ulang publish no active search edit menjadi active
  And TE057P Admin menekan tombol simpan search edit publish no active
  Then TE057P Admin berhasil edit publish no active search edit menjadi active