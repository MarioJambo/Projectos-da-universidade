



const nome = document.getElementById('nome');
const altura = document.getElementById('altura');
const peso = document.getElementById('peso');
const resultado = document.getElementById('resultado')
const bt
 = document.getElementById('bt');

function CalImc() {
   


const imc  =(peso/(altura* altura)).toFixed(1);

if (nome.value != ''&& altura.value !='' &&  peso != '') {
    let res = ''
    if (imc < 18.5 ) {
         res = "Magreza"
        resultado.value = `caro  ${nome.value} Seu IMC é de ${imc.value} kg/m2. e De acordo com a Organização Mundial da Saúde, seu IMC é considerado ${res}`

    } else if (imc >= 18.5 && imc <= 24,9) {
         res = "Normal"
        resultado.value = `caro  ${nome.value} Seu IMC é de ${imc.value} kg/m2. e De acordo com a Organização Mundial da Saúde, seu IMC é considerado ${res}`
    }
     else if (imc >= 25 && imc <= 29,9) {
             res = "Acima do peso"
    } else if (imc) {
        const res = "Obesidade "
        resultado.value = `caro  ${nome.value} Seu IMC é de ${im} kg/m2. e De acordo com a Organização Mundial da Saúde, seu IMC é considerado ${res.value}`
    }  
    

} else {
    alert("Preencha todos os campos !!!");
    resultado.value = ''
    
}
    
    
}

//CalImc();
bt.addEventListener('click', CalImc);
