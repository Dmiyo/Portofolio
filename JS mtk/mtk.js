document.getElementById('tombol').onclick = function() {
    // alert('Terima kasih telah mengunjungi situs web kami!');

    var rumus = prompt("Mau Menghitung Luas apa?\n 1. Luas Lingkaran \n 2. Luas Segitiga \n 3. Luas Persegi Panjang \n 4. Luas Jajargenjang");

if (rumus == 1) {
    var jari = prompt("Masukkan nilai jari-jarinya");
    var phi = 22/7;
    var luli = phi * jari * jari;
    alert("hasil adalah: " + luli)
} else if (rumus == 2) {
    var alas = prompt("Masukkan nilai alas segitiga");
    var tinggi = prompt("Masukkan nilai tinggi segitiga");
    var luasSegitiga = 0.5 * alas * tinggi;
    alert("hasil adalah: " + luasSegitiga)
} else if (rumus == 3) {
    var panjang = prompt("Masukkan nilai panjang persegi panjang");
    var lebar = prompt("Masukkan nilai lebar persegi panjang");
    var luasPersegiPanjang = panjang * lebar;
    alert("hasil adalah: " + luasPersegiPanjang)
} else if (rumus == 4) {
    var alas = prompt("Masukkan nilai alas jajargenjang");
    var tinggi = prompt("Masukkan nilai tinggi jajargenjang");
    var luasJajargenjang = alas * tinggi;
    alert("hasil adalah: " + luasJajargenjang)
} else {
    alert("Jawaban belum tersedia");
}
}
