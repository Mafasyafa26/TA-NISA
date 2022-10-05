Feature: Tambah Testimonial Negative
	Background: Background login tambah negative
		Given Admin login dan open page testimonial tambah negative
		When 	Admin klik tombol tambah testimonial tambah negative

#		Scenario Outline: Menambah daftar negative testimonial active
    #When  <kode test case> Admin mengisi form negative dengan rating <angka rating> active
    #And <kode test case> Admin menekan tombol simpan testimonial active negative
    #Then <kode test case> Admin menambah testimonial active invalid negative
    #
   #Examples:
   #	| angka rating | kode test case |
   #	| 0 | TE001N |
   #	| 1 | TE002N |
   #	| 2 | TE003N |
   #	| 3 | TE004N |
   #	| 4 | TE005N |
   #	| 5 | TE006N |
   	
   	Scenario Outline: Menambah daftar negative testimonial no active
    When  <kode test case> Admin mengisi form tambah negative dengan rating <angka rating> publish no active
    And <kode test case> Admin menekan tombol simpan testimonial publish no active negative
    Then <kode test case> Admin menambah testimonial publish no active invalid negative
    
   Examples:
   	| angka rating | kode test case |
   	| 0 | TE007N |
   	| 1 | TE008N |
   	| 2 | TE009N |
   	| 3 | TE010N |
   	| 4 | TE011N |
   	| 5 | TE012N |
   	
   	Scenario Outline: Menambah daftar negative testimonial kosong isi active
    When  <kode test case> Admin isi form negative dengan rating <angka rating> active kosong isi
    And <kode test case> Admin klik tombol simpan testimonial active negative kosong isi
    Then <kode test case> Admin tambah testimonial active invalid negative kosong isi
    
   Examples:
   	| angka rating | kode test case |
   	| 0 | TE013N |
   	| 1 | TE014N |
   	| 2 | TE015N |
   	| 3 | TE016N |
   	| 4 | TE017N |
   	| 5 | TE018N |
   	
   	Scenario Outline: Menambah daftar negative testimonial kosong isi no active
    When  <kode test case> Admin isi form negative rating <angka rating> no active kosong isi testi
    And <kode test case> Admin klik tombol simpan testimonial no active negative kosong isi testi
    Then <kode test case> Admin tambah testimonial no active invalid negative kosong isi testi
    
   Examples:
   	| angka rating | kode test case |
   	| 0 | TE019N |
   	| 1 | TE020N |
   	| 2 | TE021N |
   	| 3 | TE022N |
   	| 4 | TE023N |
   	| 5 | TE024N |