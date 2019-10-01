Function GameGussNumber() {
    var n = prompt ('nhap so (1-10 ) ');
    let r = Math.round (10*Math.random());
    if ( n == r){
    alert ('chuc mung, ban da doan dung');
    } else {
    alert  ('ban doan sai'+ "so dung la: " +r);
}
};