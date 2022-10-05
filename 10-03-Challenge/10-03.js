

function countBoomerangs(array){
    let count = 0;
    for(let i = 0; i < array.length - 2; i++){

        if(array[i] == array[i+2] && array[i] > array[i+1] || array[i] < array[i+1]){
            count += 1;
        }
    }
    return count;
}

function oddishOrEvenish(num){
    let sum = 0;

    while(num > 0){
        sum += num%10;
        num = Math.floor(num/10);
    }
    if(sum%2 == 0){
        return "Evenish";
    }
    return "Oddish";
}

console.log(countBoomerangs([9,5,9,5,1,1,1]));
console.log(countBoomerangs([1,1,1,2,1]));
console.log(oddishOrEvenish(13));
console.log(oddishOrEvenish(234));