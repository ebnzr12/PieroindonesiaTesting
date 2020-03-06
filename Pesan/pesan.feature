Feature: Test for Piero Indonesia (pieroindonesia.com)
  I want to use this template for my feature file
  
   	Scenario: Test kirim pesan
   		Given buka firefox dan mulai aplikasinya
   		When saya sudah login
   		Then bisa login
   		Then click hubungi kami
   		When isi form
   		Then pesan terkirim
   
   Scenario: Test kirim invalid1 pesan
   		Given buka firefox dan mulai aplikasinya
   		When saya sudah login
   		Then bisa login
   		Then click hubungi kami
   		When isi form1
   		Then pesan terkirim
   	
   	Scenario: Test kirim invalid2 pesan
   		Given buka firefox dan mulai aplikasinya
   		When saya sudah login
   		Then bisa login
   		Then click hubungi kami
   		When isi form2
   		Then pesan terkirim
   	
   	Scenario: Test kirim valid1 pesan
   		Given buka firefox dan mulai aplikasinya
   		When saya sudah login
   		Then bisa login
   		Then click hubungi kami
   		When isi form3
   		Then pesan terkirim
   	
   	Scenario: Test kirim invalid3 pesan
   		Given buka firefox dan mulai aplikasinya
   		When saya sudah login
   		Then bisa login
   		Then click hubungi kami
   		When isi form4
   		Then pesan terkirim
   		