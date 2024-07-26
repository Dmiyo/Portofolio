function perkalian(p1, p2){
    p1 = parseInt(prompt("masukan nilai ke 1 :", 0));
    p2 = parseInt(prompt("masukan nilai ke 2 :", 0));
    return p1 * p2; 
}

function sisabagi(){
    n1 = parseInt(prompt("masukan nilai sisa bagi ke 1", 0));
    n2 = parseInt(prompt("masukan nilai sisa bagi ke 2", 0));
}
let pilihan = parseInt(prompt("1. plih 1 untuk perkalian \n 2. pilih untuk sisa bagi"))
if(pilihan == 1){
    console.log("hasil perkalian :", perkalian);
}

console.log("hasil sisa bagi = ", sisabagi());
console.log("hasil perkalian = ", perkalian());