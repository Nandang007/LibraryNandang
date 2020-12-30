Library ini digunakan untuk latihan membuat librari android di Universitas AMIKOM Purwokerto

Cara menggunakanya adalah : 
tambahkan kode berikut ini pada bagian Build Gradle (Project)

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  Kemudian tambahkan kode berikut ini pada bagian Build Gradle (Module)
  
	dependencies {
	        implementation 'com.github.Nandang007:LibraryNandang:1.3'
	}
    
    
    Setelah itu anda bisa menggunakan Class berikut ini    
    
    KirimPesan
    Matematika
    
    dan bisa memanggil Activity TentangSaya
    
    berikut ini contoh penggunaanya dalam program utama :
    
    public void panggailPesan(View view) {
        KirimPesan kirimPesan=new KirimPesan();
        kirimPesan.Kirim(getApplicationContext(),"Selamat Anda Sudah Berhasil membuat library");
    }

    public void tentangSaya(View view) {
        Intent intent=new Intent(MainActivity.this, TentangSaya.class);
        startActivity(intent);
    }

    public void operasiMatematika(View view) {
        Matematika matematika=new Matematika();
        matematika.setBil1(20);
        matematika.setBil2(30);

        Toast.makeText(this, "Hasil Penjumlahan dari 20 + 30 adalah " +String.valueOf(matematika.getTambah()), Toast.LENGTH_SHORT).show();
    }
    
    
    Selamat belajar....
    Jangan Gampang Menyerah...
    Tetap Semangat...
    


