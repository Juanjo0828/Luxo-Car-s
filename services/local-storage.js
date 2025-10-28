export function guardarLocalStorage(nombre, datos) {
  localStorage.setItem(nombre, JSON.stringify(datos));
}

export function ConsultarLocalStorage(nombre) {
  const datos = localStorage.getItem(nombre);
  return datos ? JSON.parse(datos) : [];
}
