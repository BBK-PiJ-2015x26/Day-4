int power(int base, int exponent) {
	result = base ** exponent
	return result
}	

println power(2, 2)

int power2(int exponent) {
	result = 2 ** exponent
	return result
}

println power2(3)


int binary2decimal(String binary) {
	int result = 0
	int count = 0
	for (i = binary.length(); i-- > 0;) {
		int d = Integer.parseInt("${binary[i]}")
			if (d == 1) {
				result = result + power2(count)
			}
			count ++
	}
	return result
}

println binary2decimal("101110")	

String decimal2binary(int decimal) {
	String binary = ""
	while (decimal > 0 ) {
		if (decimal % 2 == 1) {
			binary = binary + "1"
		}else if (decimal % 2 == 0) {
			binary = binary + "0"
		}
		decimal = decimal / 2
	}
	binary = binary.reverse()
	return binary
}	

print  decimal2binary(123)

	
			