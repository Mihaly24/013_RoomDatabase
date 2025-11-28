package com.example.roomdb.view.route

interface DestinasiNavigasi {
    /**
     * Nama unik untuk mennetukanjalur untuk composable
     */
    val route: String

    /**
     * String resource id yang berisi judul yang akan ditampilkan di layar halaman.
     */
    val titleRes: Int
}