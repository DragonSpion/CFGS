// 1. Seleccionamos los elementos del HTML y los almacenamos en constantes para trabajar con ellas
const txt = document.getElementById("texto"); // El párrafo
const btn = document.getElementById("boton"); // El botón

btn.addEventListener("click", cambiarTexto);

function cambiarTexto() {
  txt.textContent = "El texto ha cambiado";
}