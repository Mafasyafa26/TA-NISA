Feature: Tambah Testimonial   
	Background: Background login search
		Given Admin login dan membuka halaman testimonials tambah
		When 	Admin klik tombol tambah testimonial tambah

  Scenario Outline: Menambah daftar testimonial active
    When  <kode test case> Admin mengisi form dengan rating <angka rating> active
    And <kode test case> Admin menekan tombol simpan testimonial active
    Then <kode test case> Admin menambah testimonial active valid
    
   Examples:
   	| angka rating | kode test case |
   	| 0 | TE003P |
   	| 1 | TE004P |
   	| 2 | TE005P |
   	| 3 | TE006P |
   	| 4 | TE007P |
   	| 5 | TE008P |
   	
   	Scenario Outline: Menambah daftar testimonial noactive
    When  <kode test case> Admin mengisi form dengan rating <angka rating> noactive
    And <kode test case> Admin menekan tombol simpan testimonial no active
    Then <kode test case> Admin menambah testimonial noactive valid
    
   Examples:
   	| angka rating | kode test case |
   	| 0 | TE009P |
   	| 1 | TE010P |
   	| 2 | TE011P |
   	| 3 | TE012P |
   	| 4 | TE013P |
   	| 5 | TE014P |
   	
   	Scenario Outline: Menambah daftar testimonial active format gambar
    When  <kode test case> Admin mengisi format gambar dengan rating <angka rating> active
    And <kode test case> Admin menekan tombol simpan testimonial format gambar active
    Then <kode test case> Admin menambah testimonial format gambar active valid
    
   Examples:
   	| angka rating | kode test case |
   	| 0 | TE015P |
   	| 1 | TE016P |
   	| 2 | TE017P |
   	| 3 | TE018P |
   	| 4 | TE019P |
   	| 5 | TE020P |
   	
   	Scenario Outline: Menambah testimonial no active format gambar
    When  <kode test case> Admin tambah format gambar dengan rating <angka rating> no active
    And <kode test case> Admin klik tombol simpan testimonial format gambar no active
    Then <kode test case> Admin tambah testimonial format gambar no active valid
    
   Examples:
   	| angka rating | kode test case |
   	| 0 | TE021P |
   	| 1 | TE022P |
   	| 2 | TE023P |
   	| 3 | TE024P |
   	| 4 | TE025P |
   	| 5 | TE026P |
   	
   	Scenario Outline: Menambah testi active karakter beda
    When  <kode test case> Admin tambah isi karakter beda dengan rating <angka rating> active
    And <kode test case> Admin klik tombol simpan testimonial karakter beda active
    Then <kode test case> Admin tambah testimonial karakter beda active valid
    
   Examples:
   	| angka rating | kode test case |
   	| 0 | TE027P |
   	| 1 | TE028P |
   	| 2 | TE029P |
   	| 3 | TE030P |
   	| 4 | TE031P |
   	| 5 | TE032P |
   	
   	Scenario Outline: Menambah testi no active format karakter beda
    When  <kode test case> Admin menambah isi format karakter beda dengan rating <angka rating> no active
    And <kode test case> Admin menekan button simpan testimonial karakter beda no active
    Then <kode test case> Admin menambah testimonial karakter beda no active invalid
    
   Examples:
   	| angka rating | kode test case |
   	| 0 | TE033P |
   	| 1 | TE034P |
   	| 2 | TE035P |
   	| 3 | TE036P |
   	| 4 | TE037P |
   	| 5 | TE038P |