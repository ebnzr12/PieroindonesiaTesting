Feature: Test for Piero Indonesia (pieroindonesia.com)

  Scenario: Test Login di Piero Indonesia
    Given buka firefox dan mulai aplikasinya
    Then click login
    When masukkan email dan password
    Then masuk ke halaman utama
    
   Scenario: Test Login invalid1 di Piero Indonesia
    Given buka firefox dan mulai aplikasinya
    Then click login
    When masukkan email dan password satu
    Then masuk ke halaman utama
    
   Scenario: Test Login invalid2 di Piero Indonesia
	  Given buka firefox dan mulai aplikasinya
	  Then click login
	  When masukkan email dan password dua
	  Then masuk ke halaman utama
 
  Scenario: Test Login invalid3 di Piero Indonesia
    Given buka firefox dan mulai aplikasinya
    Then click login
    When masukkan email dan password tiga
    Then masuk ke halaman utama
 
  Scenario: Test Login invalid4 di Piero Indonesia
    Given buka firefox dan mulai aplikasinya
    Then click login
    When masukkan email dan password empat
    Then masuk ke halaman utama
    
  
