const anos = [2024, 1900, 2000, 2023];

function CalculadoraAnoBissexto(ano){
    console.log(`\nAno digitado ${ano}.`);

    const anoDivisivelPor4 = ano%4 == 0;
    const anoDivisivelPor100 = ano%100 == 0;
    const anoDivisivelPor400 = ano%400 == 0;

    if( anoDivisivelPor4 && (!anoDivisivelPor100 || anoDivisivelPor400) ){
        console.log(`O ano ${ano} é bissexto.`);
    }else{
        console.log(`O ano ${ano} não é bissexto.`);
    }
}

for (const element of anos) {
    CalculadoraAnoBissexto(element);
}