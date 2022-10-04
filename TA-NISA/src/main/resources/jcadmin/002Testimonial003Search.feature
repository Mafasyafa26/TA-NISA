Feature: Search Testimonial
	Background: Background login search
		When Admin login dan membuka halaman testimonials search
		
		Scenario: Mencari nama peserta
  When TE050P Admin mengetikkan nama peserta 
  And TE050P Admin menekan enter pada keyboard
  Then TE050P Data ditemukan