package org.kotlinex.zipcodesearchex01.model

data class ZipCodeDTO (
    var zipcode: String,
    var sido: String,
    var gugun: String,
    var dong: String,
    var ri: String,
    var bunji: String,
    var seq: Int
) {
    constructor() : this("", "", "", "", "", "", 0)
}