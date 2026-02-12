const readline = require("readline");

//Indicamos que vamos a usar el módulo readline (como las librerias de java)


// Creamos la interfaz de lectura
const rl = readline.createInterface({ 
	Input: process.stdin,   //indicamos lectura por teclado
	output: process.stdout //indicamos salida por consola
});


r1.question("Número A: ", (a) => {
	rl.question("Número B: ", (b) => {
		a Number(a);
		b Number(b);


		console.log("Suma:", a + b);
		console.log("Resta:", a b);
		console.log("Multiplicación:", ab);
		console.log("División:", a / b);


		rl.close();

	});

});

