function validarCampos(){
  var algoritmo1 = document.getElementById("Algoritmo1").value;
  var algoritmo2 = document.getElementById("Algoritmo2").value;
  var algoritmo3 = document.getElementById("Algoritmo3").value;
  var algoritmo4 = document.getElementById("Algoritmo4").value;
  var algoritmo5 = document.getElementById("Algoritmo5").value;
  var algoritmo6 = document.getElementById("Algoritmo6").value;
  var otrosAlgoritmos = document.getElementById("OtrosAlgoritmos").value;
  if (algoritmo1 == "" || algoritmo2 == "" || algoritmo3 == "" || algoritmo4 == "" || algoritmo5 == "" || algoritmo6 == "" || otrosAlgoritmos == "") {
    alert("Todos los campos son obligatorios");
    return false;
  }
  else if (algoritmo1.length > 20 || algoritmo2.length > 20 || algoritmo3.length > 20 || algoritmo4.length > 20 || algoritmo5.length > 20 || algoritmo6.length > 20 || otrosAlgoritmos.length > 20) {
    alert("Los campos no pueden tener más de 20 caracteres");
    return false;
  }
  else if (isNaN(algoritmo1) == false || isNaN(algoritmo2) == false || isNaN(algoritmo3) == false || isNaN(algoritmo4) == false || isNaN(algoritmo5) == false || isNaN(algoritmo6) == false || isNaN(otrosAlgoritmos) == false) {
    alert("Los campos no pueden ser numéricos");
    return false;
  }
}
