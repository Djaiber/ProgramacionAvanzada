document.getElementById("entradas").addEventListener("submit", function(event) {
  event.preventDefault(); // Evita el envío del formulario por defecto

  // Captura los valores del formulario
  var nombre = encodeURIComponent(document.querySelector("input[name='nombre']").value);
  var email = encodeURIComponent(document.querySelector("input[name='email']").value);
  
  // Construye la URL con los parámetros GET
  var url = "ValoresRecibidos.html=" + nombre + "&email=" + email;
  
  // Redirecciona a la otra página
  window.location.href = url;
});

