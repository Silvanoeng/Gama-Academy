var numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20];



let pares = []
let impares = []


numeros.map(function(num) {
    if ((num % 2) == 0) {
        return pares.push(num);
    } else {
        return impares.push(num);
    }

})

console.log(pares)
console.log(impares)


"SD desenvolvimento de software"
"2 R$ 2450,00"
"4 R$ 2750,00"
"5 R$ 2550,00"
"7 R$ 2450,00"
"9 R$ 2750,00"
"10 R$ 2500,00"

"SM gerenciamento de software"
"0 R$ 3200,00"
"3 R$ 3700,00"

"UD designer de UI/UX"
"1 R$ 2700,00"
"6 R$ 2450,00"
"8 R$ 2550,00"


let da = [ 3200, 3700, 2450, 2750, 2550, 2450, 2750, 2500, 2700, 2450, 2550]
let ab
let er
let reducer = (a,b)=> a+b;
er = da.reduce(reducer)

console.log(er/11)




let num =5
let fatorial=1
for(i=num; i>0; i--) {
fatorial=i*fatorial
}

console.log(fatorial)


produto = [4.23,3.56,4.41,8.99,0.50]
function total(cod,qntd) {
    let i=cod-1
return (produto[i]*qntd).toFixed(2)
}
let resultado = total(5, 3)
console.log("Total: R$ " + resultado )


let v1=0
let v2=0
let v3=0
let v4=0
let v5=0
let v6=0
let cont=0
let valor=0



let valores = [1,1,1,1,1,2,2,2,3,3,5,5,5,5,5,4,4,4,4,6,6,6,6,6,6,6,6,6,6,0]

do {
valores.map(function(num){
 i=num
    switch (i) {
        case 1:
            v1++
            cont++
            break
        case 2:
            v2++
            cont++
            break
        case 3:
            v3++
            cont++
            break
        case 4:
            v4++
            cont++
            break
        case 5:
            v5++
            cont++
            break
        case 6:
            v6++
            cont++
            break
            default:
                console.log("Digite um número de 1 a 6")
    }

    return i
});
    
} while (i != 0);

 console.log(v1/cont);
 console.log(v2/cont);
 console.log(v3/cont);
 console.log(v4/cont);
 console.log(v5/cont);
 console.log(v6/cont);
 console.log(cont);










