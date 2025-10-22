import { expresionesRegulares } from "../services/utils.js";

const campos = document.querySelectorAll(".formulario__entrada");

if (campos.length === 0) {
    console.error("No se encontraron campos del formulario");
} else {
    campos.forEach((campo) => {
  campo.addEventListener("keyup", function (e) {
    const valor = e.target.value;
    const id = e.target.id;
    let cumple = false;

    switch (id) {
      case "nombre":
        cumple = expresionesRegulares.regexNombre.test(valor);
        break;
      case "correo":
        cumple = expresionesRegulares.regexCorreo.test(valor);
        break;
      case "marca":
        cumple = expresionesRegulares.regexMarca.test(valor);
        break;
      case "modelo":
        cumple = expresionesRegulares.regexModelo.test(valor);
        break;
      case "anio":
        cumple = expresionesRegulares.regexAnio.test(valor);
        break;
      case "descripcion":
        cumple = expresionesRegulares.regexDescripcion.test(valor);
        break;
      case "precio":
        cumple = parseInt(valor) > 15000000; 
        break;
    }

    if (cumple) {
      e.target.style.outline = "none";
      e.target.style.borderColor = "green";
      e.target.style.borderWidth = "2px";
      e.target.style.color = "black";
    } else {
      e.target.style.outline = "none";
      e.target.style.borderColor = "red";
      e.target.style.borderWidth = "2px";
      e.target.style.color = "red";
    }
  });
  });
}

const form = document.getElementById("formVender");
if (!form) {
    console.error("No se encontró el formulario de venta");
} else {
    form.addEventListener("submit", function (e) {
        e.preventDefault();
        
        const camposValidos = Array.from(campos).every(campo => {
            const valor = campo.value;
            const id = campo.id;
            
            switch (id) {
                case "nombre":
                    return expresionesRegulares.regexNombre.test(valor);
                case "correo":
                    return expresionesRegulares.regexCorreo.test(valor);
                case "marca":
                    return expresionesRegulares.regexMarca.test(valor);
                case "modelo":
                    return expresionesRegulares.regexModelo.test(valor);
                case "anio":
                    return expresionesRegulares.regexAnio.test(valor);
                case "descripcion":
                    return expresionesRegulares.regexDescripcion.test(valor);
                case "precio":
                    return parseInt(valor) > 15000000;
                default:
                    return false;
            }
        });

        if (camposValidos) {
            alert("Información enviada correctamente 🚗✅");
            form.reset(); 
        } else {
            alert("Por favor, corrige los campos marcados en rojo antes de enviar");
        }
    });
}
