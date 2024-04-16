fun main() {
    /*
    TODO 1
        Buatlah variable dengan ketentuan berikut :
        - Variable dapat diubah sewaktu-waktu
        - Variable memiliki Identifier berupa myName
        - Variable memiliki tipe data berupa String
        - Variable memiliki Initialization berupa nama panggilan kamu
    */
    // Todo 1: Tulis Code dibawah ini
    var myName: String="Bryan"

    /*
    TODO 2
        Ubah Initialization pada varible myName diatas menjadi Nama Lengkap kamu
     */
    // Todo 2: Tulis Code dibawah ini
    myName = "Maulana Bryan Syahputra"
    // Coba Melakukan Print untuk mengecek Inisiasi
    println(myName)
    /*
    TODO 4
        Buatlah Array dengan ketentuan berikut :
        - variabel Array bernama mobileMentors
        - Array berisi tipe data String
        - Index pada Array berisi ["Reza Kurniawan", "Raihan Zhaky", "Reynaldi", "Nabila Putri Syafarina Bukka", "Rahmad Noor Ikhsan"]
        - Ubah index yang berisi "Raihan Zhaky" pada Array menjadi "Raihan Zhaky Al-Hafizh"
        - Tampilkan index yang berisi "Raihan Zhaky Al-Hafizh"
    */
    // Todo 4: Tulis Code dibawah ini
    var mobileMentors = arrayOf<String>(
        "Reza Kurniawan",
        "Raihan Zhaky",
        "Reynaldi",
        "Nabila Putri Syafarina Bukka",
        "Rahmad Noor Ikhsan"
    )
    // cek inisiasi
    println(mobileMentors[1])
    mobileMentors[1] = "Raihan Zhaky Al-Hafizh"
    //Tampilkan index yang berisi "Raihan Zhaky Al-Hafizh"
    println(mobileMentors[1])

    // Todo 3:
    println(calculator(200, 150))
    // Todo 5:
    // Lebih dari 10 Kg
    expedition(20)
    // kurang dari atau sama dengan 10 kg
    expedition(9)
    // kurang dari atau sama dengan 5 kg
    expedition(4)
    // kurang dari atau sama dengan 1 kg
    expedition(1)
}