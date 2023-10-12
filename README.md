1.	Screenshot Coding
a.	Class Main

 ![image](https://github.com/cherrysober/ticketing-program/assets/116480927/21b7cc99-5473-491b-9139-cee497acf67b)

	package com.ticketingproject merupakan deklarasi package tempat kelas TicketingProject berada. Kode ini mendefinisikan namespace untuk kelas tersebut.
	import java.util.Scanner merupakan pernyataan impor yang mengimpor kelas Scanner dari package java.util. Kelas Scanner digunakan untuk membaca input dari pengguna melalui keyboard.

![image](https://github.com/cherrysober/ticketing-program/assets/116480927/b8ffc4e7-21de-466e-97de-44be414f1394)

 
	public class TicketingProject merupakan deklarasi kelas utama TicketingProject. Kelas ini berisi metode main yang akan dijalankan saat program dimulai.
	TicketingProcess ticketingProcess = new TicketingProcess(); baris ini berguna untuk membuat sebuah objek dari kelas TicketingProcess, yang akan digunakan untuk mengelola data tiket.
	Scanner scanner = new Scanner(System.in); baris ini berguna untuk membuat objek Scanner yang digunakan untuk membaca input dari pengguna melalui keyboard (System.in).

![image](https://github.com/cherrysober/ticketing-program/assets/116480927/28b03207-a784-4df2-99d0-76a4cdc2b668)

 
	int choice; merupakan deklarasi variabel choice yang akan digunakan untuk menyimpan pilihan pengguna.
	choice = scanner.nextInt(); baris ini membaca pilihan pengguna yang diinputkan dan menyimpannya dalam variabel choice.

![image](https://github.com/cherrysober/ticketing-program/assets/116480927/55d3e031-0fbf-409f-8549-e0dd6df7de2a)

 
	switch(choice) { merupakan awal dari blok switch, di mana choice adalah variabel yang digunakan untuk menentukan tindakan yang akan diambil berdasarkan pilihan pengguna.
	System.out.print("Enter Ticket ID: "); berfungsi untuk mencetak pesan ke layar yang meminta pengguna untuk memasukkan ID tiket.
	int ticketID = scanner.nextInt(); baris ini menggunakan objek Scanner untuk membaca input dari pengguna dalam bentuk bilangan bulat (int). Nilai yang dimasukkan oleh pengguna akan disimpan dalam variabel ticketID.
	scanner.nextLine(); baris yang digunakan untuk membersihkan karakter newline (\n) yang mungkin tersisa setelah pembacaan nextInt(). 
	System.out.print("Enter Artist Name: ");  ini mencetak pesan untuk meminta pengguna untuk memasukkan nama artis tiket.
	String artistName = scanner.nextLine(); baris ini menggunakan objek Scanner untuk membaca input dari pengguna dalam bentuk string (String). Nama artis yang dimasukkan oleh pengguna akan disimpan dalam variabel artistName
	ticketingProcess.createTicket(ticketID, artistName, concertName, price); baris ini memanggil metode createTicket dari objek ticketingProcess untuk membuat tiket dengan informasi yang telah dimasukkan oleh pengguna.
	System.out.println("Ticket has been created!"); ini mencetak pesan konfirmasi bahwa tiket telah berhasil dibuat setelah metode createTicket selesai dijalankan.

![image](https://github.com/cherrysober/ticketing-program/assets/116480927/4d8ff7fd-cc2e-4fc9-acdd-4724caad9e86)

 
	Case ini dijalankan jika pengguna memilih opsi 2, yaitu "Display Tickets."
	ticketingProcess.displayTicket(); memanggil metode displayTicket() dari objek ticketingProcess, yang akan menampilkan semua tiket yang ada.
	Setelah menampilkan tiket, eksekusi diberhentikan dengan break;, dan program kembali ke loop utama untuk meminta pilihan pengguna berikutnya.

![image](https://github.com/cherrysober/ticketing-program/assets/116480927/f5480f58-d888-46b9-952e-0f99e2e6c5c4)

 
	Case ini dijalankan jika pengguna memilih opsi 3, yaitu "Update Ticket Price."
	Program meminta pengguna untuk memasukkan ID tiket yang ingin diupdate dan harga baru untuk tiket tersebut.
	Setelah menerima input pengguna, metode updateTicket(updateID, newPrice) dari objek ticketingProcess dipanggil untuk mengupdate harga tiket.
	Setelah operasi update selesai, eksekusi diberhentikan dengan break;, dan program kembali ke loop utama.

![image](https://github.com/cherrysober/ticketing-program/assets/116480927/f58a6fe8-9c8a-4aac-bef9-e26ab3b9b11e)

 
	Case ini dijalankan jika pengguna memilih opsi 4, yaitu "Delete Ticket."
	Program meminta pengguna untuk memasukkan ID tiket yang ingin dihapus.
	Setelah menerima input pengguna, metode deleteTicket(deleteID) dari objek ticketingProcess dipanggil untuk menghapus tiket dengan ID yang sesuai.
	Setelah operasi penghapusan selesai, eksekusi diberhentikan dengan break;, dan program kembali ke loop utama.

![image](https://github.com/cherrysober/ticketing-program/assets/116480927/82f23501-765a-43be-a64f-c023c95126f2)

 
	Case ini dijalankan jika pengguna memilih opsi 5, yaitu "Exit" (Keluar).
	Program mencetak pesan ucapan terima kasih kepada pengguna dan kemudian diberhentikan dengan break;.
	Ini mengakhiri program dan keluar dari loop utama, sehingga program selesai dijalankan.

![image](https://github.com/cherrysober/ticketing-program/assets/116480927/c3adec19-b724-4af4-bce2-feb734b565bd)

 
	Bagian ini memungkinkan pengguna untuk memutuskan apakah mereka ingin melanjutkan penggunaan program setelah menyelesaikan tindakan tertentu. Jika mereka ingin melanjutkan, mereka akan kembali ke pilihan menu awal. Jika mereka ingin keluar, program akan selesai dijalankan. Ini memberikan fleksibilitas kepada pengguna untuk memutuskan apakah mereka ingin melakukan lebih banyak tindakan atau keluar dari program.

b.	Class Ticketing Process

![image](https://github.com/cherrysober/ticketing-program/assets/116480927/73ef317f-9c31-4347-8076-99b2035881f0)
 
	private List<Ticket> ticketList; ini adalah variabel yang digunakan untuk menyimpan daftar tiket. Variabel ini adalah sebuah list yang berisi objek-objek Ticket dari package TicketingData. Ini digunakan untuk melacak tiket yang telah dibuat.
	public TicketingProcess ini adalah konstruktor kelas TicketingProcess. Saat objek TicketingProcess dibuat, list ticketList akan diinisialisasi sebagai sebuah objek ArrayList.

![image](https://github.com/cherrysober/ticketing-program/assets/116480927/40f97460-062d-443c-8c97-177200412be1)

 
	public void createTicket(int ticketID, String artistName, String concertName, double price)  metode ini digunakan untuk membuat tiket baru. Ini menerima ID tiket, nama artis, nama konser, dan harga sebagai parameter, dan kemudian membuat objek Ticket dan menambahkannya ke dalam list ticketList.
	public final void displayTicket() metode ini digunakan untuk menampilkan semua tiket yang ada. Ini digunakan dalam pilihan menu "Display Tickets". Metode ini bersifat final, sehingga tidak dapat di-override oleh subkelas.

![image](https://github.com/cherrysober/ticketing-program/assets/116480927/07c71e54-bedd-402e-b8b7-22dbf3a47b46)

 
	public void updateTicket(int ticketID, double newPrice) metode ini digunakan untuk mengupdate harga tiket berdasarkan ID tiket yang diberikan. Jika ID tiket cocok dengan salah satu tiket dalam list, harga tiket tersebut akan diubah. Jika tidak, pesan kesalahan akan ditampilkan.

![image](https://github.com/cherrysober/ticketing-program/assets/116480927/10241629-066c-4a0a-8923-2b4de0f1d6f2)


 
	public void deleteTicket(int ticketID) metode ini digunakan untuk menghapus tiket berdasarkan ID tiket yang diberikan. Jika ID tiket cocok dengan salah satu tiket dalam list, tiket tersebut akan dihapus. Jika tidak, pesan kesalahan akan ditampilkan.

c.	Class Ticket

![image](https://github.com/cherrysober/ticketing-program/assets/116480927/2e13256e-ad62-4b01-b2c6-6dc2344651ac)
 

	public final class Ticket ini adalah deklarasi kelas Ticket. Kelas ini dideklarasikan sebagai final, yang berarti kelas ini tidak dapat diwariskan oleh kelas lain. Ini merupakan best practice yang memastikan bahwa kelas Ticket tidak akan memiliki subkelas yang dapat mengubah perilakunya.
	private int ticketID;, private String artistName;, private String concertName;, private double price; ini adalah properti properti privat yang menyimpan informasi tentang tiket. Ini adalah data yang akan digunakan untuk mengidentifikasi dan menampilkan tiket. Semua properti bersifat privat, sehingga hanya dapat diakses melalui metode-metode getter dan setter yang sesuai.
	public Ticket(int ticketID, String artistName, String concertName, double price) ini adalah konstruktor kelas Ticket. Ketika sebuah objek Ticket dibuat, konstruktor ini akan menginisialisasi properti-properti tiket dengan nilai yang sesuai.

![image](https://github.com/cherrysober/ticketing-program/assets/116480927/0e473b4f-dbbb-4a55-97d2-a04a6b9d3b3c)

 
	Metode getter (misalnya, public int getTicketID() { ... }) digunakan untuk mengambil nilai dari properti tiket yang bersifat privat. Ini memungkinkan akses ke informasi tiket tanpa harus mengakses properti langsung.
	Metode setter (misalnya, public void setTicketID(int ticketID) { ... }) digunakan untuk mengatur nilai properti tiket yang bersifat privat. Ini memungkinkan pengubahan nilai properti tiket dengan pengawasan, seperti validasi atau perubahan lain yang diperlukan.
	@Override adalah anotasi yang menunjukkan bahwa metode toString telah di-override dari kelas dasar (Object). Metode toString ini digunakan untuk menghasilkan representasi string dari objek tiket, yang akan digunakan untuk menampilkan informasi tiket dengan cara yang sesuai.


2.	Screenshot Output
   
 ![image](https://github.com/cherrysober/ticketing-program/assets/116480927/4c11340e-ee4f-4dc7-9a5e-1820d3ebf027)

	Ini merupakan tampilan utama dari menu utama Lavender Ticketing. Pengguna dapat memilih opsi 1/2/3/4/5 sesuai menu yang ingin digunakan.

![image](https://github.com/cherrysober/ticketing-program/assets/116480927/f9067de8-d662-4712-bf00-001173dd78b1)

 
	Jika pengguna memilih opsi 1 maka pengguna akan dipersilahkan untuk mengisi ID ticket, nama artis, nama konser, dan juga harga konser. Setelah itu ticket akan otomatis terdaftar. Setelah itu akan ada pertanyaan apakah pengguna masih ingin melanjutkan program, 1 untuk looping ke menu awal, 0 untuk keluar.

![image](https://github.com/cherrysober/ticketing-program/assets/116480927/20f7094c-eda9-4857-9b57-e1d1c3340a59)

 
	Jika pengguna memilih opsi 2 maka pengguna dapat melihat isi dari ticket yang telah dibuat.

![image](https://github.com/cherrysober/ticketing-program/assets/116480927/9c2df202-827b-4121-95c1-d6d8b57d23bc)

 
	Jika pengguna memilih opsi 3 maka pengguna dapat mengedit harga ticket yang sudah tertera dengan cara memasukkan ID ticket dan harga ticket baru.

![image](https://github.com/cherrysober/ticketing-program/assets/116480927/4c100fe0-8add-43a3-85ba-9349fd022f7f)

 
	Jika pengguna memilih opsi 4 maka pengguna dapat menghapus ticket yang sudah pengguna buat sebelumnya dengan cara memasukkan ID ticket yang ingin dihapuskan.

![image](https://github.com/cherrysober/ticketing-program/assets/116480927/ec0a1ba7-d4e7-42e6-ae22-057a77d4c713)

 
	Jika pengguna memilih opsi 5 maka pengguna akan diarahkan untuk keluar dari program.
