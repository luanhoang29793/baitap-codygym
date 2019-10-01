function doanso(){
    let batdau = document.getElementById('batdau');
    let ketthuc= document.getElementById('ketthuc');
    let so = myRandom (batdau,ketthuc);
    let diem = 5 ;
    console.log (so);
    let doan = prompt ('nhập số bạn đoán trong khoảng' + batdau + 'đến' + ketthuc);
    for (let diem == 5; diem == 0; diem-- ) {
    if (doan == so)
        alert ('ban doan dung')
    else if ( doan > so ) {
        alert ('so ban doan lon hon')
    } else if (doan < so ){
        alert ('so ban doan nho hon')
        doan = prompt (' nhập lại so')
        diem--
    }
}
     alert ('game over')

}
