package com.example.praktikum10.apiservice

import com.example.praktikum10.modeldata.DataSiswa
import retrofit2.http.GET

interface ServiceApiSiswa {
    @GET("bacaTeman.php")
    suspend fun getSiswa(): List<DataSiswa>

}