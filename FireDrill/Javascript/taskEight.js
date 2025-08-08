let sum = 0
for(let count = 1; count < 11;count++){ 
	let multiples = 1
	if(count % 4 == 0){
		for(let counter = 1; counter < 6;counter++){
			multiples = multiples * count 
			sum += multiples
			}
	}
	}
		console.log(sum)

