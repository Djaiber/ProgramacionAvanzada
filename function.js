var Algoritmo1 = document.getElementById("Algoritmo1").value;
var Algoritmo2 = document.getElementById("Algoritmo2").value;
var Algoritmo3 = document.getElementById("Algoritmo3").value;
var Algoritmo4 = document.getElementById("Algoritmo4").value;
var Algoritmo5 = document.getElementById("Algoritmo5").value;
var Algoritmo6 = document.getElementById("Algoritmo6").value;
var OtrosAlgoritmos = document.getElementById("OtrosAlgoritmos").value;

var table = "<table><thead> <th colspan='3'>Algoritmos de Ordenamiento</th></thead><tbody><tr><td rowspan='4'><br><img src='images/sort-algoritms.png' alt='Image' width='220'></td></tr><tr><td>"+Algoritmo1+"</td><td>"+Algoritmo2+"</td></tr><tr><td>"+Algoritmo3+"</td><td>"+Algoritmo4+"</td></tr><tr><td>"+Algoritmo5+"</td><td>"+Algoritmo6+"</td></tr></tbody><tfoot><tr><td colspan='2'><textarea cols='50' id='OtrosAlgoritmos' placeholder='Sí recuerda, agrege otros algoritmos'>"+OtrosAlgoritmos+"</textarea></td><td><button type='submit'><img src='images/icons8-send-button-64.png' />Enviar Datos</button></td></tr></tfoot></table>";

document.getElementById("table_id").innerHTML = table;

function sendTable() {
  document.getElementById("table_id").innerHTML = table;
  window.location.href = "Page3.html";
}