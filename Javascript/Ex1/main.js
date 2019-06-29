function calc(opt) {
  var numE1 = document.getElementById('number_1');
  var numE2 = document.getElementById('number_2');
  var num1 = parseFloat(numE1.value);
  var num2 = parseFloat(numE2.value);
  var kq = 0;
  switch (opt) {
    case '+': kq = num1+num2; break;
    case '-': kq = num1-num2; break;
    case '*': kq = num1*num2; break;
    case '/': kq = num1/num2; break;
  }
  var resE = document.getElementById('res');
  resE.value = kq;
}
