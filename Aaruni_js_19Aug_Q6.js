function VariableType(var2)
{
	console.log(typeOf(var2));
}
VariableType(12)


//count the occurrence of a substring in a string
 var string = 'This is a string',
    searchFor = 'is',
    count = 0,
    pos = string.indexOf(searchFor);

while (pos > -1) {
    ++count;
    pos = string.indexOf(searchFor, ++pos);
}

console.log(count)