package com.appyfurious.spp_bsuir.Entity

import io.realm.annotations.PrimaryKey
import java.util.*

class TrainingType {
    @PrimaryKey
    var id = UUID.randomUUID().toString()
    var name: String? = null
}