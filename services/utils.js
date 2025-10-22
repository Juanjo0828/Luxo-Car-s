export const expresionesRegulares = {
	regexNombre: /^(?=(?:.*[A-Z]){2,})[A-Za-zÁÉÍÓÚáéíóúÑñ\s]{20,30}$/,
	regexCorreo: /^[^\s@]+@[^\s@]+\.[^\s@]{2,}$/,
	regexMarca: /^[A-Za-zÁÉÍÓÚáéíóúÑñ\s]{5,15}$/,
	regexModelo: /^[A-Za-z0-9ÁÉÍÓÚáéíóúÑñ\s]{5,10}$/,
	regexAnio: /^\d{4}$/,
	regexDescripcion: /^.{0,100}$/,
};