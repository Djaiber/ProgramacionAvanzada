window.onload = function() {
  // Obtén los parámetros de la URL
  const params = new URLSearchParams(window.location.search);

  // Obtiene los valores de los parámetros del formulario
  const algoritmo1 = params.get('Algoritmo1');
  const algoritmo2 = params.get('Algoritmo2');
  const algoritmo3 = params.get('Algoritmo3');
  const algoritmo4 = params.get('Algoritmo4');
  const algoritmo5 = params.get('Algoritmo5');
  const algoritmo6 = params.get('Algoritmo6');

  // ... Obtén los otros valores de algoritmos

  // Actualiza el contenido de elementos HTML con los valores
  document.getElementById('resultadoAlgoritmo1').textContent = algoritmo1;
  document.getElementById('resultadoAlgoritmo2').textContent = algoritmo2;
  document.getElementById('resultadoAlgoritmo3').textContent = algoritmo3;
  document.getElementById('resultadoAlgoritmo4').textContent = algoritmo4;
  document.getElementById('resultadoAlgoritmo5').textContent = algoritmo5;
  document.getElementById('resultadoAlgoritmo6').textContent = algoritmo6;
  // ... Actualiza los otros elementos HTML con los valores

  // También puedes hacer algo similar con el textarea
  const otrosAlgoritmos = params.get('OtrosAlgoritmos');
  document.getElementById('resultadoOtrosAlgoritmos').textContent = otrosAlgoritmos;
};